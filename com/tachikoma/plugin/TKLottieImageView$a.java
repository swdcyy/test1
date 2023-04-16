package com.tachikoma.plugin.TKLottieImageView$a;
import android.animation.AnimatorListenerAdapter;
import com.tachikoma.plugin.TKLottieImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;

public class TKLottieImageView$a extends AnimatorListenerAdapter	// class@000de1
{
    public final TKLottieImageView a;

    public void TKLottieImageView$a(TKLottieImageView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$a.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       if (p0 != null) {
          TKLottieImageView$a ta = this.a;
          if (ta.isRunning != null) {
             ta.executeCallback(ta.mAnimationCancelCallbackRef, null);
          }
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       TKLottieImageView$a ta = this.a;
       ta.executeCallback(ta.mAnimationEndCallbackRef, null);
       ta.isRunning = false;
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$a.class, "4")) {
          return;
       }
       super.onAnimationRepeat(p0);
       TKLottieImageView$a ta = this.a;
       ta.executeCallback(ta.mAnimationRepeatCallbackRef, null);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKLottieImageView$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       TKLottieImageView$a ta = this.a;
       ta.executeCallback(ta.mAnimationStartCallbackRef, null);
       return;
    }
}
