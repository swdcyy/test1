package com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.growth.pendant.coin.task.widget.CountDownTaskPendantV2;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import android.widget.ProgressBar;

public final class CountDownTaskPendantV2$c implements ValueAnimator$AnimatorUpdateListener	// class@00061d
{
    public final CountDownTaskPendantV2 a;

    public void CountDownTaskPendantV2$c(CountDownTaskPendantV2 p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CountDownTaskPendantV2$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       CountDownTaskPendantV2 s = this.a.s;
       if (s != null) {
          p0 = p0.getAnimatedValue();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
          s.setProgress(p0.intValue());
       }
       return;
    }
}
