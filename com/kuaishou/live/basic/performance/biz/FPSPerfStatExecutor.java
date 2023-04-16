package com.kuaishou.live.basic.performance.biz.FPSPerfStatExecutor;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.kuaishou.live.basic.performance.biz.FPSPerfStatExecutor$onStartStat$1;
import msd.p;
import qe7.c;
import qe7.d;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;

public final class FPSPerfStatExecutor extends PerfStatExecutor	// class@000ce3
{

    public void FPSPerfStatExecutor(){
       super();
    }
    public void d(long p0){
       FPSPerfStatExecutor uFPSPerfStat = FPSPerfStatExecutor.class;
       if (PatchProxy.isSupport(uFPSPerfStat) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uFPSPerfStat, "1")) {
          return;
       }
       Activity uActivity = this.b();
       if (uActivity != null) {
          FpsMonitor.startSection$default("live_biz_perf", uActivity, new FPSPerfStatExecutor$onStartStat$1(this, p0), null, null, 24, null);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, FPSPerfStatExecutor.class, "2")) {
          return;
       }
       Activity uActivity = this.b();
       if (uActivity != null) {
          FpsMonitor.stopSection("live_biz_perf", uActivity);
       }
       return;
    }
}
