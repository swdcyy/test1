package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$d;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import rd5.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;
import java.lang.Long;
import com.yxcorp.gifshow.entity.QPhoto;
import gm5.b;

public final class CoronaPlayPayPauseElement$d implements g	// class@0013af
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$d(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$d.class, "1")) {
       }else {
          p0 = this.b;
          e player = CoronaPlayPayPauseElement.o0(p0).getPlayer();
          a.o(player, "mPlayModule.player");
          long currentPosit = player.getCurrentPosition();
          CoronaPlayPayPauseElement uCoronaPlayP = CoronaPlayPayPauseElement.class;
          if (!PatchProxy.isSupport(uCoronaPlayP) || !PatchProxy.applyVoidTwoRefs("ProgressPublisher", Long.valueOf(currentPosit), p0, uCoronaPlayP, "7")) {
             uCoronaPlayP = p0.B;
             if (uCoronaPlayP == null) {
                a.S("mPhoto");
             }
             if (!b.t(uCoronaPlayP) || b.r()) {
                p0.q0();
             }else if(currentPosit - 0x57e40 > 0){
                p0.u0();
             }else {
                p0.q0();
             }
          }
       }
       return;
    }
}
