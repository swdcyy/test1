package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$9;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.RomUtils;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$9 extends Lambda implements a	// class@00128e
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$9 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$9.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$9();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$9(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RomUtils.c();
       a.o(obj, "RomUtils.getCpuPlatform\(\)");
       return obj;
    }
}
