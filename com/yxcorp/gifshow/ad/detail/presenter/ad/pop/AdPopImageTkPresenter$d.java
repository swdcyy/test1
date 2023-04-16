package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$d;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import java.lang.Object;
import wl9.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AdPopImageTkPresenter$d implements g	// class@0015ff
{
    public final AdPopImageTkPresenter b;

    public void AdPopImageTkPresenter$d(AdPopImageTkPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdPopImageTkPresenter$d.class, "1")) {
       }else {
          this.b.onHomeSplashStateEvent(p0);
       }
       return;
    }
}
