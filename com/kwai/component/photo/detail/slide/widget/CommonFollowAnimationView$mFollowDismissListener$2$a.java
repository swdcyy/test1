package com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mFollowDismissListener$2$a;
import android.view.animation.Animation$AnimationListener;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mFollowDismissListener$2;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView;
import android.view.View;
import java.util.Objects;
import java.lang.Runnable;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;

public final class CommonFollowAnimationView$mFollowDismissListener$2$a implements Animation$AnimationListener	// class@000ab1
{
    public final CommonFollowAnimationView$mFollowDismissListener$2 b;

    public void CommonFollowAnimationView$mFollowDismissListener$2$a(CommonFollowAnimationView$mFollowDismissListener$2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonFollowAnimationView$mFollowDismissListener$2$a.class, "1")) {
          return;
       }
       this.b.this$0.c.setVisibility(8);
       CommonFollowAnimationView$mFollowDismissListener$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, CommonFollowAnimationView.class, "6")) {
          this$0.postDelayed(this$0.getMDelayDismissRunnable(), 500);
       }
       this.b.this$0.getLottieView().s();
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
