package h82.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import h82.r0;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public final class b implements ValueAnimator$AnimatorUpdateListener	// class@002cc8
{
    public final View a;
    public final r0 b;

    public void b(View p0,r0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       b ta = this.a;
       b tb = this.b;
       ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
       layoutParams.width = p0.getAnimatedValue().intValue();
       ta.setLayoutParams(layoutParams);
       if (tb != null) {
          tb.a();
       }
       return;
    }
}
