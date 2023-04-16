package com.kwai.library.widget.layout.ShadowLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.RectF;
import java.lang.Math;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

public class ShadowLayout extends FrameLayout	// class@00095e
{
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;

    public void ShadowLayout(Context p0){
       super(p0);
       this.g = true;
       this.h = false;
       this.b(p0, null);
    }
    public void ShadowLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = true;
       this.h = false;
       this.b(p0, p1);
    }
    public void ShadowLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = true;
       this.h = false;
       this.b(p0, p1);
    }
    public final Bitmap a(int p0,int p1,float p2,float p3,float p4,float p5,int p6,int p7){
       Bitmap uBitmap = Bitmap.createBitmap(p0, p1, Bitmap$Config.ALPHA_8);
       Canvas uCanvas = new Canvas(uBitmap);
       RectF rectF = new RectF(p3, p3, ((float)p0 - p3), ((float)p1 - p3));
       RectF rectF1 = null;
       if (p5 - rectF1 > 0) {
          rectF.top = rectF.top + p5;
          rectF.bottom = rectF.bottom - p5;
       }else if(p5 - rectF1 < 0){
          rectF.top = rectF.top + Math.abs(p5);
          rectF.bottom = rectF.bottom - Math.abs(p5);
       }
       if (p4 - rectF1 > 0) {
          rectF.left = rectF.left + p4;
          rectF.right = rectF.right - p4;
       }else if(p4 - rectF1 < 0){
          rectF.left = rectF.left + Math.abs(p4);
          rectF.right = rectF.right - Math.abs(p4);
       }
       Paint paint = new Paint();
       paint.setAntiAlias(true);
       paint.setColor(p7);
       paint.setStyle(Paint$Style.FILL);
       if (!this.isInEditMode()) {
          paint.setShadowLayer(p3, p4, p5, p6);
       }
       uCanvas.drawRoundRect(rectF, p2, p2, paint);
       return uBitmap;
    }
    public final void b(Context p0,AttributeSet p1){
       int i = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y4, i, i);
       if (typedArray == null) {
       }else {
          this.d = typedArray.getDimension(i, this.getResources().getDimension(0x7f0710e3));
          this.c = typedArray.getDimension(4, this.getResources().getDimension(0x7f0710e4));
          this.e = typedArray.getDimension(1, 0);
          this.f = typedArray.getDimension(2, 0);
          this.b = typedArray.getColor(3, this.getResources().getColor(0x7f062131));
          typedArray.recycle();
       }
       this.setPadding((int)(this.c + Math.abs(this.e)), (int)(this.c + Math.abs(this.f)), (int)(this.c + Math.abs(this.e)), (int)(this.c + Math.abs(this.f)));
       return;
    }
    public void c(int p0){
       this.b = p0;
       this.h = true;
       this.requestLayout();
       this.invalidate();
    }
    public final void d(int p0,int p1){
       this.setBackground(new BitmapDrawable(this.getResources(), this.a(p0, p1, this.d, this.c, this.e, this.f, this.b, 0)));
    }
    public int getSuggestedMinimumHeight(){
       return 0;
    }
    public int getSuggestedMinimumWidth(){
       return 0;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       if (this.h != null) {
          this.h = false;
          this.d((p3 - p1), (p4 - p2));
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0 && (p1 > 0 && (this.getBackground() != null && (this.g != null || this.h != null)))) {
          this.h = false;
          this.d(p0, p1);
       }
    label_001b :
       return;
    }
    public void setInvalidateShadowOnSizeChanged(boolean p0){
       this.g = p0;
    }
}
