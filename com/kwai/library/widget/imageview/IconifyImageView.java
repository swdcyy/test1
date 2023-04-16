package com.kwai.library.widget.imageview.IconifyImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;

public class IconifyImageView extends ImageView	// class@00094c
{
    public int b;
    public int c;

    public void IconifyImageView(Context p0){
       super(p0, null);
    }
    public void IconifyImageView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void IconifyImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.m1);
       this.b = typedArray.getDimensionPixelSize(0, 0);
       this.c = typedArray.getDimensionPixelSize(1, 0);
       typedArray.recycle();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       IconifyImageView tb = this.b;
       if (tb > null) {
          this.setTranslationX((float)(tb - (this.getWidth() / 2)));
       }
       tb = this.c;
       if (tb > null) {
          this.setTranslationY((float)(tb - (this.getHeight() / 2)));
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void setAnchorOffset(int p0){
       if (p0 == this.b) {
          return;
       }
       this.b = p0;
       this.requestLayout();
       return;
    }
}
