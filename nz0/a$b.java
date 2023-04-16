package nz0.a$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import nz0.a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.view.ViewGroup$MarginLayoutParams;

public final class a$b implements ValueAnimator$AnimatorUpdateListener	// class@003430
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.g.getLayoutParams();
       Float uFloat = null;
       if (!layoutParams instanceof ConstraintLayout$LayoutParams) {
          layoutParams = uFloat;
       }
       if (layoutParams != null) {
          a.o(p0, "it");
          p0 = p0.getAnimatedValue();
          if (p0 instanceof Float) {
             uFloat = p0;
          }
          int i = (uFloat != null)? (int)uFloat.floatValue(): 0;
          layoutParams.setMarginStart(i);
          this.a.g.setLayoutParams(layoutParams);
       }
       PatchProxy.onMethodExit(a$b.class, "1");
       return;
    }
}
