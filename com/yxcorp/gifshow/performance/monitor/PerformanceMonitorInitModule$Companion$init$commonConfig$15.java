package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$15;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import android.content.SharedPreferences;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import vid.b;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$15 extends Lambda implements l	// class@001285
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$15 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$15.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$15();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$15(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Set invoke(SharedPreferences p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PerformanceMonitorInitModule$Companion$init$commonConfig$15.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       Set set = b.a(p0);
       a.o(set, "KwaiSharedPreferences.getKeySet\(it\)");
       return set;
    }
}
