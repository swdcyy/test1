package bsa.e;
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
import java.lang.Integer;
import java.lang.Number;
import lnc.a1;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@00045e
{
    public final b a;

    public void e(b p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
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
       Integer integer = Integer.valueOf(b.V8(this.a).getMeasuredHeight());
       float f1 = (integer.intValue() > 0)? Float.MIN_VALUE: 0;
       if (!f1) {
          integer = null;
       }
       int i = (integer != null)? integer.intValue(): a1.e(52.00f);
       float f2 = (- (float)i) * ((float)1 - f);
       b.V8(this.a).setTranslationY(f2);
       b.P8(this.a).setTranslationY(f2);
       return;
    }
}
