package com.tachikoma.plugin.TKLottieImageView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.tachikoma.plugin.TKLottieImageView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.text.NumberFormat;
import com.tkruntime.v8.JsValueRef;

public class TKLottieImageView$b implements ValueAnimator$AnimatorUpdateListener	// class@000de2
{
    public final TKLottieImageView a;

    public void TKLottieImageView$b(TKLottieImageView p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$b.class, "1")) {
          return;
       }
       if (this.a.mAnimationUpdateCallbackRef != null && p0 != null) {
          NumberFormat numberInstan = NumberFormat.getNumberInstance();
          numberInstan.setMaximumFractionDigits(2);
          TKLottieImageView$b ta = this.a;
          ta.executeCallback(ta.mAnimationUpdateCallbackRef, numberInstan.format((double)p0.getAnimatedFraction()));
       }
       return;
    }
}
