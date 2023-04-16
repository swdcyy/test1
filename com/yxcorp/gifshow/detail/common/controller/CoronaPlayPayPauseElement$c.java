package com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.CoronaPlayPayPauseElement;
import java.lang.Object;
import bm5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.common.controller.a;
import java.lang.Runnable;
import android.os.Handler;

public final class CoronaPlayPayPauseElement$c implements g	// class@0013ae
{
    public final CoronaPlayPayPauseElement b;

    public void CoronaPlayPayPauseElement$c(CoronaPlayPayPauseElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaPlayPayPauseElement$c.class, "1")) {
       }else {
          this.b.H.postDelayed(new a(this, p0), 100);
       }
       return;
    }
}
