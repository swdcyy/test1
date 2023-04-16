package com.yxcorp.gifshow.widget.CropSelectionBoxView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.CropSelectionBoxView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import android.graphics.Paint;
import android.view.View;

public final class CropSelectionBoxView$b implements ValueAnimator$AnimatorUpdateListener	// class@00180f
{
    public final CropSelectionBoxView a;

    public void CropSelectionBoxView$b(CropSelectionBoxView p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView$b.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = p0.intValue();
       this.a.e.setAlpha(i);
       this.a.d.setAlpha(i);
       this.a.invalidate();
       return;
    }
}
