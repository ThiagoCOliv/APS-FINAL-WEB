using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WCFAPSFinal.modelo
{
    public class Regiao
    {
        private String regiaoCidade;
        private int qtdDistribuicaoAreasVerdes;
        private int estadoConservacaoManutencao;
        private int acessibilidade;
        private int biodiversidadeSustentabilidade;
        private int usoSatisfacaoPublico;

        public bool Verificacao = false;

        public String getRegiaoCidade()
        {
            return regiaoCidade;
        }

        public void setRegiaoCidade(String regiaoCidade)
        {
            this.regiaoCidade = regiaoCidade;
        }

        public int getQtdDistribuicaoAreasVerdes()
        {
            return qtdDistribuicaoAreasVerdes;
        }

        public void setQtdDistribuicaoAreasVerdes(int qtdDistribuicaoAreasVerdes)
        {
            this.qtdDistribuicaoAreasVerdes = qtdDistribuicaoAreasVerdes;
        }

        public int getEstadoConservacaoManutencao()
        {
            return estadoConservacaoManutencao;
        }

        public void setEstadoConservacaoManutencao(int estadoConservacaoManutencao)
        {
            this.estadoConservacaoManutencao = estadoConservacaoManutencao;
        }

        public int getAcessibilidade()
        {
            return acessibilidade;
        }

        public void setAcessibilidade(int acessibilidade)
        {
            this.acessibilidade = acessibilidade;
        }

        public int getBiodiversidadeSustentabilidade()
        {
            return biodiversidadeSustentabilidade;
        }

        public void setBiodiversidadeSustentabilidade(int biodiversidadeSustentabilidade)
        {
            this.biodiversidadeSustentabilidade = biodiversidadeSustentabilidade;
        }

        public int getUsoSatisfacaoPublico()
        {
            return usoSatisfacaoPublico;
        }

        public void setUsoSatisfacaoPublico(int usoSatisfacaoPublico)
        {
            this.usoSatisfacaoPublico = usoSatisfacaoPublico;
        }
    }
}