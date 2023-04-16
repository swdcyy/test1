package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$j;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveAdNeoEnhancePendantView$j extends AnimatorListenerAdapter	// class@0009d1
{
    public final ObjectAnimator a;
    public final ObjectAnimator b;
    public final ObjectAnimator c;
    public final a d;

    public void LiveAdNeoEnhancePendantView$j(ObjectAnimator p0,ObjectAnimator p1,ObjectAnimator p2,a p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$j.class, "1")) {
          return;
       }
       this.d.invoke();
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$j.class, "1");
       return;
    }
}
