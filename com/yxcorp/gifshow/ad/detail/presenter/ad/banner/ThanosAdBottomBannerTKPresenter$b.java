package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$b;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import vq4.d;

public final class ThanosAdBottomBannerTKPresenter$b implements g	// class@001599
{
    public final ThanosAdBottomBannerTKPresenter b;
    public final String c;

    public void ThanosAdBottomBannerTKPresenter$b(ThanosAdBottomBannerTKPresenter p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (this.b.p != null) {
          c f = p0.F;
          if (f != null) {
             f.C = 120;
          }
          p0.n0 = this.c;
       }
       return;
    }
}
