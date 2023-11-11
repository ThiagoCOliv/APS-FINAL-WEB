package serviceAPI;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.*;

public class DesativarVerificacaoCertificado {
    public static void desativarVerificacaoCertificado() {
        try {
            // Crie uma instância de SSLContext com um TrustManager que não verifica certificados
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, new TrustManager[]{new TrustAllManager()}, new SecureRandom());

            // Defina o SSLContext como o contexto padrão para conexões HTTPS
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

            // Desative a verificação do hostname (opcional, pode ser inseguro)
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            System.out.println(e.toString());
        }
    }

    // Implementação de TrustManager que não verifica certificados
    private static class TrustAllManager implements X509TrustManager {
        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            // Não fazer nada (aceitar qualquer certificado)
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            // Não fazer nada (aceitar qualquer certificado)
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
}
