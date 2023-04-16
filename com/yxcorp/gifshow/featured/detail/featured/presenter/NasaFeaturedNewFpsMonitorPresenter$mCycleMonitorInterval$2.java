package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2;
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

public final class NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2 extends Lambda implements a	// class@000f62
{
    public static final NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2 INSTANCE;

    static {
       NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2.INSTANCE = new NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2();
    }
    public void NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2(){
       super(0);
    }
    public final long invoke(){
       long l;
       e obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorInterval$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = SlidePerformanceExp.b().cycleMonitorInterval;
       if (obj <= 0) {
          l = 300;
       }
       return (l * (long)1000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
