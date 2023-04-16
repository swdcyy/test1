package com.yxcorp.gifshow.widget.record.ArcScaleView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.text.TextPaint;
import android.graphics.Typeface;
import android.graphics.Paint$Style;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.widget.record.ArcScaleView$b;
import android.os.Handler;
import android.os.Message;
import java.lang.Integer;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.PathMeasure;
import com.yxcorp.gifshow.widget.record.ArcScaleView$c;
import android.graphics.Rect;
import lnc.a1;
import android.graphics.Paint$Align;
import android.view.MotionEvent;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.widget.record.ArcScaleView$a;

public class ArcScaleView extends View	// class@0019ad
{
    public int A;
    public int B;
    public int C;
    public int D;
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
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final int U0;
    public int V;
    public final int V0;
    public ArcScaleView$b W;
    public ArcScaleView$a W0;
    public ObjectAnimator X0;
    public ObjectAnimator Y0;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public double i;
    public Path j;
    public Paint k;
    public TextPaint l;
    public TextPaint m;
    public Paint n;
    public Paint o;
    public Paint p;
    public Paint q;
    public ArcScaleView$c r;
    public String s;
    public float t;
    public int u;
    public int v;
    public final int w;
    public final int x;
    public final int y;
    public float z;

    public void ArcScaleView(Context p0){
       super(p0, null);
    }
    public void ArcScaleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ArcScaleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = 10;
       this.g = p2;
       this.h = 0;
       this.s = "X";
       this.t = 0x3f800000;
       this.u = 30;
       this.v = 1;
       this.w = 215;
       this.x = -35;
       this.y = -110;
       this.z = 50.00f;
       this.A = 1;
       this.B = this.getResources().getColor(0x7f0606d1);
       this.C = this.getResources().getColor(0x7f0606d4);
       this.D = this.getResources().getColor(0x7f0606d2);
       this.E = this.getResources().getColor(0x7f0606d2);
       this.F = this.getResources().getColor(0x7f0606d5);
       this.G = 40;
       this.H = 42;
       this.I = 100;
       this.J = 75;
       this.K = -1;
       this.L = 9;
       this.M = 3;
       this.N = 0;
       this.O = p2;
       this.P = -500;
       this.S = 215;
       this.T = 215;
       this.U = 1;
       this.V = 1000;
       this.U0 = 1;
       this.V0 = 3000;
       this.X0 = null;
       this.Y0 = null;
       this.setClickable(1);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ArcScaleView.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.u);
          String str = typedArray.getString(p2);
          this.s = str;
          if (str == null) {
             this.s = "";
          }
          this.t = typedArray.getFloat(3, 0x3f800000);
          this.u = typedArray.getInt(7, 30);
          this.v = typedArray.getInt(8, 1);
          this.S = typedArray.getInt(6, 30);
          this.A = typedArray.getInt(1, 1);
          this.B = typedArray.getColor(5, -1);
          this.D = typedArray.getColor(9, -1);
          this.E = typedArray.getColor(11, -1);
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, this, ArcScaleView.class, "3")) {
          this.j = new Path();
          this.I = (int)this.getResources().getDimension(0x7f07012d);
          this.G = (int)this.getResources().getDimension(0x7f070132);
          this.H = (int)this.getResources().getDimension(0x7f070133);
          this.J = (int)this.getResources().getDimension(0x7f07012f);
          this.L = (int)this.getResources().getDimension(0x7f07012e);
          this.M = (int)this.getResources().getDimension(0x7f07012c);
          this.V = (int)this.getResources().getDimension(0x7f070134);
       }
       if (!PatchProxy.applyVoid(null, this, ArcScaleView.class, "2")) {
          Paint paint = new Paint(1);
          this.k = paint;
          paint.setColor(this.B);
          this.k.setStrokeCap(Paint$Cap.ROUND);
          TextPaint textPaint = new TextPaint(1);
          this.l = textPaint;
          textPaint.setColor(this.D);
          this.l.setTypeface(Typeface.SANS_SERIF);
          this.l.setTextSize(this.getResources().getDimension(R.dimen.arg_RES_7f070130));
          textPaint = new TextPaint(1);
          this.m = textPaint;
          textPaint.setTypeface(Typeface.SANS_SERIF);
          this.m.setColor(this.E);
          this.m.setTextSize(this.getResources().getDimension(R.dimen.arg_RES_7f070130));
          paint = new Paint();
          this.n = paint;
          paint.setFlags(1);
          this.n.setStrokeCap(Paint$Cap.ROUND);
          this.n.setColor(this.C);
          this.n.setStrokeWidth(18.00f);
          paint = new Paint();
          this.o = paint;
          paint.setFlags(1);
          this.o.setStrokeCap(Paint$Cap.ROUND);
          this.o.setColor(this.F);
          this.o.setStyle(Paint$Style.STROKE);
          this.o.setStrokeWidth(this.getResources().getDimension(R.dimen.arg_RES_7f070131));
          paint = new Paint();
          this.p = paint;
          paint.setFlags(1);
          paint = new Paint();
          this.q = paint;
          paint.setFlags(1);
       }
       this.d();
       this.setSelectValue(this.U);
       return;
    }
    public final double a(double p0){
       return ((p0 * 180.00f) / 0x400921fb54442d18);
    }
    public final double b(float p0,float p1){
       if (PatchProxy.isSupport(ArcScaleView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ArcScaleView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       double d = (double)(p1 - (float)(this.e + this.P));
       return this.a(Math.asin((d / Math.sqrt((Math.pow((double)(p0 - (float)this.d), 2.00f) + Math.pow(d, 2.00f))))));
    }
    public final String c(float p0,boolean p1){
       if (PatchProxy.isSupport(ArcScaleView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, ArcScaleView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1) {
          return (int)(((this.z - (p0 - 215.00f)) + (float)this.O) / 10.00f)+this.s;
       }else {
          return (((this.z - (p0 - 215.00f)) + (float)this.O) / 10.00f)+this.s;
       }
    }
    public final void d(){
       this.S = 215;
       ArcScaleView tz = this.z;
       this.T = (int)tz + 215;
       ArcScaleView tu = this.u;
       this.Q = (tu / 2) - 0;
       this.R = (int)tz - (tu / 2);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, ArcScaleView.class, "16")) {
          return;
       }
       if (this.W == null) {
          this.W = new ArcScaleView$b(this);
       }
       ArcScaleView tW = this.W;
       if (tW != null) {
          tW.removeMessages(1);
          this.W.sendMessageDelayed(this.W.obtainMessage(1), 3000);
       }
       return;
    }
    public void f(int p0){
       if (PatchProxy.isSupport(ArcScaleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ArcScaleView.class, "18")) {
          return;
       }
       this.g(p0, true);
       return;
    }
    public void g(int p0,boolean p1){
       if (PatchProxy.isSupport(ArcScaleView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ArcScaleView.class, "19")) {
          return;
       }
       this.U = p0;
       if (p1) {
          this.setSelectValue(p0);
       }
       return;
    }
    public int getMaxSupportZoom(){
       return (int)this.z;
    }
    public float getViewHeight(){
       return (float)this.c;
    }
    public void onDraw(Canvas p0){
       ArcScaleView uArcScaleVie;
       int b;
       int i2;
       int i3;
       float f1;
       String str2;
       float f7;
       ArcScaleView h;
       int i8;
       float f8;
       ArcScaleView i10;
       ArcScaleView d3;
       int i11;
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, ArcScaleView.class, "5")) {
          return;
       }
       String str = 0x3f800000;
       int i1 = 0;
       if (!PatchProxy.applyVoidOneRefs(obj, i, ArcScaleView.class, "9")) {
          i10 = i.I;
          uArcScaleVie = i.J;
          b = i10 - uArcScaleVie;
          d3 = i.f;
          i11 = ((d3 * 2) - i10) + uArcScaleVie;
          i10 = i.d;
          i3 = (i10 - d3) - uArcScaleVie;
          i2 = (i10 + d3) + uArcScaleVie;
          Path path = new Path();
          path.reset();
          f8 = (float)i3;
          float f9 = (float)i2;
          f1 = (float)i11;
          path.addArc(new RectF(f8, (float)b, f9, f1), i1, -180.00f);
          path.lineTo(f8, f1);
          path.lineTo(f9, f1);
          path.lineTo(f9, (float)(b + i11));
          i.p.setColor(0x1a000000);
          i.q.setStrokeWidth(str);
          i.q.setColor(0x3affffff);
          i.q.setStyle(Paint$Style.STROKE);
          obj.drawPath(path, i.p);
          obj.drawPath(path, i.q);
       }
       if (!PatchProxy.applyVoidOneRefs(obj, i, ArcScaleView.class, "8")) {
          i10 = i.I;
          uArcScaleVie = i.f;
          b = (uArcScaleVie * 2) - i10;
          d3 = i.d;
          i11 = d3 - uArcScaleVie;
          int i12 = d3 + uArcScaleVie;
          i.j.reset();
          i.j.addArc(new RectF((float)i11, (float)i10, (float)i12, (float)b), -35.00f, -110.00f);
       }
       uArcScaleVie = 2;
       b = false;
       if (!PatchProxy.applyVoidOneRefs(obj, i, ArcScaleView.class, "7")) {
          PathMeasure pathMeasure = new PathMeasure();
          pathMeasure.setPath(i.j, b);
          float[] uofloatArray = new float[uArcScaleVie];
          float[] uofloatArray1 = new float[uArcScaleVie];
          i3 = 1;
          int i4 = 1;
          ArcScaleView u = i.u;
          while (i4 <= u) {
             float f = (float)i4 / (float)u;
             f1 = pathMeasure.getLength() * f;
             pathMeasure.getPosTan(f1, uofloatArray, uofloatArray1);
             double d = i.a(Math.atan2((double)uofloatArray1[i3], (double)uofloatArray1[b])) + 90.00f;
             float f2 = i.h + (float)i.S;
             int i5 = i.v * i4;
             f2 = f2 + (float)i5;
             float f3 = (float)Math.round(f2);
             v15 = f3 - (float)i.S;
             if (f2 >= 0) {
                float f4 = f3 % (float)i.A;
                v13 = f4 - i1;
                if (!f4) {
                   float f5 = (float)i.T;
                   if (f3 - f5 <= 0) {
                      i1 = uofloatArray[b];
                      int i6 = uofloatArray[i3];
                      if (!f2 || !f3 - f5) {
                         i.k.setStrokeWidth(15.00f);
                         i.k.setColor(i.B);
                         i6 = i.u / 2;
                         i6 = - i6;
                         i6 = i6 * i.v;
                         if (i.h - (float)i6 >= 0) {
                            p0.save();
                            double d1 = d + 90.00f;
                            float f6 = (float)d1;
                            obj.rotate(f6, uofloatArray[b], uofloatArray[1]);
                            str2 = i.c(f3, b);
                            f7 = i.l.measureText(str2, b, str2.length());
                            f3 = (!(float)i.T - f3)? uofloatArray[b] - f7: uofloatArray[b];
                            f7 = f7 + f3;
                         }else {
                            str2 = "";
                            f3 = 0;
                            f7 = 0;
                         }
                         ArcScaleView d2 = i.d;
                         h = i.H;
                         int i7 = d2 - h;
                         f5 = (float)i7;
                         if (f3 - f5 >= 0) {
                            i8 = d2 + h;
                            if (f3 - (float)i8 <= 0) {
                            label_01ca :
                               i6 = 1;
                            label_01e2 :
                               p0.restore();
                               p0.save();
                               obj.rotate((float)d, uofloatArray[b], uofloatArray[i6]);
                               p0.restore();
                            label_01f5 :
                               i4 = i4 + 1;
                               i1 = 0;
                               i3 = 1;
                            }
                         }
                         if (f7 - f5 >= 0) {
                            i3 = d2 + h;
                            if (f7 - (float)i3 <= 0) {
                            }
                         }
                         i6 = 1;
                         f8 = uofloatArray[i6] + (float)i.L;
                         obj.drawText(str2, f3, f8, i.l);
                         goto label_01e2 ;
                      }else if(!f4){
                         i.k.setColor(i.D);
                         i.k.setStrokeWidth(10.00f);
                         p0.save();
                         obj.rotate((float)d, uofloatArray[b], uofloatArray[i3]);
                         f3 = (float)i.M;
                         f1 = i1 - f3;
                         f = f3 + i1;
                         h = i.d;
                         ArcScaleView h1 = i.H;
                         i8 = h - h1;
                         f2 = (float)i8;
                         if (f1 - f2 >= 0) {
                            i3 = h + h1;
                            if (f1 - (float)i3 > 0) {
                            label_014f :
                               if (f - f2 >= 0) {
                                  int i9 = h + h1;
                                  if (f - (float)i9 <= 0) {
                                  label_015e :
                                     p0.restore();
                                  }
                               }
                               obj.drawCircle(i1, i6, f3, i.k);
                               goto label_015e ;
                            }else {
                               goto label_015e ;
                            }
                         }else {
                            goto label_014f ;
                         }
                      }
                   }
                }
             }
             f7 = 1;
             goto label_01f5 ;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, i, ArcScaleView.class, "6")) {
          i2 = Math.round(((i.h + (float)i.S) + (float)((i.u / 2) * i.v)));
          ArcScaleView r = i.r;
          if (r != null) {
             i1 = (int)((i.z - ((float)i2 - 215.00f)) + 0x3f800000);
             if (i.K != i1) {
                r.a(i1);
                i.f(i1);
                i.K = i1;
             }
          }
          String str1 = i.c((float)i2, b);
          Rect rect = new Rect();
          i.m.getTextBounds(str1, b, str1.length(), rect);
          i1 = a1.e(0x3f000000);
          p0.save();
          obj.drawCircle((float)i.d, (float)((i.e + i.I) + i1), (float)i.H, i.o);
          obj.drawCircle((float)i.d, (float)((i.e + i.I) + i1), (float)i.G, i.n);
          i.m.setTextAlign(Paint$Align.CENTER);
          obj.drawText(str1, (float)i.d, (float)((i.e + i.I) + (rect.height() / 2)), i.m);
          p0.restore();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ArcScaleView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ArcScaleView.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.b = this.getMeasuredWidth();
       this.c = this.getMeasuredHeight();
       ArcScaleView tb = this.b;
       this.d = tb / 2;
       this.e = 0;
       this.f = ((tb / 2) - this.g) + 30;
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       float x;
       boolean b;
       double d1;
       float f;
       ArcScaleView uArcScaleVie = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArcScaleView obj = PatchProxy.applyOneRefs(p0, this, ArcScaleView.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       double d = 180.00f;
       if (action) {
          if (action != 1) {
             if (action == 2) {
                x = p0.getX();
                float y = p0.getY();
                if (PatchProxy.isSupport(ArcScaleView.class)) {
                   Object obj1 = PatchProxy.applyTwoRefs(Float.valueOf(x), Float.valueOf(y), this, ArcScaleView.class, "12");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   label_0078 :
                      if (b) {
                         d1 = this.b(x, y);
                         if (x - (float)uArcScaleVie.d > 0) {
                            d1 = d - d1;
                         }
                         d1 = d1 - uArcScaleVie.i;
                         double d2 = Math.abs(d1);
                         if (d2 - 0x3ff0000000000000 < 0 && d2 - 0x3fb999999999999a > 0) {
                            d1 = (d1 - null < 0)? 0xbff0000000000000: 0x3ff0000000000000;
                         }
                      label_00a7 :
                         f = uArcScaleVie.N + (float)Math.round((d1 * (double)uArcScaleVie.t));
                         uArcScaleVie.h = f;
                         ArcScaleView r = uArcScaleVie.R;
                         if (f - (float)r > 0) {
                            uArcScaleVie.h = (float)r;
                         }
                         obj = uArcScaleVie.Q;
                         if (uArcScaleVie.h - (float)obj < 0) {
                            uArcScaleVie.h = (float)obj;
                         }
                         if (uArcScaleVie.h - (float)((- (uArcScaleVie.u / 2)) * uArcScaleVie.v) >= 0) {
                            this.invalidate();
                         }
                         return true;
                      }
                   }
                }
                d1 = ((Math.pow((double)(x - (float)uArcScaleVie.d), 2.00f) + Math.pow((double)(y - (float)uArcScaleVie.e), 2.00f)) - Math.pow((double)uArcScaleVie.f, 2.00f) < 0)? Double.MIN_VALUE: 0;
                b = d1;
                goto label_0078 ;
             }
          }else {
             this.e();
             CameraLogger.onZoomEvent(uArcScaleVie.U, 6);
          }
       }else {
          x = p0.getX();
          f = p0.getY();
          double d3 = this.b(x, f);
          uArcScaleVie.i = d3;
          if (x - (float)uArcScaleVie.d > 0) {
             uArcScaleVie.i = d - d3;
          }
          uArcScaleVie.N = uArcScaleVie.h;
          if (!PatchProxy.applyVoid(null, this, ArcScaleView.class, "15")) {
             uArcScaleVie.W.removeMessages(true);
          }
          if (f - (float)uArcScaleVie.V > 0) {
             this.setVisibility(8);
             return false;
          }
       }
    label_0124 :
       return super.onTouchEvent(p0);
    }
    public void setArcScaleViewListener(ArcScaleView$a p0){
       this.W0 = p0;
    }
    public void setDrawLineSpace(int p0){
       this.A = p0;
    }
    public void setDrawTextSpace(int p0){
       this.u = p0;
    }
    public void setEvenyScaleValue(float p0){
       this.t = p0;
    }
    public void setIndicatorColor(int p0){
       this.C = p0;
    }
    public void setMaxSupportNum(int p0){
       if (PatchProxy.isSupport(ArcScaleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ArcScaleView.class, "17")) {
          return;
       }
       float f = (float)p0;
       this.z = f;
       if (f - 50.00f > 0) {
          this.z = 50.00f;
       }
       this.u = Math.min(p0, 30);
       this.d();
       return;
    }
    public void setScaleLineColor(int p0){
       this.B = p0;
    }
    public void setScaleMin(int p0){
       this.S = p0;
    }
    public void setScaleMinNum(int p0){
       this.u = p0;
    }
    public void setScaleNum(int p0){
       this.u = p0;
    }
    public void setScaleSpace(int p0){
       this.v = p0;
    }
    public void setScaleTextColor(int p0){
       this.D = p0;
    }
    public void setScaleUnit(String p0){
       this.s = p0;
    }
    public void setSelectScaleListener(ArcScaleView$c p0){
       this.r = p0;
    }
    public void setSelectTextColor(int p0){
       this.E = p0;
    }
    public void setSelectValue(int p0){
       if (PatchProxy.isSupport(ArcScaleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ArcScaleView.class, "14")) {
          return;
       }
       float f = (this.z + 0x3f800000) - (float)p0;
       if (f - null < 0) {
          f = 0;
       }
       this.h = f - (float)(this.u / 2);
       this.invalidate();
       this.e();
       return;
    }
    public void setShowBeginNum(int p0){
       this.O = p0;
    }
}
