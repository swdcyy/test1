package com.yxcorp.gifshow.performance.monitor.jank.JankMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig$Builder;
import com.yxcorp.gifshow.performance.monitor.jank.JankMonitorInitModule$a;
import kotlin.jvm.internal.a;
import pwb.c;
import com.kwai.performance.fluency.jank.monitor.JankMonitorConfig;
import yf7.f;
import yf7.k;

public final class JankMonitorInitModule extends PerformanceBaseInitModule	// class@000e89
{

    public void JankMonitorInitModule(){
       super();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, JankMonitorInitModule.class, "1")) {
          return;
       }
       JankMonitorConfig$Builder uBuilder = new JankMonitorConfig$Builder();
       uBuilder.a = true;
       uBuilder.b = true;
       JankMonitorInitModule$a uoa = new JankMonitorInitModule$a();
       a.p(uoa, "invoker");
       uBuilder.e = uoa;
       c uoc = new c();
       a.p(uoc, "fileUploader");
       uBuilder.f = uoc;
       k.a(uBuilder.a());
       return;
    }
}
