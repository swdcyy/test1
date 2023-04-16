package com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Handler;
import t46.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import cw9.c;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Float;
import java.lang.Integer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import java.lang.Runnable;
import android.animation.ValueAnimator;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint$Style;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter$Blur;
import android.graphics.MaskFilter;
import android.graphics.Canvas;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Rect;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import java.lang.Number;
import t46.p;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.e;
import android.animation.TimeInterpolator;
import java.lang.Math;
import android.view.MotionEvent;
import com.kwai.feature.post.api.widget.PrettifyDoubleSeekBar$a;

public class PrettifyDoubleSeekBar extends View	// class@001476
{
    public Handler A;
    public Runnable B;
    public int C;
    public boolean D;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public int e;
    public Paint f;
    public boolean g;
    public String h;
    public LayerDrawable i;
    public LayerDrawable j;
    public LayerDrawable k;
    public LayerDrawable l;
    public LayerDrawable m;
    public LayerDrawable n;
    public LayerDrawable o;
    public LayerDrawable p;
    public LayerDrawable q;
    public PrettifyDoubleSeekBar$a r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public ValueAnimator z;
    public static final int E;

    public void PrettifyDoubleSeekBar(Context p0){
       super(p0, null, 0);
    }
    public void PrettifyDoubleSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PrettifyDoubleSeekBar(Context p0,AttributeSet p1,int p2){
       int i2;
       PrettifyDoubleSeekBar prettifyDoub = this;
       Drawable obj = p0;
       Object obj1 = p1;
       super(p0, p1, p2);
       prettifyDoub.e = -1;
       int i = 10;
       prettifyDoub.s = i;
       prettifyDoub.A = new Handler();
       prettifyDoub.B = new q(prettifyDoub);
       prettifyDoub.C = 0;
       prettifyDoub.D = false;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, prettifyDoub, PrettifyDoubleSeekBar.class, "1")) {
       }else {
          TypedArray typedArray = obj.obtainStyledAttributes(obj1, c$b.m4);
          prettifyDoub.v = typedArray.getBoolean(17, 0);
          prettifyDoub.w = typedArray.getInt(0, 0);
          int color = typedArray.getColor(1, 0);
          int color1 = typedArray.getColor(i, 0);
          int color2 = typedArray.getColor(11, 0);
          int i1 = 4;
          prettifyDoub.g = typedArray.getBoolean(i1, 0);
          int dimensionPix = typedArray.getDimensionPixelSize(13, 0);
          int dimensionPix1 = typedArray.getDimensionPixelSize(12, c.a(p0.getResources(), R.dimen.arg_RES_7f070e62));
          int dimensionPix2 = typedArray.getDimensionPixelSize(7, 0);
          int dimensionPix3 = typedArray.getDimensionPixelSize(8, 0);
          int dimensionPix4 = typedArray.getDimensionPixelSize(9, 0);
          int dimensionPix5 = typedArray.getDimensionPixelSize(6, 0);
          prettifyDoub.u = typedArray.getInt(16, 100);
          int dimensionPix6 = typedArray.getDimensionPixelSize(14, 0);
          prettifyDoub.s = typedArray.getDimensionPixelSize(5, i1);
          if (prettifyDoub.g != null) {
             Paint paint = new Paint(1);
             prettifyDoub.f = paint;
             paint.setTextSize((float)dimensionPix);
             prettifyDoub.f.setShadowLayer((float)a1.e(5.00f), 0, 0, a1.a(R.color.arg_RES_7f06203c));
             PrettifyDoubleSeekBar f = prettifyDoub.f;
             if (!color2) {
                color2 = color1;
             }
             f.setColor(color2);
             if (prettifyDoub.v != null) {
                prettifyDoub.x = 0xffffff & prettifyDoub.f.getColor();
             }
             prettifyDoub.f.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          }
          float f1 = (float)dimensionPix6;
          if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
             i2 = dimensionPix5;
             if (PatchProxy.applyVoidThreeRefs(Float.valueOf(f1), Integer.valueOf(color), Integer.valueOf(color1), this, PrettifyDoubleSeekBar.class, "12")) {
                i = 3;
             label_0175 :
                dimensionPix6 = 15;
                color2 = 0x7f080800;
                try{
                   obj = typedArray.getDrawable(dimensionPix6);
                   prettifyDoub.b = obj;
                   if (obj == null) {
                      prettifyDoub.b = this.getResources().getDrawable(color2);
                   }
                }catch(java.lang.Exception e0){
                   prettifyDoub.b = this.getResources().getDrawable(color2);
                }
                dimensionPix6 = 2;
                prettifyDoub.c = typedArray.getDrawable(dimensionPix6);
                prettifyDoub.d = typedArray.getDrawable(i);
                color2 = dimensionPix2 + (prettifyDoub.b.getIntrinsicWidth() / dimensionPix6);
                if (prettifyDoub.g != null) {
                   dimensionPix4 = (dimensionPix1 + dimensionPix) + dimensionPix4;
                }
                prettifyDoub.setPadding(color2, dimensionPix4, (dimensionPix3 + (prettifyDoub.b.getIntrinsicWidth() / dimensionPix6)), i2);
                typedArray.recycle();
             }
          }else {
             i2 = dimensionPix5;
             i1 = 8;
             int i3 = 5;
             int i4 = 6;
          }
          float[] uofloatArray = new float[]{f1,f1,f1,f1,f1,f1,f1,f1};
          i = 3;
          dimensionPix5 = 4;
          f1 = f1 * 2.00f;
          float[] uofloatArray1 = new float[]{f1,f1,f1,f1,f1,f1,f1,f1};
          prettifyDoub.setLayerType(1, null);
          prettifyDoub.m = prettifyDoub.b(uofloatArray, color);
          prettifyDoub.n = prettifyDoub.b(uofloatArray1, color);
          prettifyDoub.p = prettifyDoub.d(uofloatArray, color1);
          prettifyDoub.q = prettifyDoub.d(uofloatArray1, color1);
          prettifyDoub.j = prettifyDoub.c(uofloatArray, color1);
          prettifyDoub.k = prettifyDoub.c(uofloatArray1, color1);
          goto label_0175 ;
       }
       return;
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyDoubleSeekBar.class, "18")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.A.removeCallbacks(this.B);
       PrettifyDoubleSeekBar tz = this.z;
       if (tz != null) {
          tz.cancel();
          this.z = null;
       }
       if (p0) {
          this.setProgressTextAlpha(255);
          this.A.postDelayed(this.B, 2000);
       }
       return;
    }
    public final LayerDrawable b(float[] p0,int p1){
       ShapeDrawable obj;
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PrettifyDoubleSeekBar.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ShapeDrawable(new RoundRectShape(p0, null, null));
       obj.getPaint().setColor(p1);
       obj.getPaint().setStyle(Paint$Style.FILL);
       ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(p0, null, null));
       shapeDrawabl.getPaint().setColor(0x14000000);
       shapeDrawabl.getPaint().setStyle(Paint$Style.STROKE);
       shapeDrawabl.getPaint().setStrokeWidth((float)a1.e(0x3f800000));
       Drawable[] uDrawableArr = new Drawable[]{obj,shapeDrawabl};
       return new LayerDrawable(uDrawableArr);
    }
    public final LayerDrawable c(float[] p0,int p1){
       ShapeDrawable obj;
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PrettifyDoubleSeekBar.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ShapeDrawable(new RoundRectShape(p0, null, null));
       obj.getPaint().setColor(0x1a000000);
       obj.getPaint().setStyle(Paint$Style.FILL);
       obj.getPaint().setMaskFilter(new BlurMaskFilter((float)a1.e(5.00f), BlurMaskFilter$Blur.OUTER));
       Drawable[] uDrawableArr = new Drawable[]{obj};
       return new LayerDrawable(uDrawableArr);
    }
    public final LayerDrawable d(float[] p0,int p1){
       ShapeDrawable obj;
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, PrettifyDoubleSeekBar.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ShapeDrawable(new RoundRectShape(p0, null, null));
       obj.getPaint().setColor(p1);
       obj.getPaint().setStyle(Paint$Style.FILL);
       Drawable[] uDrawableArr = new Drawable[]{obj};
       return new LayerDrawable(uDrawableArr);
    }
    public final void e(Canvas p0,int p1){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PrettifyDoubleSeekBar.class, "11")) {
          return;
       }
       if (this.c != null) {
          PrettifyDoubleSeekBar tC = this.C;
          if (tC != null || (this.e >= (- this.u) && (tC != 1 || this.e >= null))) {
             tC = this.e;
             if (tC <= this.u) {
                if (this.t > tC) {
                   tC = this.d;
                }
                b uob = new b();
                uob.g(KwaiRadiusStyles.FULL);
                uob.v(a1.a(R.color.arg_RES_7f061c32));
                uob.u((float)a1.d(R.dimen.arg_RES_7f07025d));
                uob.t((float)a1.d(R.dimen.arg_RES_7f07025d));
                Drawable uDrawable = uob.a();
                int intrinsicWid = (this.D != null)? uDrawable.getIntrinsicWidth(): uDrawable.getIntrinsicWidth() / 2;
                int i = intrinsicWid;
                intrinsicWid = (this.D != null)? uDrawable.getIntrinsicHeight(): uDrawable.getIntrinsicHeight() / 2;
                this.g(p0, uDrawable, p1, i, intrinsicWid);
             }
          }
       }
       return;
    }
    public final void f(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyDoubleSeekBar.class, "10")) {
          return;
       }
       if (this.g != null) {
          String str = (TextUtils.x(this.h))? String.valueOf(this.t): this.h;
          p0.drawText(str, (((float)this.b.getBounds().left - (this.f.measureText(str) / 2.00f)) + (float)(int)((float)this.b.getIntrinsicWidth() / 2.00f)), this.f.getTextSize(), this.f);
       }
       return;
    }
    public final void g(Canvas p0,Drawable p1,int p2,int p3,int p4){
       int i = 2;
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, PrettifyDoubleSeekBar.class, "9")) {
             return;
          }
       }
       int i1 = (((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()) / i) + this.getPaddingTop();
       p3 = p3 / i;
       p4 = p4 / i;
       i = i1 - p4;
       p1.setBounds(new Rect((p2 - p3), i, (p2 + p3), (i1 + p4)));
       p1.setVisible(1, 1);
       p1.draw(p0);
       return;
    }
    public final int getCurrentProgressBarHeight(){
       int i = (this.D != null)? this.s * 2: this.s;
       return i;
    }
    public int getDefaultIndicatorProgress(){
       return this.e;
    }
    public int getMaxProgress(){
       return this.u;
    }
    public int getProgress(){
       return this.t;
    }
    public Paint getProgressTextPaint(){
       return this.f;
    }
    public final void h(Canvas p0,Drawable p1,int p2){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PrettifyDoubleSeekBar.class, "4")) {
          return;
       }
       int i = (((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()) / 2) + this.getPaddingTop();
       Paint paint = new Paint();
       paint.setColor(0xff000000);
       RectF rectF = new RectF();
       float f = 0x3f800000;
       rectF.left = (float)(a1.e(8.00f) + p2) - (((float)p1.getIntrinsicWidth() * f) / 2.00f);
       rectF.right = (float)(p2 - a1.e(8.00f)) + (((float)p1.getIntrinsicWidth() * f) / 2.00f);
       rectF.top = (float)(i - a1.e(5.00f));
       rectF.bottom = (float)(i + a1.e(5.00f));
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
       p0.saveLayer(rectF, paint, 31);
       p0.drawRect(rectF, paint);
       p0.restore();
       if (!PatchProxy.isSupport(PrettifyDoubleSeekBar.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, PrettifyDoubleSeekBar.class, "8")) {
          this.g(p0, p1, p2, p1.getIntrinsicWidth(), p1.getIntrinsicHeight());
       }
       return;
    }
    public final int i(int p0,int p1,int p2){
       PrettifyDoubleSeekBar obj;
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, PrettifyDoubleSeekBar.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.C;
       if (obj == null) {
          return (p0 + (int)(((float)p1 / 2.00f) * ((float)p2 / (float)this.u)));
       }else if(obj == 1){
          return (this.getPaddingLeft() + (int)((float)p1 * ((float)p2 / (float)this.u)));
       }else {
          return 0;
       }
    }
    public final int j(int p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.w <= null) {
          return p0;
       }else {
          int defaultIndic = this.getDefaultIndicatorProgress();
          if (defaultIndic >= 0 && (defaultIndic <= this.u && p0 != defaultIndic)) {
             PrettifyDoubleSeekBar tw = this.w;
             if (p0 > (defaultIndic - tw) && p0 < (tw + defaultIndic)) {
                return defaultIndic;
             }
          }
       label_003a :
          return p0;
       }
    }
    public final void k(boolean p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, PrettifyDoubleSeekBar.class, "19")) {
          return;
       }
       PrettifyDoubleSeekBar tz = this.z;
       if (tz != null) {
          tz.cancel();
          this.z = null;
       }
       int i = 255;
       if (!p0 || (this.y == i || (!p0 && this.y == null))) {
          return;
       }else {
          int[] ointArray = new int[1];
          if (!p0) {
             i = 0;
          }
          ointArray[0] = i;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          this.z = valueAnimato;
          valueAnimato.addUpdateListener(new p(this));
          this.z.setInterpolator(new e());
          this.z.setDuration(300);
          this.z.start();
          return;
       }
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, PrettifyDoubleSeekBar.class, "17")) {
          return;
       }
       this.setProgressTextAlpha(255);
       this.a(false);
       return;
    }
    public void m(int p0,String p1){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, PrettifyDoubleSeekBar.class, "24")) {
          return;
       }
       this.h = p1;
       this.setProgress(p0);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrettifyDoubleSeekBar.class, "3")) {
          return;
       }
       super.onDraw(p0);
       int i = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       int i1 = (i / 2) + this.getPaddingLeft();
       int i2 = (((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom()) / 2) + this.getPaddingTop();
       int i3 = this.getCurrentProgressBarHeight() / 2;
       int i4 = i2 - i3;
       i2 = i2 + i3;
       PrettifyDoubleSeekBar tD = this.D;
       PrettifyDoubleSeekBar tk = (tD != null)? this.k: this.j;
       this.i = tk;
       PrettifyDoubleSeekBar tn = (tD != null)? this.n: this.m;
       this.l = tn;
       tD = (tD != null)? this.q: this.p;
       this.o = tD;
       tD = this.C;
       if (tD == null) {
          tk.setBounds(this.getPaddingLeft(), i4, (this.getWidth() - this.getPaddingRight()), i2);
          this.i.setVisible(true, true);
          this.i.draw(p0);
          this.l.setBounds(this.getPaddingLeft(), i4, (this.getWidth() - this.getPaddingRight()), i2);
          this.l.setVisible(true, true);
          this.l.draw(p0);
          i3 = this.i(i1, i, this.t);
          tk = this.t;
          int i5 = (tk > null)? i1: i3;
          if (tk <= null) {
             i3 = i1;
          }
          this.o.setBounds(i5, i4, i3, i2);
          this.o.setVisible(true, true);
          this.o.draw(p0);
          this.e(p0, this.i(i1, i, this.e));
          this.h(p0, this.b, this.i(i1, i, this.t));
          this.f(p0);
       }else if(tD == true){
          tk.setBounds(this.getPaddingLeft(), i4, (this.getWidth() - this.getPaddingRight()), i2);
          this.i.setVisible(true, true);
          this.i.draw(p0);
          this.l.setBounds(this.getPaddingLeft(), i4, (this.getWidth() - this.getPaddingRight()), i2);
          this.l.setVisible(true, true);
          this.l.draw(p0);
          this.o.setBounds(this.getPaddingLeft(), i4, this.i(i1, i, this.t), i2);
          this.o.setVisible(true, true);
          this.o.draw(p0);
          this.e(p0, this.i(i1, i, this.e));
          this.h(p0, this.b, this.i(i1, i, this.t));
          this.f(p0);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PrettifyDoubleSeekBar.class, "5")) {
          return;
       }
       PrettifyDoubleSeekBar tb = this.b;
       int i = (tb == null)? 0: tb.getIntrinsicHeight();
       this.setMeasuredDimension(View.resolveSizeAndState(((this.getPaddingLeft() + this.getPaddingRight()) + 0), p0, 0), View.resolveSizeAndState((Math.max(i, this.getCurrentProgressBarHeight()) + (this.getPaddingBottom() + this.getPaddingTop())), p1, 0));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       PrettifyDoubleSeekBar tr;
       int i1;
       PrettifyDoubleSeekBar tu;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, PrettifyDoubleSeekBar.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int b = false;
       if (!this.isEnabled()) {
          this.D = b;
          return b;
       }else {
          int action = p0.getAction();
          if (action) {
             if (action != 1) {
                if (action != 2) {
                   this.D = b;
                }else {
                   int i = (int)p0.getX();
                   if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class)) {
                      obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, PrettifyDoubleSeekBar.class, "7");
                      if (obj != patchProxyRe) {
                         b = obj.intValue();
                      }else {
                      label_0050 :
                         PrettifyDoubleSeekBar tC = this.C;
                         if (tC == null) {
                            i1 = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
                            action = (i1 / 2) + this.getPaddingLeft();
                            b = this.getPaddingLeft();
                            int i2 = this.getWidth() - this.getPaddingRight();
                            if (i >= action) {
                               if (i >= i2) {
                                  tr = this.u;
                               }else {
                                  tu = this.u;
                               label_008a :
                                  i = (int)((float)(tu * (i - action)) / ((float)i1 / 2.00f));
                               }
                            }else if(i <= b){
                               i = - this.u;
                            }else {
                               tu = this.u;
                               goto label_008a ;
                            }
                            b = this.j(tr);
                         }else if(tC == true){
                            i1 = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
                            action = this.getPaddingLeft();
                            if (i >= (this.getWidth() - this.getPaddingRight())) {
                               tu = this.u;
                            }else if(i <= action){
                               b = (this.u * (i - action)) / i1;
                            }
                            b = this.j(tu);
                         }
                      }
                   }else {
                      goto label_0050 ;
                   }
                   this.t = b;
                   this.invalidate();
                   tr = this.r;
                   if (tr != null) {
                      tr.U1(this, this.t);
                   }
                }
             }else {
                this.D = b;
                if (this.v != null) {
                   this.A.postDelayed(this.B, 2000);
                }
                tr = this.r;
                if (tr != null) {
                   tr.V1(this, this.t);
                }
                this.invalidate();
             }
          }else {
             this.D = true;
             if (this.v != null) {
                this.l();
                this.k(true);
             }
             tr = this.r;
             if (tr != null) {
                tr.N2(this, this.t);
             }
          }
          return true;
       }
    }
    public void setDefaultIndicatorProgress(int p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "22")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
    public void setOnSeekBarChangeListener(PrettifyDoubleSeekBar$a p0){
       this.r = p0;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "23")) {
          return;
       }
       this.t = p0;
       this.invalidate();
       return;
    }
    public void setProgressAndRefresh(int p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "26")) {
          return;
       }
       this.t = p0;
       this.invalidate();
       PrettifyDoubleSeekBar tr = this.r;
       if (tr != null) {
          tr.U1(this, this.t);
       }
       return;
    }
    public final void setProgressTextAlpha(int p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "20")) {
          return;
       }
       Paint progressText = this.getProgressTextPaint();
       if (progressText != null) {
          if (!PatchProxy.isSupport(PrettifyDoubleSeekBar.class) || !PatchProxy.applyVoidTwoRefs(progressText, Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "21")) {
             int i = 128;
             if (p0 < i) {
                if (this.y >= i) {
                   progressText.clearShadowLayer();
                }
             }else if(this.y < i){
                progressText.setShadowLayer((float)a1.e(5.00f), 0, 0, a1.a(R.color.arg_RES_7f06203c));
             }
             this.y = p0;
             progressText.setColor(((p0 << 24) | this.x));
          }
          this.invalidate();
       }
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(PrettifyDoubleSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PrettifyDoubleSeekBar.class, "6")) {
          return;
       }
       super.setVisibility(p0);
       boolean b = (!p0)? true: false;
       this.a(b);
       return;
    }
    public void setupSeekBarMode(int p0){
       this.C = p0;
    }
}
