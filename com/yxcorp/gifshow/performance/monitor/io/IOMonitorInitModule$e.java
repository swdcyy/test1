package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class IOMonitorInitModule$e implements Runnable	// class@000e83
{
    public final IOMonitorInitModule b;

    public void IOMonitorInitModule$e(IOMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IOMonitorInitModule$e.class, "1")) {
          return;
       }
       this.b.w0(true);
       return;
    }
}
