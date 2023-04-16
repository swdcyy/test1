package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$h;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class AdAutoPlayPresenter$h implements g	// class@001592
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$h(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdAutoPlayPresenter$h.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("SlidePlayAutoPlay", "广告计时异常"+p0.getMessage(), objArray);
          this.b.P8();
       }
       return;
    }
}
