package com.kuaishou.live.lite.like.g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.lite.like.f$a;
import com.kuaishou.live.common.core.component.like.count.LiveLikeCountAnimationTextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.live.lite.like.f;
import e93.f;
import wb3.i;
import java.lang.Runnable;

public class g extends AnimatorListenerAdapter	// class@0009f5
{
    public final LiveLikeCountAnimationTextView a;
    public final f$a b;

    public void g(f$a p0,LiveLikeCountAnimationTextView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(8);
       this.b.a.removeView(this.a);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       g tb = this.b;
       tb.f = tb.f + 1;
       this.a.setVisibility(0);
       f.g(f.class);
       f.k("showLikeAnimation", new i(this), f.class, 1000);
       return;
    }
}
