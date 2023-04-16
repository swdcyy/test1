package com.makeramen.roundedimageview.RoundedImageViewWithForeground;
import com.makeramen.roundedimageview.RoundedImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorFilter;

public class RoundedImageViewWithForeground extends RoundedImageView	// class@001484
{
    public Drawable s;

    public void RoundedImageViewWithForeground(Context p0){
       super(p0);
       this.g();
    }
    public void RoundedImageViewWithForeground(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g();
    }
    public void RoundedImageViewWithForeground(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g();
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       RoundedImageViewWithForeground ts = this.s;
       if (ts != null && ts.isStateful()) {
          ts.setState(this.getDrawableState());
       }
       return;
    }
    public final void g(){
       this.setOval(true);
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       RoundedImageViewWithForeground ts = this.s;
       if (ts != null) {
          ts.setBounds(new Rect(this.getPaddingLeft(), this.getPaddingTop(), (this.getWidth() - this.getPaddingRight()), (this.getHeight() - this.getPaddingBottom())));
          this.s.draw(p0);
       }
       return;
    }
    public void setAvatarForeground(Drawable p0){
       RoundedImageViewWithForeground ts = this.s;
       if (ts != p0) {
          if (ts != null) {
             ts.setCallback(null);
          }
          this.s = p0;
          if (p0 != null) {
             p0.setCallback(this);
          }
       }
       return;
    }
    public void setImageDrawableGrey(boolean p0){
       if (p0) {
          ColorMatrix uColorMatrix = new ColorMatrix();
          uColorMatrix.setSaturation(0);
          this.setColorFilter(new ColorMatrixColorFilter(uColorMatrix));
       }else {
          this.setColorFilter(null);
       }
       return;
    }
}
