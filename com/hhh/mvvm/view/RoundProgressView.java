package com.hhh.mvvm.view.RoundProgressView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.RectF;

public class RoundProgressView extends View	// class@000573
{
    public Paint b;
    public RectF c;
    public int d;
    public float e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;

    public void RoundProgressView(Context p0){
       super(p0, null);
    }
    public void RoundProgressView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.G4);
       this.d = typedArray.getColor(3, 0);
       this.e = typedArray.getDimension(4, (float)(int)(((double)c.c(this.getResources()).density * 2.50f) + 0x3fe0000000000000));
       this.f = typedArray.getColor(1, -1609368);
       this.g = typedArray.getDimension(2, this.e);
       this.i = typedArray.getInteger(0, 100);
       this.h = typedArray.getInt(6, 0);
       this.k = typedArray.getInt(5, -90);
       typedArray.recycle();
    }
    public int getProgress(){
       return this.j;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       int i = this.getWidth() / 2;
       float f = (float)i;
       RoundProgressView te = this.e;
       int i1 = (int)(f - (te / 2.00f));
       this.b.setStrokeWidth(te);
       this.b.setColor(this.d);
       boolean b = true;
       this.b.setAntiAlias(b);
       te = this.h;
       if (te != null) {
          if (te == b) {
             this.b.setStyle(Paint$Style.FILL_AND_STROKE);
          }
       }else {
          this.b.setStyle(Paint$Style.STROKE);
       }
       p0.drawCircle(f, f, (float)i1, this.b);
       this.b.setStrokeWidth(this.g);
       this.b.setColor(this.f);
       if (this.c == null) {
          this.c = new RectF((float)(i - i1), (float)(i - i1), (float)(i + i1), (float)(i + i1));
       }
       i = (this.j * 360) / this.i;
       RoundProgressView th = this.h;
       if (th != null) {
          if (th == b) {
             p0.drawArc(this.c, (float)this.k, (float)i, true, this.b);
          }
       }else {
          p0.drawArc(this.c, (float)this.k, (float)i, false, this.b);
       }
       return;
    }
    public void setProgress(int p0){
       if (p0 < 0) {
          this.j = 0;
       }else {
          RoundProgressView ti = this.i;
          if (p0 > ti) {
             RoundProgressView roundProgres = ti;
          }
       }
       this.j = p0;
       this.postInvalidate();
       return;
    }
}
