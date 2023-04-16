package fia.i0;
import android.animation.AnimatorListenerAdapter;
import fia.z;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.Objects;
import com.airbnb.lottie.LottieAnimationView;
import dia.a;
import cia.w;
import k2b.e0;
import bia.d;
import java.lang.Integer;

public final class i0 extends AnimatorListenerAdapter	// class@00290f
{
    public final z a;

    public void i0(z p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "2")) {
          return;
       }
       int i = 1;
       View[] viewArray = new View[i];
       viewArray[0] = this.a.F;
       n.Z(0, viewArray);
       i0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, z.class, "14")) {
          View[] viewArray1 = new View[i];
          viewArray1[0] = ta.w;
          n.Z(8, viewArray1);
          z f = ta.F;
          if (f != null) {
             f.setRepeatCount(-1);
          }
          f = ta.F;
          if (f != null) {
             f.s();
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0.class, "1")) {
          return;
       }
       i0 ta = this.a;
       ta.J = 2;
       a.a.b(z.P8(ta).N(), z.R8(this.a).b(), Integer.valueOf(this.a.J));
       View[] viewArray = new View[]{this.a.A};
       n.Z(0, viewArray);
       View[] viewArray1 = new View[]{this.a.G};
       n.Z(0, viewArray1);
       return;
    }
}
