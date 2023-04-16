package com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableFeaturedFpsMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FeaturedExperimentUtil$enableFeaturedFpsMonitor$2 extends Lambda implements a	// class@000e90
{
    public static final FeaturedExperimentUtil$enableFeaturedFpsMonitor$2 INSTANCE;

    static {
       FeaturedExperimentUtil$enableFeaturedFpsMonitor$2.INSTANCE = new FeaturedExperimentUtil$enableFeaturedFpsMonitor$2();
    }
    public void FeaturedExperimentUtil$enableFeaturedFpsMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FeaturedExperimentUtil$enableFeaturedFpsMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableFeaturedFpsMonitor", true);
    }
}
