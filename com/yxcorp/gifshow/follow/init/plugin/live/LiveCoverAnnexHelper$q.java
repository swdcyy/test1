package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$q;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.view.View;
import java.lang.NullPointerException;

public final class LiveCoverAnnexHelper$q implements ValueAnimator$AnimatorUpdateListener	// class@0010da
{
    public final LiveCoverAnnexHelper a;

    public void LiveCoverAnnexHelper$q(LiveCoverAnnexHelper p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveCoverAnnexHelper$q.class, "1")) {
          return;
       }
       LiveCoverAnnexHelper m = this.a.M;
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          m.setAlpha(p0.floatValue());
          PatchProxy.onMethodExit(LiveCoverAnnexHelper$q.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(LiveCoverAnnexHelper$q.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
