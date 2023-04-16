package com.yxcorp.gifshow.camera.record.widget.PieChartProgress;
import android.view.View;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Path;
import lnc.a1;
import android.graphics.Paint$Style;
import android.animation.ValueAnimator;
import ki9.n;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.PieChartProgress$a;
import android.animation.Animator$AnimatorListener;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import java.lang.Float;

public class PieChartProgress extends View	// class@000fce
{
    public Paint b;
    public RectF c;
    public Path d;
    public RectF e;
    public float f;
    public int g;
    public int h;
    public ValueAnimator i;
    public int j;
    public float k;
    public static final int l;

    public void PieChartProgress(Context p0){
       super(p0);
       this.e = new RectF();
       this.h = 1200;
       this.a();
    }
    public void PieChartProgress(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = new RectF();
       this.h = 1200;
       this.b(p0, p1);
       this.a();
    }
    public void PieChartProgress(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new RectF();
       this.h = 1200;
       this.b(p0, p1);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PieChartProgress.class, "3")) {
          return;
       }
       this.c = new RectF();
       this.b = new Paint();
       this.d = new Path();
       this.j = a1.e(2.00f);
       this.b.setColor(-1);
       this.b.setStyle(Paint$Style.FILL);
       this.f = 0;
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{0,360});
       this.i = valueAnimato;
       valueAnimato.setDuration((long)this.h);
       this.i.addUpdateListener(new n(this));
       this.i.setStartDelay((long)this.g);
       this.i.addListener(new PieChartProgress$a(this));
       return;
    }
    public final void b(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PieChartProgress.class, "2")) {
          return;
       }
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, c$b.V3, 0, 0);
       this.h = typedArray.getInt(0, 1200);
       this.g = typedArray.getInt(1, 0);
       return;
    }
    public float getStartAngle(){
       return this.f;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PieChartProgress.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if ((int)this.f >= 360) {
          return;
       }
       float f = (float)this.getWidth() / 2.00f;
       float f1 = (float)this.getHeight() / 2.00f;
       p0.translate(f, f1);
       this.c.set((- f), (- f1), f, f1);
       this.d.reset();
       PieChartProgress tk = this.k;
       f = f - tk;
       f1 = f1 - tk;
       p0.rotate(this.getRotation());
       this.e.set((- f), (- f1), f, f1);
       tk = this.j;
       float f2 = (float)tk;
       this.d.addRoundRect(this.e, f2, (float)tk, Path$Direction.CW);
       p0.clipPath(this.d);
       p0.rotate(-90.00f);
       PieChartProgress tf = this.f;
       p0.drawArc(this.c, tf, (360.00f - tf), true, this.b);
       return;
    }
    public void setClipRectMargin(float p0){
       this.k = p0;
    }
    public void setRoundCorner(int p0){
       this.j = p0;
    }
    public void setStartAngle(float p0){
       if (PatchProxy.isSupport(PieChartProgress.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, PieChartProgress.class, "1")) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
}
