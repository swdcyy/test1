package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$g;
import android.animation.AnimatorListenerAdapter;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveAdNeoEnhancePendantView$g extends AnimatorListenerAdapter	// class@0009cd
{
    public final a a;

    public void LiveAdNeoEnhancePendantView$g(a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$g.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.invoke();
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$g.class, "1");
       return;
    }
}
