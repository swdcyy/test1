package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$f;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$STOP_REASON;
import java.util.BitSet;

public final class AdAutoPlayPresenter$f implements g	// class@001590
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$f(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       AdAutoPlayPresenter$f uof = AdAutoPlayPresenter$f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uof, "1")) {
          uof = this.b;
          if (uof.t != null) {
             if (b) {
                uof.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU.getType());
                this.b.V8();
             }else {
                uof.w.clear(AdAutoPlayPresenter$STOP_REASON.STOP_BY_SLIDE_MENU.getType());
                this.b.R8();
             }
          }
       }
       return;
    }
}
