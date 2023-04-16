package com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.widget.RelativeLayout;
import android.animation.AnimatorInflater;
import th0.d;
import android.animation.TimeInterpolator;
import tf5.c;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;

public class SlideFollowAnimateLayout$a extends AnimatorListenerAdapter	// class@000ab8
{
    public final SlideFollowAnimateLayout a;

    public void SlideFollowAnimateLayout$a(SlideFollowAnimateLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideFollowAnimateLayout$a.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.a();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideFollowAnimateLayout$a.class, "1")) {
          return;
       }
       SlideFollowAnimateLayout d = this.a.d;
       if (d != null) {
          d.t();
       }
       SlideFollowAnimateLayout$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, SlideFollowAnimateLayout.class, "2")) {
          Animator uAnimator = PatchProxy.applyOneRefs(ta, ta, SlideFollowAnimateLayout.class, "8");
          if (uAnimator != PatchProxyResult.class) {
          }else {
             uAnimator = AnimatorInflater.loadAnimator(ta.getContext(), R.anim.arg_RES_7f010131);
             if (uAnimator != null) {
                uAnimator.setInterpolator(new d());
                uAnimator.setTarget(ta);
             }
          }
          if (uAnimator != null) {
             uAnimator.setDuration(250);
             uAnimator.addListener(new c(ta));
             uAnimator.start();
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideFollowAnimateLayout$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       SlideFollowAnimateLayout d = this.a.d;
       if (d != null) {
          d.setVisibility(0);
       }
       return;
    }
}
