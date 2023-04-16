package com.yxcorp.gifshow.camera.record.video.gauss.HoleImageView;
import android.widget.ImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Rect;

public class HoleImageView extends ImageView	// class@000f84
{
    public int b;
    public Paint c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;

    public void HoleImageView(Context p0){
       super(p0);
    }
    public void HoleImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0, p1, 0);
    }
    public void HoleImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1, p2);
    }
    public final void a(Context p0,AttributeSet p1,int p2){
       if (PatchProxy.isSupport(HoleImageView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, HoleImageView.class, "2")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c1);
       this.d = (float)typedArray.getDimensionPixelSize(4, 0);
       this.e = typedArray.getDimensionPixelSize(3, 0);
       this.f = typedArray.getDimensionPixelSize(1, 0);
       this.g = typedArray.getDimensionPixelSize(2, 0);
       this.h = this.e;
       this.b = typedArray.getColor(0, 0);
       typedArray.recycle();
       this.setWillNotDraw(0);
       return;
    }
    public final void b(int p0){
       if (PatchProxy.isSupport(HoleImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HoleImageView.class, "3")) {
          return;
       }
       this.d = (float)p0;
       if (this.getWidth()) {
          this.i = (float)(this.getWidth() / 2);
          this.j = (float)this.e + this.d;
       }
       return;
    }
    public int getDefaultHolePaddingTop(){
       return this.h;
    }
    public int getHolePaddingTop(){
       return this.e;
    }
    public float getHoleRadius(){
       return this.d;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HoleImageView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       if (PatchProxy.applyVoid(null, this, HoleImageView.class, "4") || (this.getWidth() && this.c == null)) {
          int i = ((this.d * 2.00f) - (float)this.getWidth() > 0)? this.getWidth() / 2: (int)this.d;
          this.b(i);
          Paint paint = new Paint();
          this.c = paint;
          paint.setColor(-1);
          this.c.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
          this.c.setFlags(1);
       }
    label_005e :
       if (this.c != null) {
          p0.drawColor(this.b);
          p0.drawCircle(this.i, this.j, this.d, this.c);
       }
       return;
    }
    public void setHoleBackgroundColor(int p0){
       if (this.b != p0) {
          this.b = p0;
       }
       return;
    }
    public void setHoleRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HoleImageView.class, "1")) {
          return;
       }
       Rect top = p0.top;
       if (this.e != top) {
          this.e = top;
          this.b(((p0.bottom - top) / 2));
       }
       return;
    }
}
