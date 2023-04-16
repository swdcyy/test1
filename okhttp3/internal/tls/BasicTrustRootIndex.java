package okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.TrustRootIndex;
import java.security.cert.X509Certificate;
import java.lang.Object;
import java.util.LinkedHashMap;
import javax.security.auth.x500.X500Principal;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.security.PublicKey;

public final class BasicTrustRootIndex implements TrustRootIndex	// class@0020de
{
    public final Map subjectToCaCerts;

    public void BasicTrustRootIndex(X509Certificate[] p0){
       super();
       this.subjectToCaCerts = new LinkedHashMap();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          X500Principal subjectX500P = oobject.getSubjectX500Principal();
          Set set = this.subjectToCaCerts.get(subjectX500P);
          if (set == null) {
             set = new LinkedHashSet(1);
             this.subjectToCaCerts.put(subjectX500P, set);
          }
          set.add(oobject);
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof BasicTrustRootIndex || !p0.subjectToCaCerts.equals(this.subjectToCaCerts)) {
          b = false;
       }
       return b;
    }
    public X509Certificate findByIssuerAndSignature(X509Certificate p0){
       Set set = this.subjectToCaCerts.get(p0.getIssuerX500Principal());
       if (set == null) {
          return null;
       }
       Iterator iterator = set.iterator();
    label_0014 :
       if (!iterator.hasNext()) {
          return null;
       }
       X509Certificate x509Certific = iterator.next();
       PublicKey publicKey = x509Certific.getPublicKey();
       try{
          p0.verify(publicKey);
          return x509Certific;
       }catch(java.lang.Exception e0){
          goto label_0014 ;
       }
    }
    public int hashCode(){
       return this.subjectToCaCerts.hashCode();
    }
}
