package com.kwai.library.widget.progressbar.StepProgressBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.progressbar.a;
import com.kwai.library.widget.progressbar.a$a;
import j17.a;
import android.graphics.Paint;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.RectF;

public class StepProgressBar extends View	// class@0009b3
{
    public int b;
    public Paint c;
    public int d;
    public int e;
    public int f;

    public void StepProgressBar(Context p0){
       super(p0, null);
    }
    public void StepProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void StepProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.u5, p2, 0);
       a$a f = a.f;
       this.b = typedArray.getColor(1, a.a(this.getContext(), f.a().b));
       this.f = typedArray.getDimensionPixelSize(2, a.d(this.getContext(), f.a().c));
       this.d = typedArray.getInt(0, f.a().d);
       typedArray.recycle();
       Paint paint = new Paint(1);
       this.c = paint;
       paint.setColor(this.b);
    }
    public final int a(int p0,boolean p1){
       int paddingLeft;
       int paddingRight;
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       if (p1) {
          paddingLeft = this.getPaddingLeft();
          paddingRight = this.getPaddingRight();
       }else {
          paddingLeft = this.getPaddingTop();
          paddingRight = this.getPaddingBottom();
       }
       paddingLeft = paddingLeft + paddingRight;
       if (mode != 0x40000000) {
          paddingRight = (p1)? this.getSuggestedMinimumWidth(): this.getSuggestedMinimumHeight();
          paddingRight = paddingRight + paddingLeft;
          if (mode == Integer.MIN_VALUE) {
             if (p1) {
                p0 = Math.max(paddingRight, p0);
             }else {
                p0 = Math.min(paddingRight, p0);
             }
          }else {
             p0 = paddingRight;
          }
       }
       return p0;
    }
    public void onDraw(Canvas p0){
       float f1;
       float f2;
       int i2;
       super.onDraw(p0);
       StepProgressBar td = this.d;
       float f = ((float)((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - (float)(this.f * (td - 1))) / (float)td;
       RectF rectF = new RectF();
       rectF.top = (float)this.getPaddingTop();
       rectF.bottom = (float)(this.getHeight() - this.getPaddingBottom());
       for (int i = 0; i < this.e; i = i + 1) {
          if (a.f(this)) {
             int i1 = this.getRight() - this.getPaddingRight();
             f1 = (float)i * f;
             f2 = (float)i1 - f1;
             i2 = this.f * i;
             f2 = f2 - (float)i2;
             rectF.right = f2;
             f2 = f2 - f;
             rectF.left = f2;
          }else {
             f1 = (float)i * f;
             f2 = (float)this.getPaddingLeft() + f1;
             i2 = this.f * i;
             f2 = f2 + (float)i2;
             rectF.left = f2;
             f2 = f2 + f;
             rectF.right = f2;
          }
          p0.drawRect(rectF, this.c);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       this.setMeasuredDimension(this.a(p0, true), this.a(p1, false));
    }
    public void setMaxStep(int p0){
       this.d = p0;
       this.invalidate();
    }
    public void setProgressStep(int p0){
       if (this.e != p0) {
          this.e = p0;
          this.invalidate();
       }
       return;
    }
    public void setStepColor(int p0){
       this.b = p0;
    }
    public void setStepSpaceWidth(int p0){
       this.f = p0;
       this.invalidate();
    }
}
