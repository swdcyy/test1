package com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import android.view.View;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Canvas;

public class CircleWithStrokeView extends View	// class@000a02
{
    public float b;
    public float c;
    public Paint d;
    public static final float e;
    public static final float f;

    static {
       CircleWithStrokeView.e = (float)a1.e(0x3f800000);
       CircleWithStrokeView.f = (float)a1.e(15.00f);
    }
    public void CircleWithStrokeView(Context p0){
       super(p0);
    }
    public void CircleWithStrokeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0, p1);
    }
    public void CircleWithStrokeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       float e = CircleWithStrokeView.e;
       this.b = e;
       float f = CircleWithStrokeView.f;
       this.c = f;
       int color = this.getContext().getResources().getColor(R.color.arg_RES_7f062139);
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.M);
          this.b = typedArray.getDimension(2, e);
          this.c = typedArray.getDimension(0, f);
          color = typedArray.getColor(1, color);
          typedArray.recycle();
       }
       Paint paint = new Paint(1);
       this.d = paint;
       paint.setColor(color);
       this.d.setStyle(Paint$Style.STROKE);
       return;
    }
    public float getRadius(){
       return this.c;
    }
    public float getStrokeWidth(){
       return this.b;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       this.d.setStrokeWidth(this.b);
       p0.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), this.c, this.d);
    }
    public void setRadius(float p0){
       this.c = p0;
       this.invalidate();
    }
    public void setStrokeWidth(float p0){
       this.b = p0;
       this.invalidate();
    }
}
