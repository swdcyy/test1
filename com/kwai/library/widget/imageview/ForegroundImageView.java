package com.kwai.library.widget.imageview.ForegroundImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.Resources;

public class ForegroundImageView extends ImageView	// class@00094b
{
    public Drawable b;
    public float c;
    public float d;

    public void ForegroundImageView(Context p0){
       super(p0, null);
    }
    public void ForegroundImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.T0);
       Drawable drawable = typedArray.getDrawable(0);
       if (drawable != null) {
          this.setForegroundDrawable(drawable);
       }
       typedArray.recycle();
       return;
    }
    public void draw(Canvas p0){
       p0.save();
       super.draw(p0);
       p0.restore();
       ForegroundImageView tb = this.b;
       if (tb != null) {
          tb.draw(p0);
       }
       return;
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       ForegroundImageView tb = this.b;
       if (tb != null && tb.isStateful()) {
          this.b.setState(this.getDrawableState());
       }
       return;
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       ForegroundImageView tb = this.b;
       if (tb != null) {
          tb.jumpToCurrentState();
       }
       return;
    }
    public void onDraw(Canvas p0){
       p0.translate(this.c, this.d);
       super.onDraw(p0);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       ForegroundImageView tb = this.b;
       if (tb != null) {
          tb.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
          this.invalidate();
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       ForegroundImageView tb = this.b;
       if (tb != null) {
          tb.setBounds(0, 0, p0, p1);
          this.invalidate();
       }
       return;
    }
    public void setForegroundDrawable(Drawable p0){
       ForegroundImageView tb = this.b;
       if (tb == p0) {
          return;
       }
       if (tb != null) {
          tb.setCallback(null);
          this.unscheduleDrawable(this.b);
       }
       this.b = p0;
       if (p0 != null) {
          p0.setCallback(this);
          if (p0.isStateful()) {
             p0.setState(this.getDrawableState());
          }
       }
       this.requestLayout();
       this.invalidate();
       return;
    }
    public void setForegroundResource(int p0){
       if (p0 <= 0) {
          this.setForegroundDrawable(null);
       }else {
          this.setForegroundDrawable(this.getContext().getResources().getDrawable(p0));
       }
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       boolean b = (super.verifyDrawable(p0) || p0 == this.b)? true: false;
       return b;
    }
}
