package d6b.f;
import android.animation.Animator$AnimatorListener;
import d6b.g;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d6b.d;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;

public final class f implements Animator$AnimatorListener	// class@002461
{
    public final g a;

    public void f(g p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       f ta = this.a;
       g a = ta.a;
       a.S8(a.u, ta.b);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       g a = ta.a;
       a.S8(a.u, ta.b);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
