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
    }
}