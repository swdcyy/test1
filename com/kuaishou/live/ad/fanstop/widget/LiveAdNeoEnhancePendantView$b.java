package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import android.animation.ObjectAnimator;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public final class LiveAdNeoEnhancePendantView$b extends AnimatorListenerAdapter	// class@0009c8
{
    public final LiveAdNeoEnhancePendantView a;
    public final ObjectAnimator b;
    public final ObjectAnimator c;
    public final a d;

    public void LiveAdNeoEnhancePendantView$b(LiveAdNeoEnhancePendantView p0,ObjectAnimator p1,ObjectAnimator p2,a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("LiveAdNeoEnhancePendantView", "First add anim end", objArray);
       b uob = new b();
       uob.g(KwaiRadiusStyles.R6);
       uob.v(a1.a(R.color.arg_RES_7f060846));
       this.a.setBackground(uob.a());
       this.d.invoke();
       objArray.o = null;
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$b.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("LiveAdNeoEnhancePendantView", "First add anim start", objArray);
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$b.class, "1");
       return;
    }
}
