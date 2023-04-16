package ad0.a;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.app.Activity;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ld0.c;
import ad0.g;
import zc0.b;

public final class a implements Animator$AnimatorListener	// class@00005e
{
    public final View a;
    public final float b;
    public final View c;
    public final float d;
    public final Activity e;

    public void a(View p0,float p1,View p2,float p3,Activity p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       c.c("startNewAbsorbHideAnim  doOnCancel");
       this.a.setX(this.b);
       this.c.setX(this.d);
       g.g(this.e, this.a, this.c);
       b.d(false);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
}
