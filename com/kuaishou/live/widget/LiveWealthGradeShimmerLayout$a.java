package com.kuaishou.live.widget.LiveWealthGradeShimmerLayout$a;
import ekd.f$j;
import com.kuaishou.live.widget.LiveWealthGradeShimmerLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;

public class LiveWealthGradeShimmerLayout$a extends f$j	// class@00101f
{
    public final LiveWealthGradeShimmerLayout a;

    public void LiveWealthGradeShimmerLayout$a(LiveWealthGradeShimmerLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWealthGradeShimmerLayout$a.class, "1")) {
          return;
       }
       LiveWealthGradeShimmerLayout$a ta = this.a;
       LiveWealthGradeShimmerLayout f = ta.f;
       if (f != null && ta.l != null) {
          f.setStartDelay(ta.j);
          this.a.f.start();
       }
       return;
    }
}
