package fia.d0;
import android.view.View$OnClickListener;
import fia.z;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.animation.AnimatorSet;
import dia.a;
import bia.d;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Objects;
import cha.a;
import java.lang.Boolean;
import xl8.b;

public final class d0 implements View$OnClickListener	// class@0028f4
{
    public final z b;

    public void d0(z p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = z.P8(this.b).O();
       z oz = 1;
       if (slidePlayVie == null || slidePlayVie.n0() != oz) {
          z x = this.b.x;
          if (x == null || x.isRunning() != oz) {
             d0 tb = this.b;
             if (tb.K != null) {
                a.a.a(z.R8(tb).b(), Integer.valueOf(this.b.J));
                slidePlayVie = z.P8(this.b).O();
                if (slidePlayVie != null) {
                   slidePlayVie.d(false, 2);
                }
                slidePlayVie = z.P8(this.b).O();
                if (slidePlayVie != null) {
                   slidePlayVie.B(4);
                }
                x = this.b.r;
                if (x == null) {
                   a.S("mFollowViewPagerState");
                }
                Objects.requireNonNull(x);
                a uoa = a.class;
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, x, uoa, "7")) {
                   x.e.d(Boolean.FALSE);
                }
                return;
             }
          }
       }
       return;
    }
}
