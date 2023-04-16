package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1;
import com.kuaishou.krn.apm.MemoryEvent;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1;
import java.util.Objects;
import java.lang.ref.WeakReference;
import sj0.b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import kotlin.jvm.internal.a;
import brd.d0;

public final class MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1 extends Lambda implements a	// class@0007c7
{
    public final CoreMemoryInfo $coreMemoryInfo;
    public final MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1 this$0;

    public void MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1(MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1 p0,CoreMemoryInfo p1){
       this.this$0 = p0;
       this.$coreMemoryInfo = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1.class, "1")) {
          return;
       }
       MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1 this$0 = this.this$0.this$0;
       MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1 t$coreMemory = this.$coreMemoryInfo;
       this$0.c.coreMemoryInfo = t$coreMemory;
       MemoryMonitor m = MemoryMonitor.m;
       MemoryMonitor$postMemoryEvent$1 h = this$0.b.this$0.h;
       Objects.requireNonNull(m);
       if (!PatchProxy.applyVoidTwoRefs(h, t$coreMemory, m, MemoryMonitor.class, "17")) {
          b uob = h.get();
          if (uob != null && t$coreMemory != null) {
             Iterator iterator = m.h().entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                b uob1 = uEntry.getKey().get();
                if (uob1 == null) {
                   iterator.remove();
                }else if(a.g(uob1.e(), uob.e())){
                   h = uEntry.getKey();
                }
             }
             m.h().put(h, t$coreMemory);
          }
       }
       this.this$0.$it.onSuccess(l1.a);
       return;
    }
}
