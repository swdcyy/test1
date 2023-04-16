package com.yxcorp.gifshow.widget.CropSelectionBoxView$c;
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
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public final class CropSelectionBoxView$c implements ValueAnimator$AnimatorUpdateListener	// class@001810
{
    public final CropSelectionBoxView a;

    public void CropSelectionBoxView$c(CropSelectionBoxView p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView$c.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       this.a.s = p0.intValue();
       CropSelectionBoxView$c ta = this.a;
       ta.q = Color.argb(ta.s, 0, 0, 0);
       CropSelectionBoxView$c ta1 = this.a;
       ta1.f.setAlpha((int)((float)255 - ((float)(ta1.s - 127) * 0x4053f2b4)));
       this.a.invalidate();
       return;
    }
}
