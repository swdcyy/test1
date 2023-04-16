package b4d.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b4d.j;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@00035d
{
    public final j a;

    public void c(j p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c ta = this.a;
       if (ta.s.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = ta.s.getLayoutParams();
          layoutParams.rightMargin = (int)((float)(j.F + j.D) * p0.getAnimatedFraction());
          ta.s.setLayoutParams(layoutParams);
       }
       ViewGroup$LayoutParams layoutParams1 = ta.t.getLayoutParams();
       layoutParams1.width = Math.max(j.E, (int)((float)j.F * p0.getAnimatedFraction()));
       ta.t.setLayoutParams(layoutParams1);
       ta.t.setAlpha(p0.getAnimatedFraction());
       return;
    }
}
