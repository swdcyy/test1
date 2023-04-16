package com.yxcorp.gifshow.activity.share.bubble.BubbleImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.yxcorp.gifshow.activity.share.bubble.BubbleImageView$BubbleTriangleDirection;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Integer;
import com.facebook.drawee.view.DraweeView;
import android.widget.ImageView;
import com.yxcorp.gifshow.activity.share.bubble.BubbleImageView$a;
import java.lang.Enum;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import android.graphics.Paint;

public class BubbleImageView extends KwaiCDNImageView	// class@001379
{
    public float A;
    public float B;
    public int C;
    public int D;
    public Path E;
    public int w;
    public int x;
    public BubbleImageView$BubbleTriangleDirection y;
    public int z;
    public static final BubbleImageView$BubbleTriangleDirection F;

    static {
       BubbleImageView.F = BubbleImageView$BubbleTriangleDirection.TOP;
    }
    public void BubbleImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w = 0;
       this.x = 0;
       this.z = 0;
       this.C = 0;
       this.D = 0;
       this.A = 0x3f000000;
       this.B = 0x3f000000;
       this.w = 25;
       this.x = 10;
       this.z = 20;
       this.y = BubbleImageView.F;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BubbleImageView.class, "3")) {
          return;
       }
       p0.clipPath(this.E);
       super.onDraw(p0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(BubbleImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BubbleImageView.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, BubbleImageView.class, "2")) {
          this.D = this.getMeasuredHeight();
          this.C = this.getMeasuredWidth();
          if (!PatchProxy.applyVoid(objArray, this, BubbleImageView.class, "4")) {
             this.E = new Path();
             float f = (float)this.D * this.A;
             float f1 = (float)this.C * this.B;
             int i = BubbleImageView$a.a[this.y.ordinal()];
             float f2 = 2.00f;
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4) {
                         this.E.moveTo(f1, (float)(this.D - this.x));
                         this.E.lineTo((((float)this.w / f2) + f1), (float)this.D);
                         this.E.lineTo((f1 + (float)this.w), (float)(this.D - this.x));
                         this.E.close();
                         this.E.addRoundRect(new RectF(0, (float)this.x, (float)this.C, (float)this.D), (float)this.z, (float)this.z, Path$Direction.CW);
                      }
                   }else {
                      this.E.moveTo(f1, (float)this.x);
                      this.E.lineTo((((float)this.w / f2) + f1), 0);
                      this.E.lineTo((f1 + (float)this.w), (float)this.x);
                      this.E.close();
                      this.E.addRoundRect(new RectF(0, (float)this.x, (float)this.C, (float)this.D), (float)this.z, (float)this.z, Path$Direction.CW);
                   }
                }else {
                   this.E.moveTo((float)(this.C - this.w), f);
                   this.E.lineTo((float)this.C, (((float)this.x / f2) + f));
                   this.E.lineTo((float)(this.C - this.w), (f + (float)this.x));
                   this.E.close();
                   this.E.addRoundRect(new RectF(0, 0, (float)(this.C - this.w), (float)this.D), (float)this.z, (float)this.z, Path$Direction.CW);
                }
             }else {
                this.E.moveTo((float)this.w, f);
                this.E.lineTo(0, (((float)this.x / f2) + f));
                this.E.lineTo((float)this.w, (f + (float)this.x));
                this.E.close();
                this.E.addRoundRect(new RectF((float)this.w, 0, (float)this.C, (float)this.D), (float)this.z, (float)this.z, Path$Direction.CW);
             }
          }
          new Paint().setAntiAlias(true);
       }
       return;
    }
}
