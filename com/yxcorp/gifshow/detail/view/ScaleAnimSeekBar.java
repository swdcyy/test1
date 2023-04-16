package com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Rect;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import n9a.x;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import n9a.w;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Float;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Canvas;
import th0.e;
import n9a.y;
import com.yxcorp.gifshow.detail.view.ScaleAnimSeekBar$a;
import android.util.StateSet;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.view.ViewParent;

public class ScaleAnimSeekBar extends View	// class@001a59
{
    public Drawable A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ScaleAnimSeekBar$a G;
    public boolean H;
    public boolean I;
    public ValueAnimator J;
    public ValueAnimator K;
    public ValueAnimator L;
    public float M;
    public float N;
    public float O;
    public float P;
    public Paint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public GradientDrawable t;
    public GradientDrawable u;
    public GradientDrawable v;
    public Rect w;
    public Rect x;
    public Rect y;
    public Rect z;
    public static final int Q;

    public void ScaleAnimSeekBar(Context p0){
       super(p0, null);
    }
    public void ScaleAnimSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ScaleAnimSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       p2 = -2236963;
       this.c = p2;
       this.d = -14112027;
       this.e = 0x7b28aae5;
       int i = 6;
       this.f = i;
       this.g = 0;
       this.h = 100;
       this.i = 1;
       this.j = 2;
       this.k = false;
       this.A = null;
       this.B = false;
       this.C = false;
       this.D = false;
       this.E = true;
       this.H = false;
       this.I = false;
       this.M = 0x3fab851f;
       float f = 0x3f800000;
       this.N = f;
       float f1 = 2.00f;
       this.O = f1;
       this.P = f;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScaleAnimSeekBar.class, "1")) {
       }else if(p1 != null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.K4);
          this.j = typedArray.getDimensionPixelSize(i, this.f(p0, f1)) / 2;
          this.i = typedArray.getDimensionPixelSize(5, this.f(p0, f));
          this.f = typedArray.getDimensionPixelSize(12, this.f(p0, 6.00f));
          this.A = typedArray.getDrawable(11);
          this.c = typedArray.getColor(3, p2);
          this.d = typedArray.getColor(4, -14112027);
          this.e = typedArray.getColor(8, -14112027);
          this.g = typedArray.getInt(1, 0);
          this.h = typedArray.getInt(0, 100);
          this.k = typedArray.getBoolean(2, 0);
          this.H = typedArray.getBoolean(13, 0);
          this.I = typedArray.getBoolean(9, 0);
          this.n = typedArray.getDimensionPixelOffset(10, this.n);
          this.m = typedArray.getDimensionPixelOffset(7, this.m);
          typedArray.recycle();
       }
       Paint paint = new Paint();
       this.b = paint;
       paint.setStyle(Paint$Style.FILL);
       this.b.setAntiAlias(1);
       GradientDrawable gradientDraw = new GradientDrawable();
       this.t = gradientDraw;
       gradientDraw.setShape(0);
       this.t.setColor(this.c);
       gradientDraw = new GradientDrawable();
       this.u = gradientDraw;
       gradientDraw.setShape(0);
       this.u.setColor(this.d);
       gradientDraw = new GradientDrawable();
       this.v = gradientDraw;
       gradientDraw.setShape(0);
       this.v.setColor(this.e);
       this.w = new Rect();
       this.x = new Rect();
       this.z = new Rect();
       this.y = new Rect();
       this.o = this.g;
       return;
    }
    public final void a(boolean p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleAnimSeekBar.class, "17")) {
          return;
       }
       ScaleAnimSeekBar tP = this.P;
       ScaleAnimSeekBar tO = (p0)? this.O: 0x3f800000;
       ScaleAnimSeekBar tK = this.K;
       if (tK == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.K = valueAnimato;
          valueAnimato.setDuration(250);
          this.K.setInterpolator(new LinearInterpolator());
          this.K.addUpdateListener(new x(this));
       }else {
          tK.cancel();
       }
       float[] uofloatArray = new float[]{tP,tO};
       this.K.setFloatValues(uofloatArray);
       this.K.start();
       return;
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleAnimSeekBar.class, "16")) {
          return;
       }
       ScaleAnimSeekBar tN = this.N;
       ScaleAnimSeekBar tM = (p0)? this.M: 0x3f800000;
       ScaleAnimSeekBar tJ = this.J;
       if (tJ == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.J = valueAnimato;
          valueAnimato.setDuration(250);
          this.J.setInterpolator(new LinearInterpolator());
          this.J.addUpdateListener(new w(this));
       }else {
          tJ.cancel();
       }
       float[] uofloatArray = new float[]{tN,tM};
       this.J.setFloatValues(uofloatArray);
       this.J.start();
       return;
    }
    public final float c(float p0){
       float f = (float)(this.l / 2);
       if (p0 - f > 0) {
          return f;
       }
       f = - f;
       if (p0 - f < 0) {
          return f;
       }
       return p0;
    }
    public int d(int p0){
       ScaleAnimSeekBar obj;
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.l;
       if (p0 > (obj / 2)) {
          return this.h;
       }else if(p0 < ((- obj) / 2)){
          return this.g;
       }else {
          return (Math.round(((((float)p0 + ((float)obj / 2.00f)) * (float)(this.h - this.g)) / (float)obj)) + this.g);
       }
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleAnimSeekBar.class, "15")) {
          return;
       }
       if (this.H == null) {
          return;
       }
       if (p0) {
          this.b(true);
          this.a(true);
       }else {
          this.b(false);
          this.a(false);
       }
       return;
    }
    public final int f(Context p0,float p1){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, ScaleAnimSeekBar.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)((p1 * c.c(p0.getResources()).density) + 0x3f000000);
    }
    public void g(Canvas p0,Rect p1,GradientDrawable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ScaleAnimSeekBar.class, "7")) {
          return;
       }
       p0.save();
       Rect rect = new Rect();
       ScaleAnimSeekBar tP = this.P;
       rect.top = (int)((float)p1.top * tP);
       rect.bottom = (int)((float)p1.bottom * tP);
       rect.left = p1.left;
       rect.right = p1.right;
       p2.setBounds(rect);
       p2.setCornerRadius(((float)this.i * this.P));
       p2.draw(p0);
       p0.restore();
       return;
    }
    public int getMaxProgress(){
       return this.h;
    }
    public int getProgress(){
       return this.o;
    }
    public int getProgressLength(){
       return this.l;
    }
    public int getProgressX(){
       Object obj = PatchProxy.apply(null, this, ScaleAnimSeekBar.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)(this.getX() + ((float)this.f * this.M));
    }
    public int getSecondaryProgress(){
       return this.q;
    }
    public final void h(float p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ScaleAnimSeekBar.class, "13")) {
          return;
       }
       ScaleAnimSeekBar tz = this.z;
       ScaleAnimSeekBar tf = this.f;
       tz.left = (int)(p0 - (float)tf);
       tz.right = (int)((float)tf + p0);
       this.x.right = (int)p0;
       this.invalidate();
       return;
    }
    public final float i(int p0){
       ScaleAnimSeekBar tl = this.l;
       ScaleAnimSeekBar tg = this.g;
       float f = (float)tl;
       return ((((float)tl * (float)(p0 - tg)) / (float)(this.h - tg)) - (f / 2.00f));
    }
    public void j(int p0,boolean p1,boolean p2){
       ScaleAnimSeekBar scaleAnimSee;
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, ScaleAnimSeekBar.class, "11")) {
          return;
       }
       ScaleAnimSeekBar tg = this.g;
       if (p0 > tg) {
          tg = this.h;
          if (p0 < tg) {
          label_002b :
             if (!PatchProxy.isSupport(ScaleAnimSeekBar.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p1), Integer.valueOf(scaleAnimSee), this, ScaleAnimSeekBar.class, "12")) {
                if (p1) {
                   float f = this.c(this.i(this.o));
                   float f1 = this.c(this.i(scaleAnimSee));
                   tg = this.L;
                   if (tg == null) {
                      ValueAnimator valueAnimato = new ValueAnimator();
                      this.L = valueAnimato;
                      valueAnimato.setDuration(300);
                      this.L.setInterpolator(new e());
                      this.L.addUpdateListener(new y(this));
                   }else {
                      tg.cancel();
                   }
                   float[] uofloatArray = new float[]{f,f1};
                   this.L.setFloatValues(uofloatArray);
                   this.L.start();
                }else {
                   this.o = scaleAnimSee;
                   this.h(this.c(this.i(scaleAnimSee)));
                }
             }
             scaleAnimSee = this.G;
             if (scaleAnimSee != null) {
                tg = this.o;
                if (this.p != tg) {
                   this.D = p2;
                   scaleAnimSee.c(this, tg, p2);
                   this.D = false;
                }
             }
             this.p = this.o;
             return;
          }
       }
       scaleAnimSee = tg;
       goto label_002b ;
    }
    public void k(boolean p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleAnimSeekBar.class, "6")) {
          return;
       }
       ScaleAnimSeekBar tA = this.A;
       if (tA == null) {
          return;
       }
       int[] ointArray = (p0)? new int[2]{0x10100a7,0x10100a1}: StateSet.NOTHING;
       if (tA != null && (tA.isStateful() && this.A.setState(ointArray))) {
          this.invalidateDrawable(this.A);
       }
    label_003c :
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScaleAnimSeekBar.class, "5")) {
          return;
       }
       super.onDraw(p0);
       p0.save();
       if (!PatchProxy.applyVoidOneRefs(p0, this, ScaleAnimSeekBar.class, "4")) {
          p0.translate((float)(this.s / 2), (float)(this.r / 2));
       }
       this.g(p0, this.w, this.t);
       this.g(p0, this.y, this.v);
       this.g(p0, this.x, this.u);
       if (!PatchProxy.applyVoidOneRefs(p0, this, ScaleAnimSeekBar.class, "8")) {
          p0.save();
          ScaleAnimSeekBar tA = this.A;
          if (tA != null) {
             tA.setBounds(this.z);
             this.A.draw(p0);
          }else {
             this.b.setColor(this.d);
             p0.drawCircle((float)this.z.centerX(), (float)this.z.centerY(), (((float)this.z.width() * this.N) / 2.00f), this.b);
          }
          p0.restore();
       }
       p0.restore();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ScaleAnimSeekBar.class, "3")) {
          return;
       }
       p0 = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       ScaleAnimSeekBar scaleAnimSee = 0x40000000;
       this.s = (View$MeasureSpec.getMode(p0) == scaleAnimSee)? p0: this.getWidth();
       this.r = (mode == scaleAnimSee)? p1: this.getHeight();
       ScaleAnimSeekBar ts = this.s;
       ScaleAnimSeekBar tr = this.r;
       if (!PatchProxy.isSupport(ScaleAnimSeekBar.class) || (PatchProxy.applyVoidTwoRefs(Integer.valueOf(ts), Integer.valueOf(tr), this, ScaleAnimSeekBar.class, "2") || (ts > null && tr > null))) {
          this.l = (this.H != null)? (int)(((float)ts - ((float)(this.f * 2) * this.M)) + (float)this.m): ts - (this.f * 2);
          tr = this.w;
          int i = - this.j;
          tr.top = i;
          mode = - i;
          tr.bottom = mode;
          scaleAnimSee = this.k;
          int i1 = (scaleAnimSee != null)? - ts: - this.l;
          tr.left = i1 / 2;
          i1 = (scaleAnimSee != null)? ts / 2: this.l / 2;
          tr.right = i1;
          tr = this.x;
          tr.top = i;
          tr.bottom = mode;
          mode = (scaleAnimSee != null)? - ts: - this.l;
          tr.left = mode / 2;
          mode = - this.l;
          i1 = mode / 2;
          tr.right = i1;
          ScaleAnimSeekBar ty = this.y;
          ty.top = i;
          ty.bottom = - tr.top;
          if (scaleAnimSee != null) {
             mode = - ts;
          }
          ty.left = mode / 2;
          ty.right = i1;
          ts = this.z;
          tr = this.f;
          ts.top = - tr;
          ts.bottom = tr;
          ts.left = i1 - tr;
          ts.right = i1 + tr;
          this.setThumbDrawable(this.A);
          this.setProgress(this.o);
          this.setSecondaryProgress(this.q);
       }
    label_00f3 :
       this.setMeasuredDimension(this.s, this.r);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       ScaleAnimSeekBar tG;
       Object obj = PatchProxy.applyOneRefs(p0, this, ScaleAnimSeekBar.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 2;
       float f = p0.getX() - (float)(this.s / i);
       float f1 = p0.getY() - (float)(this.r / i);
       ViewParent parent = this.getParent();
       int action = p0.getAction();
       boolean b = false;
       if (action) {
          if (action != 1) {
             if (action != i) {
                if (action == 3) {
                   this.e(b);
                   this.k(b);
                   this.F = b;
                   this.C = b;
                   this.B = b;
                   tG = this.G;
                   if (tG != null) {
                      tG.a(this);
                   }
                   if (parent != null) {
                      parent.requestDisallowInterceptTouchEvent(b);
                   }
                }
             }else if(this.B != null || this.C != null){
                this.j(this.d((int)f), b, true);
             }
          }else {
             this.e(b);
             this.k(b);
             this.F = b;
             if (this.C != null || this.B != null) {
                this.C = b;
                this.B = b;
                this.j(this.d((int)f), this.I, true);
                tG = this.G;
                if (tG != null) {
                   tG.a(this);
                }
             }
             if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(b);
             }
          }
       }else if(this.E == null){
          return super.onTouchEvent(p0);
       }else {
          tG = this.z;
          Rect left = tG.left;
          Rect right = tG.right;
          if (left < right) {
             Rect top = tG.top;
             Rect bottom = tG.bottom;
             if (top < bottom) {
                ScaleAnimSeekBar tN = this.N;
                float f2 = (float)this.n;
                if (f - (((float)left * tN) - f2) >= 0 && (f - (((float)right * tN) + f2) <= 0 && (f1 - (((float)top * tN) - f2) >= 0 && f1 - (((float)bottom * tN) + f2) <= 0))) {
                   tG = 1;
                label_00d2 :
                   if (tG) {
                      this.e(true);
                      this.k(true);
                      this.B = true;
                      this.F = true;
                      tG = this.G;
                      if (tG != null) {
                         tG.b(this);
                      }
                      if (parent != null) {
                         parent.requestDisallowInterceptTouchEvent(true);
                      }
                   }else {
                      tG = this.w;
                      left = tG.left;
                      right = tG.right;
                      if (left < right) {
                         top = tG.top;
                         bottom = tG.bottom;
                         if (top < bottom) {
                            tN = this.P;
                            f2 = (float)this.n;
                            if (f - (((float)left * tN) - f2) >= 0 && (f - (((float)right * tN) + f2) <= 0 && (f1 - (((float)top * tN) - f2) >= 0 && f1 - (((float)bottom * tN) + f2) <= 0))) {
                               b = true;
                            }
                         }
                      }
                      if (b) {
                         this.e(true);
                         this.k(true);
                         this.C = true;
                         tG = this.G;
                         if (tG != null) {
                            tG.b(this);
                         }
                         if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                         }
                      }
                   }
                }
             }
          }
          tG = null;
          goto label_00d2 ;
       }
    label_0135 :
       return true;
    }
    public void setMaxProgress(int p0){
       this.h = p0;
    }
    public void setMinProgress(int p0){
       this.g = p0;
       if (this.o < p0) {
          this.o = p0;
       }
       return;
    }
    public void setOnSeekBarChangeListener(ScaleAnimSeekBar$a p0){
       this.G = p0;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "18")) {
          return;
       }
       this.j(p0, false, false);
       return;
    }
    public void setProgressBackgroundColor(int p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "19")) {
          return;
       }
       this.c = p0;
       this.t.setColor(p0);
       return;
    }
    public void setProgressColor(int p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "20")) {
          return;
       }
       this.d = p0;
       this.u.setColor(p0);
       return;
    }
    public void setProgressWidth(int p0){
       this.j = p0;
    }
    public void setSecondaryProgress(int p0){
       ScaleAnimSeekBar scaleAnimSee;
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "14")) {
          return;
       }
       ScaleAnimSeekBar tg = this.g;
       if (p0 > tg) {
          tg = this.h;
          if (p0 < tg) {
          label_0022 :
             this.q = scaleAnimSee;
             this.y.right = (int)this.c(this.i(scaleAnimSee));
             this.invalidate();
             return;
          }
       }
       scaleAnimSee = tg;
       goto label_0022 ;
    }
    public void setSecondaryProgressColor(int p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "21")) {
          return;
       }
       this.e = p0;
       this.v.setColor(p0);
       return;
    }
    public void setSeekBarStatePressed(boolean p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ScaleAnimSeekBar.class, "10")) {
          return;
       }
       this.e(p0);
       this.k(p0);
       return;
    }
    public void setThumbDrawable(Drawable p0){
       if (p0 == null) {
          return;
       }
       this.A = p0;
       return;
    }
    public void setThumbEnable(boolean p0){
       this.E = p0;
    }
    public void setThumbScale(float p0){
       this.N = p0;
    }
    public void setThumbTouchOffset(int p0){
       if (PatchProxy.isSupport(ScaleAnimSeekBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ScaleAnimSeekBar.class, "22")) {
          return;
       }
       this.n = p0;
       this.invalidate();
       return;
    }
}
