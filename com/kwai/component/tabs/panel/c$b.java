package com.kwai.component.tabs.panel.c$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.tabs.panel.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class c$b extends AnimatorListenerAdapter	// class@000b75
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       super.onAnimationCancel(p0);
       c$b ta = this.a;
       ta.g = null;
       ta.b.setEnabled(true);
       ta.h = null;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "3")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.l(0);
       c$b ta = this.a;
       ta.g = null;
       ta.d(2);
       this.a.b.setEnabled(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       c$b ta = this.a;
       ta.h = null;
       ta.d(1);
       this.a.b.setEnabled(false);
       return;
    }
}
