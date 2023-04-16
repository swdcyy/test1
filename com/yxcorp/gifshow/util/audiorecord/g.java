package com.yxcorp.gifshow.util.audiorecord.g;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.lang.Math;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import com.yxcorp.gifshow.util.audiorecord.g$a;
import com.yxcorp.gifshow.util.audiorecord.g$c;
import android.graphics.Canvas;
import java.lang.Object;
import com.yxcorp.gifshow.util.audiorecord.g$b;
import java.lang.System;
import android.graphics.Rect;
import android.graphics.ColorFilter;

public class g extends Drawable	// class@001f5a
{
    public Paint a;
    public ArrayList b;
    public float c;
    public float d;
    public RectF e;
    public int f;
    public int g;
    public int h;
    public g$a i;
    public g$c j;
    public boolean k;
    public long l;

    public void g(){
       super();
       this.b = new ArrayList();
       this.c = 0x3f800000;
       this.d = Math.max((0x3f800000 / 360.00f), 0x3fcccccd);
       this.e = new RectF();
       Paint paint = new Paint(1);
       this.a = paint;
       paint.setStyle(Paint$Style.STROKE);
    }
    public g$a a(){
       if (this.i == null) {
          this.i = new g$a(this);
       }
       return this.i;
    }
    public g$c b(){
       if (this.j == null) {
          this.j = new g$c(this);
       }
       return this.j;
    }
    public void c(boolean p0){
       if (this.k == p0) {
          return;
       }
       this.k = p0;
       this.l = -1;
       this.invalidateSelf();
       return;
    }
    public void draw(Canvas p0){
       int i4;
       float f6;
       int i5;
       g c;
       float f8;
       Object obj;
       g og = this;
       float f = og.a.getStrokeWidth() / 2.00f;
       og.e.inset(f, f);
       og.a.setColor(og.h);
       p0.drawOval(og.e, og.a);
       og.a.setColor(og.f);
       g j = og.j;
       g$a uoa = null;
       float f1 = 360.00f;
       float f2 = (j == null)? 0: (j.a / 100.00f) * f1;
       int i = og.b.size();
       g og1 = null;
       int i1 = 0;
       float f3 = 0;
       float f4 = 90.00f;
       int i2 = 1;
       while (i1 < i) {
          float f5 = og.b.get(i1);
          if (og.k != null) {
             int i3 = i - 1;
             if (i1 == i3) {
                og.a.setColor(og.g);
                long l = System.currentTimeMillis();
                i4 = i1;
                if (!og.l - -1) {
                   og.l = l;
                }
                l = l - og.l;
                double d = (double)l * 0x401921fb54442d18;
                d = d / 0x408f400000000000;
                d = Math.cos(d) * 0x3fd0000000000000;
                d = d + 0x3fe8000000000000;
                f6 = (float)d;
                f6 = f6 * 0x437f0000;
                og.a.setAlpha((int)f6);
                i5 = 1;
             label_009c :
                f6 = f5.b + f5.c;
                f5.b = f6;
                f6 = Math.min(f6, f5.a);
                if (f6 - f5.a >= 0) {
                   i2 = 0;
                }
                f6 = f6 / 100.00f;
                f6 = f6 * f1;
                float f7 = f1 - f3;
                f7 = f7 - f5.d.c;
                f6 = Math.min(f6, f7);
                g$b d1 = f5.d;
                c = d1.c;
                if (f6 - c > 0 || !f3 - uoa) {
                   if (f3 - uoa > 0) {
                      f6 = f6 - c;
                      f8 = f3 + c;
                      float f9 = f8;
                      f8 = f6;
                      f6 = f9;
                   }else {
                      f8 = f6;
                      f6 = f3;
                   }
                   if (f2 - uoa > 0) {
                      float f10 = f2 - f6;
                      if (f10 - f8 < 0) {
                         d1.a.setAlpha(128);
                         d1 = f5.d;
                         float f11 = f6 - f4;
                         obj = f5;
                         p0.drawArc(d1.e, f11, f8, 0, d1.a);
                         int i6 = 255;
                         if (f10 - uoa > 0) {
                            obj.d.a.setAlpha(i6);
                            g$b d2 = obj.d;
                            i1 = 255;
                            p0.drawArc(d2.e, f11, f10, false, d2.a);
                         }else {
                            i1 = 255;
                         }
                         obj.d.a.setAlpha(i1);
                      }
                   }
                   obj = f5;
                   f5 = f6 - f4;
                   f7 = f5;
                   p0.drawArc(d1.e, f7, f8, 0, d1.a);
                }else {
                   obj = f5;
                }
                og1 = i5 | i2;
                f4 = obj.a / 100.00f;
                f4 = f4 * 360.00f;
                f3 = f3 + f4;
                i1 = i4 + 1;
                f1 = 360.00f;
             }
          }
          i4 = i1;
          i5 = og1;
          goto label_009c ;
       }
       if (og.i != null) {
          og.a.setColor(og.f);
          j = og.i;
          g$a a = j.a;
          if (a - uoa) {
             f6 = Math.min(a, (j.b + j.c.d));
             j.b = f6;
             f6 = (f6 / 100.00f) * 360.00f;
             g$a c1 = j.c;
             c = c1.c;
             if (f6 - c > 0) {
                if (f3 - uoa > 0) {
                   f6 = f6 - c;
                   f3 = f3 + c;
                }
                p0.drawArc(c1.e, (f3 - f4), f6, 0, c1.a);
             }
             if (j.b - j.a < 0) {
                j.c.invalidateSelf();
             }
          }
          og1 = 1;
       }
       if (og1) {
          this.invalidateSelf();
       }
       og.e.inset((- f), (- f));
       return;
    }
    public int getOpacity(){
       return -3;
    }
    public void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       float f = (float)p0.centerX();
       float f1 = (float)p0.centerY();
       float f2 = (float)Math.min(p0.width(), p0.height()) / 2.00f;
       float f3 = f - f2;
       float f4 = f1 - f2;
       this.e.set(f3, f4, (f + f2), (f1 + f2));
       float f5 = 2.00f / f2;
       f2 = (float)((double)(f5 * 180.00f) / 0x400921fb54442d18);
       this.c = f2;
       this.d = Math.max((f2 / 360.00f), 0x3fcccccd);
    }
    public void setAlpha(int p0){
    }
    public void setColorFilter(ColorFilter p0){
    }
}
