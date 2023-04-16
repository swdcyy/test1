package com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a$b;
import com.kwai.plugin.dva.work.c$c;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.a;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwb.a;
import q87.c;
import sj7.d;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig$Builder;
import swb.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.WatermarkMonitorPolicy$run$1$onSucceed$config$1;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.WatermarkMonitorPolicy$run$1$onSucceed$config$2;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitorConfig;
import yf7.f;
import yf7.k;
import com.kwai.performance.stability.leak.monitor.WatermarkMonitor;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.policy.b;
import k2b.s1;

public final class a$b implements c$c	// class@000e95
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().t("PLATFORM.WatermarkMonitorPolicy", "plugin memory_sanitizer_module install fail", objArray);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       a a;
       String[] stringArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          p0 = new WatermarkMonitorConfig$Builder();
          d focusPages = this.a.a.focusPages;
          a.q(focusPages, "focusPages");
          p0.c = focusPages;
          focusPages = this.a.a.ignoredList;
          a.q(focusPages, "ignoredSoList");
          p0.b = focusPages;
          a = this.a.a;
          p0.f = a.loopInterval;
          p0.e = a.monitorThreshold;
          p0.d = a.procMemRatio;
          WatermarkMonitorPolicy$run$1$onSucceed$config$1 iNSTANCE = WatermarkMonitorPolicy$run$1$onSucceed$config$1.INSTANCE;
          a.q(iNSTANCE, "usageTimeMillsInvoker");
          p0.g = iNSTANCE;
          focusPages = this.a.a.selectedList;
          a.q(focusPages, "selectedSoList");
          int i = 0;
          String str = (!focusPages.length)? 1: null;
          if (str) {
             stringArray = new String[]{"^/data/.*\\.so$"};
          }
          p0.a = stringArray;
          WatermarkMonitorPolicy$run$1$onSucceed$config$2 iNSTANCE1 = WatermarkMonitorPolicy$run$1$onSucceed$config$2.INSTANCE;
          a.q(iNSTANCE1, "memInfoUploader");
          p0.h = iNSTANCE1;
          k.a(p0.a());
          Object[] objArray = new Object[i];
          a.C().w("PLATFORM.WatermarkMonitorPolicy", "PLATFORM.WatermarkMonitorPolicy lunch", objArray);
          WatermarkMonitor.INSTANCE.startLoop();
          b.a(0x4b316083).T0(b.b);
       }
       return;
    }
}
