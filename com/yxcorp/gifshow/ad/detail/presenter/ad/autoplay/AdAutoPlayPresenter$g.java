package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class AdAutoPlayPresenter$g implements g	// class@001591
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$g(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter$g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("SlidePlayAutoPlay", "广告计时"+p0, objArray);
          if (p0 != null && !p0.longValue() - 5) {
             p0 = this.b.q;
             if (p0 != null) {
                p0.L(0);
             }
          }
       }
       return;
    }
}
