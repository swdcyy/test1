package com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import uy6.e;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;

public final class FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2 extends Lambda implements a	// class@000e91
{
    public static final FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2 INSTANCE;

    static {
       FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2.INSTANCE = new FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2();
    }
    public void FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!FpsMonitor.containsScene("scene_nasa_featured_slide_fps") || (SlidePerformanceExp.b().b() || (FpsMonitor.containsScene("scene_nasa_featured_slide_cycle_fps") && SlidePerformanceExp.b().a())))? true: false;
       return b;
    }
}
