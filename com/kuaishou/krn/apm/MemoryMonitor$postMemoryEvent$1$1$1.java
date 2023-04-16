package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1;
import brd.e0;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1;
import com.kuaishou.krn.apm.MemoryEvent;
import java.lang.Object;
import brd.d0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1;
import java.util.Objects;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$1;
import com.facebook.react.bridge.CatalystInstance;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2;
import com.kuaishou.krn.apm.MemoryEventTiming;
import hi0.d;
import msd.l;
import erd.c;
import brd.a0;
import java.util.concurrent.TimeUnit;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$4;
import hi0.e;
import hi0.f;
import erd.g;
import crd.b;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$1;
import msd.a;

public final class MemoryMonitor$postMemoryEvent$1$1$1 implements e0	// class@0007c9
{
    public final MemoryMonitor$postMemoryEvent$1$1 b;
    public final MemoryEvent c;

    public void MemoryMonitor$postMemoryEvent$1$1$1(MemoryMonitor$postMemoryEvent$1$1 p0,MemoryEvent p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void b(d0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$postMemoryEvent$1$1$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1 opostMemoryE = new MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1(this, p0);
       MemoryMonitor$postMemoryEvent$1$1$1 tb = this.b;
       MemoryMonitor$postMemoryEvent$1$1 $catalystIns = tb.$catalystInstance;
       if ($catalystIns != null) {
          MemoryMonitor m = MemoryMonitor.m;
          MemoryMonitor$postMemoryEvent$1 i = tb.this$0.i;
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoidThreeRefs($catalystIns, opostMemoryE, i, m, MemoryMonitor.class, "19")) {
             a.p(opostMemoryE, "block");
             a.p(i, "timing");
             if ($catalystIns != null) {
                CoreMemoryInfo uCoreMemoryI = new CoreMemoryInfo();
                a.o(a0.g0(new MemoryMonitor$getCoreMemoryInfo$1($catalystIns, uCoreMemoryI), new MemoryMonitor$getCoreMemoryInfo$2($catalystIns, uCoreMemoryI, i), new d(opostMemoryE, uCoreMemoryI)).W(3, TimeUnit.SECONDS, new MemoryMonitor$getCoreMemoryInfo$4(opostMemoryE, uCoreMemoryI)).R(e.b, f.b), "Single.zip\(SingleSource \x20\x02> t?.printStackTrace\(\) }\)\x00");
             }else {
                opostMemoryE.invoke(null);
             }
          }
       }else {
          MemoryMonitor.m.l(new MemoryMonitor$postMemoryEvent$1$1$1$1(p0));
       }
       return;
    }
}
