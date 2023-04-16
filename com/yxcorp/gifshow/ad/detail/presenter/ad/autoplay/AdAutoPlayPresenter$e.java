package com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$e;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.presenter.ad.autoplay.AdAutoPlayPresenter$STOP_REASON;
import java.util.BitSet;

public final class AdAutoPlayPresenter$e implements g	// class@00158f
{
    public final AdAutoPlayPresenter b;

    public void AdAutoPlayPresenter$e(AdAutoPlayPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       AdAutoPlayPresenter$e uoe = AdAutoPlayPresenter$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoe, "1")) {
          if (b) {
             this.b.w.set(AdAutoPlayPresenter$STOP_REASON.STOP_BY_COMMENT.getType());
             this.b.V8();
          }else {
             this.b.w.clear(AdAutoPlayPresenter$STOP_REASON.STOP_BY_COMMENT.getType());
             this.b.R8();
          }
       }
       return;
    }
}
