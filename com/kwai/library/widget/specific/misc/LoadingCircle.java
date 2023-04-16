package com.kwai.library.widget.specific.misc.LoadingCircle;
import android.view.View;
import java.lang.String;
import android.graphics.Color;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.library.widget.specific.misc.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b27.d;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.view.MotionEvent;

public class LoadingCircle extends View	// class@000a13
{
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public float n;
    public int o;
    public int p;
    public float q;
    public int r;
    public int s;
    public int t;
    public Paint u;
    public boolean v;
    public static final int w;

    static {
       LoadingCircle.w = Color.parseColor("#F2C7C7C7");
    }
    public void LoadingCircle(Context p0){
       super(p0);
       this.b = 90;
       this.c = 25;
       this.d = 270;
       this.e = 0;
       this.f = 500;
       this.g = 1000;
       this.h = 3.00f;
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = false;
       this.m = -90;
       this.n = 0;
       this.o = 270;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 270;
       this.t = 135;
       this.v = false;
       this.a();
    }
    public void LoadingCircle(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 90;
       this.c = 25;
       this.d = 270;
       this.e = 0;
       this.f = 500;
       this.g = 1000;
       this.h = 3.00f;
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = false;
       this.m = -90;
       this.n = 0;
       this.o = 270;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 270;
       this.t = 135;
       this.v = false;
       this.a();
    }
    public void LoadingCircle(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 90;
       this.c = 25;
       this.d = 270;
       this.e = 0;
       this.f = 500;
       this.g = 1000;
       this.h = 3.00f;
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = false;
       this.m = -90;
       this.n = 0;
       this.o = 270;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 270;
       this.t = 135;
       this.v = false;
       this.a();
    }
    public final void a(){
       Paint paint = new Paint();
       this.u = paint;
       paint.setAntiAlias(true);
       this.u.setStyle(Paint$Style.STROKE);
       this.u.setStrokeCap(Paint$Cap.ROUND);
       this.u.setColor(LoadingCircle.w);
       this.h = c.c(this.getResources()).density;
       this.u.setStrokeWidth(3.00f);
    }
    public final void b(){
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{0,270});
       valueAnimato.setRepeatCount(0);
       valueAnimato.setInterpolator(new AccelerateInterpolator());
       valueAnimato.setDuration(this.f);
       valueAnimato.addUpdateListener(new f(this, valueAnimato));
       valueAnimato.start();
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[2]{0,'Z'});
       valueAnimato1.setRepeatCount(0);
       valueAnimato1.setDuration(this.f);
       valueAnimato1.addUpdateListener(new d(this));
       valueAnimato1.start();
    }
    public void onDraw(Canvas p0){
       if (this.v == null) {
          this.b();
          this.v = true;
       }
       RectF rectF = new RectF((float)(this.getPaddingLeft() + 0), (float)(this.getPaddingTop() + 0), (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()));
       if (this.i != null) {
          p0.drawArc(rectF, ((float)this.m + this.n), (float)this.e, false, this.u);
       }else if(this.j != null){
          p0.drawArc(rectF, (float)this.p, (float)this.o, false, this.u);
       }else if(this.k != null){
          p0.drawArc(rectF, (this.q + 90.00f), (float)this.r, false, this.u);
       }else if(this.l != null){
          p0.drawArc(rectF, (float)this.t, (float)this.s, false, this.u);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       p0 = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       p0 = (View$MeasureSpec.getMode(p0) == Integer.MIN_VALUE && mode == Integer.MIN_VALUE)? (int)this.h * 25: Math.min(p1, p0);
       this.setMeasuredDimension(p0, p0);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
}
