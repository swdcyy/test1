package com.kwai.performance.fluency.page.monitor.tracker.AutoTracker$checkWriteScreen$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import ef7.b;
import java.util.Map;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import gf7.g;
import java.lang.StringBuilder;
import if7.b;
import com.kwai.performance.fluency.page.monitor.PageMonitorReporter;
import com.kwai.performance.fluency.page.monitor.tracker.AutoTracker;
import com.kwai.performance.monitor.base.Monitor;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import com.kwai.performance.fluency.page.monitor.tracker.Tracker;

public final class AutoTracker$checkWriteScreen$1 extends Lambda implements a	// class@0010c5
{
    public final String $pageKey;

    public void AutoTracker$checkWriteScreen$1(String p0){
       this.$pageKey = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       b n = b.n;
       PageStageEvent pageStageEve = n.j().get(this.$pageKey);
       if (pageStageEve != null && !g.b(pageStageEve, "OnFirstFrameDraw") - null) {
          pageStageEve.resultCode = "fail";
          pageStageEve.reason = "local-1";
          b.f(pageStageEve.resultCode+": "+pageStageEve.reason);
          AutoTracker iNSTANCE = AutoTracker.INSTANCE;
          PageMonitorReporter.b.a(pageStageEve, iNSTANCE.getMonitorConfig());
          n.d(this.$pageKey);
          iNSTANCE.markTraceSection(pageStageEve.pageName, iNSTANCE.getPageSimpleName(pageStageEve.pageName)+"_t1_fail_"+pageStageEve.reason);
          iNSTANCE.traceEnd(pageStageEve.pageName);
       }
       return;
    }
}
