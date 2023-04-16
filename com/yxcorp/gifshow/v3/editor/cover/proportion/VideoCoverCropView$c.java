package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView;
import android.graphics.RectF;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.view.View;

public final class VideoCoverCropView$c implements ValueAnimator$AnimatorUpdateListener	// class@000e9b
{
    public final VideoCoverCropView a;
    public final RectF b;
    public final RectF c;

    public void VideoCoverCropView$c(VideoCoverCropView p0,RectF p1,RectF p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverCropView$c.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       VideoCoverCropView$c ta = this.a;
       VideoCoverCropView h = ta.h;
       VideoCoverCropView$c tb = this.b;
       RectF left = tb.left;
       VideoCoverCropView$c tc = this.c;
       h.left = left + ((tc.left - left) * f);
       left = tb.top;
       h.top = left + ((tc.top - left) * f);
       left = tb.right;
       h.right = left + ((tc.right - left) * f);
       RectF bottom = tb.bottom;
       h.bottom = bottom + ((tc.bottom - bottom) * f);
       ta.invalidate();
       return;
    }
}
