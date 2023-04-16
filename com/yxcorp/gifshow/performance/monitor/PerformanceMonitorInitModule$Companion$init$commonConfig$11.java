package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$11;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.c;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$11 extends Lambda implements a	// class@001281
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$11 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$11.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$11();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$11(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ExecutorService invoke(){
       ExecutorService obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$11.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.c();
       a.o(obj, "Async.getCacheThreadPoolExecutor\(\)");
       return obj;
    }
}
