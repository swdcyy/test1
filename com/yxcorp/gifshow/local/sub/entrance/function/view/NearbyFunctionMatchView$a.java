package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import java.util.Objects;
import com.airbnb.lottie.LottieAnimationView;

public final class NearbyFunctionMatchView$a extends AnimatorListenerAdapter	// class@001aaf
{
    public final NearbyFunctionMatchView a;

    public void NearbyFunctionMatchView$a(NearbyFunctionMatchView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionMatchView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       NearbyFunctionMatchView$a ta = this.a;
       KwaiLottieAnimationView[] kwaiLottieAn = new KwaiLottieAnimationView[]{ta.F,ta.G};
       int i = 0;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(kwaiLottieAn, ta, NearbyFunctionMatchView.class, "10")) {
          for (; i < 2; i = i + 1) {
             kwaiLottieAn[i].s();
          }
       }
       return;
    }
}
