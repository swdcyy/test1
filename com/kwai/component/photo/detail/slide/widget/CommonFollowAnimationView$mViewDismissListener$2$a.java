package com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mViewDismissListener$2$a;
import android.view.animation.Animation$AnimationListener;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$mViewDismissListener$2;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView;
import com.airbnb.lottie.LottieAnimationView;

public final class CommonFollowAnimationView$mViewDismissListener$2$a implements Animation$AnimationListener	// class@000ab3
{
    public final CommonFollowAnimationView$mViewDismissListener$2 b;

    public void CommonFollowAnimationView$mViewDismissListener$2$a(CommonFollowAnimationView$mViewDismissListener$2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonFollowAnimationView$mViewDismissListener$2$a.class, "2")) {
          return;
       }
       CommonFollowAnimationView$mViewDismissListener$2 this$0 = this.b.this$0;
       this$0.e = false;
       this$0.setVisibility(8);
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonFollowAnimationView$mViewDismissListener$2$a.class, "1")) {
          return;
       }
       CommonFollowAnimationView d = this.b.this$0.d;
       if (d != null) {
          d.f();
       }
       return;
    }
}
