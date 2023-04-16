package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$h;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import vz8.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ToggleState;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$b;

public final class ThanosAdWebCardTachikomaPresenter$h implements g	// class@001621
{
    public final ThanosAdWebCardTachikomaPresenter b;

    public void ThanosAdWebCardTachikomaPresenter$h(ThanosAdWebCardTachikomaPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdWebCardTachikomaPresenter$h.class, "1")) {
       }else if(p0.a() == ToggleState.TOGGLE_STATE_INFO_TO_CARD){
          ThanosAdWebCardTachikomaPresenter$h tb = this.b;
          g b = p0.b;
          p0 = p0.c;
          Objects.requireNonNull(tb);
          ThanosAdWebCardTachikomaPresenter thanosAdWebC = ThanosAdWebCardTachikomaPresenter.class;
          if (!PatchProxy.isSupport(thanosAdWebC) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Boolean.valueOf(p0), tb, thanosAdWebC, "6")) {
             thanosAdWebC = tb.E;
             if (thanosAdWebC != null) {
                thanosAdWebC.removeCallbacks(tb.T);
             }
             tb.T.b(b);
             tb.T.a(p0);
             p0 = tb.E;
             if (p0 != null) {
                p0.post(tb.T);
             }
          }
       }
       return;
    }
}
