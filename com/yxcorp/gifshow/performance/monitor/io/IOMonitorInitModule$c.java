package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class IOMonitorInitModule$c implements Runnable	// class@0012bb
{
    public final IOMonitorInitModule b;

    public void IOMonitorInitModule$c(IOMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IOMonitorInitModule$c.class, "1")) {
          return;
       }
       this.b.q0();
       return;
    }
}
