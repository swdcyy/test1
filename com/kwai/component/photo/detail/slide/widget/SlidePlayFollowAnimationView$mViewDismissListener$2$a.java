package com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView$mViewDismissListener$2$a;
import android.view.animation.Animation$AnimationListener;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView$mViewDismissListener$2;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import com.airbnb.lottie.LottieAnimationView;

public final class SlidePlayFollowAnimationView$mViewDismissListener$2$a implements Animation$AnimationListener	// class@000ac4
{
    public final SlidePlayFollowAnimationView$mViewDismissListener$2 b;

    public void SlidePlayFollowAnimationView$mViewDismissListener$2$a(SlidePlayFollowAnimationView$mViewDismissListener$2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayFollowAnimationView$mViewDismissListener$2$a.class, "2")) {
          return;
       }
       SlidePlayFollowAnimationView$mViewDismissListener$2 this$0 = this.b.this$0;
       this$0.e = false;
       this$0.setVisibility(8);
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayFollowAnimationView$mViewDismissListener$2$a.class, "1")) {
          return;
       }
       SlidePlayFollowAnimationView d = this.b.this$0.d;
       if (d != null) {
          d.f();
       }
       return;
    }
}
