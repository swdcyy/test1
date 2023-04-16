package com.yxcorp.gifshow.ad.util.j;
import ekd.f$j;
import com.yxcorp.gifshow.ad.util.i$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class j extends f$j	// class@00188b
{
    public final i$c a;

    public void j(i$c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       j ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       j ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
}
