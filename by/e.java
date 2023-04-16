package by.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import lnc.l5;
import com.kwai.sdk.switchconfig.a;
import java.util.Objects;
import java.util.Enumeration;
import java.net.NetworkInterface;
import kotlin.jvm.internal.a;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.net.Inet4Address;
import java.lang.Throwable;
import yx.j0;
import org.json.JSONObject;
import ol9.b;

public class e	// class@0002d2
{
    public String a;
    public int b;

    public void e(){
       super();
    }
    public static e a(){
       int i;
       String hostAddress;
       int a;
       e obj = PatchProxy.apply(null, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new e();
       Application uApplication = a.b();
       if (uApplication == null || !p0.C(uApplication)) {
          i = 0;
       }else {
          i = 100;
          if (p0.F(uApplication)) {
             l5.a = i;
          }else if(a.t().d("adAndroidPhoneNetTypeCacheEnable", false)){
             a = l5.a;
             if (a && a != i) {
                i = a;
             }
          }
          hostAddress = p0.h(uApplication);
          Objects.requireNonNull(hostAddress);
          a = -1;
          switch (hostAddress.hashCode()){
              case 0xa5d4d503:
                if (hostAddress.equals("5g\(nsa\)")) {
                   a = 0;
                }
                break;
              case 1653:
                if (hostAddress.equals("2g")) {
                   a = 1;
                }
                break;
              case 1684:
                if (hostAddress.equals("3g")) {
                   a = 2;
                }
                break;
              case 1715:
                if (hostAddress.equals("4g")) {
                   a = 3;
                }
                break;
              case 1746:
                if (hostAddress.equals("5g")) {
                   a = 4;
                }
                break;
              case 0x60303845:
                if (hostAddress.equals("5g\(sa\)")) {
                   a = 5;
                }
                break;
              default:
          }
          switch (a){
              case 0:
              case 4:
              case 5:
                i = 5;
                break;
              case 1:
                i = 2;
                break;
              case 2:
                i = 3;
                break;
              case 3:
                i = 4;
                break;
              default:
                i = 0;
          }
          l5.a = i;
       }
       obj.b = i;
       Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
       while (true) {
          if (networkInter.hasMoreElements()) {
             NetworkInterface networkInter1 = networkInter.nextElement();
             a.o(networkInter1, "netInterface");
             Enumeration uEnumeration = a.c(networkInter1);
             while (true) {
                if (uEnumeration.hasMoreElements()) {
                   InetAddress inetAddress = uEnumeration.nextElement();
                   if (inetAddress instanceof Inet4Address && !inetAddress.isLoopbackAddress()) {
                      hostAddress = inetAddress.getHostAddress();
                      break ;
                   }
                }else {
                   continue ;
                }
             }
          }else {
             hostAddress = "";
             break ;
          }
       }
       obj.a = hostAddress;
       return obj;
    }
    public JSONObject b(){
       JSONObject obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JSONObject();
       b.e(obj, "ip", this.a);
       b.c(obj, "connectionType", this.b);
       return obj;
    }
}
