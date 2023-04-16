package com.yxcorp.gifshow.ad.util.h$f;
import ekd.f$j;
import com.yxcorp.gifshow.ad.util.h;
import com.yxcorp.gifshow.ad.util.i$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$f extends f$j	// class@001885
{
    public final i$c a;
    public final h b;

    public void h$f(h p0,i$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$f.class, "1")) {
          return;
       }
       h$f ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$f.class, "2")) {
          return;
       }
       h$f ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
}
