package okhttp3.internal.platform.JdkWithJettyBootPlatform;
import okhttp3.internal.platform.Platform;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import javax.net.ssl.SSLSocket;
import java.lang.Object;
import java.lang.Exception;
import java.lang.AssertionError;
import okhttp3.internal.Util;
import java.util.List;
import java.lang.ClassLoader;
import okhttp3.internal.platform.JdkWithJettyBootPlatform$JettyNegoProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.lang.Throwable;

public class JdkWithJettyBootPlatform extends Platform	// class@001fcf
{
    public final Class clientProviderClass;
    public final Method getMethod;
    public final Method putMethod;
    public final Method removeMethod;
    public final Class serverProviderClass;

    public void JdkWithJettyBootPlatform(Method p0,Method p1,Method p2,Class p3,Class p4){
       super();
       this.putMethod = p0;
       this.getMethod = p1;
       this.removeMethod = p2;
       this.clientProviderClass = p3;
       this.serverProviderClass = p4;
    }
    public static Platform buildIfSupported(){
       String str = "org.eclipse.jetty.alpn.ALPN";
       try{
          Class uClass = Class.forName(str);
          Class[] uClassArray = new Class[]{SSLSocket.class,Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")};
          Method method = uClass.getMethod("put", uClassArray);
          uClassArray = new Class[]{SSLSocket.class};
          Method method1 = uClass.getMethod("get", uClassArray);
          Class[] uClassArray1 = new Class[]{SSLSocket.class};
          Method method2 = uClass.getMethod("remove", uClassArray1);
          JdkWithJettyBootPlatform jdkWithJetty = new JdkWithJettyBootPlatform(method, method1, method2, Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
          return uClass;
       }catch(java.lang.ClassNotFoundException e0){
          return null;
       }catch(java.lang.NoSuchMethodException e0){
       }
    }
    public void afterHandshake(SSLSocket p0){
       try{
          Object[] objArray = new Object[]{p0};
          this.removeMethod.invoke(null, objArray);
          return;
       }catch(java.lang.IllegalAccessException e5){
       }catch(java.lang.reflect.InvocationTargetException e5){
       }
       throw Util.assertionError("unable to remove alpn", e5);
    }
    public void configureTlsExtensions(SSLSocket p0,String p1,List p2){
       List list = Platform.alpnProtocolNames(p2);
       try{
          Class[] uClassArray = new Class[]{this.clientProviderClass,this.serverProviderClass};
          Object[] objArray = new Object[]{p0,Proxy.newProxyInstance(Platform.class.getClassLoader(), uClassArray, new JdkWithJettyBootPlatform$JettyNegoProvider(list))};
          this.putMethod.invoke(null, objArray);
          return;
       }catch(java.lang.reflect.InvocationTargetException e6){
       }catch(java.lang.IllegalAccessException e6){
       }
       throw Util.assertionError("unable to set alpn", e6);
    }
    public String getSelectedProtocol(SSLSocket p0){
       try{
          Object[] objArray = new Object[]{p0};
          JdkWithJettyBootPlatform$JettyNegoProvider jettyNegoPro = null;
          JdkWithJettyBootPlatform$JettyNegoProvider invocationHa = Proxy.getInvocationHandler(this.getMethod.invoke(jettyNegoPro, objArray));
          JdkWithJettyBootPlatform$JettyNegoProvider unsupported = invocationHa.unsupported;
          if (unsupported == null && invocationHa.selected == null) {
             Platform.get().log(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", jettyNegoPro);
             return jettyNegoPro;
          }else if(unsupported != null){
             jettyNegoPro = invocationHa.selected;
          }
          return jettyNegoPro;
       }catch(java.lang.reflect.InvocationTargetException e4){
       }catch(java.lang.IllegalAccessException e4){
       }
       throw Util.assertionError("unable to get selected protocol", e4);
    }
}
