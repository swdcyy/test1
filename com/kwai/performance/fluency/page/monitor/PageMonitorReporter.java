package com.kwai.performance.fluency.page.monitor.PageMonitorReporter;
import java.lang.Object;
import com.kwai.performance.fluency.page.monitor.model.PageStageEvent;
import com.kwai.performance.fluency.page.monitor.PageMonitorConfig;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.PageMonitorReporter$report$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class PageMonitorReporter	// class@00109e
{
    public static String a = "";
    public static final PageMonitorReporter b;

    static {
       PageMonitorReporter.b = new PageMonitorReporter();
    }
    public void PageMonitorReporter(){
       super();
    }
    public final void a(PageStageEvent p0,PageMonitorConfig p1){
       a.p(p0, "event");
       a.p(p1, "monitorConfig");
       if (a.g(PageMonitorReporter.a, p0.uuid)) {
          return;
       }
       PageMonitorReporter.a = p0.uuid;
       Monitor_ThreadKt.b(0, new PageMonitorReporter$report$1(p1, p0), 1, null);
       return;
    }
}
