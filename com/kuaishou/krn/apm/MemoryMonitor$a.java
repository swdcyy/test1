package com.kuaishou.krn.apm.MemoryMonitor$a;
import java.lang.Runnable;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.MemoryMonitor$getAvailableMemory$1;
import android.app.ActivityManager$MemoryInfo;

public final class MemoryMonitor$a implements Runnable	// class@0007b7
{
    public final l b;

    public void MemoryMonitor$a(l p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitor$a.class, "1")) {
          return;
       }
       this.b.invoke(MemoryMonitor$getAvailableMemory$1.INSTANCE.invoke());
       return;
    }
}
