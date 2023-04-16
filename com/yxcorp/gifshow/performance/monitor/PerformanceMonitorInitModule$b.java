package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b76.a;

public final class PerformanceMonitorInitModule$b implements Runnable	// class@000e4b
{
    public final PerformanceMonitorInitModule b;

    public void PerformanceMonitorInitModule$b(PerformanceMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PerformanceMonitorInitModule$b.class, "1")) {
          return;
       }
       this.b.k0(new a());
       return;
    }
}
