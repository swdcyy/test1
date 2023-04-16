package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import com.kwai.feature.api.corona.model.CoronaVipInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gm5.b;
import pp7.b;
import qp7.b;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;

public final class CoronaPlayPayPauseElement$g implements g	// class@0013b2
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$g(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$g.class, "1")) {
       }else if(b.r()){
          p0 = this.b.I().a();
          a.o(p0, "tryToShow.value");
          if (p0.booleanValue()) {
             p0 = CoronaPlayPayPauseElement.o0(this.b).getPlayer();
             a.o(p0, "mPlayModule.player");
             long currentPosit = p0.getCurrentPosition();
             long l = b.l(currentPosit);
             if (currentPosit - l) {
                CoronaPlayPayPauseElement.o0(this.b).getPlayer().seekTo(l);
             }
             this.b.q0();
          }
       }
       return;
    }
}
