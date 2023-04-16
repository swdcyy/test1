package com.kuaishou.live.common.core.component.like.i$b$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i$b;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.AnimatorSet;

public class i$b$a extends AnimatorListenerAdapter	// class@001468
{
    public final i$b a;

    public void i$b$a(i$b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.a.L.start();
       return;
    }
}
