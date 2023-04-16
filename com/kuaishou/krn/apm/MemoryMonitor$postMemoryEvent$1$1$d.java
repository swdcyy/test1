package com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1$1$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MemoryMonitor$postMemoryEvent$1$1$d implements g	// class@0007cf
{
    public static final MemoryMonitor$postMemoryEvent$1$1$d b;

    static {
       MemoryMonitor$postMemoryEvent$1$1$d.b = new MemoryMonitor$postMemoryEvent$1$1$d();
    }
    public void MemoryMonitor$postMemoryEvent$1$1$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor$postMemoryEvent$1$1$d.class, "1")) {
       }else if(p0 != null){
          p0.printStackTrace();
       }
       return;
    }
}
