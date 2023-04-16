package com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.assistant.recommend.AssistKSBlurMaskView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.graphics.Paint;
import android.view.View;

public final class AssistKSBlurMaskView$d implements ValueAnimator$AnimatorUpdateListener	// class@001d1a
{
    public final AssistKSBlurMaskView a;

    public void AssistKSBlurMaskView$d(AssistKSBlurMaskView p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistKSBlurMaskView$d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       this.a.g.setAlpha((int)((float)255 * p0.floatValue()));
       this.a.invalidate();
       return;
    }
}
