package okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import java.util.List;
import java.lang.String;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Object;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.lang.StringBuilder;
import java.security.Principal;
import java.security.PublicKey;

public final class BasicCertificateChainCleaner extends CertificateChainCleaner	// class@0020dd
{
    public final TrustRootIndex trustRootIndex;

    public void BasicCertificateChainCleaner(TrustRootIndex p0){
       super();
       this.trustRootIndex = p0;
    }
    public List clean(List p0,String p1){
       ArrayDeque uArrayDeque = new ArrayDeque(p0);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(uArrayDeque.removeFirst());
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i < 9) {
             int i2 = 1;
             int i3 = uArrayList.size() - i2;
             X509Certificate x509Certific = uArrayList.get(i3);
             X509Certificate x509Certific1 = this.trustRootIndex.findByIssuerAndSignature(x509Certific);
             if (x509Certific1 != null) {
                if (uArrayList.size() > i2 || !x509Certific.equals(x509Certific1)) {
                   uArrayList.add(x509Certific1);
                }
                if (this.verifySignature(x509Certific1, x509Certific1)) {
                }else {
                   i1 = 1;
                }
             }else {
                Iterator iterator = uArrayDeque.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      x509Certific1 = iterator.next();
                      if (this.verifySignature(x509Certific, x509Certific1)) {
                         iterator.remove();
                         uArrayList.add(x509Certific1);
                      }
                   }else if(i1){
                      return uArrayList;
                   }else {
                      throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed "+x509Certific);
                   }
                }
                throw new SSLPeerUnverifiedException("Certificate chain too long: "+uArrayList);
             }
             i = i + 1;
          }else {
             goto label_007c ;
          }
       }
       return uArrayList;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof BasicCertificateChainCleaner || !p0.trustRootIndex.equals(this.trustRootIndex)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.trustRootIndex.hashCode();
    }
    public final boolean verifySignature(X509Certificate p0,X509Certificate p1){
       if (!p0.getIssuerDN().equals(p1.getSubjectDN())) {
          return false;
       }
       try{
          p0.verify(p1.getPublicKey());
          return true;
       }catch(java.security.GeneralSecurityException e0){
          return v1;
       }
    }
}
