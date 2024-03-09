package serviceAPI;

//import com.google.gson.Gson;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import modelo.Regiao;

public class RegiaoAPI 
{
    public String mensagem = "";
    
    public Regiao getRegiao(String regiao)
    {
        String regiaoAPIURL = "https://localhost:7101/Cidade?regiao=" + regiao;
        Regiao regiaoClass = null;
        String jsonEmString;
        
        DesativarVerificacaoCertificado.desativarVerificacaoCertificado();
        
        try 
        {
            URL url = new URL(regiaoAPIURL);
            HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setRequestProperty("Content-Type", "application/json");
            
            if(conexao.getResponseCode() != 200){
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            
            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            jsonEmString = Util.converteJsonEmString(resposta);
            
            Gson gson = new Gson();
            
            regiaoClass = gson.fromJson(jsonEmString, Regiao.class);
        } 
        catch (IOException e) 
        {
            mensagem = "Erro na Requisição";
        }
        
        return regiaoClass;
        //return jsonEmString;
    }
    
    public void updateRegiao(String regiaoNumero, Regiao regiao)
    {
        String regiaoAPIURL = "https://localhost:7101/Cidade?id=" + regiaoNumero + "&acessibilidade=" + regiao.getAcessibilidade() + 
                "&qtdDistribuicaoAreasVerdes=" + regiao.getQtdDistribuicaoAreasVerdes() + "&estadoConservacaoManutencao=" + 
                regiao.getEstadoConservacaoManutencao() + "&biodiversidadeSustentabilidade=" + regiao.getBiodiversidadeSustentabilidade() +
                "&usoSatisfacaoPublico=" + regiao.getUsoSatisfacaoPublico();
        BufferedReader resposta = null;
        
        DesativarVerificacaoCertificado.desativarVerificacaoCertificado();
        
        try 
        {
            URL url = new URL(regiaoAPIURL);
            HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
            conexao.setRequestMethod("PUT");
            conexao.setRequestProperty("Content-Type", "application/json");
            
            if(conexao.getResponseCode() != 200){
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            
            resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        } 
        catch (IOException e) 
        {
            mensagem = "Erro na Requisição";
        }
    }
}
