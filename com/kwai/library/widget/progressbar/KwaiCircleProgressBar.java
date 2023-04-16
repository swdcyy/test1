package com.kwai.library.widget.progressbar.KwaiCircleProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import com.yxcorp.utility.n;
import java.lang.String;
import android.graphics.Color;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import kotlin.jvm.internal.a;
import h17.a;
import h17.a$a;
import j17.a;
import android.graphics.Paint$Style;
import android.graphics.Paint$Align;
import android.graphics.Canvas;
import android.view.View;
import java.lang.StringBuilder;
import android.graphics.Rect;

public final class KwaiCircleProgressBar extends ProgressBar	// class@0009b0
{
    public String A;
    public float b;
    public float c;
    public float d;
    public final RectF e;
    public final Paint f;
    public float g;
    public boolean h;
    public int i;
    public float j;
    public int k;
    public int l;
    public boolean m;
    public final RectF n;
    public final Paint o;
    public float p;
    public final RectF q;
    public final Paint r;
    public float s;
    public float t;
    public int u;
    public int v;
    public final Paint w;
    public boolean x;
    public int y;
    public int z;

    public void KwaiCircleProgressBar(Context p0){
       super(p0, null);
    }
    public void KwaiCircleProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KwaiCircleProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new RectF();
       int i = 1;
       Paint paint = new Paint(i);
       this.f = paint;
       this.g = (float)n.c(this.getContext(), 38.00f);
       this.i = Color.parseColor("#00000000");
       this.j = (float)n.c(this.getContext(), 5.00f);
       this.k = Color.parseColor("#ff5000");
       this.l = Color.parseColor("#ffd3d3d5");
       this.n = new RectF();
       Paint paint1 = new Paint(i);
       this.o = paint1;
       this.p = (float)n.c(this.getContext(), 20.00f);
       this.q = new RectF();
       Paint paint2 = new Paint(i);
       this.r = paint2;
       this.t = (float)n.c(this.getContext(), 2.50f);
       this.u = Paint$Join.MITER.ordinal();
       this.v = Paint$Cap.BUTT.ordinal();
       Paint paint3 = new Paint(i);
       this.w = paint3;
       this.y = Color.parseColor("#ff5000");
       this.z = n.c(this.getContext(), 10.00f);
       this.A = "";
       if (p0 != null && p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.H1);
          a.o(typedArray, "context.obtainStyledAttr¡­le.KwaiCircleProgressBar\)");
          a$a r = a.r;
          this.g = typedArray.getDimension(13, a.c(p0, r.a().f));
          this.h = typedArray.getBoolean(2, r.a().n);
          this.i = typedArray.getColor(11, a.a(p0, r.a().b));
          this.j = typedArray.getDimension(12, a.c(p0, r.a().g));
          this.m = typedArray.getBoolean(i, r.a().o);
          this.p = typedArray.getDimension(0, a.c(p0, r.a().h));
          this.k = typedArray.getColor(14, a.a(p0, r.a().d));
          this.l = typedArray.getColor(15, a.a(p0, r.a().c));
          this.s = typedArray.getDimension(3, a.c(p0, r.a().i));
          this.t = typedArray.getDimension(6, a.c(p0, r.a().j));
          this.u = typedArray.getInt(5, r.a().l);
          this.v = typedArray.getInt(4, r.a().m);
          this.x = typedArray.getBoolean(8, r.a().p);
          this.y = typedArray.getColor(7, a.a(p0, r.a().e));
          this.z = typedArray.getDimensionPixelSize(9, a.d(p0, r.a().k));
          this.A = typedArray.getString(10);
          typedArray.recycle();
       }
       paint.setColor(this.i);
       paint.setStyle(Paint$Style.STROKE);
       paint.setStrokeWidth(this.j);
       paint1.setStyle(Paint$Style.FILL);
       paint2.setStyle(Paint$Style.STROKE);
       paint2.setStrokeWidth(this.t);
       paint2.setStrokeJoin(Paint$Join.values()[this.u]);
       paint2.setStrokeCap(Paint$Cap.values()[this.v]);
       paint3.setTextAlign(Paint$Align.CENTER);
       paint3.setTextSize((float)this.z);
       paint3.setColor(this.y);
       return;
    }
    public void onDraw(Canvas p0){
       float f;
       int max;
       a.p(p0, "canvas");
       if (this.h != null) {
          p0.drawArc(this.e, 0, 360.00f, false, this.f);
       }
       if (a.f(this)) {
          f = (float)this.getProgress() * -360.00f;
          max = this.getMax();
       }else {
          f = (float)this.getProgress() * 360.00f;
          max = this.getMax();
       }
       float f1 = f / (float)max;
       if (this.m != null) {
          this.o.setColor(this.l);
          p0.drawArc(this.n, 0, 360.00f, true, this.o);
          this.o.setColor(this.k);
          p0.drawArc(this.n, -90.00f, f1, 1, this.o);
       }else {
          this.r.setColor(this.l);
          p0.drawArc(this.q, 0, 360.00f, false, this.r);
          this.r.setColor(this.k);
          p0.drawArc(this.q, -90.00f, f1, null, this.r);
       }
       if (this.x != null) {
          String str = String.valueOf(this.getProgress())+this.A;
          Rect rect = new Rect();
          this.w.getTextBounds(str, 0, str.length(), rect);
          p0.drawText(str, this.c, (this.d + (float)(rect.height() / 2)), this.w);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)2;
       float f1 = (float)p0 / f;
       this.c = f1;
       float f2 = (float)p1 / f;
       this.d = f2;
       float f3 = this.g / f;
       this.b = f3;
       KwaiCircleProgressBar te = this.e;
       te.top = f2 - f3;
       te.bottom = f2 + f3;
       te.left = f1 - f3;
       te.right = f1 + f3;
       KwaiCircleProgressBar tj = this.j;
       f2 = tj / f;
       te.inset(f2, (tj / f));
       tj = this.n;
       KwaiCircleProgressBar td = this.d;
       KwaiCircleProgressBar tp = this.p;
       tj.top = td - tp;
       tj.bottom = td + tp;
       te = this.c;
       tj.left = te - tp;
       tj.right = tp + te;
       tj = this.q;
       tp = this.b;
       tj.top = td - tp;
       tj.bottom = td + tp;
       tj.left = te - tp;
       tj.right = te + tp;
       td = this.t;
       te = this.s;
       tj.inset(((td / f) + te), ((td / f) + te));
    }
}
