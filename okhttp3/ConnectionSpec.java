package okhttp3.ConnectionSpec;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec$Builder;
import okhttp3.TlsVersion;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import okhttp3.internal.Util;
import java.util.Comparator;
import java.lang.StringBuilder;

public final class ConnectionSpec	// class@00206c
{
    public final String[] cipherSuites;
    public final boolean supportsTlsExtensions;
    public final boolean tls;
    public final String[] tlsVersions;
    public static final CipherSuite[] APPROVED_CIPHER_SUITES;
    public static final ConnectionSpec CLEARTEXT;
    public static final ConnectionSpec COMPATIBLE_TLS;
    public static final ConnectionSpec MODERN_TLS;
    public static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
    public static final ConnectionSpec RESTRICTED_TLS;

    static {
       TlsVersion tLS_1_3;
       TlsVersion tLS_1_2;
       CipherSuite[] uCipherSuite = new CipherSuite[11];
       CipherSuite tLS_AES_128_ = CipherSuite.TLS_AES_128_GCM_SHA256;
       uCipherSuite[0] = tLS_AES_128_;
       CipherSuite tLS_AES_256_ = CipherSuite.TLS_AES_256_GCM_SHA384;
       uCipherSuite[1] = tLS_AES_256_;
       CipherSuite tLS_CHACHA20 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
       uCipherSuite[2] = tLS_CHACHA20;
       CipherSuite tLS_AES_128_1 = CipherSuite.TLS_AES_128_CCM_SHA256;
       uCipherSuite[3] = tLS_AES_128_1;
       CipherSuite tLS_AES_256_1 = CipherSuite.TLS_AES_256_CCM_8_SHA256;
       uCipherSuite[4] = tLS_AES_256_1;
       CipherSuite tLS_ECDHE_EC = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
       uCipherSuite[5] = tLS_ECDHE_EC;
       CipherSuite tLS_ECDHE_RS = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
       uCipherSuite[6] = tLS_ECDHE_RS;
       CipherSuite tLS_ECDHE_EC1 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
       uCipherSuite[7] = tLS_ECDHE_EC1;
       CipherSuite tLS_ECDHE_RS1 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
       uCipherSuite[8] = tLS_ECDHE_RS1;
       CipherSuite tLS_ECDHE_EC2 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
       uCipherSuite[9] = tLS_ECDHE_EC2;
       CipherSuite tLS_ECDHE_RS2 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
       uCipherSuite[10] = tLS_ECDHE_RS2;
       ConnectionSpec.RESTRICTED_CIPHER_SUITES = uCipherSuite;
       CipherSuite[] uCipherSuite1 = new CipherSuite[18];
       uCipherSuite1[0] = tLS_AES_128_;
       uCipherSuite1[1] = tLS_AES_256_;
       uCipherSuite1[2] = tLS_CHACHA20;
       uCipherSuite1[3] = tLS_AES_128_1;
       uCipherSuite1[4] = tLS_AES_256_1;
       uCipherSuite1[5] = tLS_ECDHE_EC;
       uCipherSuite1[6] = tLS_ECDHE_RS;
       uCipherSuite1[7] = tLS_ECDHE_EC1;
       uCipherSuite1[8] = tLS_ECDHE_RS1;
       uCipherSuite1[9] = tLS_ECDHE_EC2;
       uCipherSuite1[10] = tLS_ECDHE_RS2;
       uCipherSuite1[11] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;
       uCipherSuite1[12] = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;
       uCipherSuite1[13] = CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
       uCipherSuite1[14] = CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384;
       uCipherSuite1[15] = CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA;
       uCipherSuite1[16] = CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA;
       uCipherSuite1[17] = CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA;
       ConnectionSpec.APPROVED_CIPHER_SUITES = uCipherSuite1;
       TlsVersion[] tlsVersionAr = new TlsVersion[]{tLS_1_3,tLS_1_2};
       tLS_1_3 = TlsVersion.TLS_1_3;
       tLS_1_2 = TlsVersion.TLS_1_2;
       ConnectionSpec.RESTRICTED_TLS = new ConnectionSpec$Builder(1).cipherSuites(uCipherSuite).tlsVersions(tlsVersionAr).supportsTlsExtensions(1).build();
       tlsVersionAr = new TlsVersion[]{tLS_1_3,tLS_1_2,TlsVersion.TLS_1_1,tLS_1_3};
       tLS_1_3 = TlsVersion.TLS_1_0;
       ConnectionSpec.MODERN_TLS = new ConnectionSpec$Builder(1).cipherSuites(uCipherSuite1).tlsVersions(tlsVersionAr).supportsTlsExtensions(1).build();
       TlsVersion[] tlsVersionAr1 = new TlsVersion[]{tLS_1_3};
       ConnectionSpec.COMPATIBLE_TLS = new ConnectionSpec$Builder(1).cipherSuites(uCipherSuite1).tlsVersions(tlsVersionAr1).supportsTlsExtensions(1).build();
       ConnectionSpec.CLEARTEXT = new ConnectionSpec$Builder(0).build();
    }
    public void ConnectionSpec(ConnectionSpec$Builder p0){
       super();
       this.tls = p0.tls;
       this.cipherSuites = p0.cipherSuites;
       this.tlsVersions = p0.tlsVersions;
       this.supportsTlsExtensions = p0.supportsTlsExtensions;
    }
    public void apply(SSLSocket p0,boolean p1){
       ConnectionSpec uConnectionS = this.supportedSpec(p0, p1);
       ConnectionSpec tlsVersions = uConnectionS.tlsVersions;
       if (tlsVersions != null) {
          p0.setEnabledProtocols(tlsVersions);
       }
       uConnectionS = uConnectionS.cipherSuites;
       if (uConnectionS != null) {
          p0.setEnabledCipherSuites(uConnectionS);
       }
       return;
    }
    public List cipherSuites(){
       ConnectionSpec tcipherSuite = this.cipherSuites;
       List list = (tcipherSuite != null)? CipherSuite.forJavaNames(tcipherSuite): null;
       return list;
    }
    public boolean equals(Object p0){
       if (!p0 instanceof ConnectionSpec) {
          return false;
       }
       if (p0 == this) {
          return true;
       }
       ConnectionSpec ttls = this.tls;
       if (ttls != p0.tls) {
          return false;
       }
       if (ttls != null) {
          if (!Arrays.equals(this.cipherSuites, p0.cipherSuites)) {
             return false;
          }else if(!Arrays.equals(this.tlsVersions, p0.tlsVersions)){
             return false;
          }else if(this.supportsTlsExtensions != p0.supportsTlsExtensions){
             return false;
          }
       }
       return true;
    }
    public int hashCode(){
       int i = (this.tls != null)? ((((527 + Arrays.hashCode(this.cipherSuites)) * 31) + Arrays.hashCode(this.tlsVersions)) * 31) + (this.supportsTlsExtensions ^ 0x01): 17;
       return i;
    }
    public boolean isCompatible(SSLSocket p0){
       if (this.tls == null) {
          return false;
       }
       ConnectionSpec ttlsVersions = this.tlsVersions;
       if (ttlsVersions != null && !Util.nonEmptyIntersection(Util.NATURAL_ORDER, ttlsVersions, p0.getEnabledProtocols())) {
          return false;
       }
       ttlsVersions = this.cipherSuites;
       if (ttlsVersions != null && !Util.nonEmptyIntersection(CipherSuite.ORDER_BY_NAME, ttlsVersions, p0.getEnabledCipherSuites())) {
          return false;
       }
       return true;
    }
    public boolean isTls(){
       return this.tls;
    }
    public final ConnectionSpec supportedSpec(SSLSocket p0,boolean p1){
       String[] stringArray = (this.cipherSuites != null)? Util.intersect(CipherSuite.ORDER_BY_NAME, p0.getEnabledCipherSuites(), this.cipherSuites): p0.getEnabledCipherSuites();
       String[] stringArray1 = (this.tlsVersions != null)? Util.intersect(Util.NATURAL_ORDER, p0.getEnabledProtocols(), this.tlsVersions): p0.getEnabledProtocols();
       String[] supportedCip = p0.getSupportedCipherSuites();
       int i = Util.indexOf(CipherSuite.ORDER_BY_NAME, supportedCip, "TLS_FALLBACK_SCSV");
       if (p1 && i != -1) {
          stringArray = Util.concat(stringArray, supportedCip[i]);
       }
       return new ConnectionSpec$Builder(this).cipherSuites(stringArray).tlsVersions(stringArray1).build();
    }
    public boolean supportsTlsExtensions(){
       return this.supportsTlsExtensions;
    }
    public List tlsVersions(){
       ConnectionSpec ttlsVersions = this.tlsVersions;
       List list = (ttlsVersions != null)? TlsVersion.forJavaNames(ttlsVersions): null;
       return list;
    }
    public String toString(){
       if (this.tls == null) {
          return "ConnectionSpec\(\)";
       }
       String str = "[all enabled]";
       String str1 = (this.cipherSuites != null)? this.cipherSuites().toString(): str;
       if (this.tlsVersions != null) {
          str = this.tlsVersions().toString();
       }
       return "ConnectionSpec\(cipherSuites="+str1+", tlsVersions="+str+", supportsTlsExtensions="+this.supportsTlsExtensions+"\)";
    }
}
