package com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$1$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$1$1;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Long;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$1;
import java.lang.Number;
import com.kuaishou.krn.apm.V8MemoryInfo;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import brd.d0;

public final class MemoryMonitor$getCoreMemoryInfo$1$1$1 extends Lambda implements a	// class@0007ba
{
    public final Map $memoryStats;
    public final MemoryMonitor$getCoreMemoryInfo$1$1 this$0;

    public void MemoryMonitor$getCoreMemoryInfo$1$1$1(MemoryMonitor$getCoreMemoryInfo$1$1 p0,Map p1){
       this.this$0 = p0;
       this.$memoryStats = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$getCoreMemoryInfo$1$1$1.class, "1")) {
          return;
       }
       MemoryMonitor$getCoreMemoryInfo$1$1$1 t$memoryStat = this.$memoryStats;
       String str = "memoryStats";
       a.o(t$memoryStat, str);
       Long longx = t$memoryStat.get("SharedRuntimeCount");
       if (longx == null) {
          longx = Long.valueOf(1);
       }
       MemoryMonitor$getCoreMemoryInfo$1 c = this.this$0.a.c;
       MemoryMonitor$getCoreMemoryInfo$1$1$1 t$memoryStat1 = this.$memoryStats;
       a.o(t$memoryStat1, str);
       Number number = t$memoryStat1.get("total_physical_size");
       long l = 0;
       if (number == null) {
          number = Long.valueOf(l);
       }
       long l1 = (long)1024;
       a.o(longx, "sharedRuntimeCount");
       int i = (int)((number.longValue() / l1) / longx.longValue());
       MemoryMonitor$getCoreMemoryInfo$1$1$1 t$memoryStat2 = this.$memoryStats;
       a.o(t$memoryStat2, str);
       Number number1 = t$memoryStat2.get("total_heap_size");
       if (number1 == null) {
          number1 = Long.valueOf(l);
       }
       c.v8MemoryInfo = new V8MemoryInfo(i, (int)((number1.longValue() / l1) / longx.longValue()));
       this.this$0.b.onSuccess(l1.a);
       return;
    }
}
