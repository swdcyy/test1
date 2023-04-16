package com.tencent.connect.avatar.c;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import java.lang.Math;
import android.graphics.Bitmap;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import java.lang.Thread;
import com.tencent.connect.avatar.c$1;
import java.lang.Runnable;

public class c extends ImageView	// class@000e3e
{
    public final String a;
    public boolean b;
    public Matrix c;
    public Matrix d;
    public int e;
    public float f;
    public float g;
    public Bitmap h;
    public boolean i;
    public float j;
    public float k;
    public PointF l;
    public PointF m;
    public float n;
    public float o;
    public Rect p;

    public void c(Context p0){
       super(p0);
       this.c = new Matrix();
       this.d = new Matrix();
       this.e = 0;
       this.f = 0x3f800000;
       this.g = 0x3f800000;
       this.i = false;
       this.a = "TouchView";
       this.l = new PointF();
       this.m = new PointF();
       this.n = 0x3f800000;
       this.o = 0;
       this.b = false;
       Rect rect = new Rect();
       this.p = rect;
       this.getDrawingRect(rect);
       this.a();
    }
    public static void a(c p0){
       p0.b();
    }
    public static boolean a(c p0,boolean p1){
       p0.i = p1;
       return p1;
    }
    public final float a(MotionEvent p0){
       if (p0.getPointerCount() < 0.00f) {
          return 0;
       }
       return (float)Math.sqrt((double)(((p0.getX(0) - p0.getX(1)) * (p0.getX(0) - p0.getX(1))) + ((p0.getY(0) - p0.getY(1)) * (p0.getY(0) - p0.getY(1)))));
    }
    public final void a(){
    }
    public final void a(PointF p0){
       if (this.h == null) {
          return;
       }
       float[] uofloatArray = new float[9];
       this.c.getValues(uofloatArray);
       int i = uofloatArray[2];
       int i1 = uofloatArray[5];
       int i2 = uofloatArray[0];
       float f = (float)this.h.getWidth() * i2;
       float f1 = (float)this.h.getHeight() * i2;
       c tp = this.p;
       float f2 = (float)tp.left - i;
       float f3 = 0x3f800000;
       if (f2 - f3 <= 0) {
          f2 = 0x3f800000;
       }
       float f4 = (i + f) - (float)tp.right;
       if (f4 - f3 <= 0) {
          f4 = 0x3f800000;
       }
       c tp1 = this.p;
       float f5 = (((float)tp.width() * f2) / (f4 + f2)) + (float)tp1.left;
       f = (float)tp1.top - i1;
       float f6 = (i1 + f1) - (float)tp1.bottom;
       if (f - f3 <= 0) {
          f = 0x3f800000;
       }
       if (f6 - f3 > 0) {
          f3 = f6;
       }
       p0.set(f5, ((((float)tp1.height() * f) / (f3 + f)) + (float)this.p.top));
       return;
    }
    public void a(Rect p0){
       this.p = p0;
       if (this.h != null) {
          this.c();
       }
       return;
    }
    public final void b(){
       float f3;
       c m;
       float f5;
       ScaleAnimation scaleAnimati2;
       int i5;
       c uoc = this;
       if (uoc.h == null) {
          return;
       }
       float f = (float)uoc.p.width();
       float f1 = (float)uoc.p.height();
       float[] uofloatArray = new float[9];
       uoc.c.getValues(uofloatArray);
       int i = 2;
       int i1 = uofloatArray[i];
       int i2 = 5;
       int i3 = uofloatArray[i2];
       int i4 = uofloatArray[0];
       c f2 = uoc.f;
       if (i4 - f2 > 0) {
          f3 = f2 / i4;
          uoc.o = f3;
          m = uoc.m;
          uoc.c.postScale(f3, f3, m.x, m.y);
          uoc.setImageMatrix(uoc.c);
          c o = uoc.o;
          float f4 = 0x3f800000 / o;
          f5 = 0x3f800000 / o;
          o = uoc.m;
          ScaleAnimation scaleAnimati = new ScaleAnimation(f4, 0x3f800000, f5, 0x3f800000, o.x, o.y);
       }else {
          f2 = uoc.g;
          if (i4 - f2 < 0) {
             f3 = f2 / i4;
             uoc.o = f3;
             m = uoc.m;
             uoc.c.postScale(f3, f3, m.x, m.y);
             c o1 = uoc.o;
             m = uoc.m;
             ScaleAnimation scaleAnimati1 = new ScaleAnimation(0x3f800000, o1, 0x3f800000, o1, m.x, m.y);
             scaleAnimati2 = f;
          }else {
             f3 = (float)uoc.h.getWidth() * i4;
             float f6 = (float)uoc.h.getHeight() * i4;
             c p = uoc.p;
             Rect left = p.left;
             float f7 = (float)left - i1;
             Rect top = p.top;
             float f8 = (float)top - i3;
             float f9 = 0;
             if (f7 - f9 < 0) {
                f5 = (float)left;
                i5 = 1;
             }else {
                i5 = 0;
             }
             if (f8 - f9 < 0) {
                i3 = (float)top;
                i5 = 1;
             }
             f8 = f6 - f8;
             if ((f3 - f7) - f < 0) {
                f5 = (float)left - (f3 - f);
                i5 = 1;
             }
             if (f8 - f1 < 0) {
                i3 = (float)top - (f6 - f1);
                i5 = 1;
             }
             if (i5) {
                uofloatArray[i] = f5;
                uofloatArray[i2] = i3;
                uoc.c.setValues(uofloatArray);
                uoc.setImageMatrix(uoc.c);
                scaleAnimati2 = new TranslateAnimation((uofloatArray[i] - f5), f9, (uofloatArray[i2] - i3), f9);
             }else {
                uoc.setImageMatrix(uoc.c);
                scaleAnimati2 = null;
             }
          }
       }
       if (v10 != null) {
          uoc.i = true;
          v10.setDuration(300);
          uoc.startAnimation(v10);
          new Thread(new c$1(uoc)).start();
       }
       return;
    }
    public final void c(){
       if (this.h == null) {
          return;
       }
       float[] uofloatArray = new float[9];
       this.c.getValues(uofloatArray);
       float f = Math.max(((float)this.p.width() / (float)this.h.getWidth()), ((float)this.p.height() / (float)this.h.getHeight()));
       this.j = (float)this.p.left - ((((float)this.h.getWidth() * f) - (float)this.p.width()) / 2.00f);
       float f1 = (float)this.p.top - ((((float)this.h.getHeight() * f) - (float)this.p.height()) / 2.00f);
       this.k = f1;
       uofloatArray[2] = this.j;
       uofloatArray[5] = f1;
       uofloatArray[4] = f;
       uofloatArray[0] = f;
       this.c.setValues(uofloatArray);
       float f2 = Math.min((2048.00f / (float)this.h.getWidth()), (2048.00f / (float)this.h.getHeight()));
       this.f = f2;
       this.g = f;
       if (f2 - f < 0) {
          this.f = f;
       }
       this.setImageMatrix(this.c);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       if (this.i != null) {
          return true;
       }
       int i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 1) {
             c uoc = 0x41200000;
             int i1 = 2;
             if (i != i1) {
                if (i != 5) {
                   if (i == 6) {
                   label_0089 :
                      this.b();
                      this.e = 0;
                   }
                }else {
                   f = this.a(p0);
                   this.n = f;
                   if (f - uoc > 0) {
                      this.d.set(this.c);
                      this.a(this.m);
                      this.e = i1;
                   }
                }
             }else {
                c te = this.e;
                if (te == true) {
                   this.c.set(this.d);
                   this.c.postTranslate((p0.getX() - this.l.x), (p0.getY() - this.l.y));
                   this.setImageMatrix(this.c);
                }else if(te == i1){
                   this.c.set(this.c);
                   f = this.a(p0);
                   if (f - uoc > 0) {
                      this.c.set(this.d);
                      uoc = this.m;
                      this.c.postScale((f / this.n), (f / this.n), uoc.x, uoc.y);
                   }
                   this.setImageMatrix(this.c);
                }
             }
          }else {
             goto label_0089 ;
          }
       }else {
          this.c.set(this.getImageMatrix());
          this.d.set(this.c);
          this.l.set(p0.getX(), p0.getY());
          this.e = 1;
       }
    label_00af :
       this.b = true;
       return true;
    }
    public void setImageBitmap(Bitmap p0){
       super.setImageBitmap(p0);
       this.h = p0;
       if (p0 != null) {
          this.h = p0;
       }
       return;
    }
}
