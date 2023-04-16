package b4d.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b4d.j;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@000360
{
    public final j a;

    public void d(j p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       Objects.requireNonNull(ta);
       float f = 0x3f800000 - p0.getAnimatedFraction();
       int f1 = j.F;
       ViewGroup$LayoutParams layoutParams = ta.t.getLayoutParams();
       layoutParams.width = Math.max(j.E, (int)((float)f1 * f));
       ta.t.setLayoutParams(layoutParams);
       ta.t.setAlpha((f * f));
       if (ta.s.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams1 = ta.s.getLayoutParams();
          layoutParams1.rightMargin = (int)((float)(f1 + j.D) * f);
          ta.s.setLayoutParams(layoutParams1);
       }
       return;
    }
}
