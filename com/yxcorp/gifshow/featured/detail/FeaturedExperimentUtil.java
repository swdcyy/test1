package com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil;
import com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableFeaturedFpsMonitor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableCommonInsertCard$2;
import com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2;
import com.yxcorp.gifshow.featured.detail.FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class FeaturedExperimentUtil	// class@000e93
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final FeaturedExperimentUtil e;

    static {
       FeaturedExperimentUtil.e = new FeaturedExperimentUtil();
       FeaturedExperimentUtil.a = s.c(FeaturedExperimentUtil$enableFeaturedFpsMonitor$2.INSTANCE);
       FeaturedExperimentUtil.b = s.c(FeaturedExperimentUtil$enableCommonInsertCard$2.INSTANCE);
       FeaturedExperimentUtil.c = s.c(FeaturedExperimentUtil$enableFeaturedPageFpsMonitor$2.INSTANCE);
       FeaturedExperimentUtil.d = s.c(FeaturedExperimentUtil$enableFeaturedNewFpsMonitor$2.INSTANCE);
    }
    public void FeaturedExperimentUtil(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, FeaturedExperimentUtil.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = FeaturedExperimentUtil.a.getValue();
       }
       return obj.booleanValue();
    }
}
