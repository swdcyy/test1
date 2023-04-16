package com.kwai.library.widget.progressbar.DownloadProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import java.lang.String;
import android.graphics.Color;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.view.View;
import j17.a;
import java.lang.StringBuilder;
import java.lang.Math;
import android.graphics.Typeface;

public class DownloadProgressBar extends ProgressBar	// class@0009af
{
    public final String b;
    public final Rect c;
    public final RectF d;
    public final Paint e;
    public final Paint f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public String p;
    public boolean q;

    public void DownloadProgressBar(Context p0){
       super(p0, null);
    }
    public void DownloadProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = "%";
       this.c = new Rect();
       this.d = new RectF();
       Paint paint = new Paint(1);
       this.e = paint;
       Paint paint1 = new Paint(1);
       this.f = paint1;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.q0);
       this.q = typedArray.getBoolean(7, 1);
       this.j = typedArray.getDimension(4, (float)n.c(this.getContext(), 2.50f));
       this.k = typedArray.getDimension(6, (float)n.c(this.getContext(), 10.00f));
       this.l = typedArray.getColor(1, Color.parseColor("#ff5000"));
       this.m = typedArray.getColor(5, Color.parseColor("#ff5000"));
       this.n = typedArray.getColor(0, Color.parseColor("#ffd3d3d5"));
       this.setProgressArcPaintStrokeJoin(Paint$Join.values()[typedArray.getInt(3, 0)]);
       this.setProgressArcPaintStrokeCap(Paint$Cap.values()[typedArray.getInt(2, 0)]);
       typedArray.recycle();
       this.o = true;
       this.p = "%";
       paint.setTextAlign(Paint$Align.CENTER);
       paint.setTextSize(this.k);
       paint1.setStyle(Paint$Style.STROKE);
       paint1.setStrokeWidth(this.j);
    }
    public final void a(Canvas p0){
       float f;
       int max;
       this.f.setColor(this.n);
       p0.drawArc(this.d, 0, 360.00f, false, this.f);
       this.f.setColor(this.l);
       if (a.f(this)) {
          f = (float)this.getProgress() * -360.00f;
          max = this.getMax();
       }else {
          f = (float)this.getProgress() * 360.00f;
          max = this.getMax();
       }
       p0.drawArc(this.d, -90.00f, (f / (float)max), false, this.f);
       return;
    }
    public final void b(Canvas p0){
       String str = this.getProgress();
       DownloadProgressBar tp = (this.o != null)? this.p: "";
       str = str+tp;
       this.e.setTextSize(this.k);
       this.e.setColor(this.m);
       this.e.getTextBounds(str, 0, str.length(), this.c);
       p0.drawText(str, this.h, (this.i + (float)(this.c.height() / 2)), this.e);
       return;
    }
    public synchronized void onDraw(Canvas p0){
       if (this.q != null) {
          this.b(p0);
       }
       this.a(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)(p0 / 2);
       this.h = f;
       float f1 = (float)(p1 / 2);
       this.i = f1;
       f = Math.min(f, f1);
       this.g = f;
       DownloadProgressBar td = this.d;
       DownloadProgressBar ti = this.i;
       td.top = ti - f;
       td.bottom = ti + f;
       ti = this.h;
       td.left = ti - f;
       td.right = ti + f;
       DownloadProgressBar tj = this.j;
       float f2 = tj / 2.00f;
       td.inset(f2, (tj / 2.00f));
    }
    public void setFakeBoldText(boolean p0){
       this.e.setFakeBoldText(p0);
    }
    public void setProgressArcBackgroundColor(int p0){
       this.n = p0;
       this.invalidate();
    }
    public void setProgressArcColor(int p0){
       this.l = p0;
       this.invalidate();
    }
    public void setProgressArcPaintStrokeCap(Paint$Cap p0){
       this.f.setStrokeCap(p0);
    }
    public void setProgressArcPaintStrokeJoin(Paint$Join p0){
       this.f.setStrokeJoin(p0);
    }
    public void setProgressArcWidth(float p0){
       this.j = p0;
       this.d.inset((p0 / 2.00f), (p0 / 2.00f));
       this.f.setStrokeWidth(this.j);
       this.invalidate();
    }
    public void setProgressTextColor(int p0){
       this.m = p0;
       this.invalidate();
    }
    public void setProgressTextSize(float p0){
       this.k = p0;
       this.invalidate();
    }
    public void setProgressTextTypeFace(Typeface p0){
       this.e.setTypeface(p0);
    }
}
