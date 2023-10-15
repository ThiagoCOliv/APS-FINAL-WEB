package serviceAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class RegiaoAPI 
{
    public String getRegiao(String regiao)
    {
        String respostaString = "";
        String regiaoAPIURL = "https://localhost:7101/Cidade?regiao=" + regiao;
        
        try 
        {
            URL url = new URL(regiaoAPIURL);
            HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
            
            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            
            while(resposta.readLine() != null)
            {
                respostaString += resposta.readLine();
            }
        } 
        catch (IOException e) 
        {
            respostaString = e.toString();
        }
        
        return respostaString;
    }
}
