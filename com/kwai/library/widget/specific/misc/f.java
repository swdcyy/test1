package com.kwai.library.widget.specific.misc.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import android.animation.ValueAnimator;
import java.lang.Object;
import android.view.View;
import java.lang.Integer;
import com.kwai.library.widget.specific.misc.g;
import java.lang.Runnable;

public final class f implements ValueAnimator$AnimatorUpdateListener	// class@000a21
{
    public final LoadingCircle a;
    public final ValueAnimator b;

    public void f(LoadingCircle p0,ValueAnimator p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       f ta = this.a;
       f tb = this.b;
       if (!ta.isShown()) {
          tb.cancel();
          ta.v = false;
       }else {
          ta.i = true;
          ta.e = p0.getAnimatedValue().intValue();
          ta.postInvalidate();
          if (ta.e == 270) {
             ta.m = -90;
             ta.n = 0;
             ta.i = false;
             ta.post(new g(ta));
             tb.cancel();
          }
       }
       return;
    }
}
