package com.yxcorp.gifshow.widget.EditorCropImageView$g;
import com.yxcorp.gifshow.widget.CropSelectionBoxView$a;
import com.yxcorp.gifshow.widget.EditorCropImageView;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.widget.CropSelectionBoxView;
import usd.q;
import kotlin.jvm.internal.Ref$FloatRef;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import kxa.a;
import android.graphics.Matrix;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.ValueAnimator;
import tyc.v0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import tyc.w0;
import android.animation.Animator$AnimatorListener;

public final class EditorCropImageView$g implements CropSelectionBoxView$a	// class@001828
{
    public final EditorCropImageView a;

    public void EditorCropImageView$g(EditorCropImageView p0){
       this.a = p0;
       super();
    }
    public void a(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorCropImageView$g.class, "1")) {
          return;
       }
       a.p(p0, "boxRectF");
       this.a.k(false, false);
       return;
    }
    public void b(RectF p0){
       EditorCropImageView$g a;
       ValueAnimator obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, EditorCropImageView$g.class, "2")) {
          return;
       }
       a.p(obj1, "boxRectF");
       obj.a.g();
       a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(obj1, a, EditorCropImageView.class, "18")) {
          RectF rectF = a.e.d((p0.width() / p0.height()));
          float f = (float)2;
          float f1 = q.t((a.e.getBoxMaxHeight() / p0.height()), (a.e.getBoxMaxWidth() / p0.width()));
          Ref$FloatRef uFloatRef = new Ref$FloatRef();
          uFloatRef.element = 0;
          Ref$FloatRef uFloatRef1 = new Ref$FloatRef();
          uFloatRef1.element = 0;
          f = a.c.getScale();
          float f2 = f * f1;
          a attacher = a.c.getAttacher();
          a.o(attacher, "mImageView.attacher");
          Matrix matrix = attacher.p();
          float f3 = f1 * 0x3f800000;
          Ref$FloatRef uFloatRef2 = new Ref$FloatRef();
          uFloatRef2.element = 0x3f800000;
          Object[] objArray = new Object[0];
          a.D().w("EditorCropImageView", "actScale="+f1+",boxZoomEnd="+f3, objArray);
          obj = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(200);
          a.k = obj;
          v0 ov0 = v4;
          EditorCropImageView$g og = a;
          EditorCropImageView$g og1 = a;
          v0 ov01 = v4;
          float f4 = f;
          f = f2;
          Matrix matrix1 = matrix;
          ov0 = new v0(og, p0, f4, f, matrix1, (((rectF.left + rectF.right) / f) - ((obj1.left + obj1.right) / f)), uFloatRef, (((rectF.top + rectF.bottom) / f) - ((obj1.top + obj1.bottom) / f)), uFloatRef1, 0x3f800000, f3, uFloatRef2, new Matrix());
          obj.addUpdateListener(ov01);
          EditorCropImageView$g og2 = og1;
          og2.k.addListener(new w0(og2));
          og2.m(true);
       }
       return;
    }
}
