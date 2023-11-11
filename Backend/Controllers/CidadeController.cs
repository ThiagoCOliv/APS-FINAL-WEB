using Microsoft.AspNetCore.Mvc;

namespace APIAPSFinal.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class CidadeController : ControllerBase
    {
        private static readonly Regiao[] Regioes = new[]
        {
            new Regiao("Noroeste", 45, 50, 70, 65, 55),
            new Regiao("Norte", 45, 50, 70, 65, 55),
            new Regiao("Nordeste", 45, 50, 70, 65, 55), 
            new Regiao("Oeste", 45, 50, 70, 65, 55), 
            new Regiao("Centro", 45, 50, 70, 65, 55), 
            new Regiao("Leste", 45, 50, 70, 65, 55), 
            new Regiao("Sudoeste", 45, 50, 70, 65, 55), 
            new Regiao("Sul", 45, 50, 70, 65, 55), 
            new Regiao("Sudeste", 45, 50, 70, 65, 55), 
            new Regiao("Cidade Inteira", 45, 50, 70, 65, 55)
        };

        [HttpGet]
        public JsonResult Get(int regiao)
        {
            return new JsonResult(Regioes[regiao]);
        }

        [HttpPost]
        public String Post(String id, int acessibilidade, int qtdDistribuicaoAreasVerdes, int estadoConservacaoManutencao, int biodiversidadeSustentabilidade, int usoSatisfacaoPublico)
        {
            Validacao validador = new Validacao();
            if (!validador.validarId(id)) 
            {
                return "Dados de região inválidos";
            }

            atualizarRegiao(validador.id, acessibilidade, qtdDistribuicaoAreasVerdes, estadoConservacaoManutencao, biodiversidadeSustentabilidade, usoSatisfacaoPublico);

            return "Região atualizada com sucesso!";
        }

        private void atualizarRegiao(int id, int acessibilidade, int qtdDistribuicaoAreasVerdes, int estadoConservacaoManutencao, int biodiversidadeSustentabilidade, int usoSatisfacaoPublico)
        {
            if (Regioes[id].acessibilidade != acessibilidade) 
            {
                Regioes[id].acessibilidade = acessibilidade;
            }
            if (Regioes[id].qtdDistribuicaoAreasVerdes != qtdDistribuicaoAreasVerdes)
            {
                Regioes[id].qtdDistribuicaoAreasVerdes = qtdDistribuicaoAreasVerdes;
            }
            if (Regioes[id].estadoConservacaoManutencao != estadoConservacaoManutencao)
            {
                Regioes[id].estadoConservacaoManutencao = estadoConservacaoManutencao;
            }
            if (Regioes[id].biodiversidadeSustentabilidade != biodiversidadeSustentabilidade)
            {
                Regioes[id].biodiversidadeSustentabilidade = biodiversidadeSustentabilidade;
            }
            if (Regioes[id].usoSatisfacaoPublico != usoSatisfacaoPublico)
            {
                Regioes[id].usoSatisfacaoPublico = usoSatisfacaoPublico;
            }

            Regioes[id].atualizarAvaliacao();

            atualizarCidadeInteira();
        }

        private void atualizarCidadeInteira() 
        {
            double acessibilidadeSoma = 0,
                qtdDistribuicaoAreasVerdesSoma = 0,
                estadoConservacaoManutencaoSoma = 0,
                biodiversidadeSustentabilidadeSoma = 0,
                usoSatisfacaoPublicoSoma = 0;

            for (int i = 0; i < Regioes.Length - 1; i++)
            {
                acessibilidadeSoma += Regioes[i].acessibilidade;
                qtdDistribuicaoAreasVerdesSoma += Regioes[i].qtdDistribuicaoAreasVerdes;
                estadoConservacaoManutencaoSoma += Regioes[i].estadoConservacaoManutencao;
                biodiversidadeSustentabilidadeSoma += Regioes[i].biodiversidadeSustentabilidade;
                usoSatisfacaoPublicoSoma += Regioes[i].usoSatisfacaoPublico;
            }

            Regioes[9].acessibilidade = (int)(acessibilidadeSoma / Regioes.Length - 1);
            Regioes[9].qtdDistribuicaoAreasVerdes = (int)(qtdDistribuicaoAreasVerdesSoma / Regioes.Length - 1);
            Regioes[9].estadoConservacaoManutencao = (int)(estadoConservacaoManutencaoSoma / Regioes.Length - 1);
            Regioes[9].biodiversidadeSustentabilidade = (int)(biodiversidadeSustentabilidadeSoma / Regioes.Length - 1);
            Regioes[9].usoSatisfacaoPublico = (int)(usoSatisfacaoPublicoSoma / Regioes.Length - 1);

            Regioes[9].atualizarAvaliacao();
        }
    }
}