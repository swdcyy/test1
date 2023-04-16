package com.kwai.component.tabs.panel.c$d;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.tabs.panel.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class c$d extends AnimatorListenerAdapter	// class@000b77
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.b.setEnabled(true);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "3")) {
          return;
       }
       super.onAnimationEnd(p0);
       c$d ta = this.a;
       int i = (ta.k != null)? 2: 1;
       ta.l(i);
       this.a.b.setEnabled(true);
       this.a.d(4);
       ta = this.a;
       ta.k = false;
       ta.g = null;
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.d(3);
       return;
    }
}
