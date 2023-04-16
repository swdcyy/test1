package com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2$2;
import com.facebook.react.bridge.MemoryStatsCallback;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2;
import brd.d0;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2$2$1;
import msd.a;

public final class MemoryMonitor$getCoreMemoryInfo$2$2 implements MemoryStatsCallback	// class@0007be
{
    public final MemoryMonitor$getCoreMemoryInfo$2 a;
    public final d0 b;

    public void MemoryMonitor$getCoreMemoryInfo$2$2(MemoryMonitor$getCoreMemoryInfo$2 p0,d0 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onMemoryStatsCollected(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$getCoreMemoryInfo$2$2.class, "1")) {
          return;
       }
       MemoryMonitor.m.l(new MemoryMonitor$getCoreMemoryInfo$2$2$1(this, p0));
       return;
    }
}
