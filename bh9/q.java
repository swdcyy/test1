package bh9.q;
import erd.g;
import bh9.r;
import java.lang.Object;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public final class q implements g	// class@0004a6
{
    public final r b;

    public void q(r p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r.class, "17")) {
       }else if(tb.h == null){
          ControlSpeedLayout$c a = p0.a;
          tb.r = a;
          if (p0.b != null) {
             CameraLogger.n(3, 1, "gear_speed", null, String.valueOf(a), tb.e);
          }
       }
       return;
    }
}
