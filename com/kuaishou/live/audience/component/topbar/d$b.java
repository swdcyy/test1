package com.kuaishou.live.audience.component.topbar.d$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.topbar.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import ms5.a;
import ms5.a$b;

public class d$b extends AnimatorListenerAdapter	// class@000be8
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       d o = this.a.O;
       if (o != null) {
          o.setVisibility(8);
       }
       d$b ta = this.a;
       d s = ta.S;
       if (s != null) {
          o = ta.T;
          if (o != null) {
             o.Lc(s);
          }
       }
       ta = this.a;
       ta.S = null;
       ta.T = null;
       ta.h9();
       return;
    }
}
