package com.kuaishou.live.common.core.component.multipk.render.view.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.FrameLayout;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkScoreProgressBar$b;

public class a implements ValueAnimator$AnimatorUpdateListener	// class@00167f
{
    public final LiveMultiPkScoreProgressBar a;

    public void a(LiveMultiPkScoreProgressBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.i = p0.getAnimatedValue().intValue();
       a ta = this.a;
       LiveMultiPkScoreProgressBar o = ta.o;
       if (o != null) {
          o.w0(ta.j, ta.c, ((((float)ta.i * 0x3f800000) / (float)ta.getWidth()) * 100.00f));
       }
       this.a.invalidate();
       return;
    }
}
