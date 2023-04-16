package com.kwai.library.widget.specific.misc.KwaiLoadingCircle$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.library.widget.specific.misc.KwaiLoadingCircle;
import java.lang.Object;
import java.lang.Float;
import android.animation.ValueAnimator;
import android.view.View;

public class KwaiLoadingCircle$a implements ValueAnimator$AnimatorUpdateListener	// class@000a11
{
    public final KwaiLoadingCircle a;

    public void KwaiLoadingCircle$a(KwaiLoadingCircle p0){
       this.a = p0;
       super();
    }
    public final boolean a(float p0){
       boolean b = (Float.compare(p0, 0.17f) <= 0)? true: false;
       return b;
    }
    public final boolean b(float p0){
       boolean b = (p0 - 0x3e2aaaab > 0 && p0 - 0x3f000000 < 0)? true: false;
       return b;
    }
    public final boolean c(float p0){
       boolean b = (Float.compare(p0, 0x3f000000) >= 0 && Float.compare(p0, 0x3f2aaaab) <= 0)? true: false;
       return b;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       float f1;
       float f2;
       float animatedFrac = p0.getAnimatedFraction();
       KwaiLoadingCircle$a ta = this.a;
       float f = 360.00f;
       if (this.a(animatedFrac)) {
          f1 = (animatedFrac * f) * 0x3fc00000;
          f2 = 90.00f;
       }else if(this.b(animatedFrac)){
          f1 = 1350.00f * animatedFrac;
          f2 = 225.00f;
       }else if(this.c(animatedFrac)){
          f1 = 150.00f * animatedFrac;
          f2 = 15.00f;
       }else {
          f1 = 1485.00f * animatedFrac;
          f2 = 855.00f;
       }
       f1 = f1 - f2;
       if (this.a(animatedFrac)) {
          animatedFrac = (animatedFrac * f) * 4.50f;
       }else if(this.b(animatedFrac)){
          animatedFrac = (animatedFrac * -810.00f) + 405.00f;
       }else if(this.c(animatedFrac)){
          animatedFrac = (animatedFrac * 1620.00f) - 810.00f;
       }else {
          animatedFrac = (animatedFrac * -810.00f) + 810.00f;
       }
       ta.d = f1;
       ta.e = animatedFrac;
       ta.invalidate();
       return;
    }
}
