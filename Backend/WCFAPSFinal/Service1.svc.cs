using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Net.Http;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using System.Threading.Tasks;
using System.Web.Mvc;
using WCFAPSFinal.modelo;

namespace WCFAPSFinal
{
    // OBSERVAÇÃO: Você pode usar o comando "Renomear" no menu "Refatorar" para alterar o nome da classe "Service1" no arquivo de código, svc e configuração ao mesmo tempo.
    // OBSERVAÇÃO: Para iniciar o cliente de teste do WCF para testar esse serviço, selecione Service1.svc ou Service1.svc.cs no Gerenciador de Soluções e inicie a depuração.
    public class Service1 : IService1
    {
        private Task<Regiao> con;

        public string GetData(int value)
        {
            return string.Format("You entered: {0}", value);
        }

        public CompositeType GetDataUsingDataContract(CompositeType composite)
        {
            if (composite == null)
            {
                throw new ArgumentNullException("composite");
            }
            if (composite.BoolValue)
            {
                composite.StringValue += "Suffix";
            }
            return composite;
        }

        public async Task<Regiao> getRegiaoAsync(int regiao)
        {
            Regiao regiaoClass = await criarConexaoAsync(regiao);

            return regiaoClass;
        }

        private async Task<Regiao> criarConexaoAsync(int regiao)
        {
            HttpClient httpClient = new HttpClient();
            var response = await httpClient.GetAsync("https://localhost:7101/Cidade?regiao=" + regiao);
            var jsonString = await response.Content.ReadAsStringAsync();

            Regiao jsonObject = JsonConvert.DeserializeObject<Regiao>(jsonString);

            if (jsonObject != null)
            {
                return jsonObject;
            }
            else
            {
                return new Regiao
                {
                    Verificacao = true
                };
            }
        }
    }
}
