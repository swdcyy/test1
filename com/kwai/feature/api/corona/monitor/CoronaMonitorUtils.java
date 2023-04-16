package com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$Companion$mConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$Companion$mStandardDevicePerformance$2;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class CoronaMonitorUtils	// class@000e1b
{
    public static final p a;
    public static final p b;
    public static final CoronaMonitorUtils$a c;

    static {
       CoronaMonitorUtils.c = new CoronaMonitorUtils$a(null);
       CoronaMonitorUtils.a = s.b(LazyThreadSafetyMode.SYNCHRONIZED, CoronaMonitorUtils$Companion$mConfig$2.INSTANCE);
       CoronaMonitorUtils.b = s.c(CoronaMonitorUtils$Companion$mStandardDevicePerformance$2.INSTANCE);
    }
    public void CoronaMonitorUtils(){
       super();
    }
    public static final void a(String p0,String p1,Throwable p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, null, null, CoronaMonitorUtils.class, "2")) {
          return;
       }
       CoronaMonitorUtils.c.b(p0, p1, p2, null);
       return;
    }
    public static final void b(String p0,String p1,String p2,String p3,Object p4,Map p5){
       CoronaMonitorUtils uCoronaMonit = CoronaMonitorUtils.class;
       if (PatchProxy.isSupport(uCoronaMonit)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uCoronaMonit, "4")) {
             return;
          }
       }
       CoronaMonitorUtils$a.d(CoronaMonitorUtils.c, p0, p1, p2, p3, p4, p5, false, 64, null);
       return;
    }
}
