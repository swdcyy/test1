package com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$1;
import brd.e0;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import java.lang.Object;
import brd.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$1$1;
import com.facebook.react.bridge.MemoryStatsCallback;
import com.facebook.react.bridge.MemoryStatsProvider;

public final class MemoryMonitor$getCoreMemoryInfo$1 implements e0	// class@0007bc
{
    public final CatalystInstance b;
    public final CoreMemoryInfo c;

    public void MemoryMonitor$getCoreMemoryInfo$1(CatalystInstance p0,CoreMemoryInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void b(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$getCoreMemoryInfo$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.b.getMemoryStats(new MemoryMonitor$getCoreMemoryInfo$1$1(this, p0));
       return;
    }
}
