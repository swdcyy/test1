package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1;
import brd.d0;
import java.lang.Object;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryMonitor;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1;
import msd.a;

public final class MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1 extends Lambda implements l	// class@0007c8
{
    public final d0 $it;
    public final MemoryMonitor$postMemoryEvent$1$1$1 this$0;

    public void MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1(MemoryMonitor$postMemoryEvent$1$1$1 p0,d0 p1){
       this.this$0 = p0;
       this.$it = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(CoreMemoryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1.class, "1")) {
          return;
       }
       MemoryMonitor.m.l(new MemoryMonitor$postMemoryEvent$1$1$1$doOnGetCoreMemorySuccess$1$1(this, p0));
       return;
    }
}
