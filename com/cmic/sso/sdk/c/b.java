package com.cmic.sso.sdk.c.b;
import javax.net.ssl.SSLSocketFactory;
import java.lang.String;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import com.cmic.sso.sdk.e.c;
import java.net.InetAddress;

public class b extends SSLSocketFactory	// class@000f4d
{
    public final SSLSocketFactory a;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"TLSv1.2"};
       b.b = stringArray;
    }
    public void b(SSLSocketFactory p0){
       super();
       this.a = p0;
    }
    public final Socket a(Socket p0){
       if (p0 instanceof SSLSocket) {
          SSLSocket sSLSocket = p0;
          String[] enabledProto = sSLSocket.getEnabledProtocols();
          int len = enabledProto.length;
          for (int i = 0; i < len; i = i + 1) {
             c.a("enableProtocol", enabledProto[i]);
          }
          sSLSocket.setEnabledProtocols(b.b);
          enabledProto = new String[]{"TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA","TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"};
          sSLSocket.setEnabledCipherSuites(enabledProto);
       }
       return p0;
    }
    public Socket createSocket(){
       return this.a(this.a.createSocket());
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
    public String toString(){
       return "Tls12SocketFactory";
    }
}
