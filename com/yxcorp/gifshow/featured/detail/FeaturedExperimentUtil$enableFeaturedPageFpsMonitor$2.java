package com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2 extends Lambda implements a	// class@000e92
{
    public static final FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2 INSTANCE;

    static {
       FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2.INSTANCE = new FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2();
    }
    public void FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("enable_featured_page_fps_monitor", b) && a.t().d("FluencyFpsRate", b)) {
          b = true;
       }
       return b;
    }
}
