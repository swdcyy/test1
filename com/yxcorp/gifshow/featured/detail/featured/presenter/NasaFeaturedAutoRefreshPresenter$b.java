package com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter$b;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.featured.detail.featured.presenter.NasaFeaturedAutoRefreshPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import h3.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public class NasaFeaturedAutoRefreshPresenter$b extends ViewPager$l	// class@000f56
{
    public final NasaFeaturedAutoRefreshPresenter b;

    public void NasaFeaturedAutoRefreshPresenter$b(NasaFeaturedAutoRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(NasaFeaturedAutoRefreshPresenter$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, NasaFeaturedAutoRefreshPresenter$b.class, "1")) {
          return;
       }
       NasaFeaturedAutoRefreshPresenter s = this.b.s;
       if (s == null) {
          return;
       }
       if (s != null && s.C0() != null) {
          if (p1 - null > 0) {
             p0++;
             p0 = this.b.s.q(p0);
          }else {
             p0 = this.b.s.q(p0);
          }
       }else {
          p0 = 0;
       }
       NasaFeaturedAutoRefreshPresenter$b tb = this.b;
       if (p0 > tb.u && tb.s.C()) {
          tb.u = p0;
       }
       return;
    }
}
