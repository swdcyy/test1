package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import brd.d0;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MemoryMonitor$postMemoryEvent$1$1$1$1 extends Lambda implements a	// class@0007c6
{
    public final d0 $it;

    public void MemoryMonitor$postMemoryEvent$1$1$1$1(d0 p0){
       this.$it = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$postMemoryEvent$1$1$1$1.class, "1")) {
          return;
       }
       this.$it.onSuccess(l1.a);
       return;
    }
}
