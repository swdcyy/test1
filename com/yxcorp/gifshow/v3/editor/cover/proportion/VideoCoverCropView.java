package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.Paint;
import tpc.t;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Color;
import android.graphics.RectF;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$e;
import android.animation.AnimatorSet;
import java.util.HashMap;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$d;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;
import java.lang.Boolean;
import android.graphics.Matrix;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$b;
import kotlin.Pair;
import java.lang.Number;
import java.lang.RuntimeException;
import java.lang.Math;
import tpc.w;
import w46.b;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import android.graphics.Region$Op;
import java.lang.Integer;
import android.view.MotionEvent;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverCropView$a;

public final class VideoCoverCropView extends View	// class@000e9e
{
    public Paint b;
    public final Path c;
    public int d;
    public RectF e;
    public View f;
    public Matrix g;
    public final RectF h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final Runnable m;
    public AnimatorSet n;
    public HashMap o;
    public List p;
    public HashMap q;

    public void VideoCoverCropView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void VideoCoverCropView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void VideoCoverCropView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       Resources resources = p0.getResources();
       a.o(resources, "context.resources");
       Paint paint = new Paint();
       paint.setAntiAlias(1);
       paint.setColor(t.a);
       paint.setStrokeWidth(TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       paint.setStyle(Paint$Style.STROKE);
       this.b = paint;
       this.c = new Path();
       this.d = Color.argb(127, 0, 0, 0);
       this.e = new RectF();
       this.f = new View(p0);
       this.h = new RectF();
       this.i = 0xbf800000;
       this.j = 0xbf800000;
       this.m = new VideoCoverCropView$e(this);
       this.n = new AnimatorSet();
       this.o = new HashMap();
       this.p = new ArrayList();
    }
    public void VideoCoverCropView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void l(VideoCoverCropView p0,float p1,boolean p2,float p3,float p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x02)? false: p2;
       float f = (p6 & 0x04)? 0: p3;
       float f1 = (p6 & 0x08)? 0: p4;
       boolean b1 = (p6 & 0x10)? false: p5;
       p0.k(p1, b, f, f1, b1);
       return;
    }
    public static RectF o(VideoCoverCropView p0,float p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return p0.n(p1, p2);
    }
    public final AnimatorSet a(View p0,float p1,float p2,float p3,float p4){
       ObjectAnimator obj;
       Animator[] uAnimatorArr1;
       AnimatorSet uAnimatorSet1;
       PropertyValuesHolder[] propertyValu;
       float[] uofloatArray;
       object oobject = p0;
       float f = p1;
       float f1 = p2;
       float f2 = p3;
       float f3 = p4;
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, VideoCoverCropView.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("VideoCoverCropView", "createAnimatorSet view = "+oobject+" translateX = "+f+' '+"translateY = "+f1+" scaleX = "+f2+" scaleY = "+f3, objArray1);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[2];
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          uAnimatorArr1 = uAnimatorArr;
          uAnimatorSet1 = uAnimatorSet;
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, VideoCoverCropView.class, "30");
          if (obj != PatchProxyResult.class) {
          label_00eb :
             Animator[] uAnimatorArr2 = uAnimatorArr1;
             uAnimatorArr2[0] = obj;
             if (PatchProxy.isSupport(VideoCoverCropView.class)) {
                obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p3), Float.valueOf(p4), this, VideoCoverCropView.class, "31");
                if (obj != PatchProxyResult.class) {
                label_013f :
                   uAnimatorArr2[1] = obj;
                   AnimatorSet uAnimatorSet2 = uAnimatorSet1;
                   uAnimatorSet2.playTogether(uAnimatorArr2);
                   return uAnimatorSet2;
                }
             }
             propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", uofloatArray),PropertyValuesHolder.ofFloat("scaleY", uofloatArray)};
             uofloatArray = new float[]{p0.getScaleX(),f2};
             uofloatArray = new float[]{p0.getScaleY(),f3};
             obj = ObjectAnimator.ofPropertyValuesHolder(oobject, propertyValu);
             a.o(obj, "ObjectAnimator.ofPropert¡­Y\", view.scaleY, scaleY\)\)");
             goto label_013f ;
          }
       }else {
          uAnimatorArr1 = uAnimatorArr;
          uAnimatorSet1 = uAnimatorSet;
       }
       propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("translationX", uofloatArray),PropertyValuesHolder.ofFloat("translationY", uofloatArray)};
       uofloatArray = new float[]{p0.getTranslationX(),f};
       uofloatArray = new float[]{p0.getTranslationY(),f1};
       obj = ObjectAnimator.ofPropertyValuesHolder(oobject, propertyValu);
       a.o(obj, "ObjectAnimator.ofPropert¡­nslationY, translationY\)\)");
       goto label_00eb ;
    }
    public final ValueAnimator b(RectF p0,RectF p1){
       ValueAnimator obj = PatchProxy.applyTwoRefs(p0, p1, this, VideoCoverCropView.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverCropView", "createChangeRatioAnimator originBoxRect = "+p0+" targetBoxRect = "+p1, objArray);
       obj = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(500);
       obj.addUpdateListener(new VideoCoverCropView$c(this, p0, p1));
       obj.addListener(new VideoCoverCropView$d(this, obj));
       a.o(obj, "selectBoxAnimator");
       return obj;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, VideoCoverCropView.class, "23")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoCoverCropView", "VideoCoverCropView detach", objArray);
       this.setVisibility(8);
       if (this.n.isRunning()) {
          this.n.cancel();
       }
       this.removeCallbacks(this.m);
       if (!PatchProxy.isSupport(VideoCoverCropView.class) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, this, VideoCoverCropView.class, "41")) {
          float[] uofloatArray = new float[9];
          VideoCoverCropView tg = this.g;
          if (tg != null) {
             tg.getValues(uofloatArray);
          }
          this.f.setTranslationX(uofloatArray[2]);
          this.f.setTranslationY(uofloatArray[5]);
          this.f.setScaleX(uofloatArray[i]);
          this.f.setScaleY(uofloatArray[4]);
       }
       this.h.set(new RectF());
       this.i = 0xbf800000;
       this.f = new View(this.getContext());
       return;
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, VideoCoverCropView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("VideoCoverCropView", "enable mTargetView.width:"+this.f.getWidth()+", mTargetView.height:"+this.f.getHeight()+", width:"+this.getWidth()+", height:"+this.getHeight(), objArray);
       if (this.f.getWidth() && (this.f.getHeight() && (this.getWidth() && this.getHeight()))) {
          i = true;
       }
    label_007a :
       return i;
    }
    public final void e(RectF p0){
       float f = (float)0;
       if (p0.left - f < 0) {
          p0.left = 0;
       }
       if (p0.top - f < 0) {
          p0.top = 0;
       }
       if (p0.right - 0x3f800000 > 0) {
          p0.right = 0x3f800000;
       }
       if (p0.bottom - 0x3f800000 > 0) {
          p0.bottom = 0x3f800000;
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, VideoCoverCropView.class, "38")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverCropView", "handleActionUp", objArray);
       this.i();
       RectF mTarViewCrop = this.getMTargetViewCropPercentRect();
       a.m(mTarViewCrop);
       RectF rectF = new RectF(mTarViewCrop);
       this.e(rectF);
       Iterator iterator = this.o.values().iterator();
       while (iterator.hasNext()) {
          VideoCoverCropView$b uob = iterator.next();
          if (uob != null) {
             uob.a(rectF);
          }
       }
       return;
    }
    public final void g(View p0,float p1,RectF p2,RectF p3,float p4){
       Pair pair;
       RectF rectF;
       Float mTarViewRati;
       float f4;
       Float mTarViewRati1;
       float f5;
       Float mTarViewRati2;
       Object[] objArray3;
       View view = this;
       object oobject = p0;
       float f = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       float f1 = p4;
       int i = 2;
       int i1 = 0;
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(p1),oobject1,oobject2,Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, view, VideoCoverCropView.class, "15")) {
             return;
          }
       }
       a.p(oobject, "targetView");
       Object[] objArray1 = new Object[i1];
       a.D().w("VideoCoverCropView", "init targetView = "+oobject+" ratio = "+f+" cropRectLimitRect = "+oobject2+", targetRatioWhenSelectOrigin = "+f1+", targetViewCropPercentRect:"+oobject1, objArray1);
       if (oobject2 != null) {
          view.setCropRectLimitRect(oobject2);
       }
       view.f = oobject;
       if (this.d()) {
          Matrix matrix = new Matrix();
          view.g = matrix;
          matrix.set(view.f.getMatrix());
          view.j = f1;
          if (oobject1 != null) {
             view.e(oobject1);
             if (PatchProxy.isSupport(VideoCoverCropView.class)) {
                pair = PatchProxy.applyTwoRefs(oobject1, Float.valueOf(p1), view, VideoCoverCropView.class, "17");
                if (pair != PatchProxyResult.class) {
                }else {
                label_00ba :
                   Object[] objArray2 = new Object[i1];
                   a.D().w("VideoCoverCropView", "initComputeCurrentMoveXYPercent currentTargetViewCropPercentRect = "+oobject1+" targetRatio = "+f, objArray2);
                   float f2 = view.j(f);
                   Boolean uBoolean = view.h(f2);
                   char c = ' ';
                   objArray1 = new Object[i1];
                   a.D().w("VideoCoverCropView", "initComputeCurrentMoveXYPercent currentIsFillTargetViewWidth = "+this.getMIsFillTargetViewWidth()+" targetRealRectRatio = "+f2+c+"targetIsFillTargetViewWidth = "+uBoolean, objArray1);
                   a.m(uBoolean);
                   float f3 = 0;
                   Object obj = null;
                   if (uBoolean.booleanValue()) {
                      rectF = VideoCoverCropView.o(view, f2, i1, i, obj);
                      a.m(rectF);
                      mTarViewRati = this.getMTargetViewRatio();
                      a.m(mTarViewRati);
                      f4 = rectF.width() / mTarViewRati.floatValue();
                      mTarViewRati1 = this.getMTargetViewRatio();
                      a.m(mTarViewRati1);
                      f5 = oobject1.top * (rectF.width() / mTarViewRati1.floatValue());
                      if ((f4 - f5) - rectF.height() < 0) {
                         f5 = f4 - rectF.height();
                      }
                      mTarViewRati2 = this.getMTargetViewRatio();
                      a.m(mTarViewRati2);
                      f4 = ((rectF.width() / mTarViewRati2.floatValue()) - (rectF.width() / f2)) / (float)i;
                      f2 = f4 - f5;
                      if (p2.width() - 0x3f800000 || p2.height() - 0x3f800000) {
                         f3 = f2;
                      }
                      objArray3 = new Object[i1];
                      a.D().w("VideoCoverCropView", "initComputeCurrentMoveXYPercent targetTopInTargetView = "+f5+" currentDefaultTopInTargetView = "+f4+c+"currentMoveYpx = "+f3+" targetCropRect = "+rectF, objArray3);
                      pair = new Pair(Boolean.FALSE, Float.valueOf(f3));
                   }else {
                      rectF = VideoCoverCropView.o(view, f2, i1, i, obj);
                      a.m(rectF);
                      mTarViewRati = this.getMTargetViewRatio();
                      a.m(mTarViewRati);
                      f4 = rectF.height() * mTarViewRati.floatValue();
                      mTarViewRati1 = this.getMTargetViewRatio();
                      a.m(mTarViewRati1);
                      f5 = oobject1.left * (rectF.height() * mTarViewRati1.floatValue());
                      if ((f4 - f5) - rectF.width() < 0) {
                         f5 = f4 - rectF.width();
                      }
                      mTarViewRati2 = this.getMTargetViewRatio();
                      a.m(mTarViewRati2);
                      f4 = ((rectF.height() * mTarViewRati2.floatValue()) - (rectF.height() * f2)) / (float)i;
                      f2 = f4 - f5;
                      if (p2.width() - 0x3f800000 || p2.height() - 0x3f800000) {
                         f3 = f2;
                      }
                      objArray3 = new Object[i1];
                      a.D().w("VideoCoverCropView", "initComputeCurrentMoveXYPercent targetLeftInTargetView = "+f5+" currentDefaultLeftInTargetView = "+f4+c+"currentMoveXpx = "+f3+" targetCropRect = "+rectF, objArray3);
                      pair = new Pair(Boolean.TRUE, Float.valueOf(f3));
                   }
                }
             }else {
                goto label_00ba ;
             }
             if (pair.getFirst().booleanValue()) {
                view.i = f;
                this.k(p1, true, pair.getSecond().floatValue(), 0, true);
             }else {
                view.i = f;
                this.k(p1, true, 0, pair.getSecond().floatValue(), true);
             }
          }else {
             view.i = f;
             VideoCoverCropView.l(this, p1, true, 0, 0, true, 12, null);
          }
          return;
       }else {
          throw new RuntimeException("VideoCoverCropView crop view not enable, please waiting layout");
       }
    }
    public final Boolean getMIsFillTargetViewWidth(){
       Object obj = PatchProxy.apply(null, this, VideoCoverCropView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h(this.getMRealRectRatio());
    }
    public final RectF getMOriginTargetViewRectInParent(){
       Object[] objArray = null;
       float[] obj = PatchProxy.apply(objArray, this, VideoCoverCropView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f.getWidth() <= 0 || this.f.getHeight() <= 0) {
          return objArray;
       }
       obj = new float[9];
       VideoCoverCropView tg = this.g;
       if (tg != null) {
          tg.getValues(obj);
       }
       float f = (float)this.f.getLeft() + obj[2];
       float f1 = (float)this.f.getTop() + obj[5];
       return new RectF(f, f1, (((float)this.f.getWidth() * obj[0]) + f), (((float)this.f.getHeight() * obj[4]) + f1));
    }
    public final float getMRealRectRatio(){
       Object obj = PatchProxy.apply(null, this, VideoCoverCropView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.j(this.i);
    }
    public final RectF getMTargetCropRect(){
       Object obj = PatchProxy.apply(null, this, VideoCoverCropView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float mRealRectRat = this.getMRealRectRatio();
       boolean b = (!this.i - 0xbf800000)? true: false;
       return this.n(mRealRectRat, b);
    }
    public final RectF getMTargetCropRectInParent(){
       Object[] objArray = null;
       RectF obj = PatchProxy.apply(objArray, this, VideoCoverCropView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getMTargetCropRect();
       if (obj != null) {
          objArray = new RectF(((float)this.getLeft() + obj.left), ((float)this.getTop() + obj.top), ((float)this.getLeft() + obj.right), ((float)this.getTop() + obj.bottom));
       }
       return objArray;
    }
    public final RectF getMTargetViewCropPercentRect(){
       Object obj = PatchProxy.apply(null, this, VideoCoverCropView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p(this.getMTargetViewRectInParent());
    }
    public final float getMTargetViewFinalScale(){
       Object[] objArray;
       RectF mTarCropRect;
       float f1;
       int width;
       Boolean obj = PatchProxy.apply(null, this, VideoCoverCropView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getMIsFillTargetViewWidth();
       a.m(obj);
       float f = 0x3f800000;
       int i = 0;
       if (obj.booleanValue()) {
          objArray = new Object[i];
          a.D().w("VideoCoverCropView", "get mTargetViewFinalScale mIsFillTargetViewWidth true targetView width = "+this.f.getWidth(), objArray);
          mTarCropRect = this.getMTargetCropRect();
          a.m(mTarCropRect);
          f1 = mTarCropRect.width() * f;
          width = this.f.getWidth();
       }else {
          objArray = new Object[i];
          a.D().w("VideoCoverCropView", "get mTargetViewFinalScale mIsFillTargetViewWidth false targetView height = "+this.f.getHeight(), objArray);
          mTarCropRect = this.getMTargetCropRect();
          a.m(mTarCropRect);
          f1 = mTarCropRect.height() * f;
          width = this.f.getHeight();
       }
       return (f1 / (float)width);
    }
    public final Float getMTargetViewRatio(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, VideoCoverCropView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f.getWidth() <= 0 && this.f.getHeight() <= 0) {
          return objArray;
       }
       return Float.valueOf(((float)this.f.getWidth() / (float)this.f.getHeight()));
    }
    public final RectF getMTargetViewRectInParent(){
       Object[] objArray = null;
       float[] obj = PatchProxy.apply(objArray, this, VideoCoverCropView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f.getWidth() <= 0 || this.f.getHeight() <= 0) {
          return objArray;
       }
       obj = new float[9];
       Matrix matrix = this.f.getMatrix();
       if (matrix != null) {
          matrix.getValues(obj);
       }
       float f = (float)this.f.getLeft() + obj[2];
       float f1 = (float)this.f.getTop() + obj[5];
       return new RectF(f, f1, (((float)this.f.getWidth() * obj[0]) + f), (((float)this.f.getHeight() * obj[4]) + f1));
    }
    public final Boolean h(float p0){
       boolean b;
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, VideoCoverCropView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.f.getWidth() <= 0 || this.f.getHeight() <= 0) {
          return null;
       }else if(p0 - (((float)this.f.getWidth() * 0x3f800000) / (float)this.f.getHeight()) >= 0){
          b = true;
       }else {
          b = false;
       }
       return Boolean.valueOf(b);
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, VideoCoverCropView.class, "34")) {
          return;
       }
       this.removeCallbacks(this.m);
       this.postDelayed(this.m, 1500);
       return;
    }
    public final float j(float p0){
       Object obj;
       Float mTarViewRati;
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, VideoCoverCropView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = 0xbf800000;
       if (!p0 - obj) {
          VideoCoverCropView tj = this.j;
          mTarViewRati = (!tj - obj)? this.getMTargetViewRatio(): Float.valueOf(tj);
       }else {
          mTarViewRati = Float.valueOf(p0);
       }
       a.m(mTarViewRati);
       return mTarViewRati.floatValue();
    }
    public final void k(float p0,boolean p1,float p2,float p3,boolean p4){
       Object[] objArray;
       Object[] obj;
       boolean b2;
       Object[] objArray2;
       RectF mTarCropRect;
       Pair pair;
       RectF mTarCropRect1;
       float f5;
       float f6;
       AnimatorSet uAnimatorSet;
       Boolean obj1;
       Pair pair1;
       float f8;
       RectF rectF;
       float f9;
       Boolean fALSE;
       float f10;
       float f = this;
       float f1 = p0;
       boolean b = p1;
       float f2 = p2;
       float f3 = p3;
       boolean b1 = p4;
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          objArray = new Object[]{Float.valueOf(p0),Boolean.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, f, VideoCoverCropView.class, "19")) {
             return;
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("VideoCoverCropView", "selectRatio newRatio = "+f1+" isNeedReload = "+b+", moveX = "+f2+", moveY:"+f3+", isInit:"+b1, objArray1);
       if (this.d()) {
          VideoCoverCropView i2 = f.i;
          if (PatchProxy.isSupport(VideoCoverCropView.class)) {
             obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(i2), f, VideoCoverCropView.class, "32");
             if (obj != PatchProxyResult.class) {
                b2 = obj.booleanValue();
             }else if(Math.abs((f1 - i2)) - 0x3a83126f < 0){
                b2 = true;
             }else {
                b2 = false;
             }
          }else {
             goto label_00ac ;
          }
          if (b2 && !b) {
             objArray2 = new Object[0];
             a.D().w("VideoCoverCropView", "isSameRatio, return", objArray2);
             return;
          }else if(f.h.isEmpty()){
             mTarCropRect = this.getMTargetCropRect();
             a.m(mTarCropRect);
             f.h.set(mTarCropRect);
          }
          float f4 = 0;
          if (b1) {
             pair = new Pair(Boolean.FALSE, Float.valueOf(f4));
          }else {
             mTarCropRect = this.getMTargetViewCropPercentRect();
             a.m(mTarCropRect);
             if (PatchProxy.isSupport(VideoCoverCropView.class)) {
                obj1 = PatchProxy.applyTwoRefs(mTarCropRect, Float.valueOf(p0), f, VideoCoverCropView.class, "16");
                if (obj1 != PatchProxyResult.class) {
                   pair = obj1;
                }
             }
             Object[] objArray4 = new Object[0];
             a.D().w("VideoCoverCropView", "computeCurrentMoveXYPercent currentTargetViewCropPercentRect = "+mTarCropRect+" targetRatio = "+f1, objArray4);
             obj1 = this.getMIsFillTargetViewWidth();
             float f7 = this.j(p0);
             Boolean uBoolean = f.h(f7);
             Object[] objArray5 = new Object[0];
             a.D().w("VideoCoverCropView", "computeCurrentMoveXYPercent currentIsFillTargetViewWidth = "+obj1+" targetRealRectRatio = "+f7+' '+"targetIsFillTargetViewWidth = "+uBoolean, objArray5);
             if (a.g(obj1, uBoolean) ^ i1) {
                objArray = new Object[0];
                a.D().w("VideoCoverCropView", "computeCurrentMoveXYPercent return", objArray);
                pair1 = new Pair(Boolean.TRUE, Float.valueOf(0));
             }else {
                a.m(obj1);
                String str = " targetCropRect = ";
                if (obj1.booleanValue()) {
                   mTarCropRect = this.getMTargetCropRect();
                   a.m(mTarCropRect);
                   Float mTarViewRati = this.getMTargetViewRatio();
                   a.m(mTarViewRati);
                   f4 = mTarCropRect.top * (mTarCropRect.width() / mTarViewRati.floatValue());
                   mTarCropRect = this.getMTargetCropRect();
                   a.m(mTarCropRect);
                   mTarViewRati = this.getMTargetViewRatio();
                   a.m(mTarViewRati);
                   mTarCropRect1 = this.getMTargetCropRect();
                   a.m(mTarCropRect1);
                   f5 = (float)2;
                   f8 = ((mTarCropRect.width() / mTarViewRati.floatValue()) - (mTarCropRect1.width() / this.getMRealRectRatio())) / f5;
                   f6 = f8 - f4;
                   rectF = VideoCoverCropView.o(f, f7, 0, 2, null);
                   a.m(rectF);
                   Float mTarViewRati1 = this.getMTargetViewRatio();
                   a.m(mTarViewRati1);
                   f9 = ((rectF.width() / mTarViewRati1.floatValue()) - (rectF.width() / f7)) / f5;
                   StringBuilder str1 = "computeCurrentMoveXYPercent targetTopInTargetView = "+f4;
                   objArray = new Object[0];
                   a.D().w("VideoCoverCropView", str1+" currentDefaultTopInTargetView = "+f8+' '+"currentMoveYpx = "+f6+str+rectF+" targetDefaultTopInTargetView = "+f9, objArray);
                   fALSE = Boolean.FALSE;
                   f10 = (f6 - (float)0 >= 0)? Math.min(f6, f9): Math.max(f6, (- f9));
                   pair1 = new Pair(fALSE, Float.valueOf(f10));
                }else {
                   mTarCropRect = this.getMTargetCropRect();
                   a.m(mTarCropRect);
                   Float mTarViewRati2 = this.getMTargetViewRatio();
                   a.m(mTarViewRati2);
                   f4 = mTarCropRect.left * (mTarCropRect.height() * mTarViewRati2.floatValue());
                   mTarCropRect = this.getMTargetCropRect();
                   a.m(mTarCropRect);
                   mTarViewRati2 = this.getMTargetViewRatio();
                   a.m(mTarViewRati2);
                   rectF = this.getMTargetCropRect();
                   a.m(rectF);
                   f9 = (float)2;
                   f8 = ((mTarCropRect.height() * mTarViewRati2.floatValue()) - (rectF.height() * this.getMRealRectRatio())) / f9;
                   float f11 = f8 - f4;
                   RectF rectF1 = VideoCoverCropView.o(f, f7, 0, 2, null);
                   a.m(rectF1);
                   Float mTarViewRati3 = this.getMTargetViewRatio();
                   a.m(mTarViewRati3);
                   float f12 = ((rectF1.height() * mTarViewRati3.floatValue()) - (rectF1.height() * f7)) / f9;
                   StringBuilder str2 = "computeCurrentMoveXYPercent targetLeftInTargetView = "+f4;
                   objArray = new Object[0];
                   a.D().w("VideoCoverCropView", str2+" currentDefaultLeftInTargetView = "+f8+' '+"currentMoveXpx = "+f11+str+rectF1+" targetDefaultLeftInTargetView = "+f12, objArray);
                   fALSE = Boolean.TRUE;
                   f10 = (f11 - (float)0 >= 0)? Math.min(f11, f12): Math.max(f11, (- f12));
                   pair1 = new Pair(fALSE, Float.valueOf(f10));
                }
             }
             pair = pair1;
          }
          f.i = f1;
          obj = new Object[0];
          a.D().w("VideoCoverCropView", "selectRatio moveX = "+f2+" moveY = "+f3, obj);
          mTarCropRect1 = this.getMTargetCropRectInParent();
          a.m(mTarCropRect1);
          RectF mTarViewRect = this.getMTargetViewRectInParent();
          a.m(mTarViewRect);
          f5 = (pair.getFirst().booleanValue())? pair.getSecond().floatValue() + f2: f2;
          f6 = (pair.getFirst().booleanValue())? f3: pair.getSecond().floatValue() + f3;
          if (PatchProxy.isSupport(VideoCoverCropView.class)) {
             uAnimatorSet = PatchProxy.applyFourRefs(mTarCropRect1, mTarViewRect, Float.valueOf(f5), Float.valueOf(f6), this, VideoCoverCropView.class, "28");
             if (uAnimatorSet != PatchProxyResult.class) {
             label_042e :
                RectF mTarCropRect2 = this.getMTargetCropRect();
                a.m(mTarCropRect2);
                ValueAnimator valueAnimato = f.b(f.h, mTarCropRect2);
                f.setVisibility(0);
                if (f.n.isRunning()) {
                   f.n.cancel();
                }
                Animator[] uAnimatorArr = new Animator[]{uAnimatorSet,valueAnimato};
                f.n.playTogether(uAnimatorArr);
                if (p4) {
                   objArray2 = new Object[0];
                   a.D().w("VideoCoverCropView", "selectRatio isInit true animation duration = 0", objArray2);
                   f.n.setDuration(0);
                }else {
                   objArray2 = new Object[0];
                   a.D().w("VideoCoverCropView", "selectRatio isInit false animation duration not 0", objArray2);
                   f.n.setDuration(500);
                }
                if (!PatchProxy.applyVoid(null, f, VideoCoverCropView.class, "35")) {
                   this.m();
                   this.i();
                }
                f.n.start();
                return;
             }
          }
          Object[] objArray3 = new Object[0];
          a.D().w("VideoCoverCropView", "createTargetViewExpandAnimator targetCropRectInParent = "+mTarCropRect1+" originTargetViewCropRectFInParent = "+mTarViewRect+" moveX = "+f5+" moveY = "+f6, objArray3);
          f2 = ((mTarCropRect1.centerX() - mTarViewRect.centerX()) + f.f.getTranslationX()) + f5;
          f3 = ((mTarCropRect1.centerY() - mTarViewRect.centerY()) + f.f.getTranslationY()) + f6;
          objArray = new Object[0];
          a.D().w("VideoCoverCropView", "translationX = "+f2+" translationY = "+f3, objArray);
          uAnimatorSet = this.a(f.f, f2, f3, this.getMTargetViewFinalScale(), this.getMTargetViewFinalScale());
          goto label_042e ;
       }else {
          throw new RuntimeException("VideoCoverCropView set ratio disable");
       }
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, VideoCoverCropView.class, "33")) {
          return;
       }
       this.d = t.b;
       this.b.setColor(t.a);
       this.invalidate();
       return;
    }
    public final RectF n(float p0,boolean p1){
       Object[] obj;
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, VideoCoverCropView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       RectF rectF = w.a.b(this.e, this.getMTargetViewRatio(), p0, p1);
       if (rectF == null) {
          obj = new Object[0];
          a.D().t("VideoCoverCropView", "targetCropRect: getTargetCropRect is null, mCropRectLimitRect = "+this.e+", mTargetViewRatio = "+this.getMTargetViewRatio(), obj);
          if (this.e.isEmpty()) {
             this.e.set(0, 0, ((float)this.getWidth() * 0x3f800000), ((float)this.getHeight() * 0x3f800000));
          }
          rectF = this.e;
       }
       return rectF;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverCropView.class, "24")) {
          return;
       }
       a.p(p0, "canvas");
       super.onDraw(p0);
       if (this.h.isEmpty()) {
          return;
       }
       p0.save();
       this.c.reset();
       this.c.addRect(this.h, Path$Direction.CW);
       p0.clipPath(this.c, Region$Op.DIFFERENCE);
       p0.drawColor(this.d);
       p0.restore();
       p0.drawRect(this.h, this.b);
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(VideoCoverCropView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, VideoCoverCropView.class, "14")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.e.isEmpty()) {
          this.e.set(0, 0, ((float)this.getWidth() * 0x3f800000), ((float)this.getHeight() * 0x3f800000));
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object[] objArray1;
       boolean b;
       Integer integer1;
       Object[] objArray2;
       RectF mTarViewRect;
       RectF rectF;
       float f3;
       VideoCoverCropView tf;
       RectF rectF1;
       String obj2;
       boolean b1;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, VideoCoverCropView.class, "36");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.D();
       StringBuilder str = "onTouchEvent event.action = ";
       String str1 = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.getAction()): str1;
       str = str+integer+" event.x = ";
       Float uFloat = (p0 != null)? Float.valueOf(p0.getX()): str1;
       str = str+uFloat+" event.y = ";
       uFloat = (p0 != null)? Float.valueOf(p0.getY()): str1;
       int i = 0;
       Object[] objArray = new Object[i];
       obj.w("VideoCoverCropView", str+uFloat, objArray);
       if (!this.d()) {
          objArray1 = new Object[i];
          a.D().w("VideoCoverCropView", "onTouchEvent unable, return", objArray1);
          return i;
       }else {
          Object[] obj1 = PatchProxy.applyOneRefs(p0, this, VideoCoverCropView.class, "40");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 == null){
             VideoCoverCropView th = this.h;
             RectF top = th.top;
             rectF1 = th.bottom;
             Context context = this.getContext();
             Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
             int i1 = n.k(context);
             if (p0.getX() - (float)i >= 0 && (p0.getX() - (float)i1 <= 0 && (p0.getY() - top >= 0 && p0.getY() - rectF1 <= 0))) {
                b = true;
             }
          }
       label_00c5 :
          b = false;
          Float uFloat1 = 3;
          if (!b) {
             obj1 = new Object[i];
             a.D().w("VideoCoverCropView", "onTouchEvent not in preview area, return", obj1);
             if (p0 == null || (p0.getAction() == 1 || (p0 != null && p0.getAction() == uFloat1))) {
                objArray1 = new Object[i];
                a.D().w("VideoCoverCropView", "action is up or cancel", objArray1);
                this.f();
                return true;
             }else {
                return i;
             }
          }else if(p0 != null){
             integer1 = Integer.valueOf(p0.getAction());
          }else {
             obj2 = str1;
          }
          if (integer1 != null && !integer1.intValue()) {
             objArray = new Object[i];
             a.D().w("VideoCoverCropView", "onTouchEvent ACTION_DOWN", objArray);
             if (this.p.isEmpty() ^ true) {
                obj2 = PatchProxy.apply(str1, this, VideoCoverCropView.class, "37");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else {
                   Iterator iterator1 = this.p.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         if (iterator1.next().a()) {
                            b1 = true;
                         }
                      }else {
                         b1 = false;
                      }
                   }
                }
                if (b1) {
                   return i;
                }
             }
             this.k = p0.getX();
             this.l = p0.getY();
             this.m();
          }else {
             objArray1 = 2;
             if (integer1 != null && integer1.intValue() == objArray1) {
                obj1 = new Object[i];
                a.D().w("VideoCoverCropView", "onTouchEvent ACTION_MOVE", obj1);
                float f = p0.getX() - this.k;
                float f1 = p0.getY() - this.l;
                if (!PatchProxy.isSupport(VideoCoverCropView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(f1), this, VideoCoverCropView.class, "39")) {
                   Boolean mIsFillTarVi = this.getMIsFillTargetViewWidth();
                   a.m(mIsFillTarVi);
                   float f2 = 0;
                   if (mIsFillTarVi.booleanValue()) {
                      objArray2 = new Object[i];
                      a.D().w("VideoCoverCropView", "checkAndMove mIsFillTargetViewWidth true", objArray2);
                      mTarViewRect = this.getMTargetViewRectInParent();
                      a.m(mTarViewRect);
                      rectF = new RectF(mTarViewRect);
                      rectF.offset(f2, f1);
                      rectF = this.p(rectF);
                      a.m(rectF);
                      f3 = (float)i;
                      if (rectF.top - f3 > 0 || (f1 - f3 <= 0 && (rectF.bottom - (float)true < 0 || f1 - f3 >= 0))) {
                         tf = this.f;
                         tf.setTranslationY((tf.getTranslationY() + f1));
                      }
                   }else {
                      objArray2 = new Object[i];
                      a.D().w("VideoCoverCropView", "checkAndMove mIsFillTargetViewWidth false", objArray2);
                      mTarViewRect = this.getMTargetViewRectInParent();
                      a.m(mTarViewRect);
                      rectF1 = new RectF(mTarViewRect);
                      rectF1.offset(f, f2);
                      rectF1 = this.p(rectF1);
                      a.m(rectF1);
                      f3 = (float)i;
                      if (rectF1.left - f3 > 0 || (f - f3 <= 0 && (rectF1.right - (float)true < 0 || f - f3 >= 0))) {
                         tf = this.f;
                         tf.setTranslationX((tf.getTranslationX() + f));
                         rectF = rectF1;
                      }
                   }
                   Iterator iterator = this.o.values().iterator();
                   while (iterator.hasNext()) {
                      VideoCoverCropView$b uob = iterator.next();
                      if (uob != null) {
                         uob.b(rectF);
                      }
                   }
                }
             label_0250 :
                this.k = p0.getX();
                this.l = p0.getY();
                this.removeCallbacks(this.m);
             }else if(integer1 != null && (integer1.intValue() == 1 || (integer1 != null && integer1.intValue() == uFloat1))){
                objArray1 = new Object[i];
                a.D().w("VideoCoverCropView", "onTouchEvent ACTION_UP or ACTION_CANCEL", objArray1);
                this.f();
             }
          }
          return true;
       }
    }
    public final RectF p(RectF p0){
       RectF obj = PatchProxy.applyOneRefs(p0, this, VideoCoverCropView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getMTargetCropRectInParent();
       if (obj == null || p0 == null) {
          return null;
       }
       return new RectF(((obj.left - p0.left) / p0.width()), ((obj.top - p0.top) / p0.height()), ((obj.right - p0.left) / p0.width()), ((obj.bottom - p0.top) / p0.height()));
    }
    public final void setCropRectLimitRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverCropView.class, "18")) {
          return;
       }
       a.p(p0, "cropRectLimitRect");
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverCropView", "setCropRectLimitRect cropRectLimitRect = "+p0, objArray);
       this.e.set(p0);
       return;
    }
}
