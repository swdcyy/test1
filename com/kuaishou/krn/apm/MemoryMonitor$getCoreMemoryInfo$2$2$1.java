package com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2$2;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryMonitor$getCoreMemoryInfo$2;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import trd.s0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Long;
import java.util.HashMap;
import com.kuaishou.krn.apm.CoreUIMemoryInfo;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import brd.d0;

public final class MemoryMonitor$getCoreMemoryInfo$2$2$1 extends Lambda implements a	// class@0007bd
{
    public final Map $memoryStats;
    public final MemoryMonitor$getCoreMemoryInfo$2$2 this$0;

    public void MemoryMonitor$getCoreMemoryInfo$2$2$1(MemoryMonitor$getCoreMemoryInfo$2$2 p0,Map p1){
       this.this$0 = p0;
       this.$memoryStats = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$getCoreMemoryInfo$2$2$1.class, "1")) {
          return;
       }
       MemoryMonitor$getCoreMemoryInfo$2 c = this.this$0.a.c;
       MemoryMonitor$getCoreMemoryInfo$2$2$1 t$memoryStat = this.$memoryStats;
       a.o(t$memoryStat, "memoryStats");
       LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(t$memoryStat.size()));
       Iterator iterator = t$memoryStat.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          long l = uEntry.getValue().longValue() / (long)1024;
          linkedHashMa.put(key, Long.valueOf(l));
       }
       c.uiMemoryInfo = new CoreUIMemoryInfo(new HashMap(linkedHashMa));
       this.this$0.b.onSuccess(l1.a);
       return;
    }
}
