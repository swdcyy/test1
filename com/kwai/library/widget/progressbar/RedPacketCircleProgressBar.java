package com.kwai.library.widget.progressbar.RedPacketCircleProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.Paint$Style;
import android.graphics.Paint$Cap;
import j17.a;
import java.lang.Math;

public class RedPacketCircleProgressBar extends ProgressBar	// class@0009b1
{
    public int b;
    public int c;
    public int d;
    public Paint e;
    public RectF f;
    public int g;

    public void RedPacketCircleProgressBar(Context p0){
       super(p0, null);
    }
    public void RedPacketCircleProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RedPacketCircleProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.B4);
       this.b = typedArray.getColor(0, 0);
       this.c = typedArray.getColor(1, 0);
       this.d = typedArray.getDimensionPixelOffset(2, n.c(this.getContext(), 0x3f800000));
       Paint paint = new Paint();
       this.e = paint;
       paint.setAntiAlias(1);
       this.e.setDither(1);
       this.f = new RectF();
       typedArray.recycle();
    }
    public void draw(Canvas p0){
       super.draw(p0);
       if (this.g != null) {
          this.e.setStyle(Paint$Style.FILL);
          this.e.setColor(this.b);
          RedPacketCircleProgressBar tg = this.g;
          p0.drawCircle((float)(tg / 2), (float)(tg / 2), (float)(tg / 2), this.e);
          this.e.setStrokeWidth((float)this.d);
          this.e.setStyle(Paint$Style.STROKE);
          this.e.setStrokeCap(Paint$Cap.ROUND);
          this.e.setColor(this.b);
          tg = this.g;
          p0.drawCircle((float)(tg / 2), (float)(tg / 2), (float)(tg / 2), this.e);
          this.e.setColor(this.c);
          float f = 360.00f;
          float f1 = 0x3f800000;
          int i = (a.f(this))? - this.getProgress(): this.getProgress();
          p0.drawArc(this.f, -90.00f, ((((float)i * f1) / (float)this.getMax()) * f), false, this.e);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       p3 = p3 - p1;
       p4 = p4 - p2;
       if (p3 && p4) {
          int i = Math.min(p3, p4);
          this.g = i;
          RedPacketCircleProgressBar td = this.d;
          float f = (float)((i / 2) - (td / 2)) * 2.00f;
          float f1 = ((float)i - f) / 2.00f;
          float f2 = ((float)i - f) / 2.00f;
          float f3 = (float)(td / 2);
          float f4 = f1 + f3;
          float f5 = f2 + f3;
          this.f.set(f4, f5, ((f1 + f) - f3), ((f2 + f) - f3));
       }
       return;
    }
    public void setProgressBackgroundColor(int p0){
       this.b = p0;
    }
    public void setProgressColor(int p0){
       this.c = p0;
    }
}
