package com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$d$a;
import java.lang.Runnable;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;

public final class NearbyMigrateGuideView$d$a implements Runnable	// class@000f93
{
    public final NearbyMigrateGuideView$d b;

    public void NearbyMigrateGuideView$d$a(NearbyMigrateGuideView$d p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, NearbyMigrateGuideView$d$a.class, "1")) {
          return;
       }
       ObjectAnimator hideAnimator = this.b.a.getHideAnimator();
       if (hideAnimator != null) {
          hideAnimator.start();
       }
       PatchProxy.onMethodExit(NearbyMigrateGuideView$d$a.class, "1");
       return;
    }
}
