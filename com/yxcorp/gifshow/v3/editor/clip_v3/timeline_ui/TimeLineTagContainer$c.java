package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.util.Objects;
import java.lang.Float;

public final class TimeLineTagContainer$c implements ValueAnimator$AnimatorUpdateListener	// class@000dd2
{
    public final TimeLineTagContainer a;

    public void TimeLineTagContainer$c(TimeLineTagContainer p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimeLineTagContainer$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       TextView mDurationTex = this.a.getMDurationTextView();
       a.o(mDurationTex, "mDurationTextView");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       mDurationTex.setAlpha(p0.floatValue());
       return;
    }
}
