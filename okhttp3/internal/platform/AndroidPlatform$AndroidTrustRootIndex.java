package okhttp3.internal.platform.AndroidPlatform$AndroidTrustRootIndex;
import okhttp3.internal.tls.TrustRootIndex;
import javax.net.ssl.X509TrustManager;
import java.lang.reflect.Method;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.security.cert.TrustAnchor;
import java.lang.String;
import java.lang.Exception;
import java.lang.AssertionError;
import okhttp3.internal.Util;

public final class AndroidPlatform$AndroidTrustRootIndex implements TrustRootIndex	// class@001fca
{
    public final Method findByIssuerAndSignatureMethod;
    public final X509TrustManager trustManager;

    public void AndroidPlatform$AndroidTrustRootIndex(X509TrustManager p0,Method p1){
       super();
       this.findByIssuerAndSignatureMethod = p1;
       this.trustManager = p0;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof AndroidPlatform$AndroidTrustRootIndex) {
          return false;
       }
       if (!this.trustManager.equals(p0.trustManager) || !this.findByIssuerAndSignatureMethod.equals(p0.findByIssuerAndSignatureMethod)) {
          b = false;
       }
       return b;
    }
    public X509Certificate findByIssuerAndSignature(X509Certificate p0){
       String str = null;
       try{
          Object[] objArray = new Object[]{p0};
          TrustAnchor trustAnchor = this.findByIssuerAndSignatureMethod.invoke(this.trustManager, objArray);
          if (trustAnchor != null) {
             str = trustAnchor.getTrustedCert();
          }
          return e0;
       }catch(java.lang.IllegalAccessException e6){
          throw Util.assertionError("unable to get issues and signature", e6);
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
    public int hashCode(){
       return (this.trustManager.hashCode() + (this.findByIssuerAndSignatureMethod.hashCode() * 31));
    }
}
