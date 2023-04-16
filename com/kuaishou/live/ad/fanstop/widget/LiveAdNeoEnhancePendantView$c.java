package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$c;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.TextView;

public final class LiveAdNeoEnhancePendantView$c extends AnimatorListenerAdapter	// class@0009c9
{
    public final LiveAdNeoEnhancePendantView a;
    public final boolean b;
    public final a c;

    public void LiveAdNeoEnhancePendantView$c(LiveAdNeoEnhancePendantView p0,boolean p1,a p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$c.class, "1")) {
          return;
       }
       this.c.invoke();
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$c.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$c.class, "2")) {
          return;
       }
       LiveAdNeoEnhancePendantView j = this.a.j;
       if (j == null) {
          a.S("mNeoTextGroup");
       }
       j.setVisibility(8);
       j = this.a.m;
       if (j != null) {
          j.setVisibility(8);
       }
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$c.class, "2");
       return;
    }
}
