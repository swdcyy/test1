package bf0.f;
import java.lang.Object;
import bf0.a;
import android.os.Handler;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bf0.e;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import ze0.a;
import java.lang.StringBuilder;
import ye0.a;
import java.lang.Boolean;
import java.lang.Throwable;
import bf0.c;
import bf0.d;

public final class f	// class@00036c
{
    public static c a;
    public static d b;
    public static a c;
    public static final f d;

    static {
       f.d = new f();
    }
    public void f(){
       super();
    }
    public final a a(){
       return f.c;
    }
    public final Handler b(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.a;
       if (obj != null) {
          objArray = obj.a();
       }
       return objArray;
    }
    public final Handler c(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.b;
       if (obj != null) {
          objArray = obj.a();
       }
       return objArray;
    }
    public final void d(){
       boolean b;
       StringBuilder str1;
       a c;
       Boolean uBoolean;
       a c1;
       StringBuilder str2;
       c a;
       Boolean uBoolean1;
       StringBuilder str3;
       d b3;
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       PrtpSwitchConfig prtpSwitchCo = PrtpManager.z.k();
       PrtpSpeedSwitchConfig prtpSpeedSwi = PrtpSpeedManager.s.c();
       if (prtpSwitchCo == null || prtpSwitchCo.enable != 1) {
          prtpSwitchCo = (prtpSwitchCo != null)? prtpSwitchCo.samplingRate: 0;
          if (prtpSwitchCo - (float)0 <= 0) {
             b = false;
          label_002e :
             boolean b1 = (b || a.f(prtpSpeedSwi))? true: false;
             boolean b2 = a.e(prtpSpeedSwi);
             a.h("PrtpThreads#updateRunning : startControlThread = "+b, 0, 2, null);
             String str = "PrtpThreads#updateRunning : controlThread isAlive = ";
             if (b) {
                str1 = str;
                c = f.c;
                uBoolean = (c != null)? Boolean.valueOf(c.c()): null;
                a.h(str1+uBoolean, 0, 2, null);
                c1 = f.c;
                if (c1 == null || c1.c() != true) {
                   f.c = new a();
                }
             }else {
                c1 = f.c;
                if (c1 != null) {
                   c1.d();
                }
                str1 = str;
                c = f.c;
                uBoolean = (c != null)? Boolean.valueOf(c.c()): null;
                a.h(str1+uBoolean, 0, 2, null);
             }
             a.h("PrtpThreads#updateRunning : startFeatureThread = "+b1, 0, 2, null);
             str1 = "PrtpThreads#updateRunning : featureThread isAlive = ";
             if (b1) {
                str2 = str1;
                a = f.a;
                uBoolean1 = (a != null)? Boolean.valueOf(a.c()): null;
                a.h(str2+uBoolean1, 0, 2, null);
                a = f.a;
                if (a == null || a.c() != true) {
                   f.a = new c();
                }
             }else {
                c a1 = f.a;
                if (a1 != null) {
                   a1.d();
                }
                str2 = str1;
                a = f.a;
                uBoolean1 = (a != null)? Boolean.valueOf(a.c()): null;
                a.h(str2+uBoolean1, 0, 2, null);
             }
             a.h("PrtpThreads#updateRunning : startReportThread = "+b2, 0, 2, null);
             str1 = "PrtpThreads#updateRunning : reportThread isAlive = ";
             if (b2) {
                str3 = str1;
                b3 = f.b;
                uBoolean1 = (b3 != null)? Boolean.valueOf(b3.c()): null;
                a.h(str3+uBoolean1, 0, 2, null);
                b3 = f.b;
                if (b3 == null || b3.c() != true) {
                   f.b = new d();
                }
             }else {
                d b4 = f.b;
                if (b4 != null) {
                   b4.d();
                }
                str3 = str1;
                b3 = f.b;
                uBoolean1 = (b3 != null)? Boolean.valueOf(b3.c()): null;
                a.h(str3+uBoolean1, 0, 2, null);
             }
             return;
          }
       }
       b = true;
       goto label_002e ;
    }
}
