package com.kuaishou.live.core.show.pk.u;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;

public class u extends AnimatorListenerAdapter	// class@000dad
{
    public final LivePkScoreProgressBar a;

    public void u(LivePkScoreProgressBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       LivePkScoreProgressBar r;
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       u ta = this.a;
       LivePkScoreProgressBar c = ta.c;
       ta.j = c;
       if (ta.g == null) {
          ta.g = true;
          r = ta.r;
          if (r != null) {
             r.b(c);
          }
       }else {
          r = ta.r;
          if (r != null) {
             r.H();
          }
       }
       return;
    }
}
