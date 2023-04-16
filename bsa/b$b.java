package bsa.b$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bsa.b;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class b$b implements ValueAnimator$AnimatorUpdateListener	// class@000452
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       b.S8(this.a).setAlpha(f);
       b y = this.a.y;
       if (y != null) {
          y.setAlpha(f);
       }
       b.R8(this.a).setAlpha(f);
       b.P8(this.a).setAlpha(f);
       float f1 = (- (float)b.V8(this.a).getMeasuredHeight()) * ((float)1 - f);
       b.V8(this.a).setTranslationY(f1);
       b.P8(this.a).setTranslationY(f1);
       return;
    }
}
