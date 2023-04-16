package okhttp3.internal.platform.JdkWithJettyBootPlatform$JettyNegoProvider;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.String;
import java.lang.Class;
import okhttp3.internal.Util;
import java.lang.Boolean;
import java.lang.Void;

public class JdkWithJettyBootPlatform$JettyNegoProvider implements InvocationHandler	// class@001fce
{
    public final List protocols;
    public String selected;
    public boolean unsupported;

    public void JdkWithJettyBootPlatform$JettyNegoProvider(List p0){
       super();
       this.protocols = p0;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       String[] eMPTY_STRING;
       p0 = p1.getName();
       Class returnType = p1.getReturnType();
       if (p2 == null) {
          eMPTY_STRING = Util.EMPTY_STRING_ARRAY;
       }
       if (p0.equals("supports") && Boolean.TYPE == returnType) {
          return Boolean.TRUE;
       }else if(p0.equals("unsupported") && Void.TYPE == returnType){
          this.unsupported = true;
          return null;
       }else if(p0.equals("protocols") && !eMPTY_STRING.length){
          return this.protocols;
       }else if(p0.equals("selectProtocol") || (p0.equals("select") && (String.class == returnType && (eMPTY_STRING.length == 1 && eMPTY_STRING[0] instanceof List)))){
          p0 = eMPTY_STRING[0];
          int i = p0.size();
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if (this.protocols.contains(p0.get(i1))) {
                   break ;
                }else {
                   i1++;
                }
             }else {
                p0 = this.protocols.get(0);
                this.selected = p0;
                return p0;
             }
          }
          p0 = p0.get(i1);
          this.selected = p0;
          return p0;
       }else if(p0.equals("protocolSelected") || (p0.equals("selected") && eMPTY_STRING.length == 1)){
          this.selected = eMPTY_STRING[0];
          return null;
       }else {
          return p1.invoke(this, eMPTY_STRING);
       }
    }
}
