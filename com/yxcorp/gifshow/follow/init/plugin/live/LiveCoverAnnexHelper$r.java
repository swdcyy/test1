package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$r;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class LiveCoverAnnexHelper$r extends AnimatorListenerAdapter	// class@0010db
{
    public final LiveCoverAnnexHelper a;

    public void LiveCoverAnnexHelper$r(LiveCoverAnnexHelper p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveCoverAnnexHelper$r.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.M.setVisibility(8);
       PatchProxy.onMethodExit(LiveCoverAnnexHelper$r.class, "2");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveCoverAnnexHelper$r.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.M.setVisibility(8);
       PatchProxy.onMethodExit(LiveCoverAnnexHelper$r.class, "1");
       return;
    }
}
