package com.kuaishou.live.common.core.component.multipk.render.view.b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$b;

public class b extends AnimatorListenerAdapter	// class@001680
{
    public final LiveMultiPkScoreProgressBar a;

    public void b(LiveMultiPkScoreProgressBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       LiveMultiPkScoreProgressBar o;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       b ta = this.a;
       LiveMultiPkScoreProgressBar c = ta.c;
       ta.j = c;
       if (ta.g == null) {
          ta.g = true;
          o = ta.o;
          if (o != null) {
             o.V0((float)c);
          }
       }else {
          o = ta.o;
          if (o != null) {
             o.H();
          }
       }
       return;
    }
}
