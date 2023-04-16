package com.facebook.react.views.view.ReactViewBackgroundDrawable;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Double;
import java.lang.String;
import java.lang.Math;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Float;
import android.graphics.Path;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ze.l0;
import com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderRadiusLocation;
import com.facebook.react.views.view.ReactViewBackgroundDrawable$BorderStyle;
import android.graphics.PathEffect;
import bg.a;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.RectF;
import pe.a;
import android.graphics.Region$Op;
import java.lang.Enum;
import lg.d;
import android.graphics.Outline;
import java.lang.Boolean;
import ze.d;
import java.util.Locale;
import android.graphics.ColorFilter;
import java.lang.StringBuilder;
import cb.a;
import java.util.Arrays;
import android.graphics.Path$Direction;

public class ReactViewBackgroundDrawable extends Drawable	// class@001439
{
    public l0 a;
    public l0 b;
    public l0 c;
    public ReactViewBackgroundDrawable$BorderStyle d;
    public PathEffect e;
    public Path f;
    public Path g;
    public Path h;
    public Path i;
    public Path j;
    public RectF k;
    public RectF l;
    public RectF m;
    public RectF n;
    public PointF o;
    public PointF p;
    public PointF q;
    public PointF r;
    public boolean s;
    public float t;
    public final Paint u;
    public int v;
    public int w;
    public float[] x;
    public final Context y;
    public int z;

    public void ReactViewBackgroundDrawable(Context p0){
       super();
       this.s = false;
       this.t = Float.NaN;
       this.u = new Paint(1);
       this.v = 0;
       this.w = 255;
       this.y = p0;
    }
    public static int b(int p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7){
       int i = -1;
       int i1 = (p0 > 0)? p4: -1;
       int i2 = (p1 > 0)? p5: -1;
       i1 = i1 & i2;
       i2 = (p2 > 0)? p6: -1;
       i1 = i1 & i2;
       if (p3 > 0) {
          i = p7;
       }
       i = i & i1;
       if (p0 <= 0) {
          p4 = 0;
       }
       if (p1 <= 0) {
          p5 = 0;
       }
       p0 = p4 | p5;
       if (p2 <= 0) {
          p6 = 0;
       }
       p0 = p0 | p6;
       if (p3 <= 0) {
          p7 = 0;
       }
       if (i != (p0 | p7)) {
          i = 0;
       }
       return i;
    }
    public static void i(double p0,double p1,double p2,double p3,double p4,double p5,double p6,double p7,PointF p8){
       object oobject = p8;
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Double.valueOf(p0);
          objArray[1] = Double.valueOf(p1);
          objArray[2] = Double.valueOf(p2);
          objArray[3] = Double.valueOf(p3);
          objArray[4] = Double.valueOf(p4);
          objArray[5] = Double.valueOf(p5);
          objArray[6] = Double.valueOf(p6);
          objArray[7] = Double.valueOf(p7);
          objArray[8] = oobject;
          if (PatchProxy.applyVoid(objArray, null, ReactViewBackgroundDrawable.class, "21")) {
             return;
          }
       }
       double d = (p0 + p2) / 2.00f;
       double d1 = (p1 + p3) / 2.00f;
       double d2 = p4 - d;
       double d3 = p5 - d1;
       double d4 = Math.abs((p2 - p0)) / 2.00f;
       double d5 = ((p7 - d1) - d3) / ((p6 - d) - d2);
       d3 = d3 - (d2 * d5);
       double d6 = (Math.abs((p3 - p1)) / 2.00f) * (Math.abs((p3 - p1)) / 2.00f);
       d2 = d4 * d4;
       double d7 = d6 + ((d2 * d5) * d5);
       double d8 = (((d4 * 2.00f) * d4) * d3) * d5;
       d2 = (- (d2 * ((d3 * d3) - d6))) / d7;
       d6 = d1;
       d7 = d7 * 2.00f;
       double d9 = ((- d8) / d7) - Math.sqrt((d2 + Math.pow((d8 / d7), 2.00f)));
       d9 = d9 + d;
       d5 = ((d5 * d9) + d3) + d6;
       if (!Double.isNaN(d9) && !Double.isNaN(d5)) {
          int i = p8;
          i.x = (float)d9;
          i.y = (float)d5;
       }
       return;
    }
    public final void a(Canvas p0,int p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Float.valueOf(p2);
          objArray[3] = Float.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Float.valueOf(p6);
          objArray[7] = Float.valueOf(p7);
          objArray[8] = Float.valueOf(p8);
          objArray[9] = Float.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, this, ReactViewBackgroundDrawable.class, "26")) {
             return;
          }
       }
       if (!p1) {
          return;
       }else if(this.i == null){
          this.i = new Path();
       }
       this.u.setColor(p1);
       this.i.reset();
       this.i.moveTo(p2, p3);
       this.i.lineTo(p4, p5);
       this.i.lineTo(p6, p7);
       this.i.lineTo(p8, p9);
       this.i.lineTo(p2, p3);
       p0.drawPath(this.i, this.u);
       return;
    }
    public final int c(int p0){
       ReactViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactViewBackgroundDrawable.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.b;
       float f = (obj != null)? obj.a(p0): 0;
       ReactViewBackgroundDrawable tc = this.c;
       float f1 = (tc != null)? tc.a(p0): 0x437f0000;
       return ((((int)f1 << 24) & 0xff000000) | ((int)f & 0xffffff));
    }
    public float d(ReactViewBackgroundDrawable$BorderRadiusLocation p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewBackgroundDrawable.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.e(Float.NaN, p0);
    }
    public void draw(Canvas p0){
       int i6;
       boolean i11;
       float f;
       int i14;
       int i16;
       int i17;
       int i18;
       float f1;
       float f2;
       Rect rect;
       float f5;
       float f6;
       int i19;
       float f7;
       int i20;
       float f8;
       int i21;
       ReactViewBackgroundDrawable l;
       RectF rectF2;
       RectF rectF3;
       RectF rectF4;
       RectF rectF5;
       PathEffect pathEffect = this;
       Rect obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, pathEffect, ReactViewBackgroundDrawable.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, pathEffect, ReactViewBackgroundDrawable.class, "23")) {
          l = pathEffect.d;
          if (l != null) {
             objArray = ReactViewBackgroundDrawable$BorderStyle.getPathEffect(l, this.k());
          }
          pathEffect.e = objArray;
          pathEffect.u.setPathEffect(objArray);
       }
       boolean i = 5;
       boolean i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 0;
       int i5 = 1;
       if (!this.m()) {
          if (!PatchProxy.applyVoidOneRefs(obj, pathEffect, ReactViewBackgroundDrawable.class, "25")) {
             i6 = a.a(pathEffect.v, pathEffect.w);
             if (Color.alpha(i6)) {
                pathEffect.u.setColor(i6);
                pathEffect.u.setStyle(Paint$Style.FILL);
                obj.drawRect(this.getBounds(), pathEffect.u);
             }
             RectF rectF = this.h();
             int i7 = Math.round(rectF.left);
             int i8 = Math.round(rectF.top);
             int i9 = Math.round(rectF.right);
             int i10 = Math.round(rectF.bottom);
             if (i7 <= 0 && (i9 <= 0 && (i8 > 0 || i10 > 0))) {
                Rect bounds = this.getBounds();
                i11 = pathEffect.c(i4);
                int i12 = pathEffect.c(i5);
                i3 = pathEffect.c(i3);
                int i13 = pathEffect.c(i2);
                f = (this.l() == i5)? Float.MIN_VALUE: 0;
                i14 = pathEffect.c(i1);
                boolean i15 = pathEffect.c(i);
                if (a.b().a(pathEffect.y)) {
                   if (pathEffect.n(i1)) {
                      i11 = i14;
                   }
                   if (pathEffect.n(i)) {
                      i3 = i15;
                   }
                   i = (f)? i3: i11;
                   if (!f) {
                      i11 = i3;
                   }
                   i1 = i;
                   i16 = i11;
                }else if(f){
                   i20 = i15;
                }else {
                   i20 = i14;
                }
                if (!f) {
                   i14 = i15;
                }
                i1 = pathEffect.n(i1);
                i = pathEffect.n(i);
                i15 = (f)? i: i1;
                if (!f) {
                   i1 = i;
                }
                if (i15) {
                   i11 = i20;
                }
                if (i1) {
                   i1 = i11;
                   i16 = i14;
                }else {
                   i16 = i3;
                   i1 = i11;
                }
                Rect left = bounds.left;
                Rect top = bounds.top;
                i = ReactViewBackgroundDrawable.b(i7, i8, i9, i10, i1, i12, i16, i13);
                if (i) {
                   if (Color.alpha(i)) {
                      Rect right = bounds.right;
                      Rect bottom = bounds.bottom;
                      pathEffect.u.setColor(i);
                      if (i7 > 0) {
                         p0.drawRect((float)left, (float)top, (float)(left + i7), (float)(bottom - i10), pathEffect.u);
                      }
                      if (i8 > 0) {
                         p0.drawRect((float)(left + i7), (float)top, (float)right, (float)(top + i8), pathEffect.u);
                      }
                      if (i9 > 0) {
                         p0.drawRect((float)(right - i9), (float)(top + i8), (float)right, (float)bottom, pathEffect.u);
                      }
                      if (i10 > 0) {
                         p0.drawRect((float)left, (float)(bottom - i10), (float)(right - i9), (float)bottom, pathEffect.u);
                      }
                   }
                }else {
                   pathEffect.u.setAntiAlias(i4);
                   i17 = bounds.width();
                   i18 = bounds.height();
                   if (i7 > 0) {
                      f1 = (float)left;
                      f2 = (float)(left + i7);
                      i6 = top + i18;
                      f = (float)i6;
                      float f3 = f;
                      f = f1;
                      float f4 = f1;
                      rect = top;
                      obj = left;
                      this.a(p0, i1, f, (float)top, f2, (float)(top + i8), f2, (float)(i6 - i10), f4, f3);
                   }else {
                      rect = top;
                      obj = left;
                   }
                   if (i8 > 0) {
                      f5 = (float)rect;
                      f1 = (float)(rect + i8);
                      i6 = obj + i17;
                      f6 = (float)i6;
                      this.a(p0, i12, (float)obj, f5, (float)(obj + i7), f1, (float)(i6 - i9), f1, f6, f5);
                   }
                   if (i9 > 0) {
                      i19 = obj + i17;
                      f7 = (float)i19;
                      i20 = rect + i18;
                      f8 = (float)i20;
                      f5 = (float)(i19 - i9);
                      f2 = f5;
                      f6 = f5;
                      this.a(p0, i16, f7, (float)rect, f7, f8, f2, (float)(i20 - i10), f6, (float)(rect + i8));
                   }
                   if (i10 > 0) {
                      i20 = rect + i18;
                      f8 = (float)i20;
                      i19 = obj + i17;
                      f7 = (float)i19;
                      f5 = (float)(i20 - i10);
                      this.a(p0, i13, (float)obj, f8, f7, f8, (float)(i19 - i9), f5, (float)(obj + i7), f5);
                   }
                   pathEffect.u.setAntiAlias(true);
                }
             }
          }
       }else {
          Object obj1 = p0;
          if (!PatchProxy.applyVoidOneRefs(obj1, pathEffect, ReactViewBackgroundDrawable.class, "19")) {
             this.v();
             p0.save();
             i6 = a.a(pathEffect.v, pathEffect.w);
             if (Color.alpha(i6)) {
                pathEffect.u.setColor(i6);
                pathEffect.u.setStyle(Paint$Style.FILL);
                obj1.drawPath(pathEffect.f, pathEffect.u);
             }
             RectF rectF1 = this.h();
             i6 = pathEffect.c(i4);
             i17 = pathEffect.c(1);
             i3 = pathEffect.c(i3);
             i18 = pathEffect.c(i2);
             if (rectF1.top <= 0 && (rectF1.bottom <= 0 && (rectF1.left > 0 || rectF1.right > 0))) {
                f = this.k();
                i11 = pathEffect.c(8);
                if (!rectF1.top - f && (!rectF1.bottom - f && (!rectF1.left - f && (!rectF1.right - f && (i6 == i11 && (i17 == i11 && (i3 == i11 && i18 == i11))))))) {
                   if (f > 0) {
                      pathEffect.u.setColor(a.a(i11, pathEffect.w));
                      pathEffect.u.setStyle(Paint$Style.STROKE);
                      pathEffect.u.setStrokeWidth(f);
                      obj1.drawPath(pathEffect.j, pathEffect.u);
                   }
                }else {
                   pathEffect.u.setStyle(Paint$Style.FILL);
                   obj1.clipPath(pathEffect.g, Region$Op.INTERSECT);
                   obj1.clipPath(pathEffect.f, Region$Op.DIFFERENCE);
                   if (this.l() == 1) {
                      i4 = 1;
                   }
                   i2 = pathEffect.c(i1);
                   i11 = pathEffect.c(i);
                   if (a.b().a(pathEffect.y)) {
                      if (pathEffect.n(i1)) {
                         i6 = i2;
                      }
                      if (pathEffect.n(i)) {
                         i3 = i11;
                      }
                      i = (i4)? i3: i6;
                      if (!i4) {
                         i6 = i3;
                      }
                      i21 = i6;
                      i1 = i;
                   }else if(i4){
                      i14 = i11;
                   }else {
                      i14 = i2;
                   }
                   if (!i4) {
                      i2 = i11;
                   }
                   i1 = pathEffect.n(i1);
                   i = pathEffect.n(i);
                   i11 = (i4)? i: i1;
                   if (!i4) {
                      i1 = i;
                   }
                   if (i11) {
                      i6 = i14;
                   }
                   if (i1) {
                      i1 = i6;
                      i21 = i2;
                   }else {
                      i1 = i6;
                      i21 = i3;
                   }
                   l = pathEffect.l;
                   RectF left1 = l.left;
                   RectF right1 = l.right;
                   RectF top1 = l.top;
                   RectF bottom1 = l.bottom;
                   if (rectF1.left > 0) {
                      l = pathEffect.o;
                      l = pathEffect.r;
                      rectF2 = bottom1;
                      rectF3 = top1;
                      rectF4 = right1;
                      rectF5 = left1;
                      this.a(p0, i1, left1, top1, l.x, l.y, l.x, l.y, left1, rectF2);
                   }else {
                      rectF2 = bottom1;
                      rectF3 = top1;
                      rectF4 = right1;
                      rectF5 = left1;
                   }
                   if (rectF1.top > 0) {
                      l = pathEffect.o;
                      l = pathEffect.p;
                      this.a(p0, i17, rectF5, rectF3, l.x, l.y, l.x, l.y, rectF4, rectF3);
                   }
                   if (rectF1.right > 0) {
                      l = pathEffect.p;
                      l = pathEffect.q;
                      this.a(p0, i21, rectF4, rectF3, l.x, l.y, l.x, l.y, rectF4, rectF2);
                   }
                   if (rectF1.bottom > 0) {
                      l = pathEffect.r;
                      l = pathEffect.q;
                      this.a(p0, i18, rectF5, rectF2, l.x, l.y, l.x, l.y, rectF4, rectF2);
                   }
                }
             }
             p0.restore();
          }
       }
    label_03da :
       return;
    }
    public float e(float p0,ReactViewBackgroundDrawable$BorderRadiusLocation p1){
       ReactViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), p1, this, ReactViewBackgroundDrawable.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.x;
       if (obj == null) {
          return p0;
       }else {
          int i = obj[p1.ordinal()];
          if (d.a(i)) {
             return p0;
          }else {
             return i;
          }
       }
    }
    public float f(float p0,int p1){
       ReactViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, ReactViewBackgroundDrawable.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = this.a;
       if (obj == null) {
          return p0;
       }else {
          float f = obj.b(p1);
          if (d.a(f)) {
             return p0;
          }else {
             return f;
          }
       }
    }
    public int g(){
       return this.v;
    }
    public int getAlpha(){
       return this.w;
    }
    public int getOpacity(){
       Object obj = PatchProxy.apply(null, this, ReactViewBackgroundDrawable.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a.a(this.v, this.w) >> 24;
       if (i == 255) {
          i = -1;
       }else if(!i){
          i = -2;
       }else {
          i = -3;
       }
       return i;
    }
    public void getOutline(Outline p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewBackgroundDrawable.class, "6")) {
          return;
       }
       if (d.a(this.t) || (this.t > 0 || this.x != null)) {
          this.v();
          p0.setConvexPath(this.h);
       }else {
          p0.setRect(this.getBounds());
       }
       return;
    }
    public RectF h(){
       float f6;
       Object obj = PatchProxy.apply(null, this, ReactViewBackgroundDrawable.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = this.f(0, 8);
       int i = 1;
       float f1 = this.f(f, i);
       float f2 = this.f(f, 3);
       float f3 = this.f(f, 0);
       f = this.f(f, 2);
       if (this.a != null) {
          if (this.l() != i) {
             i = 0;
          }
          float f4 = this.a.b(4);
          float f5 = this.a.b(5);
          if (a.b().a(this.y)) {
             if (!d.a(f4)) {
                f3 = f4;
             }
             if (!d.a(f5)) {
                f = f5;
             }
             f4 = (i)? f: f3;
             if (i) {
                f = f3;
             }
             f3 = f4;
          }else if(i){
             f6 = f5;
          }else {
             f6 = f4;
          }
          if (!i) {
             f4 = f5;
          }
          if (!d.a(f6)) {
             f3 = f6;
          }
          if (!d.a(f4)) {
             f = f4;
          }
       }
       return new RectF(f3, f1, f, f2);
    }
    public float j(){
       Object obj = PatchProxy.apply(null, this, ReactViewBackgroundDrawable.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = (d.a(this.t))? 0: this.t;
       return f;
    }
    public float k(){
       ReactViewBackgroundDrawable obj = PatchProxy.apply(null, this, ReactViewBackgroundDrawable.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.a;
       float f = (obj != null && !d.a(obj.b(8)))? this.a.b(8): 0;
       return f;
    }
    public int l(){
       return this.z;
    }
    public boolean m(){
       ReactViewBackgroundDrawable obj = PatchProxy.apply(null, this, ReactViewBackgroundDrawable.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d.a(this.t) && this.t > 0) {
          return true;
       }
       obj = this.x;
       if (obj != null) {
          int len = obj.length;
          int i = 0;
          while (i < len) {
             int i1 = obj[i];
             if (!d.a(i1) && i1 > 0) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public final boolean n(int p0){
       ReactViewBackgroundDrawable obj;
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactViewBackgroundDrawable.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b;
       float f = Float.NaN;
       float f1 = (obj != null)? obj.a(p0): Float.NaN;
       ReactViewBackgroundDrawable tc = this.c;
       if (tc != null) {
          f = tc.a(p0);
       }
       boolean b = (!d.a(f1) && !d.a(f))? true: false;
       return b;
    }
    public void o(int p0,float p1,float p2){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, ReactViewBackgroundDrawable.class, "8")) {
          return;
       }
       if (!PatchProxy.isSupport(ReactViewBackgroundDrawable.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ReactViewBackgroundDrawable.class, "9")) {
          if (this.b == null) {
             this.b = new l0(0);
          }
          if (!d.a(this.b.b(p0), p1)) {
             this.b.c(p0, p1);
             this.invalidateSelf();
          }
       }
       if (!PatchProxy.isSupport(ReactViewBackgroundDrawable.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p2), this, ReactViewBackgroundDrawable.class, "10")) {
          if (this.c == null) {
             this.c = new l0(0x437f0000);
          }
          if (!d.a(this.c.b(p0), p2)) {
             this.c.c(p0, p2);
             this.invalidateSelf();
          }
       }
       return;
    }
    public void onBoundsChange(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewBackgroundDrawable.class, "3")) {
          return;
       }
       super.onBoundsChange(p0);
       this.s = true;
       return;
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactViewBackgroundDrawable.class, "11")) {
          return;
       }
       ReactViewBackgroundDrawable$BorderStyle uBorderStyle = (p0 == null)? null: ReactViewBackgroundDrawable$BorderStyle.valueOf(p0.toUpperCase(Locale.US));
       if (this.d != uBorderStyle) {
          this.d = uBorderStyle;
          this.s = true;
          this.invalidateSelf();
       }
       return;
    }
    public void q(int p0,float p1){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ReactViewBackgroundDrawable.class, "7")) {
          return;
       }
       if (this.a == null) {
          this.a = new l0(0);
       }
       if (!d.a(this.a.b(p0), p1)) {
          this.a.c(p0, p1);
          if (!p0 || (p0 == 1 || (p0 == 2 || (p0 == 3 || (p0 == 4 || (p0 == 5 || p0 == 8)))))) {
             this.s = true;
          }
          this.invalidateSelf();
       }
       return;
    }
    public void r(int p0){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactViewBackgroundDrawable.class, "17")) {
          return;
       }
       this.v = p0;
       this.invalidateSelf();
       return;
    }
    public void s(float p0){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactViewBackgroundDrawable.class, "12")) {
          return;
       }
       if (!d.a(this.t, p0)) {
          this.t = p0;
          this.s = true;
          this.invalidateSelf();
       }
       return;
    }
    public void setAlpha(int p0){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactViewBackgroundDrawable.class, "4")) {
          return;
       }
       if (p0 != this.w) {
          this.w = p0;
          this.invalidateSelf();
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
    }
    public void t(float p0,int p1){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, ReactViewBackgroundDrawable.class, "13")) {
          return;
       }
       if (this.x == null) {
          if (Float.isNaN(p0)) {
             a.x("ReactNative", "setRadius exception! position:"+p1);
             return;
          }else {
             float[] uofloatArray = new float[8];
             this.x = uofloatArray;
             Arrays.fill(uofloatArray, Float.NaN);
          }
       }
       if (!d.a(this.x[p1], p0)) {
          this.x[p1] = p0;
          this.s = true;
          this.invalidateSelf();
       }
       return;
    }
    public boolean u(int p0){
       if (PatchProxy.isSupport(ReactViewBackgroundDrawable.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ReactViewBackgroundDrawable.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.z != p0) {
          this.z = p0;
       }
       return false;
    }
    public final void v(){
       float f11;
       ReactViewBackgroundDrawable a;
       boolean b = this;
       if (PatchProxy.applyVoid(null, b, ReactViewBackgroundDrawable.class, "20")) {
          return;
       }
       if (b.s == null) {
          return;
       }
       boolean b1 = false;
       b.s = b1;
       if (b.f == null) {
          b.f = new Path();
       }
       if (b.g == null) {
          b.g = new Path();
       }
       if (b.h == null) {
          b.h = new Path();
       }
       if (b.j == null) {
          b.j = new Path();
       }
       if (b.k == null) {
          b.k = new RectF();
       }
       if (b.l == null) {
          b.l = new RectF();
       }
       if (b.m == null) {
          b.m = new RectF();
       }
       if (b.n == null) {
          b.n = new RectF();
       }
       b.f.reset();
       b.g.reset();
       b.h.reset();
       b.j.reset();
       b.k.set(this.getBounds());
       b.l.set(this.getBounds());
       b.m.set(this.getBounds());
       b.n.set(this.getBounds());
       float f = this.k();
       float f1 = 0;
       if (f - f1 > 0) {
          b.n.inset((f * 0x3f000000), (f * 0x3f000000));
       }
       RectF rectF = this.h();
       ReactViewBackgroundDrawable k = b.k;
       k.top = k.top + rectF.top;
       k.bottom = k.bottom - rectF.bottom;
       k.left = k.left + rectF.left;
       k.right = k.right - rectF.right;
       float f2 = this.j();
       float f3 = b.e(f2, ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_LEFT);
       float f4 = b.e(f2, ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_RIGHT);
       float f5 = b.e(f2, ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_LEFT);
       f2 = b.e(f2, ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_RIGHT);
       RectF rectF1 = (this.l() == 1)? 1: null;
       float f6 = b.d(ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_START);
       float f7 = b.d(ReactViewBackgroundDrawable$BorderRadiusLocation.TOP_END);
       float f8 = b.d(ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_START);
       float f9 = b.d(ReactViewBackgroundDrawable$BorderRadiusLocation.BOTTOM_END);
       if (a.b().a(b.y)) {
          if (!d.a(f6)) {
             f3 = f6;
          }
          if (!d.a(f7)) {
             f4 = f7;
          }
          if (!d.a(f8)) {
             f5 = f8;
          }
          if (!d.a(f9)) {
             f2 = f9;
          }
          f6 = (rectF1)? f4: f3;
          if (!rectF1) {
             f3 = f4;
          }
          f4 = (rectF1)? f2: f5;
          if (rectF1) {
             f2 = f5;
          }
       }else if(rectF1 != null){
          f11 = f7;
       }else {
          f11 = f6;
       }
       if (rectF1 == null) {
          f6 = f7;
       }
       f7 = (rectF1 != null)? f9: f8;
       if (rectF1 == null) {
          f8 = f9;
       }
       if (!d.a(f11)) {
          f3 = f11;
       }
       if (!d.a(f6)) {
          f4 = f6;
       }
       if (!d.a(f7)) {
          f5 = f7;
       }
       f6 = f3;
       f3 = f4;
       f4 = f5;
       if (!d.a(f8)) {
          f2 = f8;
       }
       f5 = Math.max((f6 - rectF.left), f1);
       float f10 = Math.max((f6 - rectF.top), f1);
       f7 = Math.max((f3 - rectF.right), f1);
       f8 = Math.max((f3 - rectF.top), f1);
       f9 = Math.max((f2 - rectF.right), f1);
       f11 = Math.max((f2 - rectF.bottom), f1);
       float f12 = Math.max((f4 - rectF.left), f1);
       f = Math.max((f4 - rectF.bottom), f1);
       float f13 = f4;
       int i = 8;
       float f14 = f2;
       float[] uofloatArray = new float[i];
       uofloatArray[b1] = f5;
       uofloatArray[1] = f10;
       uofloatArray[2] = f7;
       uofloatArray[3] = f8;
       uofloatArray[4] = f9;
       uofloatArray[5] = f11;
       uofloatArray[6] = f12;
       uofloatArray[7] = f;
       b.f.addRoundRect(b.k, uofloatArray, Path$Direction.CW);
       uofloatArray = new float[i];
       uofloatArray[0] = f6;
       uofloatArray[1] = f6;
       uofloatArray[2] = f3;
       uofloatArray[3] = f3;
       uofloatArray[4] = f14;
       uofloatArray[5] = f14;
       uofloatArray[6] = f13;
       uofloatArray[7] = f13;
       b.g.addRoundRect(b.l, uofloatArray, Path$Direction.CW);
       a = b.a;
       f1 = 2.00f;
       float f15 = (a != null)? a.a(i) / f1: 0;
       float[] uofloatArray1 = new float[i];
       float f16 = f6 + f15;
       uofloatArray1[0] = f16;
       uofloatArray1[1] = f16;
       f16 = f3 + f15;
       uofloatArray1[2] = f16;
       uofloatArray1[3] = f16;
       f16 = f14 + f15;
       uofloatArray1[4] = f16;
       uofloatArray1[5] = f16;
       f16 = f13 + f15;
       uofloatArray1[6] = f16;
       uofloatArray1[7] = f16;
       b.h.addRoundRect(b.m, uofloatArray1, Path$Direction.CW);
       ReactViewBackgroundDrawable j = b.j;
       k = b.n;
       float[] uofloatArray2 = new float[8];
       v10 = f6;
       float f17 = (f6 > 0)? f15: 0;
       uofloatArray2[0] = f5 + f17;
       f6 = (f6 > 0)? f15: 0;
       uofloatArray2[1] = f6 + f10;
       v5 = f3;
       f6 = (f3 > 0)? f15: 0;
       uofloatArray2[2] = f6 + f7;
       f3 = (f3 > 0)? f15: 0;
       uofloatArray2[3] = f3 + f8;
       v5 = f14;
       f6 = (f3 > 0)? f15: 0;
       uofloatArray2[4] = f6 + f9;
       f3 = (f3 > 0)? f15: 0;
       uofloatArray2[5] = f3 + f11;
       v5 = f13;
       f6 = (f3 > 0)? f15: 0;
       uofloatArray2[6] = f6 + f12;
       if (f3 <= 0) {
          f15 = 0;
       }
       uofloatArray2[7] = f15 + f;
       j.addRoundRect(k, uofloatArray2, Path$Direction.CW);
       if (b.o == null) {
          b.o = new PointF();
       }
       a = b.o;
       ReactViewBackgroundDrawable reactViewBac = a;
       j = b.k;
       RectF left = j.left;
       a.x = left;
       RectF top = j.top;
       a.y = top;
       a = b.l;
       ReactViewBackgroundDrawable.i((double)left, (double)top, (double)((f5 * 2.00f) + left), (double)((f10 * 2.00f) + top), (double)a.left, (double)a.top, (double)left, (double)top, reactViewBac);
       if (b.r == null) {
          b.r = new PointF();
       }
       a = b.r;
       reactViewBac = a;
       j = b.k;
       left = j.left;
       a.x = left;
       top = j.bottom;
       a.y = top;
       a = b.l;
       ReactViewBackgroundDrawable.i((double)left, (double)(top - (f * 2.00f)), (double)((f12 * 2.00f) + left), (double)top, (double)a.left, (double)a.bottom, (double)left, (double)top, reactViewBac);
       if (b.p == null) {
          b.p = new PointF();
       }
       a = b.p;
       reactViewBac = a;
       ReactViewBackgroundDrawable k1 = b.k;
       top = k1.right;
       a.x = top;
       rectF = k1.top;
       a.y = rectF;
       a = b.l;
       ReactViewBackgroundDrawable.i((double)(top - (f7 * 2.00f)), (double)rectF, (double)top, (double)((f8 * 2.00f) + rectF), (double)a.right, (double)a.top, (double)top, (double)rectF, reactViewBac);
       if (b.q == null) {
          b.q = new PointF();
       }
       a = b.q;
       reactViewBac = a;
       k1 = b.k;
       top = k1.right;
       a.x = top;
       rectF = k1.bottom;
       a.y = rectF;
       a = b.l;
       ReactViewBackgroundDrawable.i((double)(top - (f9 * 2.00f)), (double)(rectF - (f11 * 2.00f)), (double)top, (double)rectF, (double)a.right, (double)a.bottom, (double)top, (double)rectF, reactViewBac);
       return;
    }
}
