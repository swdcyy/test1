package com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;

public final class NearbyMigrateGuideView$e implements ValueAnimator$AnimatorUpdateListener	// class@000f95
{
    public final NearbyMigrateGuideView a;

    public void NearbyMigrateGuideView$e(NearbyMigrateGuideView p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NearbyMigrateGuideView$e.class, "1")) {
          return;
       }
       a.o(p0, "it");
       if ((double)p0.getAnimatedFraction() - 0x3fe4cccccccccccd >= 0 && !this.a.e.p()) {
          this.a.e.s();
       }
       PatchProxy.onMethodExit(NearbyMigrateGuideView$e.class, "1");
       return;
    }
}
