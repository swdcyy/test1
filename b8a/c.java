package b8a.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@000398
{
    public final View a;

    public void c(View p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c ta = this.a;
       ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
       layoutParams.height = (int)p0.getAnimatedValue().floatValue();
       ta.setLayoutParams(layoutParams);
    }
}
