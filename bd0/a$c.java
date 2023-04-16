package bd0.a$c;
import android.animation.Animator$AnimatorListener;
import bd0.a;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import android.widget.TextView;
import ld0.c;

public final class a$c implements Animator$AnimatorListener	// class@00027b
{
    public final a a;
    public final float b;
    public final ObjectAnimator c;
    public final ValueAnimator d;
    public final ValueAnimator e;
    public final ObjectAnimator f;
    public final ValueAnimator g;

    public void a$c(a p0,float p1,ObjectAnimator p2,ValueAnimator p3,ValueAnimator p4,ObjectAnimator p5,ValueAnimator p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$c.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(a$c.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$c.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       c.c("this@textView.y="+this.a.b.getY()+','+"originalTextY="+this.b);
       this.a.b.setY(this.b);
       PatchProxy.onMethodExit(a$c.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$c.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(a$c.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$c.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       PatchProxy.onMethodExit(a$c.class, "4");
       return;
    }
}
