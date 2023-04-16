package com.yxcorp.gifshow.performance.monitor.page.PageMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.page.PageMonitorInitModule$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mwb.b;
import android.content.SharedPreferences;
import vtd.b;
import yf7.f;
import yf7.k;
import com.yxcorp.gifshow.performance.monitor.page.PageMonitorInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class PageMonitorInitModule extends PerformanceBaseInitModule	// class@000eb7
{
    public static final PageMonitorInitModule$a q;

    static {
       PageMonitorInitModule.q = new PageMonitorInitModule$a(null);
    }
    public void PageMonitorInitModule(){
       super();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, PageMonitorInitModule.class, "1")) {
          return;
       }
       if (b.a.getBoolean("PageSpeedMonitorOpen", false)) {
          k.a(new b());
       }
       e.g(PageMonitorInitModule$b.b, "PageSpeedMonitor_Get_Kswitch");
       return;
    }
}
