package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$d;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yx.j0;

public final class BrokenFramePresenter$d implements b$b	// class@0015d2
{
    public final BrokenFramePresenter b;

    public void BrokenFramePresenter$d(BrokenFramePresenter p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       BrokenFramePresenter$d uod = BrokenFramePresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (p0 == 3) {
          Object[] objArray = new Object[0];
          j0.f("BrokenFramePresenter", "magic play state PLAYER_STATE_STARTED", objArray);
          this.b.V8();
       }
       return;
    }
}
