package com.kuaishou.live.audience.component.topbar.d$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.topbar.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ms5.a;
import d61.l;
import android.animation.TimeInterpolator;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import com.kuaishou.live.common.core.basic.degrade.j;
import ms5.a$b;

public class d$a extends AnimatorListenerAdapter	// class@000be7
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       d$a ta = this.a;
       d o = ta.O;
       if (o != null) {
          d s = ta.S;
          if (s != null && s.g == 1) {
             o.setTimeInterpolator(new l(0.40f, 0, 0.20f, 0x3f800000));
             j.h(this.a.O, 3000);
          }
       }
       ta = this.a;
       o = ta.S;
       if (o != null) {
          ta.b9(o, false);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       d$a ta = this.a;
       d t = ta.T;
       if (t != null) {
          d s = ta.S;
          if (s != null) {
             t.Ee(s);
          }
       }
       return;
    }
}
