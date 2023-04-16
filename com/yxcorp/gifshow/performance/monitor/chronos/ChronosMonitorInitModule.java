package com.yxcorp.gifshow.performance.monitor.chronos.ChronosMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import android.app.Application;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wf7.b$a;
import pwb.c;
import wf7.b;
import yf7.f;
import yf7.k;
import ekd.e0;

public final class ChronosMonitorInitModule extends PerformanceBaseInitModule	// class@000e66
{
    public final String q;

    public void ChronosMonitorInitModule(){
       super();
       this.q = "OnlineSystrace";
    }
    public void l0(Application p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChronosMonitorInitModule.class, "1")) {
          return;
       }
       a.p(p0, "application");
       super.l0(p0);
       b$a uoa = new b$a();
       c uoc = new c();
       a.q(uoc, "fileUploader");
       uoa.a = uoc;
       k.a(uoa.a());
       return;
    }
    public void n(){
    }
}
