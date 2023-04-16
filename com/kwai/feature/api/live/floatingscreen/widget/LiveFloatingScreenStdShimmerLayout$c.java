package com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$c;
import android.animation.Animator$AnimatorListener;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;

public final class LiveFloatingScreenStdShimmerLayout$c implements Animator$AnimatorListener	// class@000fcf
{
    public final LiveFloatingScreenStdShimmerLayout a;

    public void LiveFloatingScreenStdShimmerLayout$c(LiveFloatingScreenStdShimmerLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenStdShimmerLayout$c.class, "1")) {
          return;
       }
       LiveFloatingScreenStdShimmerLayout$c ta = this.a;
       if (ta.m != null) {
          ValueAnimator shimmerAnima = ta.getShimmerAnimator();
          if (shimmerAnima != null) {
             shimmerAnima.setStartDelay(this.a.getShimmerAnimatorInterval());
             shimmerAnima.start();
          }
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
