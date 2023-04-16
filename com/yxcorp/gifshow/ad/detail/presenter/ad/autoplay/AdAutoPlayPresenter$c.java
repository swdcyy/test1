package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$c;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public final class AdAutoPlayPresenter$c implements b$b	// class@00158c
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$c(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       AdAutoPlayPresenter$c uoc = AdAutoPlayPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0 == 3) {
          AdAutoPlayPresenter$c tb = this.b;
          if (tb.v != null) {
             tb.V8();
             tb.v = false;
          }
       }
       return;
    }
}
