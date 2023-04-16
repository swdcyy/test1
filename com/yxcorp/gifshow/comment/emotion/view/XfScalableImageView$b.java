package com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$b;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$c;
import java.lang.Float;
import java.lang.Math;
import android.graphics.RectF;
import android.widget.ImageView;
import android.graphics.Matrix;

public class XfScalableImageView$b extends GestureDetector$SimpleOnGestureListener	// class@0010ca
{
    public final XfScalableImageView b;

    public void XfScalableImageView$b(XfScalableImageView p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, XfScalableImageView$b.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       XfScalableImageView$b tb = this.b;
       XfScalableImageView x = tb.x;
       XfScalableImageView xfScalableIm = 0x3f800000;
       if (!x - xfScalableIm) {
          tb.r0(x, tb.H);
       }else {
          tb.r0(x, xfScalableIm);
       }
       return true;
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XfScalableImageView$b.class, "2")) {
          return;
       }
       XfScalableImageView o = this.b.O;
       if (o != null) {
          o.a();
       }
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       float f3;
       XfScalableImageView$b uob;
       if (PatchProxy.isSupport(XfScalableImageView$b.class)) {
          p0 = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, XfScalableImageView$b.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       float f = Math.abs(p2);
       float f1 = Math.abs(p3);
       float f2 = 10.00f;
       if ((v2 = f - f2) < 0 && f1 - f2 < 0) {
          int i = 0x40555555;
          if ((f - f1) - i > 0) {
          label_0051 :
             p3 = 0;
          }else if((f1 - f) - i > 0){
          label_0059 :
             p2 = 0;
          }
       }else if((v3 = f - f2) > 0 && f1 - f2 < 0){
          goto label_0051 ;
       }else {
          v0 = f1 - f2;
          if (f2 > 0 && v2 < 0) {
             goto label_0059 ;
          }else if(f2 > 0 && v3 > 0){
             double d = (double)f1;
             double d1 = (double)f;
             if (d - (d1 * 3.50f) > 0) {
                goto label_0059 ;
             }else if(d1 - (d * 3.50f) > 0){
                goto label_0051 ;
             }
          }
       }
       RectF displayRect = this.b.getDisplayRect();
       if (p2 > 0 && displayRect.right - (float)this.b.getRight() > 0) {
          f3 = displayRect.right - (float)this.b.getRight();
          if (p2 - f3 > 0) {
             p2 = f3;
          }
          this.b.y.postTranslate((- p2), 0);
       }else if(p2 < 0 && displayRect.left - (float)this.b.getLeft() < 0){
          f3 = (float)this.b.getLeft() - displayRect.left;
          p2 = - p2;
          if (p2 - f3 <= 0) {
             f3 = p2;
          }
          this.b.y.postTranslate(f3, 0);
       }else {
          uob = null;
       label_00ce :
          if (p3 > 0 && displayRect.bottom - (float)this.b.getBottom() > 0) {
             f = displayRect.bottom - (float)this.b.getBottom();
             if (p3 - f > 0) {
                p3 = f;
             }
             this.b.y.postTranslate(0, (- p3));
          }else if(p3 < 0 && displayRect.top - (float)this.b.getTop() < 0){
             uob = (float)this.b.getTop() - displayRect.top;
             f = - p3;
             if (f - uob <= 0) {
                uob = f;
             }
             this.b.y.postTranslate(0, uob);
          }else if(uob != null){
             this.b.invalidate();
             return true;
          }else {
             return false;
          }
          uob = 1;
          goto label_0122 ;
       }
       uob = 1;
       goto label_00ce ;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, XfScalableImageView$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       XfScalableImageView o = this.b.O;
       if (o == null) {
          return false;
       }
       o.onClick();
       return true;
    }
}
