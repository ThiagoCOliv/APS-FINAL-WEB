package modelo;

import serviceAPI.RegiaoAPI;

public class Controle 
{
    public void getRegiao(String regiao)
    {
        RegiaoAPI api = new RegiaoAPI();
        //Regiao regiaoClasse = api.getRegiao(regiao);
        System.out.println(api.getRegiao(regiao));
    }
}
