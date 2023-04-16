package hy9.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.View;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@002735
{
    public final d a;
    public final int b;

    public void d(d p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       float f = (float)this.b;
       ta.o.getLayoutParams().height = (int)(f - (p0.getAnimatedValue().floatValue() * f));
       ta.o.requestLayout();
    }
}
