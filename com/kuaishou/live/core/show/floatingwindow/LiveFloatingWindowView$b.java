package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.WindowManager$LayoutParams;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager;

public class LiveFloatingWindowView$b implements ValueAnimator$AnimatorUpdateListener	// class@000b70
{
    public final LiveFloatingWindowView a;

    public void LiveFloatingWindowView$b(LiveFloatingWindowView p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowView$b.class, "1")) {
          return;
       }
       this.a.u.y = p0.getAnimatedValue().intValue();
       if (!this.a.getVisibility() && this.a.isAttachedToWindow()) {
          LiveFloatingWindowView$b ta = this.a;
          ta.i.updateViewLayout(ta, ta.u);
       }
       return;
    }
}
