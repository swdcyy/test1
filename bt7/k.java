package bt7.k;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public final class k implements ValueAnimator$AnimatorUpdateListener	// class@000474
{
    public final View a;

    public void k(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setAlpha(p0.getAnimatedValue().floatValue());
    }
}
