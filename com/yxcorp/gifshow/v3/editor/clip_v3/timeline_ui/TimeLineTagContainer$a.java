package com.yxcorp.gifshow.v3.editor.clip_v3.timeline_ui.TimeLineTagContainer$a;
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

public final class TimeLineTagContainer$a implements ValueAnimator$AnimatorUpdateListener	// class@000dd0
{
    public final TimeLineTagContainer a;

    public void TimeLineTagContainer$a(TimeLineTagContainer p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TimeLineTagContainer$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       TextView mCurrentSpee = this.a.getMCurrentSpeedView();
       a.o(mCurrentSpee, "mCurrentSpeedView");
       Object animatedValu = p0.getAnimatedValue();
       Objects.requireNonNull(animatedValu, "null cannot be cast to non-null type kotlin.Float");
       mCurrentSpee.setTranslationX((- animatedValu.floatValue()));
       mCurrentSpee = this.a.getMDurationTextView();
       a.o(mCurrentSpee, "mDurationTextView");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       mCurrentSpee.setTranslationX((- p0.floatValue()));
       return;
    }
}
