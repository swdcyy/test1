package com.kuaishou.live.core.show.wishlight.spring.view.b;
import android.animation.Animator$AnimatorListener;
import com.kuaishou.live.core.show.wishlight.spring.view.c;
import com.kuaishou.live.core.show.wishlight.spring.view.c$b;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.view.View;

public class b implements Animator$AnimatorListener	// class@0012bc
{
    public final c$b a;
    public final c b;

    public void b(c p0,c$b p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a.onAnimationEnd(p0);
       this.b.c.removeListener(this);
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, c.class, "5")) {
          tb.a.setScaleX(0x3f800000);
          tb.a.setScaleY(0x3f800000);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
}
