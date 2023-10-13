using Microsoft.AspNetCore.Mvc;

namespace APIAPSFinal.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class CidadeController : ControllerBase
    {
        private static readonly string[] Regioes = new[]
        {
            "Noroeste", "Norte", "Nodeste", "Oeste", "Centro", "Leste", "Sudoeste", "Sul", "Sudeste", "Cidade Inteira"
        };

        private static int[] qtdDistribuicaoAreasVerdesPorRegiao = new[]
        {
            45, 30, 22, 56, 78, 45, 23, 11, 64, 0
        };

        private static int[] estadoConservacaoManutencaoPorRegiao = new[]
        {
            45, 30, 22, 56, 78, 45, 23, 11, 64, 0
        };

        private static int[] acessibilidadePorRegiao = new[]
        {
            45, 30, 22, 56, 78, 45, 23, 11, 64, 0
        };

        private static int[] biodiversidadeSustentabilidadePorRegiao = new[]
        {
            45, 30, 22, 56, 78, 45, 23, 11, 64, 0
        };

        private static int[] usoSatisfacaoPublicoPorRegiao = new[]
        {
            45, 30, 22, 56, 78, 45, 23, 11, 64, 0
        };

        [HttpGet]
        public JsonResult Get(int regiao)
        {
            var data = new Regiao
            {
                regiaoCidade = Regioes[regiao],
                qtdDistribuicaoAreasVerdes = qtdDistribuicaoAreasVerdesPorRegiao[regiao],
                estadoConservacaoManutencao = estadoConservacaoManutencaoPorRegiao[regiao],
                acessibilidade = acessibilidadePorRegiao[regiao],
                biodiversidadeSustentabilidade = biodiversidadeSustentabilidadePorRegiao[regiao],
                usoSatisfacaoPublico = usoSatisfacaoPublicoPorRegiao[regiao]
            };

            return new JsonResult(data);
        }
    }
}