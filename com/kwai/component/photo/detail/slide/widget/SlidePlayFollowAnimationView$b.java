package com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class SlidePlayFollowAnimationView$b extends AnimatorListenerAdapter	// class@000abe
{
    public final SlidePlayFollowAnimationView a;

    public void SlidePlayFollowAnimationView$b(SlidePlayFollowAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayFollowAnimationView$b.class, "1")) {
          return;
       }
       SlidePlayFollowAnimationView d = this.a.d;
       if (d != null) {
          d.setVisibility(0);
       }
       return;
    }
}
