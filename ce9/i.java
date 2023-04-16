package ce9.i;
import com.yxcorp.gifshow.camerasdk.p$b;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import com.kwai.camerasdk.models.Point;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.camera.record.magic.l;

public final class i implements p$b	// class@0005c5
{
    public final e a;

    public void i(e p0){
       this.a = p0;
    }
    public final void a(Point p0,Point p1){
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, ta, e.class, "32")) {
       }else {
          d h = ta.h;
          if (h != null) {
             b9.a(ta.t);
             p$b uob = null;
             h.u0(uob);
             e u = ta.u;
             if (u == null || !u.equals(ta.E())) {
                ta.u = uob;
             }else {
                ta.u = uob;
                if (ta.s == null) {
                   ta.r.e1(1);
                }
             }
          }
       }
       return;
    }
}
