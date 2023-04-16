package com.kuaishou.live.ad.social.y$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.social.y;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.TimeUnit;
import brd.a0;
import t45.d;
import brd.z;
import zl0.o1;
import com.kuaishou.live.ad.social.x;
import erd.g;
import crd.b;

public class y$a extends AnimatorListenerAdapter	// class@000a29
{
    public final y a;
    public static final int b;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       y$a ta = this.a;
       ta.d = a0.Y((long)ta.f, TimeUnit.MILLISECONDS).G(d.a).R(new o1(this), x.b);
       return;
    }
}
