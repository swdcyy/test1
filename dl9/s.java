package dl9.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import dl9.t;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class s implements ValueAnimator$AnimatorUpdateListener	// class@001f9e
{
    public final t a;

    public void s(t p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       t a = this.a.A;
       Integer integer = null;
       ViewGroup$LayoutParams layoutParams = (a != null)? a.getLayoutParams(): integer;
       if (layoutParams != null) {
          a.o(p0, "animation");
          p0 = p0.getAnimatedValue();
          if (p0 instanceof Integer) {
             integer = p0;
          }
          int i = (integer != null)? integer.intValue(): 0;
          layoutParams.height = i;
       }
       t a1 = this.a.A;
       if (a1 != null) {
          a1.setLayoutParams(layoutParams);
       }
       return;
    }
}
