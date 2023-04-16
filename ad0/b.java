package ad0.b;
import android.animation.Animator$AnimatorListener;
import android.app.Activity;
import android.view.View;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ld0.c;
import ad0.g;
import zc0.b;

public final class b implements Animator$AnimatorListener	// class@00005f
{
    public final Activity a;
    public final View b;
    public final View c;

    public void b(Activity p0,View p1,View p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       c.c("startNewAbsorbHideAnim  doOnEnd");
       g.g(this.a, this.b, this.c);
       b.d(false);
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
}
