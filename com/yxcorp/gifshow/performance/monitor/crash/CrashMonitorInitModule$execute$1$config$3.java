package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$execute$1$config$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import com.kwai.robust2.patchmanager.c;
import java.util.List;

public final class CrashMonitorInitModule$execute$1$config$3 extends Lambda implements a	// class@0012a6
{
    public static final CrashMonitorInitModule$execute$1$config$3 INSTANCE;

    static {
       CrashMonitorInitModule$execute$1$config$3.INSTANCE = new CrashMonitorInitModule$execute$1$config$3();
    }
    public void CrashMonitorInitModule$execute$1$config$3(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, CrashMonitorInitModule$execute$1$config$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson().q(c.a().b());
    }
}
