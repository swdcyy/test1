package cra.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;

public class g	// class@00237f
{
    public static long a;
    public static long b;

    public void g(){
       super();
    }
    public static long a(long p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return (long)DateUtils.r(p0, System.currentTimeMillis());
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("newUser", b) || a.t().d("refluxUser", b)) {
          b = true;
       }
       return b;
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("newUser", false);
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("refluxUser", false);
    }
}
