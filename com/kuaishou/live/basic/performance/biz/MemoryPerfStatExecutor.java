package com.kuaishou.live.basic.performance.biz.MemoryPerfStatExecutor;
import com.kuaishou.live.basic.performance.biz.PerfStatExecutor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.performance.overhead.memory.monitor.MemoryMonitor;
import com.kuaishou.live.basic.performance.biz.MemoryPerfStatExecutor$onStartStat$1;
import msd.p;

public final class MemoryPerfStatExecutor extends PerfStatExecutor	// class@000ced
{

    public void MemoryPerfStatExecutor(){
       super();
    }
    public void d(long p0){
       MemoryPerfStatExecutor memoryPerfSt = MemoryPerfStatExecutor.class;
       if (PatchProxy.isSupport(memoryPerfSt) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, memoryPerfSt, "1")) {
          return;
       }
       MemoryMonitor.startSection$default(MemoryMonitor.INSTANCE, "live_biz_perf", null, false, 0, new MemoryPerfStatExecutor$onStartStat$1(this, p0), 14, null);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, MemoryPerfStatExecutor.class, "2")) {
          return;
       }
       MemoryMonitor.stopSection$default(MemoryMonitor.INSTANCE, "live_biz_perf", false, 2, null);
       return;
    }
}
