package okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import java.lang.Class;
import okhttp3.internal.platform.OptionalMethod;
import okhttp3.internal.platform.AndroidPlatform$CloseGuard;
import java.lang.String;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.security.Provider;
import java.security.Security;
import java.lang.Object;
import java.lang.reflect.Method;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.tls.CertificateChainCleaner;
import java.lang.reflect.Constructor;
import java.security.cert.X509Certificate;
import okhttp3.internal.platform.AndroidPlatform$AndroidCertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;
import okhttp3.internal.platform.AndroidPlatform$AndroidTrustRootIndex;
import javax.net.ssl.SSLSocket;
import java.util.List;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.AssertionError;
import okhttp3.internal.Util;
import javax.net.ssl.SSLContext;
import java.lang.IllegalStateException;
import java.nio.charset.Charset;
import java.lang.Exception;
import java.lang.StringBuilder;
import android.util.Log;
import java.lang.Math;
import javax.net.ssl.SSLSocketFactory;
import java.lang.ClassLoader;

public class AndroidPlatform extends Platform	// class@0020d5
{
    public final AndroidPlatform$CloseGuard closeGuard;
    public final OptionalMethod getAlpnSelectedProtocol;
    public final OptionalMethod setAlpnProtocols;
    public final OptionalMethod setHostname;
    public final OptionalMethod setUseSessionTickets;
    public final Class sslParametersClass;

    public void AndroidPlatform(Class p0,OptionalMethod p1,OptionalMethod p2,OptionalMethod p3,OptionalMethod p4){
       super();
       this.closeGuard = AndroidPlatform$CloseGuard.get();
       this.sslParametersClass = p0;
       this.setUseSessionTickets = p1;
       this.setHostname = p2;
       this.getAlpnSelectedProtocol = p3;
       this.setAlpnProtocols = p4;
    }
    public static Platform buildIfSupported(){
       Class uClass;
       Class uClass1;
       int i;
       Class[] uClassArray;
       int i1;
       OptionalMethod optionalMeth;
       Class[] uClassArray1;
       OptionalMethod optionalMeth1;
       Class[] uClassArray2;
       Class[] uClassArray3;
       OptionalMethod optionalMeth2;
       OptionalMethod optionalMeth3;
       AndroidPlatform uAndroidPlat;
       byte[] uobyteArray = byte[].class;
       if (!Platform.isAndroid()) {
          return null;
       }
       try{
          uClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
       }catch(java.lang.ClassNotFoundException e0){
          uClass = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
       }catch(java.lang.ClassNotFoundException e0){
          return null;
       }
    }
    public static int getSdkInt(){
       try{
          return Build$VERSION.SDK_INT;
       }catch(java.lang.NoClassDefFoundError e0){
          return 0;
       }
    }
    public static boolean supportsAlpn(){
       if (Security.getProvider("GMSCore_OpenSSL") != null) {
          return true;
       }
       try{
          Class.forName("android.net.Network");
          return true;
       }catch(java.lang.ClassNotFoundException e0){
          return false;
       }
    }
    public final boolean api23IsCleartextTrafficPermitted(String p0,Class p1,Object p2){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return p1.getMethod("isCleartextTrafficPermitted", uClassArray).invoke(p2, objArray).booleanValue();
       }catch(java.lang.NoSuchMethodException e0){
          return super.isCleartextTrafficPermitted(p0);
       }
    }
    public final boolean api24IsCleartextTrafficPermitted(String p0,Class p1,Object p2){
       try{
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          return p1.getMethod("isCleartextTrafficPermitted", uClassArray).invoke(p2, objArray).booleanValue();
       }catch(java.lang.NoSuchMethodException e0){
          return this.api23IsCleartextTrafficPermitted(p0, p1, p2);
       }
    }
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager p0){
       String str = String.class;
       try{
          Class uClass = Class.forName("android.net.http.X509TrustManagerExtensions");
          Class[] uClassArray = new Class[]{X509TrustManager.class};
          Object[] objArray = new Object[]{p0};
          Class[] uClassArray1 = new Class[]{X509Certificate[].class,str,str};
          Method method = uClass.getMethod("checkServerTrusted", uClassArray1);
          return new AndroidPlatform$AndroidCertificateChainCleaner(uClass.getConstructor(uClassArray).newInstance(objArray), method);
       }catch(java.lang.Exception e0){
          return super.buildCertificateChainCleaner(p0);
       }
    }
    public TrustRootIndex buildTrustRootIndex(X509TrustManager p0){
       try{
          Class[] uClassArray = new Class[]{X509Certificate.class};
          Method declaredMeth = p0.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", uClassArray);
          declaredMeth.setAccessible(1);
          return new AndroidPlatform$AndroidTrustRootIndex(p0, declaredMeth);
       }catch(java.lang.NoSuchMethodException e0){
          return super.buildTrustRootIndex(p0);
       }
    }
    public void configureTlsExtensions(SSLSocket p0,String p1,List p2){
       if (p1 != null) {
          Object[] objArray = new Object[]{Boolean.TRUE};
          this.setUseSessionTickets.invokeOptionalWithoutCheckedException(p0, objArray);
          objArray = new Object[]{p1};
          this.setHostname.invokeOptionalWithoutCheckedException(p0, objArray);
       }
       AndroidPlatform tsetAlpnProt = this.setAlpnProtocols;
       if (tsetAlpnProt != null && tsetAlpnProt.isSupported(p0)) {
          Object[] objArray1 = new Object[]{Platform.concatLengthPrefixed(p2)};
          this.setAlpnProtocols.invokeWithoutCheckedException(p0, objArray1);
       }
       return;
    }
    public void connectSocket(Socket p0,InetSocketAddress p1,int p2){
       String str = "Exception in connect";
       try{
          p0.connect(p1, p2);
          return;
       }catch(java.lang.AssertionError e2){
          if (Util.isAndroidGetsocknameError(e2)) {
             throw new IOException(e2);
          }
          throw e2;
       }catch(java.lang.SecurityException e2){
          IOException iOException = new IOException(str);
          iOException.initCause(e2);
          throw iOException;
       }catch(java.lang.ClassCastException e2){
          if (Build$VERSION.SDK_INT != 26) {
             throw e2;
          }
          iOException = new IOException(str);
          iOException.initCause(e2);
          throw iOException;
       }
    }
    public SSLContext getSSLContext(){
       String str = 1;
       try{
          if (Build$VERSION.SDK_INT >= 22) {
             str = null;
          }
       }catch(java.lang.NoClassDefFoundError e0){
       }
       if (e0) {
          try{
             return SSLContext.getInstance("TLSv1.2");
          }catch(java.security.NoSuchAlgorithmException e0){
             try{
                return SSLContext.getInstance("TLS");
             }catch(java.security.NoSuchAlgorithmException e0){
                throw new IllegalStateException("No TLS provider", e0);
             }
          }
       }else {
          goto label_0014 ;
       }
    }
    public String getSelectedProtocol(SSLSocket p0){
       AndroidPlatform tgetAlpnSele = this.getAlpnSelectedProtocol;
       String str = null;
       if (tgetAlpnSele == null) {
          return str;
       }
       if (!tgetAlpnSele.isSupported(p0)) {
          return str;
       }
       Object[] objArray = new Object[0];
       byte[] uobyteArray = this.getAlpnSelectedProtocol.invokeWithoutCheckedException(p0, objArray);
       if (uobyteArray != null) {
          str = new String(uobyteArray, Util.UTF_8);
       }
       return str;
    }
    public Object getStackTraceForCloseable(String p0){
       return this.closeGuard.createAndOpen(p0);
    }
    public boolean isCleartextTrafficPermitted(String p0){
       if (Build$VERSION.SDK_INT < 23) {
          return super.isCleartextTrafficPermitted(p0);
       }
       try{
          Class uClass = Class.forName("android.security.NetworkSecurityPolicy");
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return this.api24IsCleartextTrafficPermitted(p0, uClass, uClass.getMethod("getInstance", uClassArray).invoke(null, objArray));
       }catch(java.lang.ClassNotFoundException e0){
          return super.isCleartextTrafficPermitted(p0);
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.IllegalAccessException e5){
       }catch(java.lang.IllegalArgumentException e5){
       }catch(java.lang.reflect.InvocationTargetException e5){
       }
       throw Util.assertionError("unable to determine cleartext support", e5);
    }
    public void log(int p0,String p1,Throwable p2){
       int i = 5;
       if (p0 == i) {
       }else {
          i = 3;
       }
       if (p2 != null) {
          p1 = p1+10+Log.getStackTraceString(p2);
       }
       int i1 = 0;
       int i2 = p1.length();
       while (i1 < i2) {
          int i3 = p1.indexOf(10, i1);
          if (i3 == -1) {
             i3 = i2;
          }
          int i4 = i1 + 4000;
          i4 = Math.min(i3, i4);
          Log.println(i, "OkHttp", p1.substring(i1, i4));
          while (i4 < i3) {
             i1 = i4;
          }
          i1 = i4 + 1;
       }
       return;
    }
    public void logCloseableLeak(String p0,Object p1){
       if (!this.closeGuard.warnIfOpen(p1)) {
          this.log(5, p0, null);
       }
       return;
    }
    public X509TrustManager trustManager(SSLSocketFactory p0){
       String str = "sslParameters";
       Object obj = Platform.readFieldOrNull(p0, this.sslParametersClass, str);
       if (obj == null) {
          try{
             obj = Platform.readFieldOrNull(p0, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, p0.getClass().getClassLoader()), str);
          }catch(java.lang.ClassNotFoundException e0){
             return super.trustManager(p0);
          }
       }
       X509TrustManager x509TrustMan = Platform.readFieldOrNull(obj, X509TrustManager.class, "x509TrustManager");
       if (x509TrustMan != null) {
          return x509TrustMan;
       }else {
          return Platform.readFieldOrNull(obj, X509TrustManager.class, "trustManager");
       }
    }
}
