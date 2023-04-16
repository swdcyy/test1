package c3.a$b;
import android.animation.Animator$AnimatorListener;
import c3.a;
import c3.a$c;
import java.lang.Object;
import android.animation.Animator;

public class a$b implements Animator$AnimatorListener	// class@000cc6
{
    public final a$c a;
    public final a b;

    public void a$b(a p0,a$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
    }
    public void onAnimationRepeat(Animator p0){
       float f = 0x3f800000;
       this.b.e(f, this.a, true);
       this.a.A();
       this.a.l();
       a$b tb = this.b;
       if (tb.g != null) {
          tb.g = false;
          p0.cancel();
          p0.setDuration(1332);
          p0.start();
          this.a.x(false);
       }else {
          tb.f = tb.f + f;
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       p0.f = 0;
    }
}
