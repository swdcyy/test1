package com.contrarywind.view.CustomWheelView;
import com.contrarywind.view.WheelView;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.view.View;
import cw9.c;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import lnc.a1;
import java.lang.String;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.lang.Math;
import ia.a;
import java.lang.Object;
import com.contrarywind.view.WheelView$DividerType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class CustomWheelView extends WheelView	// class@000f80
{
    public int U0;
    public int V;
    public int V0;
    public int W;

    public void CustomWheelView(Context p0){
       super(p0, null);
    }
    public void CustomWheelView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.W = c.b(this.getResources(), 0x7f0710ea);
       this.V = (int)TypedValue.applyDimension(2, 16.00f, c.c(p0.getResources()));
       this.V0 = a1.e(16.00f);
    }
    public int getHeightOffsets(){
       return this.U0;
    }
    public final void l(String p0,Paint p1,boolean p2){
       Rect rect = new Rect();
       p1.getTextBounds(p0, 0, p0.length(), rect);
       int i = rect.width();
       CustomWheelView tW = (p2)? this.W: this.V;
       while (i > this.K) {
          tW--;
          p1.setTextSize((float)tW);
          p1.getTextBounds(p0, 0, p0.length(), rect);
          i = rect.width();
       }
       p1.setTextSize((float)tW);
       return;
    }
    public void onDraw(Canvas p0){
       int i5;
       int i6;
       float f2;
       WheelView a;
       float f3;
       float f4;
       float f10;
       float f11;
       WheelView wheelView = this;
       Canvas uCanvas = p0;
       if (wheelView.n == null) {
          return;
       }
       int i = 0;
       int i1 = 1;
       int i2 = Math.min(Math.max(i, wheelView.E), (wheelView.n.getItemsCount() - i1));
       wheelView.E = i2;
       Object[] objArray = new Object[wheelView.I];
       int i3 = (int)(wheelView.D / wheelView.t);
       try{
          wheelView.H = i3;
          wheelView.G = i2 + (i3 % wheelView.n.getItemsCount());
       }catch(java.lang.ArithmeticException e0){
       }
       if (e0.z == null) {
          if (e0.G < null) {
             e0.G = i;
          }
          if (e0.G > (e0.n.getItemsCount() - i1)) {
             e0.G = e0.n.getItemsCount() - i1;
          }
       }else if(e0.G < null){
          e0.G = e0.n.getItemsCount() + e0.G;
       }
       if (e0.G > (e0.n.getItemsCount() - i1)) {
          e0.G = e0.G - e0.n.getItemsCount();
       }
       float f = e0.D % e0.t;
       i2 = 0;
       WheelView i4 = e0.I;
       while (i2 < i4) {
          i3 = i4 / 2;
          i3 = i3 - i2;
          i5 = e0.G - i3;
          if (e0.z != null) {
             objArray[i2] = e0.n.getItem(e0.c(i5));
          }else {
             String str = "";
             if (i5 < 0) {
                objArray[i2] = str;
             }else {
                i6 = e0.n.getItemsCount() - i1;
                objArray[i2] = (i5 > i6)? str: e0.n.getItem(i5);
             }
          }
          i2 = i2 + 1;
       }
       double d = 0;
       if (e0.b == WheelView$DividerType.WRAP) {
          i2 = (TextUtils.isEmpty(e0.o))? (e0.K - e0.q) / 2: (e0.K - e0.q) / 4;
          float f1 = (float)(i2 - 12);
          f2 = (f1 - d <= 0)? 10.00f: f1;
          a = e0.A;
          Canvas uCanvas1 = p0;
          f3 = f2;
          f4 = (float)e0.K - f2;
          uCanvas1.drawLine(f3, a, f4, a, e0.m);
          a = e0.B;
          uCanvas1.drawLine(f3, a, f4, a, e0.m);
       }else {
          f3 = 0;
          a = e0.A;
          p0.drawLine(f3, a, (float)e0.K, a, e0.m);
          a = e0.B;
          p0.drawLine(f3, a, (float)e0.K, a, e0.m);
       }
       if (!TextUtils.isEmpty(e0.o) && e0.h != null) {
          uCanvas.drawText(e0.o, ((float)(e0.K - e0.d(e0.l, e0.o)) - e0.T), e0.C, e0.l);
       }
       i2 = 0;
       while (i2 < e0.I) {
          p0.save();
          f3 = e0.t * (float)i2;
          f3 = f3 - f;
          f3 = f3 / (float)e0.L;
          double d1 = (double)f3;
          double d2 = d1 / 0x400921fb54442d18;
          d2 = d2 * 180.00f;
          double d3 = 90.00f - d2;
          f4 = (float)d3;
          float f5 = 90.00f;
          if (f4 - f5 >= 0 || f4 - 0xc2b40000 <= 0) {
             p0.restore();
          }else {
             float f6 = Math.abs(f4) / f5;
             f5 = (float)Math.pow((double)f6, 2.20f);
             String str1 = (e0.h == null && (!TextUtils.isEmpty(e0.o) && !TextUtils.isEmpty(e0.b(objArray[i2]))))? e0.b(objArray[i2])+e0.o: e0.b(objArray[i2]);
             e0.l(str1, e0.l, i1);
             e0.l(str1, e0.k, i);
             e0.h(str1);
             e0.i(str1);
             double d4 = Math.cos(d1) * (double)e0.L;
             d2 = (double)e0.L - d4;
             double d5 = Math.sin(d1) * (double)e0.r;
             d5 = d5 / 2.00f;
             d2 = d2 - d5;
             float f7 = (float)d2;
             i1 = e0.V0 * -1;
             uCanvas.translate((float)i1, f7);
             WheelView a1 = e0.A;
             f2 = 0x3f4ccccd;
             float f8 = 0x3f800000;
             if (f7 - a1 <= 0) {
                float f9 = (float)e0.r + f7;
                if (f9 - a1 >= 0) {
                   p0.save();
                   f5 = e0.A - f7;
                   uCanvas.clipRect(0, 0, (float)e0.K, f5);
                   f4 = (float)Math.sin(d1) * f2;
                   uCanvas.scale(f8, f4);
                   i6 = e0.S + e0.V0;
                   uCanvas.drawText(str1, (float)i6, (float)e0.r, e0.k);
                   p0.restore();
                   p0.save();
                   f4 = e0.A - f7;
                   uCanvas.clipRect(0, f4, (float)e0.K, (float)(int)e0.t);
                   f3 = (float)Math.sin(d1) * f8;
                   uCanvas.scale(f8, f3);
                   i3 = e0.R + e0.V0;
                   f10 = (float)e0.r - e0.T;
                   uCanvas.drawText(str1, (float)i3, f10, e0.l);
                   p0.restore();
                }else {
                label_025f :
                   WheelView b = e0.B;
                   if (f7 - b <= 0) {
                      f11 = (float)e0.r + f7;
                      if (f11 - b >= 0) {
                         p0.save();
                         f5 = e0.B - f7;
                         uCanvas.clipRect(0, 0, (float)e0.K, f5);
                         f4 = (float)Math.sin(d1) * f8;
                         uCanvas.scale(f8, f4);
                         i6 = e0.R + e0.V0;
                         f5 = (float)e0.r - e0.T;
                         uCanvas.drawText(str1, (float)i6, f5, e0.l);
                         p0.restore();
                         p0.save();
                         f4 = e0.B - f7;
                         uCanvas.clipRect(0, f4, (float)e0.K, (float)(int)e0.t);
                         f3 = (float)Math.sin(d1) * f2;
                         uCanvas.scale(f8, f3);
                         i3 = e0.S + e0.V0;
                         uCanvas.drawText(str1, (float)i3, (float)e0.r, e0.k);
                         p0.restore();
                      }
                   }
                   if (f7 - a1 >= 0) {
                      a1 = e0.r;
                      f11 = (float)a1 + f7;
                      if (f11 - b <= 0) {
                         f3 = (float)a1 - e0.T;
                         i5 = e0.R + e0.V0;
                         uCanvas.drawText(str1, (float)i5, f3, e0.l);
                         i5 = e0.I / 2;
                         i5 = i5 - i2;
                         i3 = e0.G - i5;
                         e0.F = i3;
                      }
                   }
                   p0.save();
                   uCanvas.clipRect(0, 0, e0.K, (int)e0.t);
                   f3 = (float)Math.sin(d1) * f2;
                   uCanvas.scale(f8, f3);
                   i4 = e0.k;
                   WheelView s = e0.s;
                   if (s == null) {
                      i5 = 0;
                   }else if(s > null){
                      i5 = 1;
                   }else {
                      i5 = -1;
                   }
                   f7 = 0;
                   int i7 = (f4 - f7 > 0)? -1: 1;
                   i5 = i5 * i7;
                   f10 = (float)i5 * 0x3f000000;
                   f10 = f10 * f5;
                   i4.setTextSkewX(f10);
                   f8 = f8 - f5;
                   f8 = f8 * 0x437f0000;
                   e0.k.setAlpha((int)f8);
                   f10 = (float)e0.s * f5;
                   f3 = (float)e0.S + f10;
                   f3 = f3 + (float)e0.V0;
                   uCanvas.drawText(str1, f3, (float)e0.r, e0.k);
                   p0.restore();
                label_0349 :
                   p0.restore();
                   e0.l.setTextSize((float)e0.W);
                }
             }else {
                goto label_025f ;
             }
             d = 0;
             goto label_0349 ;
          }
          i2 = i2 + 1;
          i = false;
          i1 = true;
          d = 0;
       }
       return;
    }
    public void setCenterTextSize(float p0){
       super.setCenterTextSize(p0);
       if (p0 > 0) {
          int i = (int)p0;
          this.W = i;
          this.l.setTextSize((float)i);
       }
       return;
    }
    public void setHeightOffsets(int p0){
       this.U0 = p0;
    }
    public void setItemHeight(float p0){
       this.t = p0;
    }
    public void setOuterTextSize(float p0){
       super.setOuterTextSize(p0);
       if (p0 > 0) {
          int i = (int)p0;
          this.V = i;
          this.k.setTextSize((float)i);
       }
       return;
    }
}
