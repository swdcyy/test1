package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$a;
import brd.e0;
import com.kuaishou.krn.apm.MemoryEvent;
import java.lang.Object;
import brd.d0;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.apm.MemoryMonitor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.KdsMemoryInfo;
import hi0.c;
import java.util.Objects;
import qrd.p;
import java.lang.Number;
import qrd.l1;

public final class MemoryMonitor$postMemoryEvent$1$1$a implements e0	// class@0007cc
{
    public final MemoryEvent b;

    public void MemoryMonitor$postMemoryEvent$1$1$a(MemoryEvent p0){
       this.b = p0;
       super();
    }
    public final void b(d0 p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MemoryMonitor memoryMonito = MemoryMonitor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$postMemoryEvent$1$1$a.class, "1")) {
          return;
       }
       a.p(p0, "it");
       MemoryMonitor m = MemoryMonitor.m;
       c.a(this.b, m.j());
       MemoryMonitor$postMemoryEvent$1$1$a tb = this.b;
       Objects.requireNonNull(m);
       Number number = PatchProxy.apply(null, m, memoryMonito, "2");
       if (number == patchProxyRe) {
          number = MemoryMonitor.i.getValue();
       }
       tb.maxJvmHeapSize = number.longValue();
       tb = this.b;
       Objects.requireNonNull(m);
       Number number1 = PatchProxy.apply(null, m, memoryMonito, "3");
       if (number1 == patchProxyRe) {
          number1 = MemoryMonitor.j.getValue();
       }
       tb.maxRamSize = number1.longValue();
       p0.onSuccess(l1.a);
       return;
    }
}
