package com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.graphics.Rect;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.graphics.Path;
import lnc.a1;
import n9a.q;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar$a;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View$OnTouchListener;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import n9a.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Math;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import n9a.t;
import android.animation.Animator$AnimatorListener;
import n9a.p;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import ll8.c$b;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import android.graphics.Canvas;
import a2.i0;
import com.yxcorp.utility.Log;
import android.os.Looper;
import n9a.r;
import n9a.s;

public class NasaFeaturedSeekBar extends View	// class@001a4b
{
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public int L;
    public float M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long U0;
    public boolean V;
    public ValueAnimator V0;
    public boolean W;
    public int W0;
    public int X0;
    public int Y0;
    public boolean Z0;
    public int a1;
    public final List b;
    public int b1;
    public int c;
    public Paint c1;
    public Paint d;
    public boolean d1;
    public RectF e;
    public boolean e1;
    public RectF f;
    public boolean f1;
    public Path g;
    public SwipeLayout g1;
    public Path h;
    public View$OnTouchListener h1;
    public final int i;
    public NasaFeaturedSeekBar$b i1;
    public final int j;
    public boolean j1;
    public final int k;
    public boolean k1;
    public final float l;
    public boolean l1;
    public final int m;
    public boolean m1;
    public ValueAnimator n;
    public final Runnable n1;
    public ValueAnimator o;
    public z o1;
    public long p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public float u;
    public int v;
    public float w;
    public int x;
    public int y;
    public int z;
    public static final int p1;

    public void NasaFeaturedSeekBar(Context p0){
       super(p0, null);
    }
    public void NasaFeaturedSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NasaFeaturedSeekBar(Context p0,AttributeSet p1,int p2){
       List list;
       super(p0, p1, p2);
       if (Build$VERSION.SDK_INT >= 29) {
          Rect[] rectArray = new Rect[]{new Rect()};
          list = Arrays.asList(rectArray);
       }else {
          list = null;
       }
       this.b = list;
       this.c = 0;
       this.g = new Path();
       this.h = new Path();
       this.i = a1.e(13.00f);
       this.j = a1.e(-16.00f);
       this.k = a1.e(52.00f);
       this.l = (float)a1.e(3.00f);
       this.m = a1.e(11.00f);
       this.p = 200;
       this.q = a1.a(0x7f061c37);
       this.y = 0;
       this.F = false;
       this.J = 0x3f800000;
       this.M = 0x3f800000;
       this.T = 0;
       this.U = 0;
       this.U0 = 200;
       this.W0 = 1;
       this.X0 = -1;
       this.a1 = 1;
       this.d1 = false;
       this.e1 = false;
       this.f1 = false;
       this.k1 = false;
       this.l1 = false;
       this.m1 = false;
       this.n1 = new q(this);
       this.o1 = new NasaFeaturedSeekBar$a(this);
       this.e(p0, p1, p2, 0);
       return;
    }
    public static void a(NasaFeaturedSeekBar p0){
       super.setAlpha(p0.J);
       p0.Q = false;
       if (p0.R == null) {
          p0.setProgressState(1);
          p0.invalidate();
       }
       p0 = p0.i1;
       if (p0 != null) {
          p0.d();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedSeekBar.class, "15")) {
          return;
       }
       long l = SystemClock.uptimeMillis();
       MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
       this.d(motionEvent);
       if (motionEvent != null) {
          motionEvent.recycle();
       }
       return;
    }
    public final void c(float p0,int p1){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, NasaFeaturedSeekBar.class, "27")) {
          return;
       }
       if (this.u - p0) {
          NasaFeaturedSeekBar ti1 = this.i1;
          if (ti1 != null) {
             ti1.a(p0, (int)((float)this.v * p0), p1);
          }
       }
       return;
    }
    public boolean d(MotionEvent p0){
       NasaFeaturedSeekBar tn;
       NasaFeaturedSeekBar ti1;
       float f1;
       Object obj = PatchProxy.applyOneRefs(p0, this, NasaFeaturedSeekBar.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (this.P == null) {
          return super.onTouchEvent(p0);
       }
       NasaFeaturedSeekBar th1 = this.h1;
       if (th1 != null) {
          th1.onTouch(this, p0);
       }
       int actionMasked = p0.getActionMasked();
       boolean b1 = true;
       if (actionMasked) {
          Object[] objArray = null;
          int i = 2;
          if (actionMasked != b1) {
             if (actionMasked != i) {
                if (actionMasked == 3) {
                label_0149 :
                   if (!PatchProxy.applyVoid(objArray, this, NasaFeaturedSeekBar.class, "25")) {
                      this.G = b;
                      this.K = b;
                      this.d1 = b;
                      this.e1 = b1;
                      if (this.Z0 != null && !PatchProxy.applyVoid(objArray, this, NasaFeaturedSeekBar.class, "37")) {
                         tn = this.n;
                         if (tn != null && tn.isRunning()) {
                            this.n.cancel();
                         }
                         tn = this.o;
                         if (tn == null) {
                            ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
                            this.o = valueAnimato;
                            valueAnimato.setDuration(150);
                            this.o.setInterpolator(new LinearInterpolator());
                            this.o.addListener(new t(this));
                            this.o.addUpdateListener(new p(this));
                         }else if(tn.isRunning()){
                            this.o.cancel();
                         }
                         this.o.start();
                      }
                      this.invalidate();
                      k1.r(this.n1, 3000);
                      this.l1 = b;
                      this.m1 = b;
                   }
                   this.j1 = b;
                }
             }else if(this.j1 == null || PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "26")){
                actionMasked = this.getMeasuredWidth();
                int i1 = (int)p0.getX();
                if (this.K == null) {
                   this.K = b1;
                   this.setProgressState(i);
                   this.Q = b1;
                   this.d1 = b1;
                   this.e1 = b;
                   super.setAlpha(0x3f800000);
                   ti1 = this.i1;
                   if (ti1 != null) {
                      ti1.c();
                   }
                   if (this.Z0 != null && !PatchProxy.applyVoid(objArray, this, NasaFeaturedSeekBar.class, "36")) {
                      ti1 = this.o;
                      if (ti1 != null && ti1.isRunning()) {
                         this.o.cancel();
                      }
                      ti1 = this.n;
                      if (ti1 == null) {
                         ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                         this.n = valueAnimato1;
                         valueAnimato1.setDuration(this.p);
                         this.n.setInterpolator(new LinearInterpolator());
                         this.n.addUpdateListener(new o(this));
                      }else if(ti1.isRunning()){
                         this.n.cancel();
                      }
                      this.n.start();
                   }
                }
             label_00c4 :
                if (this.K != null) {
                   ti1 = this.u;
                   int i2 = i1 - this.I;
                   int i3 = (this.Z0 != null)? this.m * 2: 0;
                   i = actionMasked - i3;
                   float f = 0;
                   if (actionMasked > 0) {
                      f1 = Math.min(Math.max((ti1 + (((float)i2 * 0x3f800000) / (float)i)), f), 0x3f800000);
                   }
                   this.I = i1;
                   float f2 = Math.max(f, Math.min(0x3f800000, f1));
                   objArray = new Object[b];
                   o.C().w("NasaFeaturedSeekBar", "move: newRation:"+f2+", mCurrentRation:"+this.u+", movementX:"+i2+",width:"+actionMasked, objArray);
                   this.c(f2, b);
                   if (this.u - f2) {
                      this.invalidate();
                      this.u = f2;
                   }
                }
                k1.m(this.n1);
                InvalidGestureChecker.a(this.getContext(), AnswerType.SEEK_BAR);
             }
          }else {
             goto label_0149 ;
          }
       }else {
          this.H = (int)p0.getX();
          this.H = (int)p0.getY();
          this.j1 = b1;
          tn = this.V0;
          if (tn != null) {
             tn.cancel();
          }
       }
       return this.j1;
    }
    public final void e(Context p0,AttributeSet p1,int p2,int p3){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, NasaFeaturedSeekBar.class, "5")) {
          return;
       }
       this.d = new Paint(5);
       this.e = new RectF();
       this.f = new RectF();
       this.L = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.E3, p2, p3);
       this.u = typedArray.getFloat(1, 0);
       this.v = typedArray.getInt(3, 100);
       this.x = typedArray.getDimensionPixelSize(5, 0);
       this.A = typedArray.getColor(6, -1);
       this.z = typedArray.getColor(2, 0xff000000);
       this.B = typedArray.getColor(7, -1);
       this.C = typedArray.getColor(8, -1);
       this.D = typedArray.getColor(9, -1);
       this.N = this.x;
       this.O = typedArray.getDimensionPixelSize(0, 0);
       this.b1 = typedArray.getDimensionPixelSize(4, 0);
       typedArray.recycle();
       return;
    }
    public boolean f(MotionEvent p0){
       boolean b;
       int[] obj = PatchProxy.applyOneRefs(p0, this, NasaFeaturedSeekBar.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int[] ointArray = new int[2];
       this.getLocationInWindow(ointArray);
       obj = new int[2];
       NasaFeaturedSeekBar tg1 = this.g1;
       if (tg1 != null) {
          tg1.getLocationInWindow(obj);
       }
       if (ointArray[0] <= ((int)p0.getX() + obj[0]) && (((int)p0.getX() + obj[0]) <= (ointArray[0] + this.getWidth()) && (((int)p0.getY() + obj[1]) >= ointArray[1] && ((int)p0.getY() + obj[1]) <= (ointArray[1] + this.getHeight())))) {
          p0 = PatchProxy.apply(null, this, NasaFeaturedSeekBar.class, "2");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(this.isShown() || this.l1 != null){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return 1;
          }
       }
    label_0081 :
       return 0;
    }
    public boolean g(){
       return this.W;
    }
    public int getCurrentProgress(){
       return (int)((float)this.v * this.u);
    }
    public float getCurrentRation(){
       return this.u;
    }
    public final int getMax(){
       return this.v;
    }
    public final int getProgress(){
       return this.Y0;
    }
    public float getProgressRight(){
       return this.e.right;
    }
    public final float getScaleDown(){
       NasaFeaturedSeekBar tw = this.w;
       if (tw > 0) {
       }else {
          tw = 0x3f800000;
       }
       return tw;
    }
    public final float getScaleUp(){
       float f = (this.Z0 != null)? 2.00f: 0x3fc00000;
       return f;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedSeekBar.class, "29")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("NasaFeaturedSeekBar", "resetProgress: "+this.W+", "+this.getProgress(), objArray);
       if (this.W == null) {
          this.setProgress(0);
          return;
       }else {
          NasaFeaturedSeekBar tV0 = this.V0;
          if (tV0 != null) {
             tV0.cancel();
          }
          tV0 = this.n;
          if (tV0 != null && tV0.isRunning()) {
             this.n.cancel();
          }
          tV0 = this.o;
          if (tV0 != null && tV0.isRunning()) {
             this.o.cancel();
          }
          this.setProgress(0);
          this.X0 = -1;
          return;
       }
    }
    public final void i(float p0){
       this.t = (int)(0x437f0000 * p0);
       NasaFeaturedSeekBar tk = this.k;
       int i = tk / 2;
       i = i + (int)((float)(this.i - (tk / 2)) * p0);
       this.r = i;
       this.s = i + (int)((float)(this.j - i) * p0);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, NasaFeaturedSeekBar.class, "38")) {
          return;
       }
       super.onDetachedFromWindow();
       NasaFeaturedSeekBar tn = this.n;
       if (tn != null && tn.isRunning()) {
          this.n.cancel();
       }
       tn = this.o;
       if (tn != null && tn.isRunning()) {
          this.o.cancel();
       }
       return;
    }
    public void onDraw(Canvas p0){
       NasaFeaturedSeekBar tT;
       NasaFeaturedSeekBar tB;
       int measuredWidt;
       int measuredHeig;
       int i;
       int i1;
       float f;
       float f1;
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "8")) {
          return;
       }
       String str = null;
       NasaFeaturedSeekBar nasaFeatured = 0x40000000;
       if (this.Z0 != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "22")) {
             measuredWidt = this.getMeasuredWidth();
             measuredHeig = this.getMeasuredHeight();
             i = (int)((float)this.x * this.M);
             i1 = i / 2;
             this.E = i1;
             NasaFeaturedSeekBar tb1 = this.b1;
             if (tb1 != null) {
                f = (float)(tb1 - i);
                f1 = (float)tb1;
             }else {
                f = (float)measuredHeig / nasaFeatured;
                f1 = (float)i + f;
             }
             float f2 = (float)this.m;
             this.e.set(f2, f, (((float)Math.max((measuredWidt - (this.m * 2)), 0) * this.u) + f2), f1);
             NasaFeaturedSeekBar tm = this.m;
             f2 = (float)tm;
             this.f.set(f2, f, (float)Math.max(0, (measuredWidt - tm)), f1);
             if (this.Z0 != null && (this.d1 != null || this.e1 != null)) {
                this.g.reset();
                this.g.moveTo(str, (float)this.r);
                f = f + (float)i1;
                this.g.lineTo(str, f);
                float f3 = (float)measuredWidt;
                this.g.lineTo(f3, f);
                this.g.lineTo(f3, (float)this.r);
                float f4 = (float)this.r;
                this.g.cubicTo(f3, f4, (float)(measuredWidt / 2), (float)this.s, 0, f4);
                this.g.close();
                this.c1.setAlpha(this.t);
                p0.drawPath(this.g, this.c1);
             }
          }
       }else if(PatchProxy.applyVoid(null, this, NasaFeaturedSeekBar.class, "23")){
          measuredWidt = this.getMeasuredWidth();
          measuredHeig = this.getMeasuredHeight();
          f1 = (float)this.x;
          i1 = (int)(this.M * f1);
          this.E = i1 / 2;
          this.N = i1;
          float f5 = 0x3f000000;
          if (this.V != null) {
             measuredHeig = (int)(((float)(measuredHeig + (int)(f1 * this.getScaleUp())) / nasaFeatured) + f5);
             i = measuredHeig - i1;
          }else {
             i = (int)(((float)(measuredHeig - i1) / nasaFeatured) + f5);
             measuredHeig = i + i1;
          }
          f1 = (float)i;
          f = (float)measuredHeig;
          this.e.set(str, f1, (float)(i1 + (int)((float)(measuredWidt - i1) * this.u)), f);
          this.f.set(str, f1, (float)measuredWidt, f);
       }
       if (this.k1 != null && (this.Q == null && this.R == null)) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "21")) {
             this.d.setColor(this.y);
             p0.drawRoundRect(this.f, (float)this.E, (float)this.E, this.d);
          }
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "16")){
          tT = this.d;
          NasaFeaturedSeekBar tD = (this.Q != null || this.R != null)? this.D: this.z;
          tT.setColor(tD);
          p0.drawRoundRect(this.f, (float)this.E, (float)this.E, this.d);
       }
       tT = this.T;
       RectF rectF = 0x3f800000;
       if (tT - str > 0 && tT - rectF < 0) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "17")) {
             this.d.setColor(this.B);
             tT = this.f;
             p0.drawCircle((((tT.right - tT.left) * this.T) + (float)this.m), ((tT.top + tT.bottom) / nasaFeatured), ((float)this.N / 4.00f), this.d);
          }
       }else {
          tT = this.U;
          if (tT - str <= 0 || (tT - rectF < 0 && !PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "18"))) {
             tT = this.q;
             if (this.e.width() - (this.f.width() * this.U) > 0) {
                tT = (this.Q != null || this.R != null)? this.B: this.A;
             }
             this.d.setColor(tT);
             tT = this.f;
             p0.drawCircle((((tT.right - tT.left) * this.U) + (float)this.m), ((tT.top + tT.bottom) / nasaFeatured), this.l, this.d);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "19")) {
          tT = this.d;
          tB = (this.Q != null || this.R != null)? this.B: this.A;
          tT.setColor(tB);
          p0.drawRoundRect(this.e, (float)this.E, (float)this.E, this.d);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, NasaFeaturedSeekBar.class, "20") && this.S == null) {
          tT = this.d;
          tB = (this.Q != null || this.R != null)? this.B: this.C;
          tT.setColor(tB);
          if (this.Z0 == null || (this.Q != null || this.R != null)) {
             tT = this.e;
             p0.drawCircle(tT.right, ((tT.top + tT.bottom) / nasaFeatured), (float)this.N, this.d);
          }
       }
    label_0263 :
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NasaFeaturedSeekBar.class, "9")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.b != null && p0) {
          if (this.c == null) {
             this.c = a1.e(15.00f);
          }
          Rect rect = this.b.get(0);
          p1 = this.getWidth();
          p2 = (this.getHeight() > this.c)? this.getHeight() - this.c: 0;
          rect.set(0, 0, p1, p2);
          i0.M0(this, this.b);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void setAlpha(float p0){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NasaFeaturedSeekBar.class, "7")) {
          return;
       }
       super.setAlpha(p0);
       this.J = p0;
       return;
    }
    public void setCircleRadius(int p0){
       this.N = p0;
    }
    public void setCustomScaleDownValue(float p0){
       this.w = p0;
    }
    public void setDisableDrawNormal(boolean p0){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaFeaturedSeekBar.class, "12")) {
          return;
       }
       Log.g("NasaFeaturedSeekBar", "setDisableDrawNormal: "+p0);
       this.k1 = p0;
       this.invalidate();
       return;
    }
    public void setEnableSeek(boolean p0){
       this.P = p0;
    }
    public void setFirstColor(int p0){
       this.z = p0;
    }
    public void setHighLightPos(float p0){
       this.U = p0;
    }
    public void setIsLagStateBanInterceptMove(boolean p0){
       this.l1 = p0;
    }
    public void setKeepEnhanceStyle(boolean p0){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NasaFeaturedSeekBar.class, "28")) {
          return;
       }
       this.R = p0;
       if (this.Q != null) {
          return;
       }
       if (p0) {
          this.setProgressState(2);
       }else {
          this.setProgressState(1);
          this.Q = false;
       }
       this.invalidate();
       return;
    }
    public void setMaxProgress(int p0){
       this.v = p0;
    }
    public void setMentionSummaryPos(float p0){
       this.T = p0;
    }
    public void setOnProgressChangeListener(NasaFeaturedSeekBar$b p0){
       this.i1 = p0;
    }
    public void setOnTouchListener(View$OnTouchListener p0){
       this.h1 = p0;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaFeaturedSeekBar.class, "11")) {
          return;
       }
       if (p0 < 0) {
          return;
       }
       if (this.g() && this.j1 != null) {
          Log.g("NasaFeaturedSeekBar", "setProgress: is draging return!");
          return;
       }else {
          this.Y0 = p0;
          this.setRation((((float)Math.min(p0, this.v) * 0x3f800000) / (float)this.v));
          return;
       }
    }
    public void setProgressAnimatorUpdateInterval(long p0){
       this.U0 = p0;
    }
    public void setProgressAnimatorUpdateThreshold(int p0){
       this.W0 = p0;
    }
    public void setProgressBottomMargin(int p0){
       this.b1 = p0;
    }
    public void setProgressHeight(int p0){
       this.x = p0;
    }
    public void setProgressState(int p0){
       NasaFeaturedSeekBar ti1;
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaFeaturedSeekBar.class, "40")) {
          return;
       }
       if (p0 == this.a1) {
          return;
       }
       Log.g("NasaFeaturedSeekBar", p0+"");
       this.a1 = p0;
       int i = 1;
       if (p0 == i) {
          this.M = this.getScaleDown();
          ti1 = this.i1;
          if (ti1 != null) {
             ti1.b(false);
          }
       }else if(p0 == 2){
          this.M = this.getScaleUp();
          ti1 = this.i1;
          if (ti1 != null) {
             ti1.b(i);
          }
       }
       return;
    }
    public void setRation(float p0){
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NasaFeaturedSeekBar.class, "10")) {
          return;
       }
       if (this.u - p0) {
          this.u = p0;
          if (this.k1 != null && (this.Q != null || this.R != null)) {
             this.invalidate();
          }
       }
       this.c(p0, 1);
       return;
    }
    public void setSecondColor(int p0){
       this.A = p0;
    }
    public void setSeekTouchEventStarted(boolean p0){
       this.j1 = p0;
    }
    public void setSmoothProgress(int p0){
       int[] obj;
       int b;
       if (PatchProxy.isSupport(NasaFeaturedSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaFeaturedSeekBar.class, "30")) {
          return;
       }
       if (this.W == null) {
          this.setProgress(p0);
          return;
       }else if(Looper.getMainLooper() == Looper.myLooper()){
          NasaFeaturedSeekBar tV0 = this.V0;
          if (tV0 != null) {
             tV0.cancel();
          }
          tV0 = this.X0;
          int i = 0;
          if (tV0 >= null) {
             this.setProgress(tV0);
             this.X0 = -1;
             Object[] objArray = new Object[i];
             o.C().t("NasaFeaturedSeekBar", "setProgressSmoothly: "+p0+", "+this.getProgress(), objArray);
             return;
          }else {
             int i1 = 2;
             if (PatchProxy.isSupport(NasaFeaturedSeekBar.class)) {
                obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NasaFeaturedSeekBar.class, "31");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                label_0085 :
                   b = this.getProgress();
                   b = (p0 > b || Math.abs((p0 - b)) > (this.getMax() / i1))? true: false;
                }
             }else {
                goto label_0085 ;
             }
             if (b) {
                if (!PatchProxy.isSupport(NasaFeaturedSeekBar.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NasaFeaturedSeekBar.class, "32")) {
                   if (this.W == null) {
                      this.setProgress(p0);
                   }else {
                      b = this.getProgress();
                      if (b < p0) {
                         int[] ointArray = new int[i1];
                         ointArray[i] = b;
                         ointArray[1] = p0;
                         this.V0 = ValueAnimator.ofInt(ointArray);
                      }else {
                         obj = new int[i1];
                         obj[i] = i;
                         obj[1] = p0;
                         this.V0 = ValueAnimator.ofInt(obj);
                      }
                      this.V0.setDuration(this.U0);
                      this.V0.addUpdateListener(new r(this, this.W0));
                      this.V0.addListener(new s(this, p0));
                      this.V0.start();
                   }
                }
             }else {
                this.setProgress(p0);
             }
          }
       }else {
          this.setProgress(p0);
       }
       return;
    }
    public void setThirdColor(int p0){
       this.B = p0;
    }
    public void setThumbAvailability(boolean p0){
       this.S = p0 ^ 0x01;
    }
    public void setTouchSecondColor(int p0){
       this.D = p0;
    }
}
