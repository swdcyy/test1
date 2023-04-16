package com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter$e;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.magic.broken.BrokenFramePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import yx.j0;
import im8.f;
import com.kwai.framework.player.core.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.commercial.splash.SplashUtils;

public final class BrokenFramePresenter$e implements b$b	// class@0015d3
{
    public final BrokenFramePresenter b;

    public void BrokenFramePresenter$e(BrokenFramePresenter p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       boolean b;
       BrokenFramePresenter$e uoe = BrokenFramePresenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("BrokenFramePresenter", "newPlayerState:"+p0, objArray);
       if (p0 != 3) {
          if (p0 != 4) {
             if (p0 == 8) {
                BrokenFramePresenter y = this.b.y;
                if (y != null) {
                   b uob = y.get();
                   if (uob != null) {
                      uob.seekTo(0);
                   }
                }
                this.b.P8();
             }
          }else {
             this.b.P8();
          }
       }else {
          BrokenFramePresenter$e tb = this.b;
          Objects.requireNonNull(tb);
          BrokenFramePresenter obj = PatchProxy.apply(null, tb, BrokenFramePresenter.class, "11");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tb.q;
             if (obj == null) {
                a.S("mPhoto");
             }
             if (obj.isEyeMax() && (tb.w == null && !SplashUtils.I())) {
                b = true;
             }else {
                b = false;
             }
          }
          if (b) {
             return;
          }else {
             BrokenFramePresenter.S8(this.b, 0, 1, null);
          }
       }
       return;
    }
}
