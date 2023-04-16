package com.kwai.library.widget.specific.misc.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Integer;
import android.view.View;
import b27.h;
import java.lang.Runnable;

public final class e implements ValueAnimator$AnimatorUpdateListener	// class@000a20
{
    public final LoadingCircle a;
    public final ValueAnimator b;

    public void e(LoadingCircle p0,ValueAnimator p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       e ta = this.a;
       e tb = this.b;
       ta.l = true;
       ta.s = p0.getAnimatedValue().intValue();
       ta.postInvalidate();
       if (ta.s == null) {
          ta.s = 270;
          ta.l = false;
          ta.t = 135;
          ta.post(new h(ta));
          tb.cancel();
       }
       return;
    }
}
