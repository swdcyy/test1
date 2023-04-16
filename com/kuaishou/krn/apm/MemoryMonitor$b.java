package com.kuaishou.krn.apm.MemoryMonitor$b;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MemoryMonitor$b implements Runnable	// class@0007b8
{
    public final a b;

    public void MemoryMonitor$b(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$b.class, "1")) {
          return;
       }
       this.b.invoke();
       return;
    }
}
