package com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$d;
import ch7.i$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import yf7.h;

public final class OOMMonitorInitModule$d implements i$b	// class@000e9b
{
    public static final OOMMonitorInitModule$d a;

    static {
       OOMMonitorInitModule$d.a = new OOMMonitorInitModule$d();
    }
    public void OOMMonitorInitModule$d(){
       super();
    }
    public final void a(long p0,long p1){
       OOMMonitorInitModule$d uod = OOMMonitorInitModule$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uod, "1")) {
          return;
       }
       h.d("OOMMonitorInitModule", "LeakFix.afterFix\(\) | Cost = "+p0+", Free = "+p1);
       return;
    }
}
