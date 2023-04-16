package com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.feature.api.live.floatingscreen.widget.LiveFloatingScreenStdShimmerLayout;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public final class LiveFloatingScreenStdShimmerLayout$d implements ValueAnimator$AnimatorUpdateListener	// class@000fd0
{
    public final LiveFloatingScreenStdShimmerLayout a;

    public void LiveFloatingScreenStdShimmerLayout$d(LiveFloatingScreenStdShimmerLayout p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenStdShimmerLayout$d.class, "1")) {
          return;
       }
       this.a.invalidate();
       return;
    }
}
