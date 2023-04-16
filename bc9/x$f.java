package bc9.x$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bc9.x;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class x$f implements ValueAnimator$AnimatorUpdateListener	// class@00040e
{
    public final x a;

    public void x$f(x p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$f.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       x y = this.a.y;
       if (y != null) {
          y.setAlpha(f);
       }
       y = this.a.z;
       if (y != null) {
          y.setAlpha(f);
       }
       y = this.a.A;
       if (y != null) {
          y.setAlpha(f);
       }
       return;
    }
}
