package com.kuaishou.live.core.basic.widget.LiveShimmerGradientTextView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.basic.widget.LiveShimmerGradientTextView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveShimmerGradientTextView$a extends AnimatorListenerAdapter	// class@000911
{
    public final LiveShimmerGradientTextView a;

    public void LiveShimmerGradientTextView$a(LiveShimmerGradientTextView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveShimmerGradientTextView$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.f = null;
       return;
    }
}
