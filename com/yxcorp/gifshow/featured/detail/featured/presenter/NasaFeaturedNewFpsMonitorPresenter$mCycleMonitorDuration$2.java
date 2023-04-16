package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2;
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

public final class NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2 extends Lambda implements a	// class@000f61
{
    public static final NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2 INSTANCE;

    static {
       NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2.INSTANCE = new NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2();
    }
    public void NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2(){
       super(0);
    }
    public final long invoke(){
       long l;
       e obj = PatchProxy.apply(null, this, NasaFeaturedNewFpsMonitorPresenter$mCycleMonitorDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = SlidePerformanceExp.b().cycleMonitorDur;
       if (obj <= 0) {
          l = 10;
       }
       return (l * (long)1000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
