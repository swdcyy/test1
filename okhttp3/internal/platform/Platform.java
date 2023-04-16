package okhttp3.internal.platform.Platform;
import okhttp3.OkHttpClient;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;
import okhttp3.Protocol;
import okio.b;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.AndroidPlatform;
import java.util.Objects;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Jdk9Platform;
import okhttp3.internal.platform.JdkWithJettyBootPlatform;
import java.lang.System;
import java.security.Provider;
import java.security.Security;
import java.lang.reflect.Field;
import java.lang.AssertionError;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.tls.CertificateChainCleaner;
import javax.net.ssl.X509TrustManager;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.internal.tls.BasicTrustRootIndex;
import java.security.cert.X509Certificate;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import javax.net.ssl.SSLContext;
import java.lang.Throwable;
import java.util.logging.Level;

public class Platform	// class@0020da
{
    public static final Platform PLATFORM;
    public static final Logger logger;

    static {
       Platform.PLATFORM = Platform.findPlatform();
       Platform.logger = Logger.getLogger(OkHttpClient.class.getName());
    }
    public void Platform(){
       super();
    }
    public static List alpnProtocolNames(List p0){
       ArrayList uArrayList = new ArrayList(p0.size());
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          Protocol protocol = p0.get(i1);
          if (protocol != Protocol.HTTP_1_0) {
             uArrayList.add(protocol.toString());
          }
          i1 = i1 + 1;
       }
       return uArrayList;
    }
    public static byte[] concatLengthPrefixed(List p0){
       b uob = new b();
       int i = p0.size();
       int i1 = 0;
       while (i1 < i) {
          Protocol protocol = p0.get(i1);
          if (protocol != Protocol.HTTP_1_0) {
             uob.y((protocol.toString()).length());
             uob.P(protocol.toString());
          }
          i1 = i1 + 1;
       }
       return uob.readByteArray();
    }
    public static Platform findAndroidPlatform(){
       Platform platform = Android10Platform.buildIfSupported();
       if (platform != null) {
          return platform;
       }
       platform = AndroidPlatform.buildIfSupported();
       Objects.requireNonNull(platform, "No platform found on Android");
       return platform;
    }
    public static Platform findJvmPlatform(){
       if (Platform.isConscryptPreferred()) {
          ConscryptPlatform uConscryptPl = ConscryptPlatform.buildIfSupported();
          if (uConscryptPl != null) {
             return uConscryptPl;
          }
       }
       Jdk9Platform jdk9Platform = Jdk9Platform.buildIfSupported();
       if (jdk9Platform != null) {
          return jdk9Platform;
       }else {
          Platform platform = JdkWithJettyBootPlatform.buildIfSupported();
          if (platform != null) {
             return platform;
          }else {
             return new Platform();
          }
       }
    }
    public static Platform findPlatform(){
       if (Platform.isAndroid()) {
          return Platform.findAndroidPlatform();
       }
       return Platform.findJvmPlatform();
    }
    public static Platform get(){
       return Platform.PLATFORM;
    }
    public static boolean isAndroid(){
       return ("Dalvik").equals(System.getProperty("java.vm.name"));
    }
    public static boolean isConscryptPreferred(){
       if (("conscrypt").equals(System.getProperty("okhttp.platform"))) {
          return true;
       }
       return ("Conscrypt").equals(Security.getProviders()[0].getName());
    }
    public static Object readFieldOrNull(Object p0,Class p1,String p2){
       Class class = p0.getClass();
    label_0006 :
       if (class != Object.class) {
          try{
             Field declaredFiel = class.getDeclaredField(p2);
             declaredFiel.setAccessible(true);
             Object obj = declaredFiel.get(p0);
             if (obj == null || !p1.isInstance(obj)) {
                return null;
             }else {
                return p1.cast(obj);
             }
          }catch(java.lang.NoSuchFieldException e0){
             class = class.getSuperclass();
             goto label_0006 ;
          }catch(java.lang.IllegalAccessException e0){
             throw new AssertionError();
          }
       }else if(!p2.equals("delegate")){
          p0 = Platform.readFieldOrNull(p0, Object.class, "delegate");
          if (p0 != null) {
             return Platform.readFieldOrNull(p0, p1, p2);
          }
       }
       return null;
    }
    public void afterHandshake(SSLSocket p0){
    }
    public CertificateChainCleaner buildCertificateChainCleaner(SSLSocketFactory p0){
       X509TrustManager x509TrustMan = this.trustManager(p0);
       if (x509TrustMan != null) {
          return this.buildCertificateChainCleaner(x509TrustMan);
       }
       throw new IllegalStateException("Unable to extract the trust manager on "+Platform.get()+", sslSocketFactory is "+p0.getClass());
    }
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager p0){
       return new BasicCertificateChainCleaner(this.buildTrustRootIndex(p0));
    }
    public TrustRootIndex buildTrustRootIndex(X509TrustManager p0){
       return new BasicTrustRootIndex(p0.getAcceptedIssuers());
    }
    public void configureSslSocketFactory(SSLSocketFactory p0){
    }
    public void configureTlsExtensions(SSLSocket p0,String p1,List p2){
    }
    public void connectSocket(Socket p0,InetSocketAddress p1,int p2){
       p0.connect(p1, p2);
    }
    public String getPrefix(){
       return "OkHttp";
    }
    public SSLContext getSSLContext(){
       if (("1.7").equals(System.getProperty("java.specification.version"))) {
          return SSLContext.getInstance("TLSv1.2");
       }
       try{
          return SSLContext.getInstance("TLS");
       }catch(java.security.NoSuchAlgorithmException e0){
          throw new IllegalStateException("No TLS provider", e0);
       }
    }
    public String getSelectedProtocol(SSLSocket p0){
       return null;
    }
    public Object getStackTraceForCloseable(String p0){
       if (Platform.logger.isLoggable(Level.FINE)) {
          return new Throwable(p0);
       }
       return null;
    }
    public boolean isCleartextTrafficPermitted(String p0){
       return true;
    }
    public void log(int p0,String p1,Throwable p2){
       Level wARNING = (p0 == 5)? Level.WARNING: Level.INFO;
       Platform.logger.log(wARNING, p1, p2);
       return;
    }
    public void logCloseableLeak(String p0,Object p1){
       if (p1 == null) {
          p0 = p0+" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger\(OkHttpClient.class.getName\(\)\).setLevel\(Level.FINE\);";
       }
       this.log(5, p0, p1);
       return;
    }
    public String toString(){
       return this.getClass().getSimpleName();
    }
    public X509TrustManager trustManager(SSLSocketFactory p0){
       X509TrustManager x509TrustMan = null;
       try{
          p0 = Platform.readFieldOrNull(p0, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
          if (p0 == null) {
             return x509TrustMan;
          }
          return Platform.readFieldOrNull(p0, X509TrustManager.class, "trustManager");
       }catch(java.lang.ClassNotFoundException e0){
          return e0;
       }
    }
}
