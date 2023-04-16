package gg2.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.ProgressBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@002b16
{
    public final ProgressBar a;

    public void e(ProgressBar p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.setProgress(p0.getAnimatedValue().intValue());
    }
}
