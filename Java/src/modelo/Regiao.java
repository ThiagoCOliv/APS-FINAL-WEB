package modelo;

public class Regiao 
{
    private String regiaoCidade;
    private int qtdDistribuicaoAreasVerdes;
    private int estadoConservacaoManutencao;
    private int acessibilidade;
    private int biodiversidadeSustentabilidade;
    private int usoSatisfacaoPublico;

    public String getRegiaoCidade() {
        return regiaoCidade;
    }

    public void setRegiaoCidade(String regiaoCidade) {
        this.regiaoCidade = regiaoCidade;
    }

    public String getQtdDistribuicaoAreasVerdes() {
        return Integer.toString(qtdDistribuicaoAreasVerdes);
    }

    public void setQtdDistribuicaoAreasVerdes(String qtdDistribuicaoAreasVerdes) {
        this.qtdDistribuicaoAreasVerdes = Integer.parseInt(qtdDistribuicaoAreasVerdes);
    }

    public String getEstadoConservacaoManutencao() {
        return Integer.toString(estadoConservacaoManutencao);
    }

    public void setEstadoConservacaoManutencao(String estadoConservacaoManutencao) {
        this.estadoConservacaoManutencao = Integer.parseInt(estadoConservacaoManutencao);
    }

    public String getAcessibilidade() {
        return Integer.toString(acessibilidade);
    }

    public void setAcessibilidade(String acessibilidade) {
        this.acessibilidade = Integer.parseInt(acessibilidade);
    }

    public String getBiodiversidadeSustentabilidade() {
        return Integer.toString(biodiversidadeSustentabilidade);
    }

    public void setBiodiversidadeSustentabilidade(String biodiversidadeSustentabilidade) {
        this.biodiversidadeSustentabilidade = Integer.parseInt(biodiversidadeSustentabilidade);
    }

    public String getUsoSatisfacaoPublico() {
        return Integer.toString(usoSatisfacaoPublico);
    }

    public void setUsoSatisfacaoPublico(String usoSatisfacaoPublico) {
        this.usoSatisfacaoPublico = Integer.parseInt(usoSatisfacaoPublico);
    }
}
