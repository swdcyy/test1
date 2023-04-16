package a2.r0$c$a;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import a2.r0$b;
import java.lang.Object;
import a2.u0;
import a2.i0;
import a2.u0$b;
import android.view.WindowInsets;
import a2.r0$c;
import java.util.Objects;
import a2.r0;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.animation.ValueAnimator;
import a2.r0$a;
import a2.r0$c$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import a2.r0$c$a$b;
import android.animation.Animator$AnimatorListener;
import a2.r0$c$a$c;
import java.lang.Runnable;
import a2.c0;

public class r0$c$a implements View$OnApplyWindowInsetsListener	// class@00009e
{
    public final r0$b b;
    public u0 c;

    public void r0$c$a(View p0,r0$b p1){
       super();
       this.b = p1;
       u0 ou0 = i0.J(p0);
       ou0 = (ou0 != null)? new u0$b(ou0).a(): null;
       this.c = ou0;
       return;
    }
    public WindowInsets onApplyWindowInsets(View p0,WindowInsets p1){
       r0$c$a uoc$a = this;
       View view = p0;
       WindowInsets windowInsets = p1;
       if (!p0.isLaidOut()) {
          uoc$a.c = u0.x(windowInsets, view);
          return r0$c.l(p0, p1);
       }else {
          u0 ou0 = u0.x(windowInsets, view);
          if (uoc$a.c == null) {
             uoc$a.c = i0.J(p0);
          }
          if (uoc$a.c == null) {
             uoc$a.c = ou0;
             return r0$c.l(p0, p1);
          }else {
             r0$b uob = r0$c.m(p0);
             if (uob != null && Objects.equals(uob.a, windowInsets)) {
                return r0$c.l(p0, p1);
             }else {
                int i = r0$c.e(ou0, uoc$a.c);
                if (!i) {
                   return r0$c.l(p0, p1);
                }else {
                   r0$c$a c = uoc$a.c;
                   r0 or0 = new r0(i, new DecelerateInterpolator(), 160);
                   or0.e(0);
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(or0.a());
                   r0$c.i(view, or0, windowInsets, false);
                   r0$c$a uoc$a1 = this;
                   r0$c$a$a uoc$a$a = new r0$c$a$a(uoc$a1, or0, ou0, c, i, p0);
                   valueAnimato.addUpdateListener(v14);
                   valueAnimato.addListener(new r0$c$a$b(this, or0, view));
                   r0$c$a$c uoc$a$c = new r0$c$a$c(uoc$a1, p0, or0, r0$c.f(ou0, c, i), valueAnimato);
                   c0.a(view, v6);
                   uoc$a.c = ou0;
                   return r0$c.l(p0, p1);
                }
             }
          }
       }
    }
}
