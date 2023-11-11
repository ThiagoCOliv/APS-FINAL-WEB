namespace APIAPSFinal
{
    public class Regiao
    {
        public Regiao(string r_city, int qtd_areas_verdes, int conservacao_manut, int acess, int bio_sust, int satisfacao_publico) 
        {
            regiaoCidade = r_city;
            qtdDistribuicaoAreasVerdes = qtd_areas_verdes;
            qtdDistribuicaoAreasVerdesAvaliacao = avaliacao(qtdDistribuicaoAreasVerdes);
            estadoConservacaoManutencao = conservacao_manut;
            estadoConservacaoManutencaoAvaliacao = avaliacao(estadoConservacaoManutencao);
            acessibilidade = acess;
            acessibilidadeAvaliacao = avaliacao(acessibilidade);
            biodiversidadeSustentabilidade = bio_sust;
            biodiversidadeSustentabilidadeAvaliacao = avaliacao(biodiversidadeSustentabilidade);
            usoSatisfacaoPublico = satisfacao_publico;
            usoSatisfacaoPublicoAvaliacao = avaliacao(usoSatisfacaoPublico);
            avaliacaoGeral = avaliacao(media());
        }
        public string? regiaoCidade { get; set; }

        public int qtdDistribuicaoAreasVerdes { get; set; }
        public string? qtdDistribuicaoAreasVerdesAvaliacao { get; set; }

        public int estadoConservacaoManutencao { get; set; }
        public string? estadoConservacaoManutencaoAvaliacao { get; set; }

        public int acessibilidade { get; set; }
        public string? acessibilidadeAvaliacao { get; set; }

        public int biodiversidadeSustentabilidade { get; set; }
        public string? biodiversidadeSustentabilidadeAvaliacao { get; set; }

        public int usoSatisfacaoPublico { get; set; }
        public string? usoSatisfacaoPublicoAvaliacao { get; set; }

        public string? avaliacaoGeral { get; set; }

        private string avaliacao(int topico)
        {
            if (topico < 20)
            {
                return "Péssimo";
            }
            else if (topico < 40)
            {
                return "Ruim";
            }
            else if (topico < 60)
            {
                return "Razoável";
            }
            else if (topico < 80)
            {
                return "Bom";
            }
            else
            {
                return "Ótimo";
            }
        }

        private int media()
        {
            double soma = qtdDistribuicaoAreasVerdes + estadoConservacaoManutencao + acessibilidade + biodiversidadeSustentabilidade + usoSatisfacaoPublico;
            int media = (int)Math.Floor(soma / 5);
            
            return media;
        }
        
        public void atualizarAvaliacao()
        {
            qtdDistribuicaoAreasVerdesAvaliacao = avaliacao(qtdDistribuicaoAreasVerdes);
            estadoConservacaoManutencaoAvaliacao = avaliacao(estadoConservacaoManutencao);
            acessibilidadeAvaliacao = avaliacao(acessibilidade);
            biodiversidadeSustentabilidadeAvaliacao = avaliacao(biodiversidadeSustentabilidade);
            usoSatisfacaoPublicoAvaliacao = avaliacao(usoSatisfacaoPublico);
            avaliacaoGeral = avaliacao(media());
        }
    }
}