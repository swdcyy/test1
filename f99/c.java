package f99.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@0022e3
{
    public final View a;

    public void c(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setTranslationX(p0.getAnimatedValue().floatValue());
    }
}
