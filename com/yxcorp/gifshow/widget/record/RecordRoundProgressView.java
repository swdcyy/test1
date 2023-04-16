package com.yxcorp.gifshow.widget.record.RecordRoundProgressView;
import ozc.l;
import android.view.View;
import android.content.Context;
import java.util.LinkedList;
import lnc.b0;
import android.content.res.Resources;
import lnc.a1;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import th0.q;
import android.animation.TimeInterpolator;
import ozc.o;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.p;
import ozc.p;
import android.animation.Animator;
import ozc.s;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import th0.e;
import ozc.n;
import ozc.q;
import ozc.m;
import ozc.r;
import android.graphics.Canvas;
import java.lang.Float;
import android.graphics.RectF;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import com.yxcorp.gifshow.widget.record.RecordRoundProgressView$a;
import lnc.b0$b;
import com.yxcorp.gifshow.widget.record.RecordRoundProgressView$b;
import pi9.p;
import java.security.InvalidParameterException;
import o56.c;
import o56.a;

public class RecordRoundProgressView extends View implements l	// class@0019be
{
    public float A;
    public boolean B;
    public AnimatorSet C;
    public Paint b;
    public Paint c;
    public Paint d;
    public Paint e;
    public RectF f;
    public RectF g;
    public float h;
    public int i;
    public int j;
    public float k;
    public boolean l;
    public boolean m;
    public LinkedList n;
    public int o;
    public b0 p;
    public int q;
    public b0 r;
    public int s;
    public int t;
    public AnimatorSet u;
    public Matrix v;
    public Shader w;
    public float x;
    public float y;
    public float z;
    public static final int D;

    public void RecordRoundProgressView(Context p0){
       super(p0);
       this.h = 4.00f;
       this.j = 100;
       this.k = 0x3f800000;
       this.n = new LinkedList();
       this.o = 255;
       this.p = new b0();
       this.q = 255;
       this.r = new b0();
       this.s = this.getResources().getColor(0x7f061ce4);
       this.t = 0;
       this.x = (float)a1.e(2.50f);
       this.y = (float)a1.e(2.00f);
       this.B = false;
       this.o(p0);
    }
    public void RecordRoundProgressView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = 4.00f;
       this.j = 100;
       this.k = 0x3f800000;
       this.n = new LinkedList();
       this.o = 255;
       this.p = new b0();
       this.q = 255;
       this.r = new b0();
       this.s = this.getResources().getColor(0x7f061ce4);
       this.t = 0;
       this.x = (float)a1.e(2.50f);
       this.y = (float)a1.e(2.00f);
       this.B = false;
       this.o(p0);
    }
    public void RecordRoundProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = 4.00f;
       this.j = 100;
       this.k = 0x3f800000;
       this.n = new LinkedList();
       this.o = 255;
       this.p = new b0();
       this.q = 255;
       this.r = new b0();
       this.s = this.getResources().getColor(0x7f061ce4);
       this.t = 0;
       this.x = (float)a1.e(2.50f);
       this.y = (float)a1.e(2.00f);
       this.B = false;
       this.o(p0);
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordRoundProgressView.class, "22")) {
          return;
       }
       if (this.l == null) {
          boolean b = true;
          this.l = b;
          if (!PatchProxy.applyVoid(objArray, this, RecordRoundProgressView.class, "23")) {
             if (this.u == null) {
                this.u = new AnimatorSet();
             }
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0x3dcccccd});
             valueAnimato.setDuration(500);
             valueAnimato.setInterpolator(new q());
             valueAnimato.addUpdateListener(new o(this));
             ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x3dcccccd,0x3f800000});
             valueAnimato1.setDuration(800);
             valueAnimato1.setInterpolator(new p());
             valueAnimato1.addUpdateListener(new p(this));
             valueAnimato1.setStartDelay(100);
             Animator[] uAnimatorArr = new Animator[]{valueAnimato,valueAnimato1};
             this.u.playSequentially(uAnimatorArr);
             this.u.addListener(new s(this));
             this.u.start();
          }
       }
       return;
    }
    public boolean b(){
       return this.m;
    }
    public boolean c(){
       return this.l;
    }
    public boolean d(){
       RecordRoundProgressView obj = PatchProxy.apply(null, this, RecordRoundProgressView.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = false;
       int i = (this.n.isEmpty())? 0: this.n.getLast().intValue();
       if (obj > i) {
          b = true;
       }
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "17")) {
          return;
       }
       this.n.add(Integer.valueOf(this.i));
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, RecordRoundProgressView.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.n.size() != b) {
          b = false;
       }
       return b;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, RecordRoundProgressView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.n.isEmpty() ^ 0x01);
    }
    public int getProgress(){
       Object obj = PatchProxy.apply(null, this, RecordRoundProgressView.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.n.isEmpty())? 0: this.n.getLast().intValue();
       if (this.B == null) {
          i = this.i;
       }
       return i;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "21")) {
          return;
       }
       this.n.clear();
       this.i = 0;
       this.invalidate();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "32")) {
          return;
       }
       RecordRoundProgressView tC = this.C;
       if (tC != null && tC.isRunning()) {
          this.C.end();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "27")) {
          return;
       }
       this.p.d();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "19")) {
          return;
       }
       try{
          this.n.removeLast();
       }catch(java.util.NoSuchElementException e0){
       }
       int i = (this.n.isEmpty())? 0: this.n.getLast().intValue();
       if (!PatchProxy.isSupport(RecordRoundProgressView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, RecordRoundProgressView.class, "20")) {
          this.m();
          this.B = true;
          int i1 = 2;
          int[] ointArray = new int[i1];
          ointArray[0] = this.i;
          ointArray[1] = i;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          long l = 300;
          valueAnimato.setDuration(l);
          valueAnimato.setInterpolator(new e());
          valueAnimato.addUpdateListener(new n(this));
          valueAnimato.addListener(new q(this));
          AnimatorSet uAnimatorSet = (!i)? 1: null;
          ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[i1]{255,0});
          valueAnimato1.setDuration(l);
          valueAnimato1.setInterpolator(new e());
          valueAnimato1.addUpdateListener(new m(this));
          valueAnimato1.addListener(new r(this));
          if (uAnimatorSet) {
             uAnimatorSet = new AnimatorSet();
             this.C = uAnimatorSet;
             Animator[] uAnimatorArr = new Animator[i1];
             uAnimatorArr[0] = valueAnimato;
             uAnimatorArr[1] = valueAnimato1;
             uAnimatorSet.playTogether(uAnimatorArr);
             this.C.start();
          }else {
             valueAnimato.start();
          }
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "26")) {
          return;
       }
       this.setHeadBlinkEnable(true);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "24")) {
          return;
       }
       if (this.l != null) {
          this.l = false;
          this.u.cancel();
          this.invalidate();
       }
       return;
    }
    public final void n(float p0,Canvas p1){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, RecordRoundProgressView.class, "10")) {
          return;
       }
       p1.save();
       p1.rotate((p0 + 0x3f800000), this.z, this.A);
       p1.drawRoundRect(this.g, (this.x / 2.00f), (this.y / 2.00f), this.e);
       p1.restore();
       return;
    }
    public void o(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordRoundProgressView.class, "1")) {
          return;
       }
       this.setWillNotDraw(false);
       this.h = c.c(this.getResources()).density * 4.00f;
       Paint paint = new Paint();
       this.b = paint;
       paint.setColor(this.s);
       this.b.setStrokeWidth(this.h);
       this.b.setStyle(Paint$Style.STROKE);
       this.b.setAntiAlias(true);
       this.b.setStrokeCap(Paint$Cap.ROUND);
       this.v = new Matrix();
       paint = new Paint();
       this.c = paint;
       paint.setColor(this.getResources().getColor(R.color.arg_RES_7f061cf9));
       this.c.setStrokeWidth(this.h);
       this.c.setStyle(Paint$Style.STROKE);
       this.c.setAntiAlias(true);
       this.c.setStrokeCap(Paint$Cap.ROUND);
       Bitmap uBitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.arg_RES_7f081e4b);
       if (uBitmap != null) {
          BitmapShader uBitmapShade = new BitmapShader(uBitmap, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
          this.w = uBitmapShade;
          this.b.setShader(uBitmapShade);
          this.c.setShader(this.w);
       }
       paint = new Paint();
       this.e = paint;
       paint.setColor(-1);
       this.e.setStyle(Paint$Style.FILL);
       this.e.setAntiAlias(true);
       paint = new Paint();
       this.d = paint;
       paint.setColor(this.t);
       this.d.setStrokeWidth(this.h);
       this.d.setStyle(Paint$Style.STROKE);
       this.d.setAntiAlias(true);
       this.f = new RectF();
       this.g = new RectF();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p.a();
       this.r.a();
       return;
    }
    public void onDraw(Canvas p0){
       float f3;
       float f4;
       float f6;
       int i1;
       RecordRoundProgressView recordRoundP = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, RecordRoundProgressView.class, "7")) {
          return;
       }
       RecordRoundProgressView f = recordRoundP.f;
       obj.drawCircle(((float)this.getWidth() * 0x3f000000), ((float)this.getHeight() * 0x3f000000), ((f.right - f.left) * 0x3f000000), recordRoundP.d);
       RecordRoundProgressView obj1 = PatchProxy.applyOneRefs(obj, this, RecordRoundProgressView.class, "8");
       float f1 = 360.00f;
       float f2 = 270.00f;
       int i = 0;
       if (obj1 != PatchProxyResult.class) {
          f3 = obj1.floatValue();
       }else {
          f3 = 0;
          int i2 = 0;
          while (i2 < recordRoundP.n.size()) {
             float f7 = (float)recordRoundP.n.get(i2).intValue();
             f4 = f7 - f3;
             if (f4 > 0) {
                RecordRoundProgressView recordRoundP1 = (f7 - (float)recordRoundP.i >= 0 && recordRoundP.l != null)? 1: null;
                if (recordRoundP1) {
                   recordRoundP.c.setAlpha(recordRoundP.q);
                }
                recordRoundP1 = recordRoundP.f;
                f3 = f3 * f1;
                float f8 = (float)recordRoundP.j;
                f3 = f3 / f8;
                f6 = f3 + f2;
                f4 = f4 * f1;
                f8 = f4 / f8;
                i1 = 0;
                obj1 = (f7 - (float)recordRoundP.i >= 0 && recordRoundP.l != null)? recordRoundP.c: recordRoundP.b;
                p0.drawArc(recordRoundP1, f6, f8, i1, obj1);
             }
             i2 = i2 + 1;
             f3 = f7;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(obj, this, RecordRoundProgressView.class, "9")) {
          for (; i < recordRoundP.n.size(); i = i + 1) {
             f4 = (float)recordRoundP.n.get(i).intValue() * f1;
             f4 = f4 / (float)recordRoundP.j;
             f4 = f4 + f2;
             this.n(f4, obj);
          }
       }
       if (!PatchProxy.isSupport(RecordRoundProgressView.class) || !PatchProxy.applyVoidTwoRefs(obj, Float.valueOf(f3), this, RecordRoundProgressView.class, "11")) {
          f4 = (float)recordRoundP.i;
          if (f3 - f4 < 0) {
             f4 = f4 - f3;
             if (f4 > 0) {
                float f5 = (float)recordRoundP.j;
                f2 = f2 + ((f3 * f1) / f5);
                f = recordRoundP.f;
                f6 = (f4 * f1) / f5;
                i1 = 0;
                obj1 = (recordRoundP.l != null)? recordRoundP.c: recordRoundP.b;
                p0.drawArc(f, f2, f6, i1, obj1);
                if (recordRoundP.n.size()) {
                   this.n(f2, obj);
                }
             }
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.p.b(new RecordRoundProgressView$a(this));
       this.r.b(new RecordRoundProgressView$b(this));
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(RecordRoundProgressView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, RecordRoundProgressView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.p();
       }
       return;
    }
    public final void p(){
       float f2;
       if (PatchProxy.applyVoid(null, this, RecordRoundProgressView.class, "5")) {
          return;
       }
       float f = 0x3f800000;
       int i = 0;
       float f1 = 0x3f000000;
       if (!p.d(f, this.k)) {
          i = (float)this.getMeasuredWidth() * ((f - this.k) * f1);
          f2 = (float)this.getMeasuredHeight() * ((f - this.k) * f1);
       }else {
          f2 = 0;
       }
       this.f.set(i, f2, ((this.k * (float)this.getMeasuredWidth()) + i), ((this.k * (float)this.getMeasuredHeight()) + f2));
       RecordRoundProgressView th = this.h;
       float f3 = th * f1;
       this.f.inset(f3, (th * f1));
       if (!PatchProxy.isSupport(RecordRoundProgressView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(i), this, RecordRoundProgressView.class, "6")) {
          f2 = (float)this.getWidth() / 2.00f;
          this.z = (float)this.getLeft() + f2;
          this.A = (float)this.getTop() + f2;
          f2 = this.x / 2.00f;
          f1 = this.y / 2.00f;
          f3 = this.h / 2.00f;
          this.g.set(((((float)this.getRight() - f3) - f2) - i), (this.A - f1), ((((float)this.getRight() - f3) + f2) - i), (this.A + f1));
       }
       this.v.setScale(0x3f400000, 0x3f400000);
       RecordRoundProgressView tw = this.w;
       if (tw != null) {
          tw.setLocalMatrix(this.v);
       }
       return;
    }
    public void setBackGroundStrokeColor(int p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordRoundProgressView.class, "14")) {
          return;
       }
       this.t = p0;
       this.d.setColor(p0);
       this.p();
       this.invalidate();
       return;
    }
    public void setHeadBlinkEnable(boolean p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordRoundProgressView.class, "31")) {
          return;
       }
       this.m = p0;
       this.invalidate();
       return;
    }
    public void setLongClickRecordMode(boolean p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordRoundProgressView.class, "16")) {
          return;
       }
       RecordRoundProgressView td = this.d;
       int i = (!p0)? 0: this.getResources().getColor(R.color.arg_RES_7f061cf6);
       td.setColor(i);
       return;
    }
    public void setMax(int p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordRoundProgressView.class, "28")) {
          return;
       }
       if (p0 <= 0) {
          throw new InvalidParameterException("max must be positive number");
       }
       this.j = p0;
       return;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordRoundProgressView.class, "30")) {
          return;
       }
       if (this.m != null || this.i == p0) {
          this.invalidate();
          return;
       }else if(p0 < 0){
          if (!a.a().c()) {
             p0 = 0;
          }else {
             throw new InvalidParameterException("progress can not be negative ");
          }
       }
       this.i = p0;
       this.invalidate();
       return;
    }
    public void setScaleRate(float p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RecordRoundProgressView.class, "15")) {
          return;
       }
       this.k = p0;
       this.p();
       this.invalidate();
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordRoundProgressView.class, "13")) {
          return;
       }
       this.s = p0;
       this.b.setColor(p0);
       this.p();
       this.invalidate();
       return;
    }
    public void setStrokeWidth(float p0){
       if (PatchProxy.isSupport(RecordRoundProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RecordRoundProgressView.class, "12")) {
          return;
       }
       p0 = (float)a1.e(p0);
       this.h = p0;
       this.b.setStrokeWidth(p0);
       this.c.setStrokeWidth(this.h);
       this.d.setStrokeWidth(this.h);
       this.p();
       this.invalidate();
       return;
    }
}
