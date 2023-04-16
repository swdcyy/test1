package com.kwai.performance.overhead.gpu.monitor.GpuMonitor$mActivityManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.app.ActivityManager;
import android.app.Application;
import yf7.k;
import kotlin.Result;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import kotlin.TypeCastException;
import java.lang.Throwable;
import qrd.j0;

public final class GpuMonitor$mActivityManager$2 extends Lambda implements a	// class@00114b
{
    public static final GpuMonitor$mActivityManager$2 INSTANCE;

    static {
       GpuMonitor$mActivityManager$2.INSTANCE = new GpuMonitor$mActivityManager$2();
    }
    public void GpuMonitor$mActivityManager$2(){
       super(0);
    }
    public final ActivityManager invoke(){
       ActivityManager systemServic = k.b().getBaseContext().getSystemService("activity");
       if (systemServic == null) {
          throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
       }
       systemServic = Result.constructor-impl(systemServic);
       if (Result.isFailure-impl(systemServic)) {
          systemServic = null;
       }
       return systemServic;
    }
    public Object invoke(){
       return this.invoke();
    }
}
