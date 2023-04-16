package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import com.kwai.performance.fluency.page.monitor.tracker.Tracker;

public final class NewPageMonitorInitModule$initPageMonitor$5 extends Lambda implements l	// class@000ea9
{
    public static final NewPageMonitorInitModule$initPageMonitor$5 INSTANCE;

    static {
       NewPageMonitorInitModule$initPageMonitor$5.INSTANCE = new NewPageMonitorInitModule$initPageMonitor$5();
    }
    public void NewPageMonitorInitModule$initPageMonitor$5(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Object p0){
       PageMonitor obj = PatchProxy.applyOneRefs(p0, this, NewPageMonitorInitModule$initPageMonitor$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       if (!p0 instanceof HomeItemFragment) {
          obj = PageMonitor.INSTANCE;
          if (!a.g(obj.getPageName(p0), "com.yxcorp.gifshow.featured.detail.featured.milano.HomeFeaturedMilanoContainerFragment") && !a.g(obj.getPageName(p0), "com.yxcorp.gifshow.corona.bifeeds.tv.CoronaBiTVFeedsFragment")) {
             return false;
          }
       }
       return true;
    }
}
