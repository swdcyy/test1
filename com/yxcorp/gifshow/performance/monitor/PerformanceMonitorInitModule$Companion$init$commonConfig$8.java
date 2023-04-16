package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$8;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.RomUtils;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$8 extends Lambda implements a	// class@00128d
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$8 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$8.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$8();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$8(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       String obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = RomUtils.d();
       a.o(obj, "RomUtils.getFingerprint\(\)");
       return obj;
    }
}
