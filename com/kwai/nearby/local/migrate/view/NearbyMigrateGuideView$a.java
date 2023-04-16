package com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$a;
import android.view.View$OnClickListener;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ObjectAnimator;

public final class NearbyMigrateGuideView$a implements View$OnClickListener	// class@000f90
{
    public final NearbyMigrateGuideView b;

    public void NearbyMigrateGuideView$a(NearbyMigrateGuideView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyMigrateGuideView$a.class, "1")) {
          return;
       }
       NearbyMigrateGuideView$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, NearbyMigrateGuideView.class, "4")) {
          ObjectAnimator hideAnimator = tb.getHideAnimator();
          if (hideAnimator != null) {
             hideAnimator.start();
          }
       }
       return;
    }
}
