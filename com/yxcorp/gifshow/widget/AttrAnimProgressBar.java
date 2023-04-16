package com.yxcorp.gifshow.widget.AttrAnimProgressBar;
import android.view.View;
import java.lang.Float;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import java.lang.String;
import android.graphics.Color;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint$Style;
import java.lang.Integer;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import tyc.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import tyc.m;
import android.animation.Animator$AnimatorListener;

public class AttrAnimProgressBar extends View	// class@0017eb
{
    public Paint b;
    public float c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public RectF l;
    public boolean m;
    public int n;
    public ValueAnimator o;
    public float p;
    public float q;
    public static final Float r;

    static {
       AttrAnimProgressBar.r = Float.valueOf(360.00f);
    }
    public void AttrAnimProgressBar(Context p0){
       super(p0, null);
    }
    public void AttrAnimProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c = 0;
       this.d = 100;
       this.e = Color.parseColor("#00000000");
       this.f = a.a().a().getResources().getColor(0x7f06060a);
       this.g = Color.parseColor("#00000000");
       this.h = 5;
       this.l = new RectF();
       this.n = 5;
       this.p = -90.00f;
       this.q = 5.00f;
       this.b.setAntiAlias(true);
       this.b.setDither(true);
    }
    public int getBackgroundColor(){
       return this.e;
    }
    public int getProgressBackgroundColor(){
       return this.g;
    }
    public int getProgressColor(){
       return this.f;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressBar.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, AttrAnimProgressBar.class, "6")) {
          this.b.setColor(this.e);
          this.b.setStyle(Paint$Style.FILL);
          p0.drawCircle((float)(this.i / 2), (float)(this.j / 2), (float)(this.k - this.h), this.b);
          this.b.setColor(this.f);
          this.b.setStyle(Paint$Style.STROKE);
          this.b.setStrokeWidth((float)this.h);
          Float r = AttrAnimProgressBar.r;
          float f = (r.floatValue() / (float)this.d) * this.c;
          p0.drawArc(this.l, this.p, f, false, this.b);
          this.b.setColor(this.g);
          this.b.setStrokeWidth((float)this.h);
          p0.drawArc(this.l, (this.p + f), (r.floatValue() - f), false, this.b);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(AttrAnimProgressBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AttrAnimProgressBar.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.i = this.getMeasuredWidth();
       p0 = this.getMeasuredHeight();
       this.j = p0;
       AttrAnimProgressBar ti = this.i;
       int i = (ti > p0)? p0 / 2: ti / 2;
       this.k = i;
       AttrAnimProgressBar th = this.h;
       this.l.set((float)(((ti / 2) - i) + (th / 2)), (float)(((p0 / 2) - i) + (th / 2)), (float)(((ti / 2) + i) - (th / 2)), (float)(((p0 / 2) + i) - (th / 2)));
       return;
    }
    public void setBackgroudColor(int p0){
       this.e = p0;
    }
    public void setIntermediateMode(boolean p0){
       AttrAnimProgressBar tn;
       if (PatchProxy.isSupport(AttrAnimProgressBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AttrAnimProgressBar.class, "2")) {
          return;
       }
       Object[] objArray = null;
       if (this.m != p0) {
          this.m = p0;
          if (!p0) {
             this.o.cancel();
          }else if(PatchProxy.applyVoid(objArray, this, AttrAnimProgressBar.class, "7")){
             this.q = (float)this.n;
             if (this.o == null) {
                ValueAnimator valueAnimato = new ValueAnimator();
                float[] uofloatArray = new float[]{(float)tn,(float)(this.d - tn)};
                tn = this.n;
                valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                this.o = valueAnimato;
                valueAnimato.setDuration(1000);
                this.o.setInterpolator(new AccelerateDecelerateInterpolator());
                this.o.addUpdateListener(new l(this));
                this.o.addListener(new m(this));
             }
             this.o.setRepeatCount(-1);
             this.o.start();
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, AttrAnimProgressBar.class, "3")) {
          this.c = 0;
          this.p = -90.00f;
          this.e = Color.parseColor("#00000000");
          this.f = a.a().a().getResources().getColor(0x7f06060a);
          this.g = Color.parseColor("#00000000");
       }
       this.invalidate();
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(AttrAnimProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, AttrAnimProgressBar.class, "1")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setProgressBackgroundColor(int p0){
       this.g = p0;
    }
    public void setProgressColorX(int p0){
       this.f = p0;
    }
}
