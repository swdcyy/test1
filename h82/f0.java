package h82.f0;
import android.animation.AnimatorListenerAdapter;
import h82.k0;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f0 extends AnimatorListenerAdapter	// class@002ccf
{
    public final k0 a;

    public void f0(k0 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       f0 ta = this.a;
       ta.u = null;
       if (ta.n == 2) {
          ta.f();
       }
       return;
    }
}
