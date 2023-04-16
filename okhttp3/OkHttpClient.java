package okhttp3.OkHttpClient;
import java.lang.Cloneable;
import okhttp3.Call$Factory;
import okhttp3.WebSocket$Factory;
import okhttp3.Protocol;
import java.lang.Object;
import java.util.List;
import okhttp3.internal.Util;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient$1;
import okhttp3.internal.Internal;
import okhttp3.OkHttpClient$Builder;
import java.util.Iterator;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.platform.Platform;
import okhttp3.CertificatePinner;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import java.lang.Exception;
import java.lang.AssertionError;
import okhttp3.Authenticator;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.EventListener$Factory;
import javax.net.ssl.HostnameVerifier;
import okhttp3.internal.cache.InternalCache;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.RealCall;
import okhttp3.WebSocketListener;
import okhttp3.WebSocket;
import okhttp3.internal.ws.RealWebSocket;
import java.util.Random;
import java.net.Proxy;
import java.net.ProxySelector;
import javax.net.SocketFactory;

public class OkHttpClient implements Cloneable, Call$Factory, WebSocket$Factory	// class@002087
{
    public final Authenticator authenticator;
    public final Cache cache;
    public final int callTimeout;
    public final CertificateChainCleaner certificateChainCleaner;
    public final CertificatePinner certificatePinner;
    public final int connectTimeout;
    public final ConnectionPool connectionPool;
    public final List connectionSpecs;
    public final CookieJar cookieJar;
    public final Dispatcher dispatcher;
    public final Dns dns;
    public final EventListener$Factory eventListenerFactory;
    public final boolean followRedirects;
    public final boolean followSslRedirects;
    public final HostnameVerifier hostnameVerifier;
    public final List interceptors;
    public final InternalCache internalCache;
    public final List networkInterceptors;
    public final int pingInterval;
    public final List protocols;
    public final Proxy proxy;
    public final Authenticator proxyAuthenticator;
    public final ProxySelector proxySelector;
    public final int readTimeout;
    public final boolean retryOnConnectionFailure;
    public final SocketFactory socketFactory;
    public final SSLSocketFactory sslSocketFactory;
    public final int writeTimeout;
    public static final List DEFAULT_CONNECTION_SPECS;
    public static final List DEFAULT_PROTOCOLS;

    static {
       Protocol[] protocolArra = new Protocol[]{Protocol.HTTP_2,Protocol.HTTP_1_1};
       OkHttpClient.DEFAULT_PROTOCOLS = Util.immutableList(protocolArra);
       ConnectionSpec[] uConnectionS = new ConnectionSpec[]{ConnectionSpec.MODERN_TLS,ConnectionSpec.CLEARTEXT};
       OkHttpClient.DEFAULT_CONNECTION_SPECS = Util.immutableList(uConnectionS);
       Internal.instance = new OkHttpClient$1();
    }
    public void OkHttpClient(){
       super(new OkHttpClient$Builder());
    }
    public void OkHttpClient(OkHttpClient$Builder p0){
       X509TrustManager obj;
       super();
       this.dispatcher = p0.dispatcher;
       this.proxy = p0.proxy;
       this.protocols = p0.protocols;
       OkHttpClient$Builder connectionSp = p0.connectionSpecs;
       this.connectionSpecs = connectionSp;
       this.interceptors = Util.immutableList(p0.interceptors);
       this.networkInterceptors = Util.immutableList(p0.networkInterceptors);
       this.eventListenerFactory = p0.eventListenerFactory;
       this.proxySelector = p0.proxySelector;
       this.cookieJar = p0.cookieJar;
       this.cache = p0.cache;
       this.internalCache = p0.internalCache;
       this.socketFactory = p0.socketFactory;
       Iterator iterator = connectionSp.iterator();
       OkHttpClient okHttpClient = null;
       while (true) {
          boolean b = false;
          while (true) {
             if (iterator.hasNext()) {
                ConnectionSpec uConnectionS = iterator.next();
                if (b || uConnectionS.isTls()) {
                   b = true;
                }else {
                   continue ;
                }
             }else {
                connectionSp = p0.sslSocketFactory;
                if (connectionSp != null || !b) {
                   this.sslSocketFactory = connectionSp;
                   this.certificateChainCleaner = p0.certificateChainCleaner;
                }else {
                   obj = Util.platformTrustManager();
                   this.sslSocketFactory = OkHttpClient.newSslSocketFactory(obj);
                   this.certificateChainCleaner = CertificateChainCleaner.get(obj);
                }
                if (this.sslSocketFactory != null) {
                   Platform.get().configureSslSocketFactory(this.sslSocketFactory);
                }
                this.hostnameVerifier = p0.hostnameVerifier;
                this.certificatePinner = p0.certificatePinner.withCertificateChainCleaner(this.certificateChainCleaner);
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
                obj = null;
                if (!this.interceptors.contains(obj)) {
                   if (!this.networkInterceptors.contains(obj)) {
                      break ;
                   }else {
                      throw new IllegalStateException("Null network interceptor: "+this.networkInterceptors);
                   }
                }else {
                }
             }
          }
          return;
       }
       throw new IllegalStateException("Null interceptor: "+this.interceptors);
    }
    public static SSLSocketFactory newSslSocketFactory(X509TrustManager p0){
       try{
          SSLContext sSLContext = Platform.get().getSSLContext();
          TrustManager[] trustManager = new TrustManager[]{p0};
          sSLContext.init(null, trustManager, null);
          return sSLContext.getSocketFactory();
       }catch(java.security.GeneralSecurityException e3){
          throw Util.assertionError("No System TLS", e3);
       }
    }
    public Authenticator authenticator(){
       return this.authenticator;
    }
    public Cache cache(){
       return this.cache;
    }
    public int callTimeoutMillis(){
       return this.callTimeout;
    }
    public CertificatePinner certificatePinner(){
       return this.certificatePinner;
    }
    public int connectTimeoutMillis(){
       return this.connectTimeout;
    }
    public ConnectionPool connectionPool(){
       return this.connectionPool;
    }
    public List connectionSpecs(){
       return this.connectionSpecs;
    }
    public CookieJar cookieJar(){
       return this.cookieJar;
    }
    public Dispatcher dispatcher(){
       return this.dispatcher;
    }
    public Dns dns(){
       return this.dns;
    }
    public EventListener$Factory eventListenerFactory(){
       return this.eventListenerFactory;
    }
    public boolean followRedirects(){
       return this.followRedirects;
    }
    public boolean followSslRedirects(){
       return this.followSslRedirects;
    }
    public HostnameVerifier hostnameVerifier(){
       return this.hostnameVerifier;
    }
    public List interceptors(){
       return this.interceptors;
    }
    public InternalCache internalCache(){
       OkHttpClient tcache = this.cache;
       Cache internalCach = (tcache != null)? tcache.internalCache: this.internalCache;
       return internalCach;
    }
    public List networkInterceptors(){
       return this.networkInterceptors;
    }
    public OkHttpClient$Builder newBuilder(){
       return new OkHttpClient$Builder(this);
    }
    public Call newCall(Request p0){
       return RealCall.newRealCall(this, p0, false);
    }
    public WebSocket newWebSocket(Request p0,WebSocketListener p1){
       RealWebSocket realWebSocke = new RealWebSocket(p0, p1, new Random(), (long)this.pingInterval);
       v6.connect(this);
       return v6;
    }
    public int pingIntervalMillis(){
       return this.pingInterval;
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
    public int readTimeoutMillis(){
       return this.readTimeout;
    }
    public boolean retryOnConnectionFailure(){
       return this.retryOnConnectionFailure;
    }
    public SocketFactory socketFactory(){
       return this.socketFactory;
    }
    public SSLSocketFactory sslSocketFactory(){
       return this.sslSocketFactory;
    }
    public int writeTimeoutMillis(){
       return this.writeTimeout;
    }
}
