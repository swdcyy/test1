package okhttp3.internal.platform.Jdk9Platform;
import okhttp3.internal.platform.Platform;
import java.lang.reflect.Method;
import javax.net.ssl.SSLParameters;
import java.lang.Class;
import java.lang.String;
import javax.net.ssl.SSLSocket;
import java.util.List;
import java.lang.Object;
import java.lang.Exception;
import java.lang.AssertionError;
import okhttp3.internal.Util;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.lang.UnsupportedOperationException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public final class Jdk9Platform extends Platform	// class@001fcd
{
    public final Method getProtocolMethod;
    public final Method setProtocolMethod;

    public void Jdk9Platform(Method p0,Method p1){
       super();
       this.setProtocolMethod = p0;
       this.getProtocolMethod = p1;
    }
    public static Jdk9Platform buildIfSupported(){
       try{
          Class[] uClassArray = new Class[]{String[].class};
          Class[] uClassArray1 = new Class[0];
          return new Jdk9Platform(SSLParameters.class.getMethod("setApplicationProtocols", uClassArray), SSLSocket.class.getMethod("getApplicationProtocol", uClassArray1));
       }catch(java.lang.NoSuchMethodException e0){
          return null;
       }
    }
    public void configureTlsExtensions(SSLSocket p0,String p1,List p2){
       String[] stringArray;
       try{
          SSLParameters sSLParameter = p0.getSSLParameters();
          p2 = Platform.alpnProtocolNames(p2);
          Object[] objArray = new Object[]{p2.toArray(stringArray)};
          stringArray = new String[p2.size()];
          this.setProtocolMethod.invoke(sSLParameter, objArray);
          p0.setSSLParameters(sSLParameter);
          return;
       }catch(java.lang.IllegalAccessException e5){
       }catch(java.lang.reflect.InvocationTargetException e5){
       }
       throw Util.assertionError("unable to set ssl parameters", e5);
    }
    public String getSelectedProtocol(SSLSocket p0){
       String str = "failed to get ALPN selected protocol";
       String str1 = null;
       try{
          Object[] objArray = new Object[0];
          String str2 = this.getProtocolMethod.invoke(p0, objArray);
          if (str2 == null || str2.equals("")) {
             return str1;
          }
          return str2;
       }catch(java.lang.reflect.InvocationTargetException e5){
          if (e5.getCause() instanceof UnsupportedOperationException) {
             return str1;
          }
          throw Util.assertionError(str, e5);
       }catch(java.lang.IllegalAccessException e5){
          throw Util.assertionError(str, e5);
       }
    }
    public X509TrustManager trustManager(SSLSocketFactory p0){
       throw new UnsupportedOperationException("clientBuilder.sslSocketFactory\(SSLSocketFactory\) not supported on JDK 9+");
    }
}
