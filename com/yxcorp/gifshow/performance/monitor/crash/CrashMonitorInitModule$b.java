package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$b;
import pg7.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class CrashMonitorInitModule$b implements c	// class@0012a0
{
    public static final CrashMonitorInitModule$b a;

    static {
       CrashMonitorInitModule$b.a = new CrashMonitorInitModule$b();
    }
    public void CrashMonitorInitModule$b(){
       super();
    }
    public final void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CrashMonitorInitModule$b.class, "1")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
}
