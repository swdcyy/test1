package com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.photo.detail.slide.widget.SlideFollowAnimateLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.animation.Animator$AnimatorListener;
import com.airbnb.lottie.LottieAnimationView;

public class SlideFollowAnimateLayout$b extends AnimatorListenerAdapter	// class@000ab9
{
    public final SlideFollowAnimateLayout a;

    public void SlideFollowAnimateLayout$b(SlideFollowAnimateLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideFollowAnimateLayout$b.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.a();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideFollowAnimateLayout$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       SlideFollowAnimateLayout d = this.a.d;
       if (d != null) {
          d.setVisibility(4);
          SlideFollowAnimateLayout$b ta = this.a;
          ta.d.a(ta.f);
          this.a.d.s();
       }
       return;
    }
}
