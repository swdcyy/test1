package com.kuaishou.live.core.show.fansgroup.a;
import ekd.f$j;
import com.kuaishou.live.core.show.fansgroup.b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f82.b;
import java.lang.Runnable;
import ekd.k1;

public class a extends f$j	// class@000b2a
{
    public final b a;

    public void a(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       int i = ta.f + 1;
       ta.f = i;
       if (ta.c != null && i < 4) {
          k1.p(new b(this), ta.g);
       }
       return;
    }
}
