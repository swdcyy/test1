package com.yxcorp.gifshow.widget.CropSelectionBoxView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Color;
import java.util.ArrayList;
import java.lang.Boolean;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.widget.CropSelectionBoxView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Float;
import java.lang.Number;
import android.view.MotionEvent;
import kxa.c$a;
import usd.q;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.CropSelectionBoxView$c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path$Direction;
import android.graphics.Region$Op;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.widget.CropSelectionBoxView$a;
import java.lang.Math;

public final class CropSelectionBoxView extends View	// class@001811
{
    public boolean b;
    public int c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Path g;
    public final RectF h;
    public c$a i;
    public boolean j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public ValueAnimator r;
    public int s;
    public Matrix t;
    public final ArrayList u;
    public HashMap v;

    public void CropSelectionBoxView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void CropSelectionBoxView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void CropSelectionBoxView(Context p0,AttributeSet p1,int p2){
       Resources resources;
       Context context;
       String str = "context";
       a.p(p0, str);
       super(p0, p1, p2);
       Object[] objArray = null;
       Paint paint = PatchProxy.apply(objArray, this, CropSelectionBoxView.class, "3");
       if (paint != PatchProxyResult.class) {
       }else {
          paint = new Paint();
          paint.setColor(-1);
          Context context1 = this.getContext();
          a.o(context1, str);
          Resources resources2 = context1.getResources();
          a.o(resources2, "context.resources");
          paint.setStrokeWidth(TypedValue.applyDimension(true, 2.00f, c.c(resources2)));
       }
       this.d = paint;
       paint = PatchProxy.apply(objArray, this, CropSelectionBoxView.class, "4");
       if (paint != PatchProxyResult.class) {
       }else {
          context = this.getContext();
          a.o(context, str);
          Resources resources1 = context.getResources();
          a.o(resources1, "context.resources");
          Paint paint1 = new Paint();
          paint1.setAntiAlias(true);
          paint1.setColor(-1);
          paint1.setStrokeWidth(TypedValue.applyDimension(true, 0x3f800000, c.c(resources1)));
          paint1.setStyle(Paint$Style.STROKE);
          paint = paint1;
       }
       this.e = paint;
       paint = PatchProxy.apply(objArray, this, CropSelectionBoxView.class, "5");
       if (paint != PatchProxyResult.class) {
       }else {
          paint = new Paint();
          paint.setColor(-1);
          paint.setStrokeWidth(0x3f800000);
          paint.setAlpha(0);
       }
       this.f = paint;
       this.g = new Path();
       this.h = new RectF();
       this.j = true;
       resources = p0.getResources();
       a.o(resources, "context.resources");
       float f = TypedValue.applyDimension(true, 20.00f, c.c(resources));
       this.k = f;
       this.l = f;
       this.m = f;
       this.n = f;
       this.q = Color.argb(204, 0, 0, 0);
       this.s = 204;
       this.u = new ArrayList();
       return;
    }
    public void CropSelectionBoxView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(boolean p0){
       CropSelectionBoxView th1;
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropSelectionBoxView.class, "14")) {
          return;
       }
       if (this.e()) {
          CropSelectionBoxView th = this.h;
          float f = (float)2;
          float f1 = (th.top + th.bottom) / f;
          float f2 = this.h.width() / this.o;
          if (f2 - this.getBoxMaxHeight() > 0) {
             f2 = this.getBoxMaxHeight() * this.o;
             if (p0) {
                th1 = this.h;
                th1.left = th1.right - f2;
             }else {
                th1 = this.h;
                th1.right = th1.left + f2;
             }
             f2 = this.getBoxMaxHeight();
          }
          th1 = this.h;
          f2 = f2 / f;
          th1.top = f1 - f2;
          th1.bottom = f1 + f2;
       }
       return;
    }
    public final void b(boolean p0){
       CropSelectionBoxView th1;
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropSelectionBoxView.class, "15")) {
          return;
       }
       if (this.e()) {
          CropSelectionBoxView th = this.h;
          float f = (float)2;
          float f1 = (th.left + th.right) / f;
          float f2 = this.h.height() * this.o;
          if (f2 - this.getBoxMaxWidth() > 0) {
             f2 = this.getBoxMaxWidth() / this.o;
             if (p0) {
                th1 = this.h;
                th1.top = th1.bottom - f2;
             }else {
                th1 = this.h;
                th1.bottom = th1.top + f2;
             }
             f2 = this.getBoxMaxWidth();
          }
          th1 = this.h;
          f2 = f2 / f;
          th1.left = f1 - f2;
          th1.right = f1 + f2;
       }
       return;
    }
    public final void c(Animator$AnimatorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "26")) {
          return;
       }
       this.q = Color.argb(204, 0, 0, 0);
       if (p0 == null) {
          this.e.setAlpha(255);
          this.d.setAlpha(255);
          this.invalidate();
          return;
       }else {
          ValueAnimator valueAnimato = ObjectAnimator.ofInt(new int[2]{0,255});
          a.o(valueAnimato, "anim");
          valueAnimato.setDuration(300);
          valueAnimato.addUpdateListener(new CropSelectionBoxView$b(this));
          valueAnimato.addListener(p0);
          valueAnimato.start();
          return;
       }
    }
    public final RectF d(float p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, CropSelectionBoxView.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g(p0);
    }
    public final boolean e(){
       int i = 0;
       if (this.o - (float)i > 0) {
          i = true;
       }
       return i;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, CropSelectionBoxView.class, "25")) {
          return;
       }
       this.e.setAlpha(0);
       this.f.setAlpha(0);
       this.d.setAlpha(0);
       this.invalidate();
       return;
    }
    public final RectF g(float p0){
       float f;
       if (PatchProxy.isSupport(CropSelectionBoxView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, CropSelectionBoxView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 - (float)0 > 0 && (!this.getWidth() || !this.getHeight())) {
          return new RectF();
       }else if(p0 - (((float)this.getWidth() - (this.k + this.m)) / ((float)this.getHeight() - (this.l + this.n))) > 0){
          f = (float)this.getWidth() - (this.k + this.m);
          p0 = f / p0;
       }else {
          f = (float)this.getHeight() - (this.l + this.n);
          float f4 = f;
          f = p0 * f;
          p0 = f4;
       }
       float f1 = (float)2;
       float f2 = this.l + ((this.getBoxMaxHeight() - p0) / f1);
       float f3 = this.k + ((this.getBoxMaxWidth() - f) / f1);
       return new RectF(f3, f2, (f + f3), (p0 + f2));
    }
    public final float getBoxMaxHeight(){
       Object obj = PatchProxy.apply(null, this, CropSelectionBoxView.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)this.getHeight() - (this.l + this.n));
    }
    public final float getBoxMaxWidth(){
       Object obj = PatchProxy.apply(null, this, CropSelectionBoxView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return ((float)this.getWidth() - (this.k + this.m));
    }
    public final float getCropMinimumHeight(){
       CropSelectionBoxView obj = PatchProxy.apply(null, this, CropSelectionBoxView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 180.00f;
       if (this.e()) {
          obj = this.o;
          if (obj - (float)1 < 0) {
             f = f / obj;
          }
       }
       return f;
    }
    public final float getCropMinimumWidth(){
       CropSelectionBoxView obj = PatchProxy.apply(null, this, CropSelectionBoxView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 180.00f;
       if (this.e()) {
          obj = this.o;
          if (obj - (float)1 >= 0) {
             f = f * obj;
          }
       }
       return f;
    }
    public final RectF getSelectionBoxRect(){
       return this.h;
    }
    public final void h(float p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CropSelectionBoxView.class, "36")) {
          return;
       }
       this.p = p0;
       this.l(p0);
       this.t = null;
       this.invalidate();
       return;
    }
    public final void i(MotionEvent p0){
       CropSelectionBoxView th;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "13")) {
          return;
       }
       CropSelectionBoxView ti = this.i;
       a.m(ti);
       if (p0.getY() - ti.a().bottom <= 0 && p0.getY() - (this.h.top + this.getCropMinimumHeight()) > 0) {
          this.h.bottom = p0.getY();
       }else {
          CropSelectionBoxView ti1 = this.i;
          a.m(ti1);
          if (p0.getY() - ti1.a().bottom > 0) {
             ti1 = this.i;
             a.m(ti1);
             p0.bottom = ti1.a().bottom;
          }else {
             th = this.h;
             th.bottom = th.top + this.getCropMinimumHeight();
          }
       }
       th = this.h;
       th.bottom = q.t(th.bottom, ((float)this.getHeight() - this.n));
       return;
    }
    public final void j(MotionEvent p0){
       CropSelectionBoxView th;
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "10")) {
          return;
       }
       CropSelectionBoxView ti = this.i;
       a.m(ti);
       if (p0.getY() - ti.a().top >= 0 && p0.getY() - (this.h.bottom - this.getCropMinimumHeight()) < 0) {
          this.h.top = p0.getY();
       }else {
          CropSelectionBoxView ti1 = this.i;
          a.m(ti1);
          if (p0.getY() - ti1.a().top < 0) {
             ti1 = this.i;
             a.m(ti1);
             p0.top = ti1.a().top;
          }else {
             th = this.h;
             th.top = th.bottom - this.getCropMinimumHeight();
          }
       }
       th = this.h;
       th.top = q.m(th.top, this.l);
       return;
    }
    public final void k(boolean p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CropSelectionBoxView.class, "23")) {
          return;
       }
       CropSelectionBoxView tr = this.r;
       if (tr != null) {
          tr.cancel();
       }
       tr = this.s;
       int[] ointArray = new int[2];
       int i = 0;
       ointArray[0] = tr;
       int i1 = 1;
       int i2 = (p0)? 127: 204;
       ointArray[i1] = i2;
       this.r = ObjectAnimator.ofInt(ointArray);
       Object[] objArray = new Object[i];
       a.D().s("CropSelectionBoxView", "startMaskAnimation: startAlpha="+tr+",isMoving="+p0, objArray);
       CropSelectionBoxView tr1 = this.r;
       if (tr1 != null) {
          tr1.setDuration(300);
       }
       tr1 = this.r;
       if (tr1 != null) {
          tr1.addUpdateListener(new CropSelectionBoxView$c(this));
       }
       tr1 = this.r;
       if (tr1 != null) {
          tr1.start();
       }
       return;
    }
    public final void l(float p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CropSelectionBoxView.class, "24")) {
          return;
       }
       RectF rectF = this.g(p0);
       Object[] objArray = new Object[0];
       a.D().w("CropSelectionBoxView", "updateCurBoxRect ratio="+p0+",mRectRatio="+this.o+",rect="+rectF, objArray);
       if (!rectF.isEmpty()) {
          this.h.set(rectF);
       }
       return;
    }
    public void onDraw(Canvas p0){
       RectF left;
       RectF top;
       RectF right;
       RectF bottom;
       float f;
       float f1;
       float f2;
       Canvas uCanvas;
       RectF rectF1;
       RectF rectF2;
       float f3;
       RectF rectF3;
       RectF rectF4;
       Context context;
       Resources resources;
       float f4;
       float f5;
       RectF bottom1;
       float f6;
       float f7;
       float f8;
       float f9;
       float f10;
       float f11;
       float f12;
       float f13;
       float f14;
       float f15;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, CropSelectionBoxView.class, "6")) {
          return;
       }
       a.p(obj1, "canvas");
       super.onDraw(p0);
       if (!obj.h.isEmpty()) {
          CropSelectionBoxView i = obj.i;
          String str = 1;
          if (i != null) {
             RectF rectF = i.a();
             if (rectF == null || rectF.isEmpty() != str) {
             }
          }else {
          }
       }
    label_0186 :
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(CropSelectionBoxView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CropSelectionBoxView.class, "1")) {
             return;
          }
       }
       if (p0) {
          CropSelectionBoxView to = (this.e())? this.o: this.p;
          this.l(to);
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Iterator iterator;
       float f1;
       float f2;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CropSelectionBoxView obj = PatchProxy.applyOneRefs(p0, this, CropSelectionBoxView.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.i;
       CropSelectionBoxView uCropSelecti = null;
       RectF rectF = (obj != null)? obj.a(): uCropSelecti;
       if (rectF == null) {
          i1.c(new RuntimeException("CropSelectionBoxView : mBoundsProvider is null"));
          return super.onTouchEvent(p0);
       }else {
          int action = p0.getAction();
          float f = 0.00f;
          boolean b = false;
          if (action) {
             if (action != 2) {
                if (this.b != null) {
                   this.b = b;
                   iterator = this.u.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().b(this.h);
                   }
                }
                this.k(b);
             }else if(this.b != null){
                CropSelectionBoxView tc = this.c;
                if ((tc & 0x1000) == f) {
                   if (!PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "12")) {
                      obj = this.i;
                      a.m(obj);
                      if (p0.getX() - obj.a().left >= 0 && p0.getX() - (this.h.right - this.getCropMinimumWidth()) < 0) {
                         this.h.left = p0.getX();
                      }else {
                         obj = this.i;
                         a.m(obj);
                         if (p0.getX() - obj.a().left < 0) {
                            obj = this.i;
                            a.m(obj);
                            this.h.left = obj.a().left;
                         }else {
                            tc = this.h;
                            tc.left = tc.right - this.getCropMinimumWidth();
                         }
                      }
                      tc = this.h;
                      tc.left = q.m(tc.left, this.k);
                   }
                   tc = this.c;
                   if ((tc & 0x0100) == 256) {
                      this.j(p0);
                      if (!PatchProxy.applyVoid(uCropSelecti, this, CropSelectionBoxView.class, "16") && this.e()) {
                         f1 = this.h.width();
                         uCropSelecti = this.o;
                         f2 = this.h.height() * uCropSelecti;
                         if (f2 - f1 > 0) {
                            obj = this.h;
                            obj.top = obj.bottom - (f1 / uCropSelecti);
                         }else if(f2 - f1 < 0){
                            tc = this.h;
                            tc.left = tc.right - f2;
                         }
                      }
                   }else if((tc & 1) == 1){
                      this.i(p0);
                      if (!PatchProxy.applyVoid(uCropSelecti, this, CropSelectionBoxView.class, "19") && this.e()) {
                         f1 = this.h.width();
                         uCropSelecti = this.o;
                         f2 = this.h.height() * uCropSelecti;
                         if (f2 - f1 > 0) {
                            obj = this.h;
                            obj.bottom = obj.top + (f1 / uCropSelecti);
                         }else if(f2 - f1 < 0){
                            tc = this.h;
                            tc.left = tc.right - f2;
                         }
                      }
                   }else {
                      this.a(1);
                   }
                }else if((tc & 0x10) == 0.00f){
                   if (!PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "11")) {
                      obj = this.i;
                      a.m(obj);
                      if (p0.getX() - obj.a().right <= 0 && p0.getX() - (this.h.left + this.getCropMinimumWidth()) > 0) {
                         this.h.right = p0.getX();
                      }else {
                         obj = this.i;
                         a.m(obj);
                         if (p0.getX() - obj.a().right > 0) {
                            obj = this.i;
                            a.m(obj);
                            this.h.right = obj.a().right;
                         }else {
                            tc = this.h;
                            tc.right = tc.left + this.getCropMinimumWidth();
                         }
                      }
                      tc = this.h;
                      tc.right = q.t(tc.right, ((float)this.getWidth() - this.m));
                   }
                   tc = this.c;
                   if ((tc & 0x0100) == 256) {
                      this.j(p0);
                      if (!PatchProxy.applyVoid(uCropSelecti, this, CropSelectionBoxView.class, "17") && this.e()) {
                         f1 = this.h.width();
                         uCropSelecti = this.o;
                         f2 = this.h.height() * uCropSelecti;
                         if (f2 - f1 > 0) {
                            obj = this.h;
                            obj.top = obj.bottom - (f1 / uCropSelecti);
                         }else if(f2 - f1 < 0){
                            tc = this.h;
                            tc.right = tc.left + f2;
                         }
                      }
                   }else if((tc & 1) == 1){
                      this.i(p0);
                      if (!PatchProxy.applyVoid(uCropSelecti, this, CropSelectionBoxView.class, "18") && this.e()) {
                         f1 = this.h.width();
                         uCropSelecti = this.o;
                         f2 = this.h.height() * uCropSelecti;
                         if (f2 - f1 > 0) {
                            obj = this.h;
                            obj.bottom = obj.top + (f1 / uCropSelecti);
                         }else if(f2 - f1 < 0){
                            tc = this.h;
                            tc.right = tc.left + f2;
                         }
                      }
                   }else {
                      this.a(b);
                   }
                }else if((tc & 0x0100) == 256){
                   this.j(p0);
                   this.b(1);
                }else if((tc & 1) == 1){
                   this.i(p0);
                   this.b(b);
                }
             label_028a :
                this.invalidate();
                iterator = this.u.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(this.h);
                }
             }
          }else {
             CropSelectionBoxView obj1 = PatchProxy.applyOneRefs(p0, this, CropSelectionBoxView.class, "22");
             if (obj1 != patchProxyRe) {
                i = obj1.intValue();
             }else {
                f1 = p0.getX();
                f2 = p0.getY();
                float f3 = (float)50;
                if (Math.abs((f1 - this.h.left)) - f3 > 0) {
                   f = 0;
                }
                if (Math.abs((f2 - this.h.top)) - f3 <= 0) {
                   f = f | 0x0100;
                }
                if (Math.abs((f1 - this.h.right)) - f3 <= 0) {
                   f = f | 0x10;
                }
                if (Math.abs((f2 - this.h.bottom)) - f3 <= 0) {
                   i = f | 0x01;
                }else {
                   i = f;
                }
             }
             this.c = i;
             if (i) {
                this.b = true;
             }
             this.k(1);
          }
          if (this.b != null || super.onTouchEvent(p0)) {
             b = true;
          }
          return b;
       }
    }
    public final void setBorderPaintColor(int p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropSelectionBoxView.class, "34")) {
          return;
       }
       this.e.setColor(p0);
       this.invalidate();
       return;
    }
    public final void setBorderPaintWidth(int p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CropSelectionBoxView.class, "33")) {
          return;
       }
       this.e.setStrokeWidth((float)p0);
       this.invalidate();
       return;
    }
    public final void setDrawMatrix(Matrix p0){
       this.t = p0;
    }
    public final void setImageBoundsProvider(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "27")) {
          return;
       }
       a.p(p0, "provider");
       this.i = p0;
       return;
    }
    public final void setOverColor(int p0){
       this.q = p0;
    }
    public final void setRectRatio(float p0){
       if (PatchProxy.isSupport(CropSelectionBoxView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, CropSelectionBoxView.class, "35")) {
          return;
       }
       this.o = p0;
       this.l(p0);
       this.invalidate();
       return;
    }
    public final void setSelectionBoxRect(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CropSelectionBoxView.class, "28")) {
          return;
       }
       a.p(p0, "rectF");
       this.h.set(p0);
       this.invalidate();
       return;
    }
}
