package com.kuaishou.live.audience.component.follow.e;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.audience.component.follow.d;
import com.yxcorp.plugin.live.widget.ShimmerTextView;
import oy0.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oy0.p;
import java.lang.Runnable;
import e93.f;

public class e extends AnimatorListenerAdapter	// class@000ad4
{
    public final ShimmerTextView a;
    public final a b;
    public final KwaiImageView c;
    public final d d;

    public void e(d p0,ShimmerTextView p1,a p2,KwaiImageView p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.d.Y8();
       p op = new p(this, this.a, this.b, this.c);
       p0.w = op;
       f.j("getFollowButtonShrinkAnimation", op, 3000);
       return;
    }
}
