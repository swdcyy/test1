package com.yxcorp.gifshow.widget.record.BaseRecordButton;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import ozc.c;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import q87.c;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.d;
import android.animation.TimeInterpolator;
import ozc.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Runnable;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import android.graphics.Point;
import com.yxcorp.gifshow.widget.record.BaseRecordButton$c;
import java.util.Collection;
import ekd.q;

public abstract class BaseRecordButton extends FrameLayout implements d	// class@0019b1
{
    public List b;
    public BaseRecordButton$c c;
    public int d;
    public Point e;
    public Point f;
    public final PointF g;
    public final Handler h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public Runnable n;
    public static final int o;

    public void BaseRecordButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.d = 0;
       this.g = new PointF();
       this.h = new Handler(Looper.getMainLooper());
       this.l = false;
       this.m = true;
       this.n = new c(this);
    }
    public void BaseRecordButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.d = 0;
       this.g = new PointF();
       this.h = new Handler(Looper.getMainLooper());
       this.l = false;
       this.m = true;
       this.n = new c(this);
    }
    public static void a(BaseRecordButton p0){
       Objects.requireNonNull(p0);
       int i = 2;
       Object[] objArray = new Object[i];
       objArray[0] = Integer.valueOf(p0.d);
       objArray[1] = Boolean.valueOf(p0.isEnabled());
       Object[] objArray1 = new Object[0];
       a.D().s("record_btn_v2", String.format("long click when status=%d,enable=%b", objArray), objArray1);
       if (p0.d == null && p0.isEnabled()) {
          p0.d = i;
          Iterator iterator = p0.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(0, p0.j);
          }
       }
       return;
    }
    public void b(BaseRecordButton$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecordButton.class, "3")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public boolean c(){
       return true;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, BaseRecordButton.class, "6")) {
          return;
       }
       this.e();
       return;
    }
    public void doBindView(View p0){
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, BaseRecordButton.class, "7")) {
          return;
       }
       this.d = 0;
       this.g();
       return;
    }
    public void f(boolean p0){
       if (PatchProxy.isSupport(BaseRecordButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseRecordButton.class, "5")) {
          return;
       }
       int i = 1;
       int i1 = 2;
       if (this.d != i1) {
          this.d = i;
       }
       this.i = false;
       Object[] objArray = new Object[i1];
       objArray[0] = Integer.valueOf(this.d);
       objArray[i] = Boolean.valueOf(this.i);
       Object[] objArray1 = new Object[false];
       a.D().w("record_btn_v2", String.format("onRecording status=%d, interrupted=%b", objArray), objArray1);
       return;
    }
    public final void g(){
       float[] uofloatArray;
       float[] uofloatArray1;
       if (PatchProxy.applyVoid(null, this, BaseRecordButton.class, "14")) {
          return;
       }
       int i = 0;
       if (!this.getTranslationX() - i && !this.getTranslationY() - i) {
          return;
       }
       this.k = 0;
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1)};
       uofloatArray = new float[]{this.getTranslationX(),i};
       uofloatArray1 = new float[]{this.getTranslationY(),i};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this, propertyValu);
       objectAnimat.setDuration(200);
       objectAnimat.setInterpolator(new d());
       objectAnimat.addUpdateListener(new b(this));
       objectAnimat.start();
       return;
    }
    public int getRecordStatus(){
       return this.d;
    }
    public void h(boolean p0,boolean p1){
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, BaseRecordButton.class, "9")) {
          return;
       }
       this.h.removeCallbacks(this.n);
       this.g.set(0, 0);
       this.i = false;
       this.d = 0;
       this.h(false, true);
       this.g();
       return;
    }
    public void j(float p0,float p1){
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, BaseRecordButton.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.getViewTreeObserver().addOnGlobalLayoutListener(new BaseRecordButton$a(this));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       float rawX;
       PointF y;
       Point x;
       BaseRecordButton obj = PatchProxy.applyOneRefs(p0, this, BaseRecordButton.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       Object[] objArray = 3;
       String str = "record_btn_v2";
       Float uFloat = 2;
       int i = 0;
       if (action) {
          f = 0;
          if (action != 1) {
             if (action != uFloat) {
                if (action == objArray || (action == 4 || action == 12)) {
                label_00e4 :
                   objArray = new Object[true];
                   objArray[i] = Integer.valueOf(p0.getAction());
                   Object[] objArray1 = new Object[i];
                   a.D().w(str, String.format("on Touch end action=%d", objArray), objArray1);
                   if (!PatchProxy.applyVoidOneRefs(p0, this, BaseRecordButton.class, "11")) {
                      objArray = new Object[true];
                      objArray[i] = Integer.valueOf(this.d);
                      objArray1 = new Object[i];
                      a.D().w(str, String.format("onTouchEnd status=%d", objArray), objArray1);
                      this.h.removeCallbacks(this.n);
                      this.g.set(f, f);
                      obj = this.d;
                      if (obj == true || obj == uFloat) {
                         if (p0.getAction() == 1 && !q.f(this.b)) {
                            this.l = true;
                         }
                         Iterator iterator = this.b.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().a(true, this.j);
                         }
                      }
                      if (this.d == uFloat) {
                         obj = this.i;
                         this.d = obj ^ 0x01;
                         this.h(obj, i);
                         this.g();
                      }
                   }
                }
             }else {
                rawX = p0.getRawX();
                float rawY = p0.getRawY();
                if (PatchProxy.isSupport(BaseRecordButton.class) && (!PatchProxy.applyVoidTwoRefs(Float.valueOf(rawX), Float.valueOf(rawY), this, BaseRecordButton.class, "12") && this.c())) {
                   BaseRecordButton tg = this.g;
                   y = tg.y;
                   if (y - f) {
                      int i1 = (int)(rawY - y) + this.k;
                      action = (int)(rawX - tg.x);
                      int i2 = (int)((float)this.getWidth() * 0x3f000000);
                      int i3 = (int)((float)this.getHeight() * 0x3f000000);
                      BaseRecordButton tf = this.f;
                      x = tf.x;
                      int i4 = x + action;
                      int i5 = - i2;
                      if (i4 >= i5) {
                         i5 = this.e.x - i2;
                         if (i4 <= i5) {
                         label_0092 :
                            Point y1 = tf.y;
                            int i6 = y1 + i1;
                            int i7 = - i3;
                            if (i6 < i7) {
                               i1 = i7 - y1;
                            }else {
                               x = this.e.y;
                               i4 = x - i3;
                               if (i6 > i4) {
                                  rawY = rawY + (float)x;
                                  i1 = i4 - y1;
                               }else {
                               label_00ae :
                                  rawX = (float)action;
                                  this.setTranslationX(rawX);
                                  float f1 = (float)i1;
                                  this.setTranslationY(f1);
                                  this.j(rawX, f1);
                                  rawX = this.g.y - rawY;
                                  BaseRecordButton tc = this.c;
                                  if (tc != null) {
                                     f1 = (float)i3 * 0x3f000000;
                                     if (rawX - f1 >= 0 && tc.a((rawX - f1), (int)((((float)(this.f.y + this.k) - f1) * 0x3f333333) + 0x3f000000))) {
                                        this.j = true;
                                     }
                                  }
                               }
                            }
                            rawY = ((rawY - (float)i3) - (float)y1) - (float)i1;
                            goto label_00ae ;
                         }
                      }
                      action = i5 - x;
                      goto label_0092 ;
                   }
                }
             }
          }else {
             goto label_00e4 ;
          }
       }else {
          rawX = p0.getRawX();
          f = p0.getRawY();
          if (!PatchProxy.isSupport(BaseRecordButton.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(rawX), Float.valueOf(f), this, BaseRecordButton.class, "13")) {
             this.g.set(rawX, f);
             this.j = i;
             this.k = (int)this.getTranslationY();
             if (this.b.size() > 0) {
                this.h.removeCallbacks(this.n);
                this.h.postDelayed(this.n, 500);
             }
          }
          objArray = new Object[objArray];
          objArray[i] = Integer.valueOf(p0.getAction());
          objArray[1] = Float.valueOf(p0.getX());
          objArray[uFloat] = Float.valueOf(p0.getY());
          Object[] objArray2 = new Object[i];
          a.D().w(str, String.format("onTouchDown action=%d,x=%f,y=%f", objArray), objArray2);
          this.l = i;
       }
    label_01ea :
       super.onTouchEvent(p0);
       return true;
    }
    public boolean performClick(){
       Object obj = PatchProxy.apply(null, this, BaseRecordButton.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.m != null && this.l != null) {
          return false;
       }
       return super.performClick();
    }
    public void setMoveEventListener(BaseRecordButton$c p0){
       this.c = p0;
    }
    public void setShouldForbidClick(boolean p0){
       this.m = p0;
    }
}
