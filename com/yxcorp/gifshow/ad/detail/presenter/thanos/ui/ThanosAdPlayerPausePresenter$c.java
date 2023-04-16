package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$c;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;

public final class ThanosAdPlayerPausePresenter$c implements b$b	// class@0016cf
{
    public final ThanosAdPlayerPausePresenter b;

    public void ThanosAdPlayerPausePresenter$c(ThanosAdPlayerPausePresenter p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       ThanosAdPlayerPausePresenter$c uoc = ThanosAdPlayerPausePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0 == 3) {
          ThanosAdPlayerPausePresenter.R8(this.b).setVisibility(8);
       }
       return;
    }
}
