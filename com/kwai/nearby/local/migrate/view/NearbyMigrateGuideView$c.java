package com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$c;
import android.animation.AnimatorListenerAdapter;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$b;
import android.widget.FrameLayout;

public final class NearbyMigrateGuideView$c extends AnimatorListenerAdapter	// class@000f92
{
    public final NearbyMigrateGuideView a;

    public void NearbyMigrateGuideView$c(NearbyMigrateGuideView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NearbyMigrateGuideView$c.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.e.f();
       this.a.e.setFrame(0);
       NearbyMigrateGuideView i = this.a.i;
       if (i != null) {
          i.a();
       }
       this.a.setVisibility(8);
       i.k = false;
       PatchProxy.onMethodExit(NearbyMigrateGuideView$c.class, "1");
       return;
    }
}
