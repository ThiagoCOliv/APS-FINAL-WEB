namespace APIAPSFinal.Controllers
{
    public class Validacao
    {
        public String mensagem = "";
        public int id;
        public Boolean validarId(String id) 
        {
            try
            {
                this.id = Convert.ToInt32(id);

                if(this.id < 0 && this.id >= 9) 
                {
                    mensagem = "ID Inválido";
                    return false;
                }
            }
            catch
            {
                mensagem = "Erro na conversão";
                return false;
            }

            return true;
        }

        public Boolean validarRegiao(Regiao regiao)
        {
            try
            {
                
            }
            catch
            {
                mensagem = "Erro na conversão";
                return false;
            }

            return true;
        }
    }
}
