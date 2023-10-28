package serviceAPI;

//import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import modelo.Regiao;

public class RegiaoAPI 
{
    public String getRegiao(String regiao)
    {
        String regiaoAPIURL = "https://localhost:7101/Cidade?regiao=" + regiao;
        //Regiao regiaoClass = null;
        String jsonEmString = "";
        
        try 
        {
            URL url = new URL(regiaoAPIURL);
            HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("Content-Type", "application/json");
            
            //if(conexao.getResponseCode() != 200){
                //throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            //}
            
            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            jsonEmString = Util.converteJsonEmString(resposta);
            
            //Gson gson = new Gson();
            
            //regiaoClass = gson.fromJson(jsonEmString, Regiao.class);
        } 
        catch (IOException e) 
        {
            System.out.println(e.toString());
        }
        
        //return regiaoClass;
        return jsonEmString;
    }
}
