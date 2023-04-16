package com.kuaishou.live.core.show.luckystar.currentinfo.c$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import ac2.m;
import java.lang.Runnable;
import ac2.n;

public class c$a extends AnimatorListenerAdapter	// class@000cc3
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.A.animate().alpha(0).withEndAction(new m(this)).start();
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       super.onAnimationRepeat(p0);
       this.a.A.animate().alpha(0).withEndAction(new n(this)).start();
       return;
    }
}
