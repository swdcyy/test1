package com.kuaishou.live.common.core.component.comments.a$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.comments.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import va1.b0;

public class a$a extends AnimatorListenerAdapter	// class@001059
{
    public final float a;
    public final float b;
    public final a c;

    public void a$a(a p0,float p1,float p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       a$a tc = this.c;
       int i = (this.a - this.b >= 0 && !b0.a())? 0: 4;
       tc.a(i);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       if (this.a - this.b > 0 && !b0.a()) {
          this.c.a(0);
       }
       return;
    }
}
