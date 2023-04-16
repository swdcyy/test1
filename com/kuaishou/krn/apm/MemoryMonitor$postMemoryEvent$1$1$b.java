package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$b;
import erd.c;
import msd.l;
import com.kuaishou.krn.apm.MemoryEvent;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MemoryMonitor$postMemoryEvent$1$1$b implements c	// class@0007cd
{
    public final l a;
    public final MemoryEvent b;

    public void MemoryMonitor$postMemoryEvent$1$1$b(l p0,MemoryEvent p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object a(Object p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MemoryMonitor$postMemoryEvent$1$1$b.class, "1")) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          this.a.invoke(this.b);
       }
       return l1.a;
    }
}
