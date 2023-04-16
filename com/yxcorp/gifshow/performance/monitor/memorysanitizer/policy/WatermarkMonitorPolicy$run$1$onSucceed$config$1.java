package com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.WatermarkMonitorPolicy$run$1$onSucceed$config$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import o56.d;
import java.lang.Long;

public final class WatermarkMonitorPolicy$run$1$onSucceed$config$1 extends Lambda implements a	// class@000e92
{
    public static final WatermarkMonitorPolicy$run$1$onSucceed$config$1 INSTANCE;

    static {
       WatermarkMonitorPolicy$run$1$onSucceed$config$1.INSTANCE = new WatermarkMonitorPolicy$run$1$onSucceed$config$1();
    }
    public void WatermarkMonitorPolicy$run$1$onSucceed$config$1(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, WatermarkMonitorPolicy$run$1$onSucceed$config$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (System.currentTimeMillis() - d.h);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
