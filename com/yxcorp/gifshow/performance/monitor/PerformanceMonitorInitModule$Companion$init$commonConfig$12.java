package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$12;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Handler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.g;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$12 extends Lambda implements a	// class@001282
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$12 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$12.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$12();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$12(){
       super(0);
    }
    public final Handler invoke(){
       Handler obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$12.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.a();
       a.o(obj, "PerformanceThread.getHandler\(\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
