package okhttp3.OkHttpClient$Builder;
import java.lang.Object;
import java.util.ArrayList;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.EventListener;
import okhttp3.EventListener$Factory;
import java.net.ProxySelector;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.CookieJar;
import javax.net.SocketFactory;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.CertificatePinner;
import okhttp3.Authenticator;
import okhttp3.ConnectionPool;
import okhttp3.Dns;
import java.util.Collection;
import java.util.List;
import okhttp3.Interceptor;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Objects;
import okhttp3.Cache;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import java.time.Duration;
import javax.net.ssl.HostnameVerifier;
import okhttp3.Protocol;
import java.lang.StringBuilder;
import java.util.Collections;
import java.net.Proxy;
import okhttp3.internal.cache.InternalCache;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import javax.net.ssl.X509TrustManager;

public final class OkHttpClient$Builder	// class@002086
{
    public Authenticator authenticator;
    public Cache cache;
    public int callTimeout;
    public CertificateChainCleaner certificateChainCleaner;
    public CertificatePinner certificatePinner;
    public int connectTimeout;
    public ConnectionPool connectionPool;
    public List connectionSpecs;
    public CookieJar cookieJar;
    public Dispatcher dispatcher;
    public Dns dns;
    public EventListener$Factory eventListenerFactory;
    public boolean followRedirects;
    public boolean followSslRedirects;
    public HostnameVerifier hostnameVerifier;
    public final List interceptors;
    public InternalCache internalCache;
    public final List networkInterceptors;
    public int pingInterval;
    public List protocols;
    public Proxy proxy;
    public Authenticator proxyAuthenticator;
    public ProxySelector proxySelector;
    public int readTimeout;
    public boolean retryOnConnectionFailure;
    public SocketFactory socketFactory;
    public SSLSocketFactory sslSocketFactory;
    public int writeTimeout;

    public void OkHttpClient$Builder(){
       super();
       this.interceptors = new ArrayList();
       this.networkInterceptors = new ArrayList();
       this.dispatcher = new Dispatcher();
       this.protocols = OkHttpClient.DEFAULT_PROTOCOLS;
       this.connectionSpecs = OkHttpClient.DEFAULT_CONNECTION_SPECS;
       this.eventListenerFactory = EventListener.factory(EventListener.NONE);
       ProxySelector default = ProxySelector.getDefault();
       this.proxySelector = default;
       if (default == null) {
          this.proxySelector = new NullProxySelector();
       }
       this.cookieJar = CookieJar.NO_COOKIES;
       this.socketFactory = SocketFactory.getDefault();
       this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
       this.certificatePinner = CertificatePinner.DEFAULT;
       Authenticator nONE = Authenticator.NONE;
       this.proxyAuthenticator = nONE;
       this.authenticator = nONE;
       this.connectionPool = new ConnectionPool();
       this.dns = Dns.SYSTEM;
       this.followSslRedirects = true;
       this.followRedirects = true;
       this.retryOnConnectionFailure = true;
       this.callTimeout = 0;
       this.connectTimeout = 0x2710;
       this.readTimeout = 0x2710;
       this.writeTimeout = 0x2710;
       this.pingInterval = 0;
       return;
    }
    public void OkHttpClient$Builder(OkHttpClient p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.interceptors = uArrayList;
       ArrayList uArrayList1 = new ArrayList();
       this.networkInterceptors = uArrayList1;
       this.dispatcher = p0.dispatcher;
       this.proxy = p0.proxy;
       this.protocols = p0.protocols;
       this.connectionSpecs = p0.connectionSpecs;
       uArrayList.addAll(p0.interceptors);
       uArrayList1.addAll(p0.networkInterceptors);
       this.eventListenerFactory = p0.eventListenerFactory;
       this.proxySelector = p0.proxySelector;
       this.cookieJar = p0.cookieJar;
       this.internalCache = p0.internalCache;
       this.cache = p0.cache;
       this.socketFactory = p0.socketFactory;
       this.sslSocketFactory = p0.sslSocketFactory;
       this.certificateChainCleaner = p0.certificateChainCleaner;
       this.hostnameVerifier = p0.hostnameVerifier;
       this.certificatePinner = p0.certificatePinner;
       this.proxyAuthenticator = p0.proxyAuthenticator;
       this.authenticator = p0.authenticator;
       this.connectionPool = p0.connectionPool;
       this.dns = p0.dns;
       this.followSslRedirects = p0.followSslRedirects;
       this.followRedirects = p0.followRedirects;
       this.retryOnConnectionFailure = p0.retryOnConnectionFailure;
       this.callTimeout = p0.callTimeout;
       this.connectTimeout = p0.connectTimeout;
       this.readTimeout = p0.readTimeout;
       this.writeTimeout = p0.writeTimeout;
       this.pingInterval = p0.pingInterval;
    }
    public OkHttpClient$Builder addInterceptor(Interceptor p0){
       if (p0 == null) {
          throw new IllegalArgumentException("interceptor == null");
       }
       this.interceptors.add(p0);
       return this;
    }
    public OkHttpClient$Builder addNetworkInterceptor(Interceptor p0){
       if (p0 == null) {
          throw new IllegalArgumentException("interceptor == null");
       }
       this.networkInterceptors.add(p0);
       return this;
    }
    public OkHttpClient$Builder authenticator(Authenticator p0){
       Objects.requireNonNull(p0, "authenticator == null");
       this.authenticator = p0;
       return this;
    }
    public OkHttpClient build(){
       return new OkHttpClient(this);
    }
    public OkHttpClient$Builder cache(Cache p0){
       this.cache = p0;
       this.internalCache = null;
       return this;
    }
    public OkHttpClient$Builder callTimeout(long p0,TimeUnit p1){
       this.callTimeout = Util.checkDuration("timeout", p0, p1);
       return this;
    }
    public OkHttpClient$Builder callTimeout(Duration p0){
       this.callTimeout = Util.checkDuration("timeout", p0.toMillis(), TimeUnit.MILLISECONDS);
       return this;
    }
    public OkHttpClient$Builder certificatePinner(CertificatePinner p0){
       Objects.requireNonNull(p0, "certificatePinner == null");
       this.certificatePinner = p0;
       return this;
    }
    public OkHttpClient$Builder connectTimeout(long p0,TimeUnit p1){
       this.connectTimeout = Util.checkDuration("timeout", p0, p1);
       return this;
    }
    public OkHttpClient$Builder connectTimeout(Duration p0){
       this.connectTimeout = Util.checkDuration("timeout", p0.toMillis(), TimeUnit.MILLISECONDS);
       return this;
    }
    public OkHttpClient$Builder connectionPool(ConnectionPool p0){
       Objects.requireNonNull(p0, "connectionPool == null");
       this.connectionPool = p0;
       return this;
    }
    public OkHttpClient$Builder connectionSpecs(List p0){
       this.connectionSpecs = Util.immutableList(p0);
       return this;
    }
    public OkHttpClient$Builder cookieJar(CookieJar p0){
       Objects.requireNonNull(p0, "cookieJar == null");
       this.cookieJar = p0;
       return this;
    }
    public OkHttpClient$Builder dispatcher(Dispatcher p0){
       if (p0 == null) {
          throw new IllegalArgumentException("dispatcher == null");
       }
       this.dispatcher = p0;
       return this;
    }
    public OkHttpClient$Builder dns(Dns p0){
       Objects.requireNonNull(p0, "dns == null");
       this.dns = p0;
       return this;
    }
    public OkHttpClient$Builder eventListener(EventListener p0){
       Objects.requireNonNull(p0, "eventListener == null");
       this.eventListenerFactory = EventListener.factory(p0);
       return this;
    }
    public OkHttpClient$Builder eventListenerFactory(EventListener$Factory p0){
       Objects.requireNonNull(p0, "eventListenerFactory == null");
       this.eventListenerFactory = p0;
       return this;
    }
    public OkHttpClient$Builder followRedirects(boolean p0){
       this.followRedirects = p0;
       return this;
    }
    public OkHttpClient$Builder followSslRedirects(boolean p0){
       this.followSslRedirects = p0;
       return this;
    }
    public OkHttpClient$Builder hostnameVerifier(HostnameVerifier p0){
       Objects.requireNonNull(p0, "hostnameVerifier == null");
       this.hostnameVerifier = p0;
       return this;
    }
    public List interceptors(){
       return this.interceptors;
    }
    public List networkInterceptors(){
       return this.networkInterceptors;
    }
    public OkHttpClient$Builder pingInterval(long p0,TimeUnit p1){
       this.pingInterval = Util.checkDuration("interval", p0, p1);
       return this;
    }
    public OkHttpClient$Builder pingInterval(Duration p0){
       this.pingInterval = Util.checkDuration("timeout", p0.toMillis(), TimeUnit.MILLISECONDS);
       return this;
    }
    public OkHttpClient$Builder protocols(List p0){
       ArrayList uArrayList = new ArrayList(p0);
       Protocol h2_PRIOR_KNO = Protocol.H2_PRIOR_KNOWLEDGE;
       if (!uArrayList.contains(h2_PRIOR_KNO) && !uArrayList.contains(Protocol.HTTP_1_1)) {
          throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: "+uArrayList);
       }
       if (uArrayList.contains(h2_PRIOR_KNO) && uArrayList.size() > 1) {
          throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: "+uArrayList);
       }
       if (uArrayList.contains(Protocol.HTTP_1_0)) {
          throw new IllegalArgumentException("protocols must not contain http/1.0: "+uArrayList);
       }
       if (uArrayList.contains(null)) {
          throw new IllegalArgumentException("protocols must not contain null");
       }
       uArrayList.remove(Protocol.SPDY_3);
       this.protocols = Collections.unmodifiableList(uArrayList);
       return this;
    }
    public OkHttpClient$Builder proxy(Proxy p0){
       this.proxy = p0;
       return this;
    }
    public OkHttpClient$Builder proxyAuthenticator(Authenticator p0){
       Objects.requireNonNull(p0, "proxyAuthenticator == null");
       this.proxyAuthenticator = p0;
       return this;
    }
    public OkHttpClient$Builder proxySelector(ProxySelector p0){
       Objects.requireNonNull(p0, "proxySelector == null");
       this.proxySelector = p0;
       return this;
    }
    public OkHttpClient$Builder readTimeout(long p0,TimeUnit p1){
       this.readTimeout = Util.checkDuration("timeout", p0, p1);
       return this;
    }
    public OkHttpClient$Builder readTimeout(Duration p0){
       this.readTimeout = Util.checkDuration("timeout", p0.toMillis(), TimeUnit.MILLISECONDS);
       return this;
    }
    public OkHttpClient$Builder retryOnConnectionFailure(boolean p0){
       this.retryOnConnectionFailure = p0;
       return this;
    }
    public void setInternalCache(InternalCache p0){
       this.internalCache = p0;
       this.cache = null;
    }
    public OkHttpClient$Builder socketFactory(SocketFactory p0){
       Objects.requireNonNull(p0, "socketFactory == null");
       this.socketFactory = p0;
       return this;
    }
    public OkHttpClient$Builder sslSocketFactory(SSLSocketFactory p0){
       Objects.requireNonNull(p0, "sslSocketFactory == null");
       this.sslSocketFactory = p0;
       this.certificateChainCleaner = Platform.get().buildCertificateChainCleaner(p0);
       return this;
    }
    public OkHttpClient$Builder sslSocketFactory(SSLSocketFactory p0,X509TrustManager p1){
       Objects.requireNonNull(p0, "sslSocketFactory == null");
       Objects.requireNonNull(p1, "trustManager == null");
       this.sslSocketFactory = p0;
       this.certificateChainCleaner = CertificateChainCleaner.get(p1);
       return this;
    }
    public OkHttpClient$Builder writeTimeout(long p0,TimeUnit p1){
       this.writeTimeout = Util.checkDuration("timeout", p0, p1);
       return this;
    }
    public OkHttpClient$Builder writeTimeout(Duration p0){
       this.writeTimeout = Util.checkDuration("timeout", p0.toMillis(), TimeUnit.MILLISECONDS);
       return this;
    }
}
