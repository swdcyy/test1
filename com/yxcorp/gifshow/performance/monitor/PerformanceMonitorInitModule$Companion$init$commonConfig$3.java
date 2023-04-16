package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$3 extends Lambda implements a	// class@001288
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$3 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$3.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$3();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$3(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.k;
       a.o(obj, "AppEnv.CHANNEL");
       return obj;
    }
}
