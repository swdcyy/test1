package okhttp3.internal.platform.AndroidPlatform$AndroidCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import java.lang.Object;
import java.lang.reflect.Method;
import java.util.List;
import java.lang.String;
import java.security.cert.X509Certificate;
import java.lang.AssertionError;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.lang.reflect.InvocationTargetException;
import java.lang.Throwable;

public final class AndroidPlatform$AndroidCertificateChainCleaner extends CertificateChainCleaner	// class@0020d2
{
    public final Method checkServerTrusted;
    public final Object x509TrustManagerExtensions;

    public void AndroidPlatform$AndroidCertificateChainCleaner(Object p0,Method p1){
       super();
       this.x509TrustManagerExtensions = p0;
       this.checkServerTrusted = p1;
    }
    public List clean(List p0,String p1){
       try{
          X509Certificate[] x509Certific = new X509Certificate[p0.size()];
          Object[] objArray = new Object[]{p0.toArray(x509Certific),"RSA",p1};
          return this.checkServerTrusted.invoke(this.x509TrustManagerExtensions, objArray);
       }catch(java.lang.reflect.InvocationTargetException e5){
          SSLPeerUnverifiedException sSLPeerUnver = new SSLPeerUnverifiedException(e5.getMessage());
          sSLPeerUnver.initCause(e5);
          throw sSLPeerUnver;
       }catch(java.lang.IllegalAccessException e5){
          throw new AssertionError(e5);
       }
    }
    public boolean equals(Object p0){
       return p0 instanceof AndroidPlatform$AndroidCertificateChainCleaner;
    }
    public int hashCode(){
       return 0;
    }
}
