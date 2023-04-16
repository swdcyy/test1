package com.tencent.open.a.c;
import javax.net.ssl.SSLSocketFactory;
import java.lang.String;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import javax.net.ssl.X509TrustManager;
import java.lang.StringBuilder;
import java.lang.Object;
import java.util.Arrays;
import com.tencent.open.log.SLog;
import java.net.InetAddress;

public class c extends SSLSocketFactory	// class@000f3e
{
    public SSLSocketFactory a;
    public TrustManager[] b;

    public void c(){
       super();
       SSLContext instance = SSLContext.getInstance("TLS");
       TrustManager[] trustManager = this.b();
       this.b = trustManager;
       instance.init(null, trustManager, null);
       this.a = instance.getSocketFactory();
    }
    public final Socket a(Socket p0){
       if (p0 instanceof SSLSocket) {
          SSLSocket sSLSocket = p0;
          sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
       }
       return p0;
    }
    public TrustManager a(){
       c tb = this.b;
       if (tb != null && tb.length > 0) {
          return tb[0];
       }
       return null;
    }
    public final TrustManager[] b(){
       KeyStore keyStore = null;
       try{
          TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
          instance.init(keyStore);
          TrustManager[] trustManager = instance.getTrustManagers();
          if (trustManager.length == 1 && trustManager[0] instanceof X509TrustManager) {
             return trustManager;
          }
          SLog.e("openSDK_LOG.Tls2SupportedSocketFactory", "Unexpected default trust managers: "+Arrays.toString(trustManager));
          return keyStore;
       }catch(java.security.GeneralSecurityException e0){
          SLog.e(e0, "The system has no TLS. Just give up.");
          return keyStore;
       }
    }
    public Socket createSocket(String p0,int p1){
       return this.a(this.a.createSocket(p0, p1));
    }
    public Socket createSocket(String p0,int p1,InetAddress p2,int p3){
       return this.a(this.a.createSocket(p0, p1, p2, p3));
    }
    public Socket createSocket(InetAddress p0,int p1){
       return this.a(this.a.createSocket(p0, p1));
    }
    public Socket createSocket(InetAddress p0,int p1,InetAddress p2,int p3){
       return this.a(this.a.createSocket(p0, p1, p2, p3));
    }
    public Socket createSocket(Socket p0,String p1,int p2,boolean p3){
       return this.a(this.a.createSocket(p0, p1, p2, p3));
    }
    public String[] getDefaultCipherSuites(){
       return this.a.getDefaultCipherSuites();
    }
    public String[] getSupportedCipherSuites(){
       return this.a.getSupportedCipherSuites();
    }
}
