package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$h$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$h;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import java.lang.CharSequence;
import android.widget.TextView;

public final class LiveAdNeoEnhancePendantView$h$a extends AnimatorListenerAdapter	// class@0009ce
{
    public final LiveAdNeoEnhancePendantView$h a;

    public void LiveAdNeoEnhancePendantView$h$a(LiveAdNeoEnhancePendantView$h p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$h$a.class, "1")) {
          return;
       }
       LiveAdNeoEnhancePendantView$h$a ta = this.a;
       LiveAdNeoEnhancePendantView l = ta.a.l;
       if (l != null) {
          l.setText(String.valueOf(ta.b));
       }
       LiveAdNeoEnhancePendantView l1 = this.a.a.l;
       if (l1 != null) {
          l1.setVisibility(0);
       }
       l1 = this.a.a.m;
       if (l1 != null) {
          l1.setVisibility(8);
       }
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$h$a.class, "1");
       return;
    }
}
