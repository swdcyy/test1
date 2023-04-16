package okhttp3.CertificatePinner;
import okhttp3.CertificatePinner$Builder;
import java.util.Set;
import okhttp3.internal.tls.CertificateChainCleaner;
import java.lang.Object;
import java.security.cert.Certificate;
import java.lang.String;
import java.security.cert.X509Certificate;
import java.lang.StringBuilder;
import okio.ByteString;
import java.lang.IllegalArgumentException;
import java.security.PublicKey;
import java.util.List;
import okhttp3.CertificatePinner$Pin;
import java.lang.AssertionError;
import java.security.Principal;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Arrays;
import okhttp3.internal.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public final class CertificatePinner	// class@002064
{
    public final CertificateChainCleaner certificateChainCleaner;
    public final Set pins;
    public static final CertificatePinner DEFAULT;

    static {
       CertificatePinner.DEFAULT = new CertificatePinner$Builder().build();
    }
    public void CertificatePinner(Set p0,CertificateChainCleaner p1){
       super();
       this.pins = p0;
       this.certificateChainCleaner = p1;
    }
    public static String pin(Certificate p0){
       if (p0 instanceof X509Certificate) {
          return "sha256/"+CertificatePinner.sha256(p0).base64();
       }
       throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
    public static ByteString sha1(X509Certificate p0){
       return ByteString.of(p0.getPublicKey().getEncoded()).sha1();
    }
    public static ByteString sha256(X509Certificate p0){
       return ByteString.of(p0.getPublicKey().getEncoded()).sha256();
    }
    public void check(String p0,List p1){
       List list = this.findMatchingPins(p0);
       if (list.isEmpty()) {
          return;
       }
       CertificatePinner tcertificate = this.certificateChainCleaner;
       if (tcertificate != null) {
          p1 = tcertificate.clean(p1, p0);
       }
       int i = p1.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < i) {
             X509Certificate x509Certific = p1.get(i2);
             int i3 = list.size();
             ByteString uByteString = null;
             ByteString uByteString1 = uByteString;
             int i4 = 0;
             while (true) {
                if (i4 < i3) {
                   CertificatePinner$Pin pin = list.get(i4);
                   if ((pin.hashAlgorithm).equals("sha256/")) {
                      if (uByteString == null) {
                         uByteString = CertificatePinner.sha256(x509Certific);
                      }
                      if (pin.hash.equals(uByteString)) {
                         break ;
                      }
                   }else if((pin.hashAlgorithm).equals("sha1/")){
                      if (uByteString1 == null) {
                         uByteString1 = CertificatePinner.sha1(x509Certific);
                      }
                      if (pin.hash.equals(uByteString1)) {
                         return;
                      }
                   }else {
                      throw new AssertionError("unsupported hashAlgorithm: "+pin.hashAlgorithm);
                   }
                   i4 = i4 + 1;
                }else {
                   i2 = i2 + 1;
                }
             }
             return;
          }else {
             StringBuilder str = "Certificate pinning failure!"+"\n  Peer certificate chain:";
             i2 = p1.size();
             int i5 = 0;
             String str1 = "\n    ";
             while (i5 < i2) {
                X509Certificate x509Certific1 = p1.get(i5);
                str = str+str1+CertificatePinner.pin(x509Certific1)+": "+x509Certific1.getSubjectDN().getName();
                i5 = i5 + 1;
             }
             str = str+"\n  Pinned certificates for "+p0+":";
             int i6 = list.size();
             for (; i1 < i6; i1 = i1 + 1) {
                str = str+str1+list.get(i1);
             }
             throw new SSLPeerUnverifiedException(str);
          }
       }
    }
    public void check(String p0,Certificate[] p1){
       this.check(p0, Arrays.asList(p1));
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof CertificatePinner || (!Util.equal(this.certificateChainCleaner, p0.certificateChainCleaner) || !this.pins.equals(p0.pins))) {
          b = false;
       }
       return b;
    }
    public List findMatchingPins(String p0){
       List list = Collections.emptyList();
       Iterator iterator = this.pins.iterator();
       while (iterator.hasNext()) {
          CertificatePinner$Pin pin = iterator.next();
          if (pin.matches(p0)) {
             if (list.isEmpty()) {
                list = new ArrayList();
             }
             list.add(pin);
          }
       }
       return list;
    }
    public int hashCode(){
       CertificatePinner tcertificate = this.certificateChainCleaner;
       int i = (tcertificate != null)? tcertificate.hashCode(): 0;
       return ((i * 31) + this.pins.hashCode());
    }
    public CertificatePinner withCertificateChainCleaner(CertificateChainCleaner p0){
       CertificatePinner uCertificate = (Util.equal(this.certificateChainCleaner, p0))? this: new CertificatePinner(this.pins, p0);
       return uCertificate;
    }
}
