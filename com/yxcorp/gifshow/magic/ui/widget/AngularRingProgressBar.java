package com.yxcorp.gifshow.magic.ui.widget.AngularRingProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import com.yxcorp.utility.n;
import android.graphics.Paint$Style;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import java.lang.Math;

public class AngularRingProgressBar extends ProgressBar	// class@001c49
{
    public int b;
    public int c;
    public float d;
    public final RectF e;
    public final Paint f;

    public void AngularRingProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AngularRingProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new RectF();
       Paint paint = new Paint(1);
       this.f = paint;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AngularRingProgressBar.class, "1")) {
       }else {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.d3);
          this.b = typedArray.getColor(0, -2130706433);
          this.c = typedArray.getDimensionPixelSize(2, -419430401);
          this.d = (float)typedArray.getDimensionPixelSize(1, n.c(this.getContext(), 3.00f));
          typedArray.recycle();
          paint.setStyle(Paint$Style.STROKE);
          paint.setStrokeWidth(this.d);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AngularRingProgressBar.class, "2")) {
          return;
       }
       Drawable background = this.getBackground();
       if (background != null) {
          background.draw(p0);
       }
       this.f.setColor(this.b);
       p0.drawArc(this.e, 0, 360.00f, false, this.f);
       this.f.setColor(this.c);
       p0.drawArc(this.e, -90.00f, (((float)this.getProgress() / (float)this.getMax()) * 360.00f), false, this.f);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AngularRingProgressBar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AngularRingProgressBar.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)p0 / 2.00f;
       float f1 = (float)p1 / 2.00f;
       float f2 = Math.min(f, f1);
       AngularRingProgressBar te = this.e;
       te.top = f1 - f2;
       te.bottom = f1 + f2;
       te.left = f - f2;
       te.right = f + f2;
       return;
    }
}
