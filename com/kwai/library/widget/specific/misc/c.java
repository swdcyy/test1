package com.kwai.library.widget.specific.misc.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Integer;
import android.view.View;
import com.kwai.library.widget.specific.misc.a;
import java.lang.Runnable;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@000a1e
{
    public final LoadingCircle a;
    public final ValueAnimator b;

    public void c(LoadingCircle p0,ValueAnimator p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       c ta = this.a;
       c tb = this.b;
       ta.j = true;
       ta.o = p0.getAnimatedValue().intValue();
       ta.postInvalidate();
       if (ta.o == null) {
          ta.o = 270;
          ta.p = 0;
          ta.j = false;
          ta.post(new a(ta));
          tb.cancel();
       }
       return;
    }
}
