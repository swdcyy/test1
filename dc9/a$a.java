package dc9.a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import dc9.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.NullPointerException;

public final class a$a implements ValueAnimator$AnimatorUpdateListener	// class@0020b2
{
    public final ValueAnimator a;
    public final a b;
    public final View c;
    public final float d;
    public final float e;

    public void a$a(ValueAnimator p0,a p1,View p2,float p3,float p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$a.class, "1")) {
          return;
       }
       a$a ta = this.a;
       a.o(ta, "valueAnimator");
       ta = ta.getAnimatedValue();
       if (ta != null) {
          float f = ta.floatValue();
          a$a tb = this.b;
          int i = -1;
          if (tb.a != null) {
             float f1 = (tb.b != null)? f: 0;
             a$a tc = this.c;
             a.o(tc, "view");
             tc.setTranslationX((((float)i * this.d) * f1));
          }
          tb = this.c;
          a.o(tb, "view");
          tb.setTranslationY((((float)i * this.e) * f));
          PatchProxy.onMethodExit(a$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
