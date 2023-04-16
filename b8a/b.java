package b8a.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@000394
{
    public final View a;

    public void b(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b ta = this.a;
       ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
       layoutParams.width = (int)p0.getAnimatedValue().floatValue();
       ta.setLayoutParams(layoutParams);
    }
}
