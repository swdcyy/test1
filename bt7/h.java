package bt7.h;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import lnc.a1;

public final class h implements ValueAnimator$AnimatorUpdateListener	// class@000471
{
    public final boolean a;
    public final View b;

    public void h(boolean p0,View p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       h tb = this.b;
       float f = p0.getAnimatedValue().floatValue();
       if (this.a != null) {
          tb.setTranslationY(((float)a1.e(28.00f) * (0x3f800000 - f)));
       }
       tb.setAlpha(f);
       return;
    }
}
