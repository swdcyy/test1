package com.kuaishou.live.core.show.pk.t;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;

public class t implements ValueAnimator$AnimatorUpdateListener	// class@000dac
{
    public final LivePkScoreProgressBar a;

    public void t(LivePkScoreProgressBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.a.i = p0.getAnimatedValue().intValue();
       t ta = this.a;
       LivePkScoreProgressBar r = ta.r;
       if (r != null) {
          r.a(ta.j, ta.c, (int)((((double)ta.i * 0x3ff0000000000000) / (double)ta.getWidth()) * 100.00f));
       }
       this.a.invalidate();
       return;
    }
}
