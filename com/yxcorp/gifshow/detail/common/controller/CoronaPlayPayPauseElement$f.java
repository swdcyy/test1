package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;

public final class CoronaPlayPayPauseElement$f implements g	// class@0013b1
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$f(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$f.class, "1")) {
       }else {
          p0 = this.b;
          p0.r0(CoronaPlayPayPauseElement.n0(p0), "BUY");
          this.b.t0(false);
       }
       return;
    }
}
