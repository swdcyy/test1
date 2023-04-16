package com.kwai.library.widget.textview.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import android.view.View;

public class b implements ValueAnimator$AnimatorUpdateListener	// class@000a60
{
    public final IconifyTextViewNew a;

    public void b(IconifyTextViewNew p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.p = p0.getAnimatedValue().floatValue();
       b ta = this.a;
       IconifyTextViewNew p = ta.p;
       if (p > 0) {
          ta.w = true;
       }
       if (!p - 0x3f800000) {
          ta.w = false;
          ta.v = IconifyTextViewNew$a.a;
       }
       ta.invalidate();
       return;
    }
}
