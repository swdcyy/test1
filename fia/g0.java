package fia.g0;
import android.animation.AnimatorListenerAdapter;
import fia.h0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import fia.z;
import com.yxcorp.utility.n;
import dia.a;
import cia.w;
import k2b.e0;
import bia.d;
import java.lang.Integer;
import java.util.Objects;
import com.airbnb.lottie.LottieAnimationView;

public final class g0 extends AnimatorListenerAdapter	// class@00290b
{
    public final h0 a;

    public void g0(h0 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "2")) {
          return;
       }
       View[] viewArray = new View[]{this.a.b.A};
       n.Z(8, viewArray);
       viewArray = new View[]{this.a.b.G};
       n.Z(8, viewArray);
       View[] viewArray1 = new View[]{this.a.b.F};
       n.Z(8, viewArray1);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       h0 b = this.a.b;
       b.J = 1;
       a.a.b(z.P8(b).N(), z.R8(this.a.b).b(), Integer.valueOf(this.a.b.J));
       b = this.a.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(null, b, z.class, "15")) {
          z f = b.F;
          if (f != null) {
             f.f();
          }
       }
       return;
    }
}
