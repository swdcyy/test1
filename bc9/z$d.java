package bc9.z$d;
import erd.g;
import bc9.z;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ac9.g;
import cc9.q;
import ac9.i;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.base.d;
import fg9.e;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import pi9.n;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import bc9.y;
import java.lang.Runnable;
import ca7.v;

public final class z$d implements g	// class@000417
{
    public final z b;

    public void z$d(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z$d.class, "1")) {
       }else {
          a.p(p0, "event");
          z$d tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, z.class, "7")) {
             z s = tb.s;
             g og = (s != null)? s.d(): null;
             if (og instanceof i && tb.n == 5) {
                Objects.requireNonNull(e.c);
                n.a(tb.t, (p0.a ^ 0x01), tb.d.d(e.b).a, null);
             }
             if (p0.a == null) {
                p0 = p0.c;
                if (p0 == PanelShowEvent$PanelType.MAGIC || p0 == PanelShowEvent$PanelType.IMMERSE_MODE) {
                   v.f(new y(tb), 0);
                }
             }
          }
       }
       return;
    }
}
