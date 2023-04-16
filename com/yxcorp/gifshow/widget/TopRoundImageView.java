package com.yxcorp.gifshow.widget.TopRoundImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.lang.Float;

public class TopRoundImageView extends ImageView	// class@0018dd
{
    public float[] b;
    public float c;
    public float d;
    public float e;
    public Path f;

    public void TopRoundImageView(Context p0){
       super(p0, null);
    }
    public void TopRoundImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TopRoundImageView(Context p0,AttributeSet p1,int p2){
       TopRoundImageView tc;
       super(p0, p1, p2);
       this.b = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TopRoundImageView.class, "1")) {
       }else {
          p2 = 2;
          if (p1 != null) {
             TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.L5);
             this.c = typedArray.getDimension(1, 0);
             this.d = typedArray.getDimension(p2, 0);
             this.e = typedArray.getFloat(0, 0x3f800000);
             typedArray.recycle();
          }
          float[] uofloatArray = new float[]{tc,tc,tc,tc,0,0,0,0};
          tc = this.c;
          tc = this.d;
          this.b = uofloatArray;
          this.f = new Path();
       }
       return;
    }
    public float getRatio(){
       return this.e;
    }
    public float getTopLeftRadius(){
       return this.c;
    }
    public float getTopRightRadius(){
       return this.d;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopRoundImageView.class, "5")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       this.f.addRoundRect(new RectF(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight()), this.b, Path$Direction.CW);
       p0.clipPath(this.f);
       super.onDraw(p0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(TopRoundImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, TopRoundImageView.class, "6")) {
          return;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredWidth();
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.width = p0;
       layoutParams.height = (int)((float)p0 / this.e);
       this.setLayoutParams(layoutParams);
       return;
    }
    public void setRatio(float p0){
       if (PatchProxy.isSupport(TopRoundImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TopRoundImageView.class, "4")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
    public void setTopLeftRadius(float p0){
       if (PatchProxy.isSupport(TopRoundImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TopRoundImageView.class, "2")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setTopRightRadius(float p0){
       if (PatchProxy.isSupport(TopRoundImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TopRoundImageView.class, "3")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
}
