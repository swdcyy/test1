package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1;
import com.facebook.react.bridge.CatalystInstance;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryEvent;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$a;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$b;
import msd.l;
import brd.e0;
import erd.c;
import brd.a0;
import java.util.concurrent.TimeUnit;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$4;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$c;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$d;
import erd.g;
import crd.b;

public final class MemoryMonitor$postMemoryEvent$1$1 extends Lambda implements a	// class@0007d1
{
    public final CatalystInstance $catalystInstance;
    public final MemoryMonitor$postMemoryEvent$1 this$0;

    public void MemoryMonitor$postMemoryEvent$1$1(MemoryMonitor$postMemoryEvent$1 p0,CatalystInstance p1){
       this.this$0 = p0;
       this.$catalystInstance = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$postMemoryEvent$1$1.class, "1")) {
          return;
       }
       MemoryMonitor$postMemoryEvent$1$1 tthis$0 = this.this$0;
       MemoryEvent memoryEvent = new MemoryEvent(tthis$0.d, tthis$0.e);
       MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1 opostMemoryE = new MemoryMonitor$postMemoryEvent$1$1$doOnGetMemorySuccess$1(this);
       a0.g0(new MemoryMonitor$postMemoryEvent$1$1$1(this, memoryEvent), new MemoryMonitor$postMemoryEvent$1$1$a(memoryEvent), new MemoryMonitor$postMemoryEvent$1$1$b(opostMemoryE, memoryEvent)).W(3, TimeUnit.SECONDS, new MemoryMonitor$postMemoryEvent$1$1$4(opostMemoryE, memoryEvent)).R(MemoryMonitor$postMemoryEvent$1$1$c.b, MemoryMonitor$postMemoryEvent$1$1$d.b);
       return;
    }
}
