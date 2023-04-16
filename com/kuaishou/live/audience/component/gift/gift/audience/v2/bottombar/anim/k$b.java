package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.k;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm1.a;

public class k$b extends AnimatorListenerAdapter	// class@000b0f
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.e();
       k$b ta = this.a;
       ta.h = false;
       ta.i.onAnimationEnd();
       return;
    }
}
