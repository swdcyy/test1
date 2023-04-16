package ch9.g$a;
import com.yxcorp.gifshow.widget.m;
import ch9.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import w46.b;

public class g$a extends m	// class@0005ee
{
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       g$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, g.class, "12")) {
          if (tc.g2().isDisabled()) {
             tc.l2();
             tc.i2();
          }else {
             g r = tc.r;
             Objects.requireNonNull(r);
             if (!PatchProxy.applyVoid(objArray, r, UltraWideAndSuperStabilityStateHelper.class, "10")) {
                Object[] objArray1 = new Object[0];
                a.D().w("WideAndStability", "click stability when "+r.g()+"\("+r.e()+"\), "+r.e, objArray1);
                if (r.e == StabilityType.DISABLED) {
                   objArray = new Object[0];
                   a.D().t("WideAndStability", "click stability when disabled, this should not happen", objArray);
                }else {
                   r.e = r.e.move();
                   r.b(r.h());
                }
             }
             tc.k2();
             tc.n2();
             tc.p2();
             tc.l2();
             tc.i2();
          }
       }
       return;
    }
}
