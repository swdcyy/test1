package ar7.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ar7.j;
import eh5.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.NullPointerException;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@000349
{
    public final j a;
    public final int b;
    public final int c;
    public final a d;

    public void c(j p0,int p1,int p2,a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       a.o(p0, "it");
       Object animatedValu = p0.getAnimatedValue();
       if (animatedValu != null) {
          int i = animatedValu.intValue();
          float f = (this.b > this.c)? (float)1 - p0.getAnimatedFraction(): p0.getAnimatedFraction();
          ta.z(i, f);
          PatchProxy.onMethodExit(c.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(c.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
