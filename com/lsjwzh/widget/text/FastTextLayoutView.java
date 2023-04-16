package com.lsjwzh.widget.text.FastTextLayoutView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.text.Layout;
import android.graphics.Canvas;
import java.lang.System;

public class FastTextLayoutView extends View	// class@00147a
{
    public Layout b;
    public static final String c;

    static {
       FastTextLayoutView.c = "FastTextLayoutView";
    }
    public void FastTextLayoutView(Context p0){
       super(p0);
    }
    public void FastTextLayoutView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FastTextLayoutView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int a(int p0,int p1){
       if (this.getLayoutParams().height == -2) {
          return p0;
       }
       return View.getDefaultSize(p0, p1);
    }
    public int b(int p0,int p1){
       if (this.getLayoutParams().width == -2) {
          return p0;
       }
       return View.getDefaultSize(p0, p1);
    }
    public Layout getTextLayout(){
       return this.b;
    }
    public void onDraw(Canvas p0){
       System.currentTimeMillis();
       p0.save();
       if (this.b != null) {
          p0.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
          this.b.draw(p0);
       }
       p0.restore();
       System.currentTimeMillis();
       return;
    }
    public void onMeasure(int p0,int p1){
       System.currentTimeMillis();
       if (this.b != null) {
          this.setMeasuredDimension(this.b(((this.getPaddingLeft() + this.getPaddingRight()) + this.b.getWidth()), p0), this.a(((this.getPaddingTop() + this.getPaddingBottom()) + this.b.getHeight()), p1));
       }else {
          super.onMeasure(p0, p1);
       }
       System.currentTimeMillis();
       return;
    }
    public void setTextLayout(Layout p0){
       this.b = p0;
    }
}
