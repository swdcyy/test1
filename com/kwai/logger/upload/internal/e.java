package com.kwai.logger.upload.internal.e;
import javax.net.ssl.X509TrustManager;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.lang.String;

public final class e implements X509TrustManager	// class@000ecf
{

    public void e(){
       super();
    }
    public void checkClientTrusted(X509Certificate[] p0,String p1){
    }
    public void checkServerTrusted(X509Certificate[] p0,String p1){
    }
    public X509Certificate[] getAcceptedIssuers(){
       X509Certificate[] x509Certific = new X509Certificate[0];
       return x509Certific;
    }
}
