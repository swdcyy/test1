package com.kuaishou.weapon.ks.p$1;
import javax.net.ssl.X509TrustManager;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.lang.String;
import com.kuaishou.weapon.ks.p;

public final class p$1 implements X509TrustManager	// class@00121a
{

    public void p$1(){
       super();
    }
    public void checkClientTrusted(X509Certificate[] p0,String p1){
    }
    public void checkServerTrusted(X509Certificate[] p0,String p1){
       p.a(p0);
    }
    public X509Certificate[] getAcceptedIssuers(){
       return null;
    }
}
