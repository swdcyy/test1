package okhttp3.ConnectionSpec$Builder;
import okhttp3.ConnectionSpec;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import okhttp3.CipherSuite;
import okhttp3.TlsVersion;

public final class ConnectionSpec$Builder	// class@00206b
{
    public String[] cipherSuites;
    public boolean supportsTlsExtensions;
    public boolean tls;
    public String[] tlsVersions;

    public void ConnectionSpec$Builder(ConnectionSpec p0){
       super();
       this.tls = p0.tls;
       this.cipherSuites = p0.cipherSuites;
       this.tlsVersions = p0.tlsVersions;
       this.supportsTlsExtensions = p0.supportsTlsExtensions;
    }
    public void ConnectionSpec$Builder(boolean p0){
       super();
       this.tls = p0;
    }
    public ConnectionSpec$Builder allEnabledCipherSuites(){
       if (this.tls == null) {
          throw new IllegalStateException("no cipher suites for cleartext connections");
       }
       this.cipherSuites = null;
       return this;
    }
    public ConnectionSpec$Builder allEnabledTlsVersions(){
       if (this.tls == null) {
          throw new IllegalStateException("no TLS versions for cleartext connections");
       }
       this.tlsVersions = null;
       return this;
    }
    public ConnectionSpec build(){
       return new ConnectionSpec(this);
    }
    public ConnectionSpec$Builder cipherSuites(String[] p0){
       if (this.tls == null) {
          throw new IllegalStateException("no cipher suites for cleartext connections");
       }
       if (!p0.length) {
          throw new IllegalArgumentException("At least one cipher suite is required");
       }
       this.cipherSuites = p0.clone();
       return this;
    }
    public ConnectionSpec$Builder cipherSuites(CipherSuite[] p0){
       if (this.tls == null) {
          throw new IllegalStateException("no cipher suites for cleartext connections");
       }
       String[] stringArray = new String[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          stringArray[i] = p0[i].javaName;
       }
       return this.cipherSuites(stringArray);
    }
    public ConnectionSpec$Builder supportsTlsExtensions(boolean p0){
       if (this.tls == null) {
          throw new IllegalStateException("no TLS extensions for cleartext connections");
       }
       this.supportsTlsExtensions = p0;
       return this;
    }
    public ConnectionSpec$Builder tlsVersions(String[] p0){
       if (this.tls == null) {
          throw new IllegalStateException("no TLS versions for cleartext connections");
       }
       if (!p0.length) {
          throw new IllegalArgumentException("At least one TLS version is required");
       }
       this.tlsVersions = p0.clone();
       return this;
    }
    public ConnectionSpec$Builder tlsVersions(TlsVersion[] p0){
       if (this.tls == null) {
          throw new IllegalStateException("no TLS versions for cleartext connections");
       }
       String[] stringArray = new String[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          stringArray[i] = p0[i].javaName;
       }
       return this.tlsVersions(stringArray);
    }
}
