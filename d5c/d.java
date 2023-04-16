package d5c.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import d5c.g0;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.widget.ImageView;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@0020ec
{
    public final g0 a;

    public void d(g0 p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       float f = p0.getAnimatedValue().floatValue();
       g0 y0 = ta.Y0;
       if (y0 != null) {
          y0.setAlpha(f);
       }
       return;
    }
}
