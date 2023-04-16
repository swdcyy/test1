package com.kwai.library.widget.specific.misc.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.library.widget.specific.misc.b;
import java.lang.Runnable;
import android.view.View;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@000a1f
{
    public final LoadingCircle a;
    public final ValueAnimator b;

    public void d(LoadingCircle p0,ValueAnimator p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       d ta = this.a;
       d tb = this.b;
       ta.k = true;
       int i = p0.getAnimatedValue().intValue();
       ta.r = i;
       if (i == 270) {
          ta.q = 0;
          ta.r = 0;
          ta.k = false;
          ta.post(new b(ta));
          tb.cancel();
       }else {
          ta.postInvalidate();
       }
       return;
    }
}
