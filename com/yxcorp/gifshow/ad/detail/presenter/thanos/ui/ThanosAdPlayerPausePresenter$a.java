package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$a;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vq4.d;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;

public final class ThanosAdPlayerPausePresenter$a implements g	// class@0016cd
{
    public final ThanosAdPlayerPausePresenter b;
    public final boolean c;

    public void ThanosAdPlayerPausePresenter$a(ThanosAdPlayerPausePresenter p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdPlayerPausePresenter$a.class, "1")) {
       }else {
          c f = p0.F;
          int i = (this.c != null)? 181: 180;
          f.C = i;
          e player = ThanosAdPlayerPausePresenter.P8(this.b).getPlayer();
          a.o(player, "mPlayModule.player");
          f.a1 = player.getCurrentPosition();
          e player1 = ThanosAdPlayerPausePresenter.P8(this.b).getPlayer();
          a.o(player1, "mPlayModule.player");
          p0.T2 = player1.getDuration();
       }
       return;
    }
}
