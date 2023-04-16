package com.kwai.library.widget.textview.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import android.view.View;

public class a implements ValueAnimator$AnimatorUpdateListener	// class@000a5f
{
    public final IconifyTextViewNew a;

    public void a(IconifyTextViewNew p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       this.a.p = p0.getAnimatedValue().floatValue();
       a ta = this.a;
       IconifyTextViewNew p = ta.p;
       if (p - 0x3f800000 < 0) {
          ta.w = true;
       }
       if (!p) {
          ta.w = false;
          ta.v = IconifyTextViewNew$a.b;
       }
       ta.invalidate();
       return;
    }
}
