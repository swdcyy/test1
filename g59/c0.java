package g59.c0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;

public final class c0 implements ValueAnimator$AnimatorUpdateListener	// class@0023f7
{
    public final boolean a;
    public final View b;

    public void c0(boolean p0,View p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c0 tb = this.b;
       float f = p0.getAnimatedValue().floatValue();
       if (this.a != null) {
          f = 0x3f800000 - f;
       }
       tb.setAlpha(f);
       return;
    }
}
