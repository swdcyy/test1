package com.kuaishou.live.common.core.component.like.j$a$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.j$a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.j;
import com.kuaishou.live.common.core.component.like.i;

public class j$a$a extends AnimatorListenerAdapter	// class@00146b
{
    public final j$a a;

    public void j$a$a(j$a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.a.a.X8(true);
       return;
    }
}
