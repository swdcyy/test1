package com.yxcorp.gifshow.kuaishan.widget.KSProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.Path;
import android.graphics.Path$Direction;

public class KSProgressBar extends ProgressBar	// class@001a06
{
    public final RectF b;
    public Path c;
    public float d;

    public void KSProgressBar(Context p0){
       super(p0, null);
    }
    public void KSProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KSProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new RectF();
       this.d = 0;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSProgressBar.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d4);
          if (p1 != null && typedArray != null) {
             this.d = (float)typedArray.getDimensionPixelSize(0, 0);
             typedArray.recycle();
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSProgressBar.class, "2")) {
          return;
       }
       Drawable progressDraw = this.getProgressDrawable();
       if (progressDraw == null) {
          return;
       }
       if (!this.getProgress()) {
          return;
       }
       progressDraw.setBounds(0, 0, ((this.getWidth() * this.getProgress()) / this.getMax()), this.getHeight());
       if (this.c == null) {
          this.c = new Path();
          this.b.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
          this.c.addRoundRect(this.b, this.d, this.d, Path$Direction.CW);
       }
       p0.clipPath(this.c);
       progressDraw.draw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
}
