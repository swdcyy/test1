package com.kwai.moved.ks_page.fragment.KsAlbumAttrAnimProgressBar;
import android.view.View;
import java.lang.Float;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import java.lang.String;
import android.graphics.Color;
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
import dc7.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import dc7.b;
import android.animation.Animator$AnimatorListener;

public class KsAlbumAttrAnimProgressBar extends View	// class@000f6d
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
       KsAlbumAttrAnimProgressBar.r = Float.valueOf(360.00f);
    }
    public void KsAlbumAttrAnimProgressBar(Context p0){
       super(p0, null);
    }
    public void KsAlbumAttrAnimProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c = 0;
       this.d = 100;
       this.e = Color.parseColor("#00000000");
       this.f = Color.parseColor("#ffffff");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumAttrAnimProgressBar.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, KsAlbumAttrAnimProgressBar.class, "6")) {
          this.b.setColor(this.e);
          this.b.setStyle(Paint$Style.FILL);
          p0.drawCircle((float)(this.i / 2), (float)(this.j / 2), (float)(this.k - this.h), this.b);
          this.b.setColor(this.f);
          this.b.setStyle(Paint$Style.STROKE);
          this.b.setStrokeWidth((float)this.h);
          Float r = KsAlbumAttrAnimProgressBar.r;
          float f = (r.floatValue() / (float)this.d) * this.c;
          p0.drawArc(this.l, this.p, f, false, this.b);
          this.b.setColor(this.g);
          this.b.setStrokeWidth((float)this.h);
          p0.drawArc(this.l, (this.p + f), (r.floatValue() - f), false, this.b);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KsAlbumAttrAnimProgressBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KsAlbumAttrAnimProgressBar.class, "4")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.i = this.getMeasuredWidth();
       p0 = this.getMeasuredHeight();
       this.j = p0;
       KsAlbumAttrAnimProgressBar ti = this.i;
       int i = (ti > p0)? p0 / 2: ti / 2;
       this.k = i;
       KsAlbumAttrAnimProgressBar th = this.h;
       this.l.set((float)(((ti / 2) - i) + (th / 2)), (float)(((p0 / 2) - i) + (th / 2)), (float)(((ti / 2) + i) - (th / 2)), (float)(((p0 / 2) + i) - (th / 2)));
       return;
    }
    public void setBackgroudColor(int p0){
       this.e = p0;
    }
    public void setIntermediateMode(boolean p0){
       KsAlbumAttrAnimProgressBar tn;
       if (PatchProxy.isSupport(KsAlbumAttrAnimProgressBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KsAlbumAttrAnimProgressBar.class, "2")) {
          return;
       }
       if (this.m != p0) {
          this.m = p0;
          if (!p0) {
             this.o.cancel();
          }else if(PatchProxy.applyVoid(null, this, KsAlbumAttrAnimProgressBar.class, "7")){
             this.q = (float)this.n;
             if (this.o == null) {
                ValueAnimator valueAnimato = new ValueAnimator();
                float[] uofloatArray = new float[]{(float)tn,(float)(this.d - tn)};
                tn = this.n;
                valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                this.o = valueAnimato;
                valueAnimato.setDuration(1000);
                this.o.setInterpolator(new AccelerateDecelerateInterpolator());
                this.o.addUpdateListener(new a(this));
                this.o.addListener(new b(this));
             }
             this.o.setRepeatCount(-1);
             this.o.start();
          }
       }
       if (!PatchProxy.applyVoid(null, this, KsAlbumAttrAnimProgressBar.class, "3")) {
          this.c = 0;
          this.p = -90.00f;
          this.e = Color.parseColor("#00000000");
          this.f = Color.parseColor("#ffffff");
          this.g = Color.parseColor("#00000000");
       }
       this.invalidate();
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(KsAlbumAttrAnimProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KsAlbumAttrAnimProgressBar.class, "1")) {
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
