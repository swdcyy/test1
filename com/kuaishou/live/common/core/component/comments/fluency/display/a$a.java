package com.kuaishou.live.common.core.component.comments.fluency.display.a$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.comments.fluency.display.a;
import android.view.View;
import te1.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$a extends AnimatorListenerAdapter	// class@00107e
{
    public final View a;
    public final d b;
    public final a c;

    public void a$a(a p0,View p1,d p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.c.d(this.a, this.b);
       this.c.f(this.a);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.c.d(this.a, this.b);
       this.c.f(this.a);
       return;
    }
}
