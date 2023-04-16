package fia.b0;
import android.animation.AnimatorListenerAdapter;
import fia.z;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class b0 extends AnimatorListenerAdapter	// class@0028ef
{
    public final z a;

    public void b0(z p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b0.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       this.a.Z8();
       PatchProxy.onMethodExit(b0.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b0.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       z v = this.a.v;
       if (v != null && v.getVisibility() == 8) {
          v = this.a.v;
          float f = 0;
          if (v != null) {
             v.setScaleX(f);
          }
          v = this.a.v;
          if (v != null) {
             v.setScaleY(f);
          }
          v = this.a.v;
          if (v != null) {
             v.setVisibility(0);
          }
       }
    label_003b :
       PatchProxy.onMethodExit(b0.class, "1");
       return;
    }
}
