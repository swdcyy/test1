package com.kuaishou.live.basic.widget.LiveUserView;
import com.kuaishou.live.basic.widget.GreyscaleImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import lnc.a1;
import android.graphics.RectF;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Canvas;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Region$Op;
import java.lang.UnsupportedOperationException;
import com.facebook.drawee.view.DraweeView;
import android.view.View;
import android.graphics.Path$Direction;

public class LiveUserView extends GreyscaleImageView	// class@000d33
{
    public Matrix A;
    public Paint B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public RectF I;
    public Paint J;
    public long x;
    public Path y;
    public Bitmap z;

    public void LiveUserView(Context p0){
       super(p0, null);
    }
    public void LiveUserView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void LiveUserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.x = -1;
       this.y = new Path();
       this.D = true;
       float f = 0x3fc00000;
       this.E = a1.e(f);
       this.F = 0;
       this.G = 43.50f;
       this.H = true;
       this.I = new RectF();
       this.J = new Paint(3);
       if (!PatchProxy.isSupport(LiveUserView.class) || (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, LiveUserView.class, "2") && p1 != null)) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.Y2, p2, 0);
          this.F = typedArray.getColor(0, 0);
          this.E = typedArray.getDimensionPixelOffset(true, a1.e(f));
          this.H = typedArray.getBoolean(2, true);
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, this, LiveUserView.class, "3")) {
          this.J.setStyle(Paint$Style.STROKE);
          this.J.setStrokeWidth((float)this.E);
          this.J.setColor(this.F);
          this.y = new Path();
          this.z = BitmapFactory.decodeResource(this.getResources(), 0x7f0811ab);
          this.A = new Matrix();
          Paint paint = new Paint(7);
          this.B = paint;
          paint.setAntiAlias(true);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUserView.class, "9")) {
          return;
       }
       super.onDraw(p0);
       if (this.H != null && this.E > null) {
          p0.drawOval(this.I, this.J);
       }
       if (this.C != null) {
          return;
       }else {
          int i = 0;
          if (this.x - i >= 0 && this.D != null) {
             long drawingTime = this.getDrawingTime();
             LiveUserView tx = this.x;
             if (!tx - i || (drawingTime - tx) - 5700 >= 0) {
                this.x = drawingTime;
             }
             drawingTime = (drawingTime - 700) - this.x;
             if (drawingTime - i > 0 && drawingTime - 700 < 0) {
                try{
                   p0.save();
                   p0.clipPath(this.y, Region$Op.INTERSECT);
                   if (this.z != null) {
                      LiveUserView tG = this.G;
                      float f = (((((float)drawingTime * 0x3f800000) / 0x442f0000) * tG) * 2.00f) - tG;
                      p0.translate(f, (- f));
                      p0.drawBitmap(this.z, this.A, this.B);
                   }
                   p0.restore();
                   this.invalidate();
                }catch(java.lang.UnsupportedOperationException e10){
                   e10.printStackTrace();
                   this.C = true;
                   this.invalidate();
                   return;
                }
             }else if(drawingTime - 700 >= 0){
                this.postInvalidateDelayed((4300 - drawingTime));
                return;
             }else {
                this.postInvalidateDelayed((drawingTime + 700));
             }
          }
          return;
       }
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveUserView.class, "7")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.G = (float)(this.getMeasuredWidth() - (this.E * 2));
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveUserView.class, "8")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.y.reset();
       this.y.addOval(new RectF(2.00f, 2.00f, (float)(p0 - 2), (float)(p1 - 2)), Path$Direction.CCW);
       this.A.reset();
       LiveUserView tz = this.z;
       if (tz != null) {
          float f = (float)p0 * 0x3f800000;
          float f1 = f / (float)tz.getWidth();
          this.A.setScale(f1, (f / (float)this.z.getWidth()));
       }
       this.q0();
       return;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, LiveUserView.class, "6")) {
          return;
       }
       this.I.set((float)((this.E / 2) + this.getPaddingLeft()), (float)((this.E / 2) + this.getPaddingTop()), (float)((this.getWidth() - this.getPaddingRight()) - (this.E / 2)), (float)((this.getHeight() - this.getPaddingBottom()) - (this.E / 2)));
       return;
    }
    public void setAnimationEnabled(boolean p0){
       this.D = p0;
    }
    public void setBorderColor(int p0){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveUserView.class, "4")) {
          return;
       }
       this.F = p0;
       this.J.setColor(p0);
       return;
    }
    public void setBorderWidth(int p0){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveUserView.class, "5")) {
          return;
       }
       this.E = p0;
       this.J.setStrokeWidth((float)p0);
       if (this.getWidth() > 0) {
          this.q0();
       }
       return;
    }
}
