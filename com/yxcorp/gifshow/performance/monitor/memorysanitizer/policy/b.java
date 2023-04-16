package com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.b;
import k2b.s1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor;

public final class b implements s1	// class@000e97
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void d(String p0,int p1,String p2){
       WatermarkMonitor iNSTANCE;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2) {
             iNSTANCE = WatermarkMonitor.INSTANCE;
             if (p0 == null) {
                p0 = "unknown";
             }
             iNSTANCE.exitOwner(p0);
          }
       }else {
          iNSTANCE = WatermarkMonitor.INSTANCE;
          if (p0 == null) {
             p0 = "unknown";
          }
          iNSTANCE.entryOwner(p0);
       }
       return;
    }
}
