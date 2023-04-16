package h82.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import h82.r0;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@002cca
{
    public final View a;
    public final r0 b;

    public void c(View p0,r0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c ta = this.a;
       c tb = this.b;
       ViewGroup$LayoutParams layoutParams = ta.getLayoutParams();
       layoutParams.width = p0.getAnimatedValue().intValue();
       ta.setLayoutParams(layoutParams);
       if (tb != null) {
          tb.a();
       }
       return;
    }
}
