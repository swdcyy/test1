package com.android.kwai.foundation.network.clientfactory.DefaultOkHttpClientFactoryImpl;
import com.android.kwai.foundation.network.clientfactory.AbsKwaiOkHttpClientFactory;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.EventListener$Factory;
import com.android.kwai.foundation.network.clientfactory.a;
import javax.net.ssl.HostnameVerifier;
import com.android.kwai.foundation.network.https.TrustAllHostnameVerifier;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import java.lang.String;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import com.android.kwai.foundation.network.https.TrustAllManager;
import okhttp3.Dns;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import okhttp3.Protocol;
import java.lang.Object;
import java.util.Collections;

public class DefaultOkHttpClientFactoryImpl extends AbsKwaiOkHttpClientFactory	// class@000ee4
{
    public OkHttpClient mOkHttpClient;
    public static ConnectionPool sConnectionPool;

    static {
       DefaultOkHttpClientFactoryImpl.sConnectionPool = new ConnectionPool();
    }
    public void DefaultOkHttpClientFactoryImpl(){
       super();
       this.mOkHttpClient = this.initOkHttpClient();
    }
    public static EventListener a(Call p0){
       return DefaultOkHttpClientFactoryImpl.lambda$createEventListenerFactory$0(p0);
    }
    public static EventListener lambda$createEventListenerFactory$0(Call p0){
       return EventListener.NONE;
    }
    public int connectTimeoutInSeconds(){
       return 10;
    }
    public ConnectionPool connectionPool(){
       return DefaultOkHttpClientFactoryImpl.sConnectionPool;
    }
    public EventListener$Factory createEventListenerFactory(){
       return a.a;
    }
    public HostnameVerifier createHostVerifier(){
       return new TrustAllHostnameVerifier();
    }
    public SSLSocketFactory createSSLSocketFactory(X509TrustManager p0){
       KeyManager[] keyManagerAr = null;
       try{
          SSLContext instance = SSLContext.getInstance("TLS");
          TrustManager[] trustManager = new TrustManager[]{p0};
          instance.init(keyManagerAr, trustManager, new SecureRandom());
          SSLSocketFactory socketFactor = instance.getSocketFactory();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public X509TrustManager createTrustManager(){
       return new TrustAllManager();
    }
    public Dns dns(){
       return Dns.SYSTEM;
    }
    public OkHttpClient initOkHttpClient(){
       X509TrustManager x509TrustMan = this.createTrustManager();
       TimeUnit sECONDS = TimeUnit.SECONDS;
       return new OkHttpClient$Builder().connectTimeout((long)this.connectTimeoutInSeconds(), sECONDS).readTimeout((long)this.readTimeoutInSeconds(), sECONDS).writeTimeout((long)this.writeTimeoutInSeconds(), sECONDS).sslSocketFactory(this.createSSLSocketFactory(x509TrustMan), x509TrustMan).eventListenerFactory(this.createEventListenerFactory()).protocols(this.supportProtocols()).connectionPool(this.connectionPool()).dns(this.dns()).hostnameVerifier(this.createHostVerifier()).build();
    }
    public OkHttpClient makeOkHttpClient(String p0){
       if (p0 == null) {
          throw new IllegalArgumentException("scheme can not be null");
       }
       if (!("https").equalsIgnoreCase(p0) && (!("https://").equalsIgnoreCase(p0) && (("http").equalsIgnoreCase(p0) || ("http://").equalsIgnoreCase(p0)))) {
          return this.mOkHttpClient;
       }
       throw new IllegalArgumentException("scheme:"+p0+" not support!");
    }
    public int readTimeoutInSeconds(){
       return 30;
    }
    public List supportProtocols(){
       return Collections.singletonList(Protocol.HTTP_1_1);
    }
    public int writeTimeoutInSeconds(){
       return 30;
    }
}
