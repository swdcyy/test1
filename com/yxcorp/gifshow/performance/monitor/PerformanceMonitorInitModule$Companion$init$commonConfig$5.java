package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$5 extends Lambda implements a	// class@00128a
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$5 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$5.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$5();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$5(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.a;
       a.o(obj, "AppEnv.DEVICE_ID");
       return obj;
    }
}
