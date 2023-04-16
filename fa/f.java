package fa.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class f implements ValueAnimator$AnimatorUpdateListener	// class@001fdf
{
    public final Drawable a;

    public void f(Drawable p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setAlpha(p0.getAnimatedValue().intValue());
    }
}
