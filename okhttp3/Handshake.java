package okhttp3.Handshake;
import okhttp3.TlsVersion;
import okhttp3.CipherSuite;
import java.util.List;
import java.lang.Object;
import javax.net.ssl.SSLSession;
import java.lang.String;
import java.security.cert.Certificate;
import okhttp3.internal.Util;
import java.util.Collections;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.util.Objects;
import java.lang.Enum;
import java.security.Principal;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public final class Handshake	// class@002079
{
    public final CipherSuite cipherSuite;
    public final List localCertificates;
    public final List peerCertificates;
    public final TlsVersion tlsVersion;

    public void Handshake(TlsVersion p0,CipherSuite p1,List p2,List p3){
       super();
       this.tlsVersion = p0;
       this.cipherSuite = p1;
       this.peerCertificates = p2;
       this.localCertificates = p3;
    }
    public static Handshake get(SSLSession p0){
       TlsVersion tlsVersion;
       Certificate[] peerCertific;
       String cipherSuite = p0.getCipherSuite();
       if (cipherSuite == null) {
          throw new IllegalStateException("cipherSuite == null");
       }
       if (("SSL_NULL_WITH_NULL_NULL").equals(cipherSuite)) {
          throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
       }
       CipherSuite uCipherSuite = CipherSuite.forJavaName(cipherSuite);
       String protocol = p0.getProtocol();
       if (protocol == null) {
          throw new IllegalStateException("tlsVersion == null");
       }
       if (("NONE").equals(protocol)) {
          throw new IOException("tlsVersion == NONE");
       }
       tlsVersion = TlsVersion.forJavaName(protocol);
       try{
          peerCertific = p0.getPeerCertificates();
       }catch(javax.net.ssl.SSLPeerUnverifiedException e0){
          peerCertific = null;
       }
       List list = (peerCertific != null)? Util.immutableList(peerCertific): Collections.emptyList();
       Certificate[] localCertifi = p0.getLocalCertificates();
       List list1 = (localCertifi != null)? Util.immutableList(localCertifi): Collections.emptyList();
       return new Handshake(tlsVersion, e0, list, list1);
    }
    public static Handshake get(TlsVersion p0,CipherSuite p1,List p2,List p3){
       Objects.requireNonNull(p0, "tlsVersion == null");
       Objects.requireNonNull(p1, "cipherSuite == null");
       return new Handshake(p0, p1, Util.immutableList(p2), Util.immutableList(p3));
    }
    public CipherSuite cipherSuite(){
       return this.cipherSuite;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof Handshake) {
          return b;
       }
       if (this.tlsVersion.equals(p0.tlsVersion) && (this.cipherSuite.equals(p0.cipherSuite) && (this.peerCertificates.equals(p0.peerCertificates) && this.localCertificates.equals(p0.localCertificates)))) {
          b = true;
       }
    label_0031 :
       return b;
    }
    public int hashCode(){
       return (((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + this.peerCertificates.hashCode()) * 31) + this.localCertificates.hashCode());
    }
    public List localCertificates(){
       return this.localCertificates;
    }
    public Principal localPrincipal(){
       X500Principal subjectX500P = (!this.localCertificates.isEmpty())? this.localCertificates.get(0).getSubjectX500Principal(): null;
       return subjectX500P;
    }
    public List peerCertificates(){
       return this.peerCertificates;
    }
    public Principal peerPrincipal(){
       X500Principal subjectX500P = (!this.peerCertificates.isEmpty())? this.peerCertificates.get(0).getSubjectX500Principal(): null;
       return subjectX500P;
    }
    public TlsVersion tlsVersion(){
       return this.tlsVersion;
    }
}
