package com.kwai.component.tabs.panel.c$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.component.tabs.panel.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$c implements ValueAnimator$AnimatorUpdateListener	// class@000b76
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       c$c ta = this.a;
       int i = (ta.k != null)? 2: 1;
       ta.l(i);
       return;
    }
}
