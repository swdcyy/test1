package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$e;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b;

public final class CoronaPlayPayPauseElement$e implements g	// class@0013b0
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$e(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$e.class, "1")) {
       }else {
          p0 = this.b;
          p0.r0(CoronaPlayPayPauseElement.n0(p0), "VIEW_PART_AGAIN");
          CoronaPlayPayPauseElement.o0(this.b).getPlayer().seekTo(0);
          this.b.q0();
       }
       return;
    }
}
