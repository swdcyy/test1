package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$4;
import brd.e0;
import msd.l;
import com.kuaishou.krn.apm.MemoryEvent;
import java.lang.Object;
import brd.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$4$1;
import msd.a;

public final class MemoryMonitor$postMemoryEvent$1$1$4 implements e0	// class@0007cb
{
    public final l b;
    public final MemoryEvent c;

    public void MemoryMonitor$postMemoryEvent$1$1$4(l p0,MemoryEvent p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void b(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$postMemoryEvent$1$1$4.class, "1")) {
          return;
       }
       a.p(p0, "it");
       MemoryMonitor.m.l(new MemoryMonitor$postMemoryEvent$1$1$4$1(this));
       return;
    }
}
