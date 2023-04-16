package okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import java.lang.String;
import java.lang.Class;
import org.conscrypt.Conscrypt;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLSocket;
import java.util.List;
import java.lang.Object;
import java.security.Provider;
import org.conscrypt.Conscrypt$ProviderBuilder;
import javax.net.ssl.SSLContext;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import javax.net.ssl.X509TrustManager;
import java.lang.UnsupportedOperationException;

public class ConscryptPlatform extends Platform	// class@001fcc
{

    public void ConscryptPlatform(){
       super();
    }
    public static ConscryptPlatform buildIfSupported(){
       ConscryptPlatform uConscryptPl = null;
       try{
          Class.forName("org.conscrypt.Conscrypt");
          if (!Conscrypt.isAvailable()) {
             return uConscryptPl;
          }
          return new ConscryptPlatform();
       }catch(java.lang.ClassNotFoundException e0){
          return e0;
       }
    }
    public void configureSslSocketFactory(SSLSocketFactory p0){
       if (Conscrypt.isConscrypt(p0)) {
          Conscrypt.setUseEngineSocket(p0, true);
       }
       return;
    }
    public void configureTlsExtensions(SSLSocket p0,String p1,List p2){
       if (Conscrypt.isConscrypt(p0)) {
          if (p1 != null) {
             Conscrypt.setUseSessionTickets(p0, true);
             Conscrypt.setHostname(p0, p1);
          }
          String[] stringArray = new String[0];
          Conscrypt.setApplicationProtocols(p0, Platform.alpnProtocolNames(p2).toArray(stringArray));
       }else {
          super.configureTlsExtensions(p0, p1, p2);
       }
       return;
    }
    public final Provider getProvider(){
       return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }
    public SSLContext getSSLContext(){
       try{
          return SSLContext.getInstance("TLSv1.3", this.getProvider());
       }catch(java.security.NoSuchAlgorithmException e0){
          try{
             return SSLContext.getInstance("TLS", this.getProvider());
          }catch(java.security.NoSuchAlgorithmException e0){
             throw new IllegalStateException("No TLS provider", e0);
          }
       }
    }
    public String getSelectedProtocol(SSLSocket p0){
       if (Conscrypt.isConscrypt(p0)) {
          return Conscrypt.getApplicationProtocol(p0);
       }
       return super.getSelectedProtocol(p0);
    }
    public X509TrustManager trustManager(SSLSocketFactory p0){
       if (!Conscrypt.isConscrypt(p0)) {
          return super.trustManager(p0);
       }
       try{
          p0 = Platform.readFieldOrNull(p0, Object.class, "sslParameters");
          if (p0 != null) {
             return Platform.readFieldOrNull(p0, X509TrustManager.class, "x509TrustManager");
          }
          return null;
       }catch(java.lang.Exception e3){
          throw new UnsupportedOperationException("clientBuilder.sslSocketFactory\(SSLSocketFactory\) not supported on Conscrypt", e3);
       }
    }
}
