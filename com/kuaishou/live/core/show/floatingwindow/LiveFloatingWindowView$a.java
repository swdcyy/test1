package com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowView$a;
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

public class LiveFloatingWindowView$a implements ValueAnimator$AnimatorUpdateListener	// class@000b6f
{
    public final LiveFloatingWindowView a;

    public void LiveFloatingWindowView$a(LiveFloatingWindowView p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingWindowView$a.class, "1")) {
          return;
       }
       this.a.u.x = p0.getAnimatedValue().intValue();
       if (!this.a.c()) {
          this.a.f();
       }
       if (!this.a.getVisibility() && this.a.isAttachedToWindow()) {
          LiveFloatingWindowView$a ta = this.a;
          ta.i.updateViewLayout(ta, ta.u);
       }
       return;
    }
}
