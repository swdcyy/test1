package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule;
import com.kwai.performance.overhead.io.monitor.IoMonitorWBConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import dg7.a;
import mwb.b;
import com.kwai.performance.overhead.io.monitor.IoMonitorDiskUsageConfig;
import yf7.r;
import yf7.f;
import yf7.k;
import com.kwai.performance.overhead.io.monitor.IoMonitor;
import com.kwai.performance.monitor.base.Monitor;

public final class IOMonitorInitModule$f implements Runnable	// class@000e84
{
    public final IOMonitorInitModule b;
    public final IoMonitorWBConfig c;

    public void IOMonitorInitModule$f(IOMonitorInitModule p0,IoMonitorWBConfig p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, IOMonitorInitModule$f.class, "1")) {
          return;
       }
       this.b.w0(false);
       Log.b("io-detector", "resume monitorDiskUseage");
       a uoa = new a();
       b.n((b.d() + 1));
       String[] stringArray = new String[]{"******"};
       uoa.b(new IoMonitorDiskUsageConfig(1, b.f(), b.g(), stringArray));
       uoa.c(this.c);
       uoa.d(r.a());
       k.a(uoa);
       k.d(IoMonitor.class).checkStartMonitor(1);
       return;
    }
}
