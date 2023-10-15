package modelo;

import serviceAPI.RegiaoAPI;

public class Controle 
{
    public void getRegiao(String regiao)
    {
        RegiaoAPI api = new RegiaoAPI();
        System.out.println(api.getRegiao(regiao));
    }
}
