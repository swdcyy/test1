package b;
import sx4.e;
import java.lang.String;
import tx4.h;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.Throwable;

public final class b	// class@000b04
{

    public static void a(e p0,String p1,String p2,h p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = null;
       }
       a.p(p0, "$this$invokeJSFunctionSafety");
       try{
          a.p(p1, "funcName");
          p0.b(p1, p2, null);
       }catch(java.lang.Exception e0){
          KwaiPopLog.e.C("invokeJSFunction", e0);
       }
       return;
    }
}
