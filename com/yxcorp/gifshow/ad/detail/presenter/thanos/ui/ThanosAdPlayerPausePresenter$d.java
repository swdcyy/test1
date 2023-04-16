package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$d;
import jta.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;

public final class ThanosAdPlayerPausePresenter$d extends a	// class@0016d0
{
    public final ThanosAdPlayerPausePresenter a;

    public void ThanosAdPlayerPausePresenter$d(ThanosAdPlayerPausePresenter p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       ThanosAdPlayerPausePresenter$d uod = ThanosAdPlayerPausePresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "1")) {
          return;
       }
       int i = 8;
       if (p0 - (float)1 < 0) {
          ThanosAdPlayerPausePresenter.R8(this.a).setVisibility(i);
       }else {
          View view = ThanosAdPlayerPausePresenter.R8(this.a);
          e player = ThanosAdPlayerPausePresenter.P8(this.a).getPlayer();
          a.o(player, "mPlayModule.player");
          if (player.isPaused()) {
             i = 0;
          }
          view.setVisibility(i);
       }
       return;
    }
}
