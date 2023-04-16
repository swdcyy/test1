package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.a;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$2 extends Lambda implements a	// class@001287
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$2 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$2.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$2();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.m;
       a.o(obj, "AppEnv.VERSION");
       return obj;
    }
}
