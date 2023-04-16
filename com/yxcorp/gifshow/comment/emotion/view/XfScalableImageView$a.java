package com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$a;
import android.view.ScaleGestureDetector$SimpleOnScaleGestureListener;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView;
import android.view.ScaleGestureDetector;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;
import java.lang.Math;
import android.animation.ValueAnimator;

public class XfScalableImageView$a extends ScaleGestureDetector$SimpleOnScaleGestureListener	// class@0010c9
{
    public final XfScalableImageView a;

    public void XfScalableImageView$a(XfScalableImageView p0){
       this.a = p0;
       super();
    }
    public boolean onScale(ScaleGestureDetector p0){
       float f1;
       Object obj = PatchProxy.applyOneRefs(p0, this, XfScalableImageView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       float scaleFactor = p0.getScaleFactor();
       if (scaleFactor - 0x3f80624e < 0 && scaleFactor - 0x3f7f7cee > 0) {
          return true;
       }
       float f = 0x3f800000;
       if (scaleFactor - f > 0) {
          f1 = 0x3f8147ae;
       }else if(scaleFactor - f < 0){
          f1 = 0x3f7d70a4;
       }else {
       label_003b :
          XfScalableImageView$a ta = this.a;
          float f2 = ta.x * scaleFactor;
          if (f2 - ta.F >= 0 && f2 - ta.D <= 0) {
             ta.x = f2;
             ta.y.postScale(scaleFactor, scaleFactor, ta.B, ta.C);
             if (scaleFactor - f < 0) {
                RectF displayRect = this.a.getDisplayRect();
                float f3 = 2.00f;
                if (displayRect.width() - (float)this.a.getWidth() > 0) {
                   f = (((displayRect.right + displayRect.left) - (float)this.a.getLeft()) - (float)this.a.getRight()) / f3;
                   float f4 = - f;
                   this.a.y.postTranslate((f4 * Math.abs((f / displayRect.width()))), 0);
                }
                if (displayRect.height() - (float)this.a.getHeight() > 0) {
                   f = (((displayRect.top + displayRect.bottom) - (float)this.a.getTop()) - (float)this.a.getBottom()) / f3;
                   f3 = - f;
                   this.a.y.postTranslate(0, (f3 * Math.abs((f / displayRect.height()))));
                }
             }
             this.a.invalidate();
          }
          return true;
       }
       scaleFactor = scaleFactor * f1;
       goto label_003b ;
    }
    public void onScaleEnd(ScaleGestureDetector p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XfScalableImageView$a.class, "2")) {
          return;
       }
       XfScalableImageView n = this.a.N;
       if (n != null && n.isRunning()) {
          return;
       }
       XfScalableImageView$a ta = this.a;
       XfScalableImageView x = ta.x;
       XfScalableImageView g = ta.G;
       if (x - g < 0) {
          ta.r0(x, g);
       }else {
          g = ta.E;
          if (x - g > 0) {
             ta.r0(x, g);
          }
       }
       return;
    }
}
