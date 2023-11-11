package modelo;

import serviceAPI.RegiaoAPI;

public class Controle 
{
    public String mensagem = "";
    
    public Regiao getRegiao(String regiao)
    {
        RegiaoAPI api = new RegiaoAPI();
        Regiao regiaoClasse = api.getRegiao(regiao);
        
        if(!"".equals(api.mensagem))
        {
            this.mensagem = api.mensagem;
            return null;
        }
        
        return regiaoClasse;
    }
    
    public void setRegiao(String id, Regiao regiao)
    {
        RegiaoAPI api = new RegiaoAPI();
        api.setRegiao(id, regiao);
        
        if(!"".equals(api.mensagem))
        {
            this.mensagem = api.mensagem;
        }
    }
}
