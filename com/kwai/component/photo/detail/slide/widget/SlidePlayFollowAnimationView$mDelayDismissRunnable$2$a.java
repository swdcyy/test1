package com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView$mDelayDismissRunnable$2$a;
import java.lang.Runnable;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView$mDelayDismissRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import android.view.animation.AnimationSet;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView$mViewDismissListener$2$a;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.widget.FrameLayout;

public final class SlidePlayFollowAnimationView$mDelayDismissRunnable$2$a implements Runnable	// class@000ac0
{
    public final SlidePlayFollowAnimationView$mDelayDismissRunnable$2 b;

    public void SlidePlayFollowAnimationView$mDelayDismissRunnable$2$a(SlidePlayFollowAnimationView$mDelayDismissRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SlidePlayFollowAnimationView$mDelayDismissRunnable$2$a.class, "1")) {
          return;
       }
       SlidePlayFollowAnimationView$mDelayDismissRunnable$2 this$0 = this.b.this$0;
       if (this$0.e != null) {
          this$0.getFollowAnimator().setAnimationListener(this.b.this$0.getMViewDismissListener());
          this$0 = this.b.this$0;
          this$0.startAnimation(this$0.getFollowAnimator());
       }
       return;
    }
}
