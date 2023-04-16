package okhttp3.CertificatePinner$Pin;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import okio.ByteString;
import java.lang.IllegalArgumentException;

public final class CertificatePinner$Pin	// class@001f3a
{
    public final String canonicalHostname;
    public final ByteString hash;
    public final String hashAlgorithm;
    public final String pattern;

    public void CertificatePinner$Pin(String p0,String p1){
       super();
       this.pattern = p0;
       String str = "http://";
       p0 = (p0.startsWith("*."))? HttpUrl.get(str+p0.substring(2)).host(): HttpUrl.get(str+p0).host();
       this.canonicalHostname = p0;
       p0 = "sha1/";
       if (p1.startsWith(p0)) {
          this.hashAlgorithm = p0;
          this.hash = ByteString.decodeBase64(p1.substring(5));
       }else {
          p0 = "sha256/";
          if (p1.startsWith(p0)) {
             this.hashAlgorithm = p0;
             this.hash = ByteString.decodeBase64(p1.substring(7));
          }else {
             throw new IllegalArgumentException("pins must start with \'sha256/\' or \'sha1/\': "+p1);
          }
       }
       if (this.hash != null) {
          return;
       }else {
          throw new IllegalArgumentException("pins must be base64: "+p1);
       }
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof CertificatePinner$Pin && ((this.pattern).equals(p0.pattern) && ((this.hashAlgorithm).equals(p0.hashAlgorithm) && this.hash.equals(p0.hash))))? true: false;
       return b;
    }
    public int hashCode(){
       return (((((527 + (this.pattern).hashCode()) * 31) + (this.hashAlgorithm).hashCode()) * 31) + this.hash.hashCode());
    }
    public boolean matches(String p0){
       if (!(this.pattern).startsWith("*.")) {
          return p0.equals(this.canonicalHostname);
       }
       int i = p0.indexOf(46);
       int i1 = 1;
       if (((p0.length() - i) - i1) == (this.canonicalHostname).length()) {
          CertificatePinner$Pin tcanonicalHo = this.canonicalHostname;
          if ((p0).regionMatches(false, (i + 1), tcanonicalHo, 0, tcanonicalHo.length())) {
          label_0032 :
             return i1;
          }
       }
       i1 = false;
       goto label_0032 ;
    }
    public String toString(){
       return this.hashAlgorithm+this.hash.base64();
    }
}
