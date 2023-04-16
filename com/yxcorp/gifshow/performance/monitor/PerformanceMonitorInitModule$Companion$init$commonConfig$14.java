package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$14;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import km8.b;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$14 extends Lambda implements l	// class@001284
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$14 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$14.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$14();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$14(){
       super(1);
    }
    public final SharedPreferences invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PerformanceMonitorInitModule$Companion$init$commonConfig$14.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       p0 = b.c(p0, 0);
       a.o(p0, "PreferenceContext.get\(it, Context.MODE_PRIVATE\)");
       return p0;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
