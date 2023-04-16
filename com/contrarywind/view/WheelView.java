package com.contrarywind.view.WheelView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import android.graphics.Typeface;
import android.content.res.Resources;
import cw9.c;
import android.util.DisplayMetrics;
import ll8.c$b;
import android.content.res.TypedArray;
import la.b;
import android.view.GestureDetector;
import ka.a;
import android.view.GestureDetector$OnGestureListener;
import android.graphics.Paint;
import java.util.concurrent.ScheduledFuture;
import java.lang.Object;
import java.lang.String;
import ja.a;
import java.lang.Integer;
import java.util.Locale;
import ia.a;
import java.lang.Math;
import android.os.Handler;
import android.graphics.Rect;
import android.view.View$MeasureSpec;
import com.contrarywind.view.WheelView$ACTION;
import la.c;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import android.graphics.Canvas;
import com.contrarywind.view.WheelView$DividerType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.view.MotionEvent;
import java.lang.System;
import ka.b;

public class WheelView extends View	// class@000f83
{
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public final float U;
    public WheelView$DividerType b;
    public Context c;
    public Handler d;
    public GestureDetector e;
    public b f;
    public boolean g;
    public boolean h;
    public ScheduledExecutorService i;
    public ScheduledFuture j;
    public Paint k;
    public Paint l;
    public Paint m;
    public a n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public Typeface u;
    public int v;
    public int w;
    public int x;
    public float y;
    public boolean z;

    public void WheelView(Context p0){
       super(p0, null);
    }
    public void WheelView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = false;
       this.h = true;
       this.i = Executors.newSingleThreadScheduledExecutor();
       this.u = Typeface.MONOSPACE;
       this.y = 0x3fcccccd;
       this.I = 11;
       this.M = 0;
       this.N = 0;
       this.O = 0;
       int i = 17;
       this.Q = i;
       this.R = 0;
       this.S = 0;
       this.U = 0x3f000000;
       this.p = c.b(this.getResources(), 0x7f0710ea);
       DisplayMetrics density = c.c(this.getResources()).density;
       int i1 = 0x3f800000;
       if (density - i1 < 0) {
          this.T = 2.40f;
       }else {
          int i2 = 0x40000000;
          v5 = i1 - density;
          if (i1 <= 0 && density - i2 < 0) {
             this.T = 3.60f;
          }else if(i1 <= 0 && density - i2 < 0){
             this.T = 4.50f;
          }else {
             i1 = 0x40400000;
             if (i2 - density <= 0 && density - i1 < 0) {
                this.T = 6.00f;
             }else if(density - i1 >= 0){
                this.T = density * 2.50f;
             }
          }
       }
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o2, false, false);
          this.Q = typedArray.getInt(false, i);
          this.v = typedArray.getColor(4, -5723992);
          this.w = typedArray.getColor(3, -14013910);
          this.x = typedArray.getColor(true, -2763307);
          this.p = typedArray.getDimensionPixelOffset(5, this.p);
          this.y = typedArray.getFloat(2, this.y);
          typedArray.recycle();
       }
       this.g();
       this.c = p0;
       this.d = new b(this);
       GestureDetector gestureDetec = new GestureDetector(p0, new a(this));
       this.e = gestureDetec;
       gestureDetec.setIsLongpressEnabled(false);
       this.z = true;
       this.D = 0;
       this.E = -1;
       Paint paint = new Paint();
       this.k = paint;
       paint.setColor(this.v);
       this.k.setAntiAlias(true);
       this.k.setTypeface(this.u);
       this.k.setTextSize((float)this.p);
       paint = new Paint();
       this.l = paint;
       paint.setColor(this.w);
       this.l.setAntiAlias(true);
       this.l.setTypeface(this.u);
       this.l.setTextSize((float)this.p);
       paint = new Paint();
       this.m = paint;
       paint.setColor(this.x);
       this.m.setAntiAlias(true);
       this.setLayerType(true, null);
       return;
    }
    public void a(){
       WheelView tj = this.j;
       if (tj != null && !tj.isCancelled()) {
          this.j.cancel(true);
          this.j = null;
       }
       return;
    }
    public String b(Object p0){
       if (p0 == null) {
          return "";
       }
       if (p0 instanceof a) {
          return p0.getPickerViewText();
       }
       if (!p0 instanceof Integer) {
          return p0.toString();
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0.intValue())};
       return String.format(Locale.getDefault(), "%02d", objArray);
    }
    public int c(int p0){
       if (p0 < 0) {
          p0 = this.c((p0 + this.n.getItemsCount()));
       }else if(p0 > (this.n.getItemsCount() - 1)){
          p0 = this.c((p0 - this.n.getItemsCount()));
       }
       return p0;
    }
    public int d(Paint p0,String p1){
       int i = 0;
       if (p1 != null && p1.length() > 0) {
          int i1 = p1.length();
          float[] uofloatArray = new float[i1];
          p0.getTextWidths(p1, uofloatArray);
          int i2 = 0;
          for (; i < i1; i = i + 1) {
             i2 = i2 + (int)Math.ceil((double)uofloatArray[i]);
          }
          i = i2;
       }
       return i;
    }
    public void e(boolean p0){
       this.h = p0;
    }
    public boolean f(){
       return this.z;
    }
    public final void g(){
       WheelView ty = this.y;
       float f = 0x3f800000;
       if (ty - f < 0) {
          this.y = f;
       }else if(ty - 4.00f > 0){
          this.y = 4.00f;
       }
       return;
    }
    public final a getAdapter(){
       return this.n;
    }
    public final int getCurrentItem(){
       WheelView tn = this.n;
       if (tn == null) {
          return 0;
       }
       if (this.z != null) {
          WheelView tF = this.F;
          if (tF < null || tF >= tn.getItemsCount()) {
             return Math.max(0, Math.min(Math.abs((Math.abs(this.F) - this.n.getItemsCount())), (this.n.getItemsCount() - 1)));
          }
       }
       return Math.max(0, Math.min(this.F, (this.n.getItemsCount() - 1)));
    }
    public Handler getHandler(){
       return this.d;
    }
    public int getInitPosition(){
       return this.E;
    }
    public float getItemHeight(){
       return this.t;
    }
    public int getItemsCount(){
       WheelView tn = this.n;
       int itemsCount = (tn != null)? tn.getItemsCount(): 0;
       return itemsCount;
    }
    public int getItemsVisible(){
       return this.I;
    }
    public float getTotalScrollY(){
       return this.D;
    }
    public void h(String p0){
       Rect rect = new Rect();
       this.l.getTextBounds(p0, 0, p0.length(), rect);
       WheelView tQ = this.Q;
       if (tQ != 3) {
          if (tQ != 5) {
             if (tQ == 17) {
                if (this.g == null) {
                   tQ = this.o;
                   if (tQ == null || (!tQ.equals("") && this.h != null)) {
                      this.R = (int)((double)(this.K - rect.width()) * 0x3fd0000000000000);
                   }
                }
                this.R = (int)((double)(this.K - rect.width()) * 0x3fe0000000000000);
             }
          }else {
             this.R = (this.K - rect.width()) - (int)this.T;
          }
       }else {
          this.R = 0;
       }
       return;
    }
    public void i(String p0){
       Rect rect = new Rect();
       this.k.getTextBounds(p0, 0, p0.length(), rect);
       WheelView tQ = this.Q;
       if (tQ != 3) {
          if (tQ != 5) {
             if (tQ == 17) {
                if (this.g == null) {
                   tQ = this.o;
                   if (tQ == null || (!tQ.equals("") && this.h != null)) {
                      this.S = (int)((double)(this.K - rect.width()) * 0x3fd0000000000000);
                   }
                }
                this.S = (int)((double)(this.K - rect.width()) * 0x3fe0000000000000);
             }
          }else {
             this.S = (this.K - rect.width()) - (int)this.T;
          }
       }else {
          this.S = 0;
       }
       return;
    }
    public final void j(){
       if (this.n == null) {
          return;
       }
       Rect rect = new Rect();
       for (int i = 0; i < this.n.getItemsCount(); i = i + 1) {
          String str = this.b(this.n.getItem(i));
          this.l.getTextBounds(str, 0, str.length(), rect);
          int i1 = rect.width();
          if (i1 > this.q) {
             this.q = i1;
          }
          this.l.getTextBounds("ÐÇÆÚ", 0, 2, rect);
          i1 = rect.height() + 2;
          this.r = i1;
       }
       if (this.t - null <= 0) {
          this.t = this.y * (float)this.r;
       }
       int i2 = (int)(this.t * (float)(this.I - 1));
       this.J = (int)((double)(i2 * 2) / 0x400921fb54442d18);
       this.L = (int)((double)i2 / 0x400921fb54442d18);
       this.K = View$MeasureSpec.getSize(this.P);
       WheelView tJ = this.J;
       WheelView tt = this.t;
       this.A = ((float)tJ - tt) / 2.00f;
       float f = ((float)tJ + tt) / 2.00f;
       this.B = f;
       this.C = (f - ((tt - (float)this.r) / 2.00f)) - this.T;
       if (this.E == -1) {
          this.E = (this.z != null)? (this.n.getItemsCount() + 1) / 2: 0;
       }
    label_00a8 :
       this.G = this.E;
       return;
    }
    public void k(WheelView$ACTION p0){
       this.a();
       if (p0 == WheelView$ACTION.FLING || p0 == WheelView$ACTION.DAGGLE) {
          WheelView tt = this.t;
          int i = (int)(((this.D % tt) + tt) % tt);
          this.M = i;
          this.M = ((float)i - (tt / 2.00f) > 0)? (int)(tt - (float)i): - i;
       }
    label_0027 :
       this.j = this.i.scheduleWithFixedDelay(new c(this, this.M), 0, 10, TimeUnit.MILLISECONDS);
       return;
    }
    public void onDraw(Canvas p0){
       int i5;
       float f2;
       WheelView a;
       float f3;
       float f4;
       float f9;
       WheelView wheelView1;
       float f10;
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
                int i6 = e0.n.getItemsCount() - i1;
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
             f5 = (float)Math.pow((double)(Math.abs(f4) / f5), 2.20f);
             String str1 = (e0.h == null && (!TextUtils.isEmpty(e0.o) && !TextUtils.isEmpty(e0.b(objArray[i2]))))? e0.b(objArray[i2])+e0.o: e0.b(objArray[i2]);
             Rect rect = new Rect();
             e0.l.getTextBounds(str1, i, str1.length(), rect);
             int i7 = rect.width();
             WheelView p = e0.p;
             while (i7 > e0.K) {
                p = p - 1;
                e0.l.setTextSize((float)p);
                e0.l.getTextBounds(str1, i, str1.length(), rect);
                i7 = rect.width();
             }
             e0.k.setTextSize((float)p);
             e0.h(str1);
             e0.i(str1);
             double d4 = Math.cos(d1) * (double)e0.L;
             d2 = (double)e0.L - d4;
             double d5 = Math.sin(d1) * (double)e0.r;
             d5 = d5 / 2.00f;
             d2 = d2 - d5;
             float f6 = (float)d2;
             uCanvas.translate(0, f6);
             WheelView a1 = e0.A;
             float f7 = 0x3f4ccccd;
             f2 = 0x3f800000;
             if (f6 - a1 <= 0) {
                float f8 = (float)e0.r + f6;
                if (f8 - a1 >= 0) {
                   p0.save();
                   f5 = e0.A - f6;
                   uCanvas.clipRect(0, 0, (float)e0.K, f5);
                   f4 = (float)Math.sin(d1) * f7;
                   uCanvas.scale(f2, f4);
                   uCanvas.drawText(str1, (float)e0.S, (float)e0.r, e0.k);
                   p0.restore();
                   p0.save();
                   f4 = e0.A - f6;
                   uCanvas.clipRect(0, f4, (float)e0.K, (float)(int)e0.t);
                   f3 = (float)Math.sin(d1) * f2;
                   uCanvas.scale(f2, f3);
                   f9 = (float)e0.r - e0.T;
                   uCanvas.drawText(str1, (float)e0.R, f9, e0.l);
                   p0.restore();
                }else {
                label_027f :
                   wheelView1 = e0.B;
                   if (f6 - wheelView1 <= 0) {
                      f10 = (float)e0.r + f6;
                      if (f10 - wheelView1 >= 0) {
                         p0.save();
                         f5 = e0.B - f6;
                         uCanvas.clipRect(0, 0, (float)e0.K, f5);
                         f4 = (float)Math.sin(d1) * f2;
                         uCanvas.scale(f2, f4);
                         f5 = (float)e0.r - e0.T;
                         uCanvas.drawText(str1, (float)e0.R, f5, e0.l);
                         p0.restore();
                         p0.save();
                         f4 = e0.B - f6;
                         uCanvas.clipRect(0, f4, (float)e0.K, (float)(int)e0.t);
                         f3 = (float)Math.sin(d1) * f7;
                         uCanvas.scale(f2, f3);
                         uCanvas.drawText(str1, (float)e0.S, (float)e0.r, e0.k);
                         p0.restore();
                      }
                   }
                   if (f6 - a1 >= 0) {
                      a1 = e0.r;
                      f10 = (float)a1 + f6;
                      if (f10 - wheelView1 <= 0) {
                         f3 = (float)a1 - e0.T;
                         uCanvas.drawText(str1, (float)e0.R, f3, e0.l);
                         i5 = e0.I / 2;
                         i5 = i5 - i2;
                         i3 = e0.G - i5;
                         e0.F = i3;
                      }
                   }
                   p0.save();
                   uCanvas.clipRect(0, 0, e0.K, (int)e0.t);
                   f3 = (float)Math.sin(d1) * f7;
                   uCanvas.scale(f2, f3);
                   i4 = e0.k;
                   WheelView s = e0.s;
                   int i8 = -1;
                   if (s == null) {
                      i5 = 0;
                   }else if(s > null){
                      i5 = 1;
                   }else {
                      i5 = -1;
                   }
                   f6 = 0;
                   if (f4 - f6 <= 0) {
                      i8 = 1;
                   }
                   i5 = i5 * i8;
                   f9 = (float)i5 * 0x3f000000;
                   f9 = f9 * f5;
                   i4.setTextSkewX(f9);
                   f2 = f2 - f5;
                   f2 = f2 * 0x437f0000;
                   e0.k.setAlpha((int)f2);
                   f9 = (float)e0.s * f5;
                   f3 = (float)e0.S + f9;
                   uCanvas.drawText(str1, f3, (float)e0.r, e0.k);
                   p0.restore();
                label_035c :
                   p0.restore();
                   e0.l.setTextSize((float)e0.p);
                }
             }else {
                goto label_027f ;
             }
             wheelView1 = null;
             goto label_035c ;
          }
          i2 = i2 + 1;
          i = 0;
          d = 0;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       this.P = p0;
       this.j();
       this.setMeasuredDimension(this.K, this.J);
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b = this.e.onTouchEvent(p0);
       float f = (float)(- this.E) * this.t;
       float f1 = (float)((this.n.getItemsCount() - 1) - this.E) * this.t;
       int action = p0.getAction();
       int i = 0;
       if (action) {
          int i1 = 2;
          if (action != i1) {
             if (!b) {
                WheelView tL = this.L;
                WheelView tt = this.t;
                this.M = (int)(((float)((int)(((Math.acos((double)(((float)tL - p0.getY()) / (float)tL)) * (double)this.L) + (double)(tt / 2.00f)) / (double)tt) - (this.I / i1)) * tt) - (((this.D % tt) + tt) % tt));
                if ((System.currentTimeMillis() - this.O) - 120 > 0) {
                   this.k(WheelView$ACTION.DAGGLE);
                }else {
                   this.k(WheelView$ACTION.CLICK);
                }
             }
          }else {
             float f2 = this.N - p0.getRawY();
             this.N = p0.getRawY();
             float f3 = this.D + f2;
             this.D = f3;
             if (this.z == null) {
                WheelView tt1 = this.t;
                if ((f3 - (tt1 * 0.25f)) - f >= 0 || (f2 < 0 || (((tt1 * 0.25f) + f3) - f1 > 0 && f2 > 0))) {
                   this.D = f3 - f2;
                   i = 1;
                }
             }
          }
       }else {
          this.O = System.currentTimeMillis();
          this.a();
          this.N = p0.getRawY();
       }
       if (!i && p0.getAction()) {
          this.invalidate();
       }
       return 1;
    }
    public final void setAdapter(a p0){
       this.n = p0;
       this.j();
       this.invalidate();
    }
    public void setCenterTextSize(float p0){
       if (p0 > 0) {
          this.l.setTextSize(p0);
       }
       return;
    }
    public final void setCurrentItem(int p0){
       this.F = p0;
       this.E = p0;
       this.D = 0;
       this.invalidate();
    }
    public final void setCyclic(boolean p0){
       this.z = p0;
    }
    public void setDividerColor(int p0){
       this.x = p0;
       this.m.setColor(p0);
    }
    public void setDividerType(WheelView$DividerType p0){
       this.b = p0;
    }
    public void setGravity(int p0){
       this.Q = p0;
    }
    public void setIsOptions(boolean p0){
       this.g = p0;
    }
    public void setItemsVisible(int p0){
       this.I = p0;
    }
    public void setLabel(String p0){
       this.o = p0;
    }
    public void setLineSpacingMultiplier(float p0){
       if (p0) {
          this.y = p0;
          this.g();
       }
       return;
    }
    public final void setOnItemSelectedListener(b p0){
       this.f = p0;
    }
    public void setOuterTextSize(float p0){
       if (p0 > 0) {
          this.k.setTextSize(p0);
       }
       return;
    }
    public void setTextColorCenter(int p0){
       this.w = p0;
       this.l.setColor(p0);
    }
    public void setTextColorOut(int p0){
       this.v = p0;
       this.k.setColor(p0);
    }
    public final void setTextSize(float p0){
       if (p0 > 0) {
          int i = (int)p0;
          this.p = i;
          this.k.setTextSize((float)i);
          this.l.setTextSize((float)this.p);
       }
       return;
    }
    public void setTextXOffset(int p0){
       this.s = p0;
       if (p0) {
          this.l.setTextScaleX(0x3f800000);
       }
       return;
    }
    public void setTotalScrollY(float p0){
       this.D = p0;
    }
    public final void setTypeface(Typeface p0){
       this.u = p0;
       this.k.setTypeface(p0);
       this.l.setTypeface(this.u);
    }
}
