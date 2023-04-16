package com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$4;
import brd.e0;
import msd.l;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import java.lang.Object;
import brd.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$4$1;
import msd.a;

public final class MemoryMonitor$getCoreMemoryInfo$4 implements e0	// class@0007c1
{
    public final l b;
    public final CoreMemoryInfo c;

    public void MemoryMonitor$getCoreMemoryInfo$4(l p0,CoreMemoryInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void b(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$getCoreMemoryInfo$4.class, "1")) {
          return;
       }
       a.p(p0, "it");
       MemoryMonitor.m.l(new MemoryMonitor$getCoreMemoryInfo$4$1(this));
       return;
    }
}
