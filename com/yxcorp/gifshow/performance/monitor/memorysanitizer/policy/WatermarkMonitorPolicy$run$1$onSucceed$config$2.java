package com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.WatermarkMonitorPolicy$run$1$onSucceed$config$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yf7.i;
import yf7.d;
import yf7.d$a;

public final class WatermarkMonitorPolicy$run$1$onSucceed$config$2 extends Lambda implements l	// class@000e93
{
    public static final WatermarkMonitorPolicy$run$1$onSucceed$config$2 INSTANCE;

    static {
       WatermarkMonitorPolicy$run$1$onSucceed$config$2.INSTANCE = new WatermarkMonitorPolicy$run$1$onSucceed$config$2();
    }
    public void WatermarkMonitorPolicy$run$1$onSucceed$config$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WatermarkMonitorPolicy$run$1$onSucceed$config$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       d$a.b(i.a, "pf_memory_watermark", p0, false, 4, null);
       return;
    }
}
