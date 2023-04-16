package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import uy6.e;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import java.lang.Long;

public final class NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2 extends Lambda implements a	// class@000f63
{
    public static final NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2 INSTANCE;

    static {
       NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2.INSTANCE = new NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2();
    }
    public void NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2(){
       super(0);
    }
    public final long invoke(){
       long l;
       e obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter$mFeatureMonitorDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = SlidePerformanceExp.b().featureNewFpsDur;
       if (obj <= 0) {
          l = 60;
       }
       return (l * (long)1000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
