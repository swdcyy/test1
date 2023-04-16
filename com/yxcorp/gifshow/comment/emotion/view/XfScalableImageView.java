package com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Math;
import android.graphics.RectF;
import android.widget.ImageView;
import android.view.ViewParent;
import android.view.View;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.Matrix;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$a;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector$OnScaleGestureListener;
import java.lang.reflect.Field;
import java.lang.Integer;
import ek9.m1;
import java.lang.Exception;
import q87.c;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$b;
import android.view.GestureDetector;
import android.view.GestureDetector$OnGestureListener;
import android.graphics.Canvas;
import android.animation.ValueAnimator;
import java.lang.Float;
import mk9.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$c;

public class XfScalableImageView extends KwaiBindableImageView	// class@0010cc
{
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public ValueAnimator N;
    public XfScalableImageView$c O;
    public ScaleGestureDetector v;
    public GestureDetector w;
    public float x;
    public Matrix y;
    public float z;
    public static final int P;

    public void XfScalableImageView(Context p0){
       super(p0);
       this.x = 0x3f800000;
       this.D = 4.00f;
       this.E = 3.00f;
       this.F = 0x3f19999a;
       this.G = 0x3f800000;
       this.H = 2.00f;
       this.I = 0x3f800000;
       this.J = -1;
       this.K = -1;
       this.L = -1;
       this.M = -1;
       this.o0();
    }
    public void XfScalableImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.x = 0x3f800000;
       this.D = 4.00f;
       this.E = 3.00f;
       this.F = 0x3f19999a;
       this.G = 0x3f800000;
       this.H = 2.00f;
       this.I = 0x3f800000;
       this.J = -1;
       this.K = -1;
       this.L = -1;
       this.M = -1;
       this.o0();
    }
    public void XfScalableImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = 0x3f800000;
       this.D = 4.00f;
       this.E = 3.00f;
       this.F = 0x3f19999a;
       this.G = 0x3f800000;
       this.H = 2.00f;
       this.I = 0x3f800000;
       this.J = -1;
       this.K = -1;
       this.L = -1;
       this.M = -1;
       this.o0();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, XfScalableImageView.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action != b) {
             if (action != 0.00f) {
                if (action == 3) {
                label_0113 :
                   this.getParent().requestDisallowInterceptTouchEvent(false);
                }
             }else {
                float f = this.z - p0.getX();
                float f1 = this.A - p0.getY();
                this.z = p0.getX();
                this.A = p0.getY();
                if (Math.abs(f1) - Math.abs(f) > 0) {
                   if (f1 < 0) {
                      obj = PatchProxy.apply(null, this, XfScalableImageView.class, "19");
                      if (obj != patchProxyRe) {
                         action = obj.booleanValue();
                      }else if(this.getDisplayRect().bottom - (float)this.getBottom() > 0){
                         action = true;
                      }else {
                         action = false;
                      }
                      if (!action) {
                         this.getParent().requestDisallowInterceptTouchEvent(false);
                      }
                   }
                   if (f1 > 0) {
                      obj = PatchProxy.apply(null, this, XfScalableImageView.class, "18");
                      if (obj != patchProxyRe) {
                         b1 = obj.booleanValue();
                      }else if(this.getDisplayRect().top - (float)this.getTop() < 0){
                         b = 0;
                      }
                      b1 = b;
                      if (!b1) {
                         this.getParent().requestDisallowInterceptTouchEvent(false);
                      }
                   }
                }else if(f < 0){
                   Object obj1 = PatchProxy.apply(null, this, XfScalableImageView.class, "16");
                   if (obj1 != patchProxyRe) {
                      b2 = obj1.booleanValue();
                   }else if(this.getDisplayRect().left - (float)this.getLeft() < 0){
                      b2 = true;
                   }else {
                      b2 = false;
                   }
                   if (!b2) {
                      this.getParent().requestDisallowInterceptTouchEvent(false);
                   }
                }
                if (f > 0) {
                   obj = PatchProxy.apply(null, this, XfScalableImageView.class, "17");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else if(this.getDisplayRect().right - (float)this.getRight() > 0){
                      b = 0;
                   }
                   b1 = b;
                   if (!b1) {
                      this.getParent().requestDisallowInterceptTouchEvent(false);
                   }
                }
             }
          }else {
             goto label_0113 ;
          }
       }else {
          this.getParent().requestDisallowInterceptTouchEvent(b);
          this.z = p0.getX();
          this.A = p0.getY();
       }
    label_012e :
       return super.dispatchTouchEvent(p0);
    }
    public RectF getDisplayRect(){
       RectF obj = PatchProxy.apply(null, this, XfScalableImageView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new RectF();
       this.getHierarchy().k(obj);
       this.y.mapRect(obj);
       return obj;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, XfScalableImageView.class, "3")) {
          return;
       }
       float f = 0x3f800000;
       if (this.I - f) {
          return;
       }
       XfScalableImageView xfScalableIm = null;
       if (this.B - xfScalableIm && this.C - xfScalableIm) {
          XfScalableImageView tJ = this.J;
          if (tJ > null) {
             xfScalableIm = this.K;
             if (xfScalableIm > null) {
                this.I = ((float)(xfScalableIm / this.M) - (float)(tJ / this.L) < 0)? ((float)xfScalableIm * f) / (float)this.getHeight(): ((float)tJ * f) / (float)this.getWidth();
                this.q0();
                this.invalidate();
             }
          }
       }
       return;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, XfScalableImageView.class, "1")) {
          return;
       }
       this.y = new Matrix();
       ScaleGestureDetector scaleGesture = new ScaleGestureDetector(this.getContext(), new XfScalableImageView$a(this));
       try{
          this.v = scaleGesture;
          Field declaredFiel = scaleGesture.getClass().getDeclaredField("mMinSpan");
          declaredFiel.setAccessible(true);
          declaredFiel.set(this.v, Integer.valueOf(true));
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          m1.C().t("XfScalableImageView", e0.getMessage(), objArray);
       }
       this.w = new GestureDetector(this.getContext(), new XfScalableImageView$b(this));
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XfScalableImageView.class, "7")) {
          return;
       }
       this.n0();
       p0.concat(this.y);
       super.onDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(XfScalableImageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, XfScalableImageView.class, "6")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (!PatchProxy.applyVoid(null, this, XfScalableImageView.class, "2")) {
          p2 = 0;
          if (!this.B - p2) {
             this.B = (float)(this.getLeft() + this.getRight()) / 2.00f;
          }
          if (!this.C - p2) {
             this.C = (float)(this.getTop() + this.getBottom()) / 2.00f;
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, XfScalableImageView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v.onTouchEvent(p0);
       if (!this.v.isInProgress()) {
          this.w.onTouchEvent(p0);
       }
       return true;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, XfScalableImageView.class, "14")) {
          return;
       }
       super.p();
       XfScalableImageView tN = this.N;
       if (tN != null && tN.isRunning()) {
          this.N.cancel();
          this.N.removeAllUpdateListeners();
       }
       return;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, XfScalableImageView.class, "5")) {
          return;
       }
       this.q0();
       this.invalidate();
       return;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, XfScalableImageView.class, "4")) {
          return;
       }
       this.y.reset();
       this.y.setScale(this.I, this.I, this.B, this.C);
       this.x = 0x3f800000;
       return;
    }
    public void r0(float p0,float p1){
       if (PatchProxy.isSupport(XfScalableImageView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, XfScalableImageView.class, "9")) {
          return;
       }
       XfScalableImageView tN = this.N;
       if (tN != null && tN.isRunning()) {
          return;
       }
       float[] uofloatArray = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(200);
       this.N = valueAnimato;
       valueAnimato.addUpdateListener(new a(this));
       this.N.start();
       return;
    }
    public void setImageBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XfScalableImageView.class, "11")) {
          return;
       }
       this.p0();
       super.setImageBitmap(p0);
       return;
    }
    public void setImageURI(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XfScalableImageView.class, "10")) {
          return;
       }
       this.p0();
       super.setImageURI(p0);
       return;
    }
    public void setListener(XfScalableImageView$c p0){
       this.O = p0;
    }
    public void setMaxReboundScale(float p0){
       this.E = p0;
    }
    public void setMaxScale(float p0){
       this.D = p0;
    }
    public void setMinReboundScale(float p0){
       this.G = p0;
    }
    public void setMinScale(float p0){
       this.F = p0;
    }
}
