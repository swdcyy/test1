package com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$d;
import android.animation.AnimatorListenerAdapter;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$b;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$d$a;
import java.lang.Runnable;
import android.widget.FrameLayout;
import android.view.ViewGroup;

public final class NearbyMigrateGuideView$d extends AnimatorListenerAdapter	// class@000f94
{
    public final NearbyMigrateGuideView a;

    public void NearbyMigrateGuideView$d(NearbyMigrateGuideView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NearbyMigrateGuideView$d.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       NearbyMigrateGuideView$d ta = this.a;
       ta.k = true;
       NearbyMigrateGuideView i = ta.i;
       if (i != null) {
          i.b();
       }
       this.a.postDelayed(new NearbyMigrateGuideView$d$a(this), 2000);
       PatchProxy.onMethodExit(NearbyMigrateGuideView$d.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NearbyMigrateGuideView$d.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setAlpha(0x3f800000);
       this.a.setVisibility(0);
       this.a.f.setVisibility(0);
       PatchProxy.onMethodExit(NearbyMigrateGuideView$d.class, "1");
       return;
    }
}
