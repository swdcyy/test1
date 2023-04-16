package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import pwb.d;
import ekd.k1;

public final class CrashMonitorInitModule$d implements Runnable	// class@0012a2
{
    public final CrashMonitorInitModule b;

    public void CrashMonitorInitModule$d(CrashMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CrashMonitorInitModule$d.class, "1")) {
          return;
       }
       CrashMonitorInitModule$d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, CrashMonitorInitModule.class, "9")) {
          k1.o(d.b);
       }
       return;
    }
}
