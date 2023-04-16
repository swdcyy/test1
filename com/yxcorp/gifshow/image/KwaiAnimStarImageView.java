package com.yxcorp.gifshow.image.KwaiAnimStarImageView;
import com.yxcorp.gifshow.image.KwaiAnimImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.util.Random;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.List;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiAnimStarImageView$a;
import java.lang.Float;
import java.lang.Math;
import android.graphics.Paint;

public class KwaiAnimStarImageView extends KwaiAnimImageView	// class@001943
{
    public Bitmap C;
    public List D;
    public Random E;
    public long F;

    public void KwaiAnimStarImageView(Context p0){
       super(p0, null);
    }
    public void KwaiAnimStarImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiAnimStarImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.E = new Random();
    }
    public void onDraw(Canvas p0){
       float f1;
       int i2;
       int i3;
       int i4;
       int i5;
       KwaiAnimStarImageView$a uoa3;
       float f2;
       float f3;
       int i6;
       KwaiAnimStarImageView$a n;
       double d1;
       double d2;
       long l = this;
       KwaiAnimStarImageView obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, l, KwaiAnimStarImageView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (!l.F - null) {
          l.F = System.nanoTime();
       }
       float f = (float)(System.nanoTime() - l.F) / 1000000000.00f;
       l.F = System.nanoTime();
       if (l.C != null) {
          KwaiAnimStarImageView d = l.D;
          if (d != null) {
             int i = d.size();
             int width = l.C.getWidth();
             int height = l.C.getHeight();
             int width1 = this.getWidth();
             int height1 = this.getHeight();
             int i1 = 0;
             KwaiAnimStarImageView$a uoa = 1;
             while (i1 < i) {
                KwaiAnimStarImageView$a uoa1 = l.D.get(i1);
                if (uoa1.o == null) {
                   KwaiAnimStarImageView$a uoa2 = KwaiAnimStarImageView$a.class;
                   if (PatchProxy.isSupport(uoa2) && PatchProxy.applyVoidOneRefs(Float.valueOf(f), uoa1, uoa2, "1")) {
                      f1 = f;
                      i2 = i;
                      i3 = width;
                      i4 = height;
                      i5 = i1;
                      uoa3 = uoa;
                   }else {
                      float f4 = Math.min(f, 0.05f);
                      float f5 = uoa1.d + f4;
                      uoa1.d = f5;
                      n = uoa1.n;
                      f1 = 0;
                      if (n - f1 > 0 && f5 - n >= 0) {
                         uoa1.o = true;
                      }
                      if (f5 - uoa1.e < 0) {
                         float f6 = uoa1.f * f4;
                         f3 = uoa1.c + f6;
                         uoa1.c = f3;
                         f6 = uoa1.g * f4;
                         f3 = uoa1.a + f6;
                         uoa1.a = f3;
                         f6 = uoa1.h * f4;
                         f3 = uoa1.b + f6;
                         uoa1.b = f3;
                         f1 = f;
                         i2 = i;
                         i3 = width;
                         i4 = height;
                         i5 = i1;
                         uoa3 = uoa;
                      }else if(!uoa1.i - f1 && !uoa1.j - f1){
                         uoa1.i = uoa1.a;
                         uoa1.j = uoa1.b;
                         uoa1.a();
                      }
                      n = uoa1.a;
                      KwaiAnimStarImageView$a k = uoa1.k;
                      v15 = n - k;
                      f1 = f;
                      if (f5) {
                         i5 = i1;
                         uoa3 = uoa;
                         d1 = (double)uoa1.g;
                         if (f5 > 0) {
                            i2 = i;
                            d2 = (double)n + d1;
                            uoa1.a = (d2 - (double)k < 0)? k: (float)d2;
                         }else {
                            i2 = i;
                            if (n - k < 0) {
                               d2 = (double)n + d1;
                               uoa1.a = (d2 - (double)k > 0)? k: (float)d2;
                            }
                         }
                      }else {
                         i2 = i;
                         i5 = i1;
                         uoa3 = uoa;
                      }
                      KwaiAnimStarImageView$a b = uoa1.b;
                      n = uoa1.l;
                      v11 = b - n;
                      if (d1) {
                         i3 = width;
                         i4 = height;
                         double d3 = (double)uoa1.h;
                         if (d1 > 0) {
                            d1 = (double)b + d3;
                            uoa1.b = (d1 - (double)n < 0)? n: (float)d1;
                         }else if(b - n < 0){
                            d1 = (double)b + d3;
                            uoa1.b = (d1 - (double)n > 0)? n: (float)d1;
                         }
                      }else {
                         i3 = width;
                         i4 = height;
                      }
                      f2 = uoa1.c + uoa1.f;
                      uoa1.c = f2;
                      b = uoa1.a;
                      if (!b - k) {
                         KwaiAnimStarImageView$a b1 = uoa1.b;
                         if (!b1 - n) {
                            if (!b - uoa1.i && !b1 - uoa1.j) {
                               uoa1.a();
                            }else if(PatchProxy.applyVoid(null, uoa1, uoa2, "3")){
                               b = uoa1.i;
                               uoa1.k = b;
                               n = uoa1.j;
                               uoa1.l = n;
                               f3 = n - uoa1.b;
                               f2 = b - uoa1.a;
                               d2 = Math.atan2((double)f3, (double)f2);
                               uoa1.m = d2;
                               float f7 = (float)Math.cos(d2) * uoa1.r;
                               uoa1.g = f7;
                               f2 = (float)Math.sin(d2) * uoa1.r;
                               uoa1.h = f2;
                               f2 = uoa1.q * (float)uoa1.p;
                               uoa1.f = f2;
                            }
                         }
                      }
                   label_01ae :
                      f3 = 0x3fa66666;
                      if (uoa1.c - f3 > 0) {
                         uoa1.c = f3;
                      }
                      f3 = 0.09f;
                      if (uoa1.c - f3 < 0) {
                         uoa1.c = f3;
                      }
                   }
                   uoa = (uoa1.o == null)? null: uoa3;
                   p0.save();
                   f2 = uoa1.a * (float)width1;
                   f3 = uoa1.b * (float)height1;
                   obj.translate(f2, f3);
                   obj.scale(uoa1.c, uoa1.c);
                   i6 = i3;
                   width = - i6;
                   width = width / 2;
                   height = i4;
                   int i7 = - height;
                   i7 = i7 / 2;
                   obj.drawBitmap(l.C, (float)width, (float)i7, null);
                   p0.restore();
                }else {
                   f1 = f;
                   i2 = i;
                   i6 = width;
                   i5 = i1;
                   uoa3 = uoa;
                }
                i1 = i5 + 1;
                i = i2;
                width = i6;
                f = f1;
             }
             l.postInvalidateDelayed(50);
             n = uoa;
          label_0211 :
             if (n != null) {
                obj = l.D;
                if (obj != null) {
                   obj.clear();
                }
                this.postInvalidate();
             }
             return;
          }
       }
       n = 1;
       goto label_0211 ;
    }
    public void setStarImage(Bitmap p0){
       this.C = p0;
    }
}
