package com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.pk.widget.LivePkPeerInfoView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import fe2.h;
import java.lang.Runnable;

public class LivePkPeerInfoView$a extends AnimatorListenerAdapter	// class@000dae
{
    public final LivePkPeerInfoView a;

    public void LivePkPeerInfoView$a(LivePkPeerInfoView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePkPeerInfoView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.e.t();
       ViewPropertyAnimator viewProperty = this.a.e.animate();
       viewProperty.cancel();
       viewProperty.alpha(0).withLayer().withEndAction(new h(this)).start();
       return;
    }
}
