package com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl$c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;

public class LiveHeartParticleServiceImpl$c extends AnimatorListenerAdapter	// class@001477
{
    public final LottieAnimationView a;
    public final LiveHeartParticleServiceImpl b;

    public void LiveHeartParticleServiceImpl$c(LiveHeartParticleServiceImpl p0,LottieAnimationView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleServiceImpl$c.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.b.i(this.a, this);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleServiceImpl$c.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.b.i(this.a, this);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHeartParticleServiceImpl$c.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       if (!this.b.t.isAdded()) {
          return;
       }
       this.a.setVisibility(0);
       return;
    }
}
