package okhttp3.Address;
import java.lang.String;
import okhttp3.Dns;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.HostnameVerifier;
import okhttp3.CertificatePinner;
import okhttp3.Authenticator;
import java.net.Proxy;
import java.util.List;
import java.net.ProxySelector;
import java.lang.Object;
import okhttp3.HttpUrl$Builder;
import okhttp3.HttpUrl;
import java.util.Objects;
import okhttp3.internal.Util;
import java.lang.StringBuilder;

public final class Address	// class@002059
{
    public final CertificatePinner certificatePinner;
    public final List connectionSpecs;
    public final Dns dns;
    public final HostnameVerifier hostnameVerifier;
    public final List protocols;
    public final Proxy proxy;
    public final Authenticator proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactory;
    public final HttpUrl url;

    public void Address(String p0,int p1,Dns p2,SocketFactory p3,SSLSocketFactory p4,HostnameVerifier p5,CertificatePinner p6,Authenticator p7,Proxy p8,List p9,List p10,ProxySelector p11){
       super();
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       String str = (p4 != null)? "https": "http";
       this.url = uBuilder.scheme(str).host(p0).port(p1).build();
       Objects.requireNonNull(p2, "dns == null");
       this.dns = p2;
       Objects.requireNonNull(p3, "socketFactory == null");
       this.socketFactory = p3;
       Objects.requireNonNull(p7, "proxyAuthenticator == null");
       this.proxyAuthenticator = p7;
       Objects.requireNonNull(p9, "protocols == null");
       this.protocols = Util.immutableList(p9);
       Objects.requireNonNull(p10, "connectionSpecs == null");
       this.connectionSpecs = Util.immutableList(p10);
       Objects.requireNonNull(p11, "proxySelector == null");
       this.proxySelector = p11;
       this.proxy = p8;
       this.sslSocketFactory = p4;
       this.hostnameVerifier = p5;
       this.certificatePinner = p6;
       return;
    }
    public CertificatePinner certificatePinner(){
       return this.certificatePinner;
    }
    public List connectionSpecs(){
       return this.connectionSpecs;
    }
    public Dns dns(){
       return this.dns;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Address && (this.url.equals(p0.url) && this.equalsNonHost(p0)))? true: false;
       return b;
    }
    public boolean equalsNonHost(Address p0){
       boolean b = (this.dns.equals(p0.dns) && (this.proxyAuthenticator.equals(p0.proxyAuthenticator) && (this.protocols.equals(p0.protocols) && (this.connectionSpecs.equals(p0.connectionSpecs) && (this.proxySelector.equals(p0.proxySelector) && (Util.equal(this.proxy, p0.proxy) && (Util.equal(this.sslSocketFactory, p0.sslSocketFactory) && (Util.equal(this.hostnameVerifier, p0.hostnameVerifier) && (Util.equal(this.certificatePinner, p0.certificatePinner) && this.url().port() == p0.url().port())))))))))? true: false;
       return b;
    }
    public int hashCode(){
       int i = (((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31;
       Address tproxy = this.proxy;
       int i1 = 0;
       int i2 = (tproxy != null)? tproxy.hashCode(): 0;
       i = (i + i2) * 31;
       tproxy = this.sslSocketFactory;
       i2 = (tproxy != null)? tproxy.hashCode(): 0;
       i = (i + i2) * 31;
       tproxy = this.hostnameVerifier;
       i2 = (tproxy != null)? tproxy.hashCode(): 0;
       i = (i + i2) * 31;
       tproxy = this.certificatePinner;
       if (tproxy != null) {
          i1 = tproxy.hashCode();
       }
       return (i + i1);
    }
    public HostnameVerifier hostnameVerifier(){
       return this.hostnameVerifier;
    }
    public List protocols(){
       return this.protocols;
    }
    public Proxy proxy(){
       return this.proxy;
    }
    public Authenticator proxyAuthenticator(){
       return this.proxyAuthenticator;
    }
    public ProxySelector proxySelector(){
       return this.proxySelector;
    }
    public SocketFactory socketFactory(){
       return this.socketFactory;
    }
    public SSLSocketFactory sslSocketFactory(){
       return this.sslSocketFactory;
    }
    public String toString(){
       StringBuilder str = "Address{"+this.url.host()+":"+this.url.port();
       str = (this.proxy != null)? str+", proxy="+this.proxy: str+", proxySelector="+this.proxySelector;
       return str+"}";
    }
    public HttpUrl url(){
       return this.url;
    }
}
