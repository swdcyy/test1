package com.yxcorp.gifshow.widget.EditorCropImageView$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import android.graphics.RectF;
import android.graphics.Matrix;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.widget.CropSelectionBoxView;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import android.widget.ImageView;

public final class EditorCropImageView$f implements ValueAnimator$AnimatorUpdateListener	// class@001827
{
    public final EditorCropImageView a;
    public final RectF b;
    public final RectF c;
    public final float d;
    public final float e;
    public final Matrix f;

    public void EditorCropImageView$f(EditorCropImageView p0,RectF p1,RectF p2,float p3,float p4,Matrix p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       float f4;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorCropImageView$f.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       RectF selectionBox = this.a.e.getSelectionBoxRect();
       EditorCropImageView$f tb = this.b;
       RectF left = tb.left;
       EditorCropImageView$f tc = this.c;
       selectionBox.left = left + ((tc.left - left) * f);
       left = tb.top;
       selectionBox.top = left + ((tc.top - left) * f);
       left = tb.right;
       selectionBox.right = left + ((tc.right - left) * f);
       RectF bottom = tb.bottom;
       selectionBox.bottom = bottom + ((tc.bottom - bottom) * f);
       this.a.e.setSelectionBoxRect(selectionBox);
       this.a.o();
       tb = this.b;
       float f1 = (float)2;
       float f2 = (tb.left + tb.right) / f1;
       float f3 = (tb.top + tb.bottom) / f1;
       tb = this.d;
       this.f.postScale(((tb + (f * (this.e - tb))) / this.a.c.getScale()), ((tb + (f * (this.e - tb))) / this.a.c.getScale()), f2, f3);
       RectF displayRect = this.a.c.getDisplayRect();
       bottom = selectionBox.left;
       left = displayRect.left;
       f1 = 0;
       if (bottom - left >= 0) {
          bottom = selectionBox.right;
          left = displayRect.right;
          if (bottom - left <= 0) {
             f4 = 0;
          label_00a2 :
             left = selectionBox.top;
             RectF top = displayRect.top;
             if (left - top < 0) {
                f1 = left - top;
             }else {
                selectionBox = selectionBox.bottom;
                displayRect = displayRect.bottom;
                if (selectionBox - displayRect > 0) {
                   f1 = selectionBox - displayRect;
                }
             }
             this.f.postTranslate(f4, f1);
             this.a.c.invalidate();
             return;
          }
       }
       f4 = bottom - left;
       goto label_00a2 ;
    }
}
