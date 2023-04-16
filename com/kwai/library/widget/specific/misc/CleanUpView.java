package com.kwai.library.widget.specific.misc.CleanUpView;
import android.view.View;
import java.lang.Float;
import com.kwai.library.widget.specific.misc.CleanUpView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.library.widget.specific.misc.CleanUpView$b;
import java.lang.Integer;
import com.kwai.library.widget.specific.misc.CleanUpView$c;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.PathMeasure;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.graphics.Paint$Style;
import android.animation.AnimatorSet;
import android.graphics.Canvas;
import java.lang.Math;
import android.animation.Animator$AnimatorListener;

public class CleanUpView extends View	// class@000a06
{
    public final Paint b;
    public final RectF c;
    public final RectF d;
    public final Path e;
    public final Path f;
    public final PathMeasure g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;
    public float n;
    public float o;
    public AnimatorSet p;
    public Animator$AnimatorListener q;
    public static final Property r;
    public static final Property s;
    public static final Property t;

    static {
       CleanUpView.r = new CleanUpView$a(Float.class, null);
       CleanUpView.s = new CleanUpView$b(Integer.class, null);
       CleanUpView.t = new CleanUpView$c(Float.class, null);
    }
    public void CleanUpView(Context p0){
       super(p0, null);
    }
    public void CleanUpView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CleanUpView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Paint paint = new Paint(1);
       this.b = paint;
       this.c = new RectF();
       this.d = new RectF();
       this.e = new Path();
       this.f = new Path();
       this.g = new PathMeasure();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.N);
       this.h = typedArray.getColor(1, -256);
       this.i = typedArray.getColor(0, -7829368);
       this.j = typedArray.getDimensionPixelSize(2, n.c(this.getContext().getApplicationContext(), 0x3f800000));
       typedArray.recycle();
       paint.setStyle(Paint$Style.STROKE);
       paint.setStrokeWidth((float)this.j);
       paint.setColor(this.h);
    }
    public final void a(){
       this.d.set(this.c);
       this.b();
    }
    public void b(){
       this.f.reset();
       CleanUpView td = this.d;
       td = this.d;
       this.f.moveTo((td.left + (td.width() * 0.25f)), (td.top + (td.height() * 0.45f)));
       td = this.d;
       td = this.d;
       this.f.lineTo((td.left + (td.width() * 0.40f)), (td.top + (td.height() * 0x3f266666)));
       td = this.d;
       td = this.d;
       this.f.lineTo((td.left + (td.width() * 0x3f400000)), (td.top + (td.height() * 0.40f)));
       this.g.setPath(this.f, false);
       this.n = this.g.getLength();
    }
    public void c(){
       CleanUpView tp = this.p;
       if (tp != null) {
          tp.cancel();
       }
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.k == 360) {
       }else {
          this.d.set(this.c);
          this.d.inset(this.m, this.m);
          this.b.setColor(this.i);
          this.b.setAlpha(this.l);
          p0.drawArc(this.d, -90.00f, 360.00f, false, this.b);
       }
       if (this.k != null) {
          this.d.set(this.c);
          this.d.inset(this.m, this.m);
          this.b.setColor(this.h);
          this.b.setAlpha(this.l);
          p0.drawArc(this.d, -90.00f, (float)this.k, false, this.b);
       }
       CleanUpView uCleanUpView = null;
       if (this.o - uCleanUpView) {
          this.b.setColor(this.h);
          this.b.setAlpha(this.l);
          if (this.o - this.n >= 0) {
             p0.drawPath(this.f, this.b);
          }else {
             this.e.reset();
             this.g.getSegment(uCleanUpView, this.o, this.e, true);
             p0.drawPath(this.e, this.b);
          }
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       p2 = Math.min(p0, p1) / 2;
       p0 = p0 / 2;
       p1 = p1 / 2;
       this.c.set((float)(p0 - p2), (float)(p1 - p2), (float)(p0 + p2), (float)(p1 + p2));
       CleanUpView tj = this.j;
       this.c.inset(((float)tj / 2.00f), ((float)tj / 2.00f));
       this.a();
    }
    public void setAnimatorListener(Animator$AnimatorListener p0){
       this.q = p0;
    }
    public void setDrawingPathLength(float p0){
       this.o = p0;
       this.invalidate();
    }
    public void setSweepAngle(int p0){
       this.k = p0;
       this.invalidate();
    }
}
