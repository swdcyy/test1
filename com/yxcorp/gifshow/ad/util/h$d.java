package com.yxcorp.gifshow.ad.util.h$d;
import ekd.f$j;
import com.yxcorp.gifshow.ad.util.h;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.ad.util.i$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$d extends f$j	// class@001883
{
    public final ValueAnimator a;
    public final i$c b;
    public final h c;

    public void h$d(h p0,ValueAnimator p1,i$c p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       this.c.a(this.a, this.b);
       h$d tb = this.b;
       if (tb != null) {
          tb.d();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "2")) {
          return;
       }
       h$d tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
}
