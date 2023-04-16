package com.kuaishou.live.common.core.component.line.widget.LiveLinePeerInfoView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.line.widget.LiveLinePeerInfoView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import ro1.h;
import java.lang.Runnable;

public class LiveLinePeerInfoView$a extends AnimatorListenerAdapter	// class@001495
{
    public final LiveLinePeerInfoView a;

    public void LiveLinePeerInfoView$a(LiveLinePeerInfoView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLinePeerInfoView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.d.t();
       ViewPropertyAnimator viewProperty = this.a.d.animate();
       viewProperty.cancel();
       viewProperty.alpha(0).withLayer().withEndAction(new h(this)).start();
       return;
    }
}
