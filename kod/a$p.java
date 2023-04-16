package kod.a$p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kod.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.NullPointerException;

public final class a$p implements ValueAnimator$AnimatorUpdateListener	// class@001807
{
    public final a a;
    public final float b;
    public final boolean c;

    public void a$p(a p0,float p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$p.class, "1")) {
          return;
       }
       a.p(p0, "value");
       a$p ta = this.a;
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          ta.n0(p0.floatValue());
          PatchProxy.onMethodExit(a$p.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a$p.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
