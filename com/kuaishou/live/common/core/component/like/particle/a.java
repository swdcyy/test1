package com.kuaishou.live.common.core.component.like.particle.a;
import android.animation.AnimatorListenerAdapter;
import jo1.a;
import com.kuaishou.live.common.core.component.like.count.LiveLikeCountAnimationTextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import x51.b;
import e93.f;
import jo1.c;
import java.lang.Runnable;

public class a extends AnimatorListenerAdapter	// class@001473
{
    public final LiveLikeCountAnimationTextView a;
    public final a b;

    public void a(a p0,LiveLikeCountAnimationTextView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.g = b.b().a();
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       f.g(a.class);
       f.k("ParticleAnimator.start", new c(this), a.class, 1000);
       return;
    }
}
