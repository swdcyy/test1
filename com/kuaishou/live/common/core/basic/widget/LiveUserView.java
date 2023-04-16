package com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
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
import ya1.d0;
import ya1.e0;
import msd.a;
import msd.l;
import crd.b;
import k51.b;
import android.graphics.Matrix;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import k51.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.facebook.drawee.view.DraweeView;
import android.graphics.Canvas;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Region$Op;
import android.graphics.Bitmap;
import java.lang.UnsupportedOperationException;
import android.view.View;
import android.graphics.Path$Direction;

public class LiveUserView extends GreyscaleImageView	// class@000f28
{
    public Bitmap A;
    public Matrix B;
    public Paint C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public float H;
    public boolean I;
    public RectF J;
    public Paint K;
    public long x;
    public Path y;
    public b z;
    public static final int L;

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
       this.E = true;
       this.F = n.c(a.a().a(), 0x3fc00000);
       int i = 0;
       this.G = i;
       this.H = 43.50f;
       this.I = true;
       this.J = new RectF();
       this.K = new Paint(3);
       if (!PatchProxy.isSupport(LiveUserView.class) || (!PatchProxy.applyVoidTwoRefs(p1, Integer.valueOf(p2), this, LiveUserView.class, "2") && p1 != null)) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.Y2, p2, i);
          this.G = typedArray.getColor(i, i);
          this.F = typedArray.getDimensionPixelOffset(true, n.c(a.a().a(), 0x3fc00000));
          this.I = typedArray.getBoolean(2, true);
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, this, LiveUserView.class, "3")) {
          this.K.setStyle(Paint$Style.STROKE);
          this.K.setStrokeWidth((float)this.F);
          this.K.setColor(this.G);
          this.y = new Path();
          this.z = b.e(new d0(this), new e0(this), this.getOptSwitch());
          this.B = new Matrix();
          Paint paint = new Paint(7);
          this.C = paint;
          paint.setAntiAlias(true);
       }
       return;
    }
    public final boolean getOptSwitch(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveUserView.class, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "14");
       boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiveUserViewPerfOpt", false);
       return b;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveUserView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveUserView tz = this.z;
       if (tz != null && !tz.isDisposed()) {
          this.z.dispose();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveUserView.class, "10")) {
          return;
       }
       super.onDraw(p0);
       if (this.I != null && this.F > null) {
          p0.drawOval(this.J, this.K);
       }
       if (this.D != null) {
          return;
       }else {
          int i = 0;
          if (this.x - i >= 0 && this.E != null) {
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
                   if (this.A != null) {
                      LiveUserView tH = this.H;
                      float f = (((((float)drawingTime * 0x3f800000) / 0x442f0000) * tH) * 2.00f) - tH;
                      p0.translate(f, (- f));
                      p0.drawBitmap(this.A, this.B, this.C);
                   }
                   p0.restore();
                   this.invalidate();
                }catch(java.lang.UnsupportedOperationException e10){
                   e10.printStackTrace();
                   this.D = true;
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
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveUserView.class, "8")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.H = (float)(this.getMeasuredWidth() - (this.F * 2));
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveUserView.class, "9")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.y.reset();
       this.y.addOval(new RectF(2.00f, 2.00f, (float)(p0 - 2), (float)(p1 - 2)), Path$Direction.CCW);
       this.B.reset();
       LiveUserView tA = this.A;
       if (tA != null) {
          float f = (float)p0 * 0x3f800000;
          float f1 = f / (float)tA.getWidth();
          this.B.setScale(f1, (f / (float)this.A.getWidth()));
       }
       this.q0();
       return;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, LiveUserView.class, "7")) {
          return;
       }
       this.J.set((float)((this.F / 2) + this.getPaddingLeft()), (float)((this.F / 2) + this.getPaddingTop()), (float)((this.getWidth() - this.getPaddingRight()) - (this.F / 2)), (float)((this.getHeight() - this.getPaddingBottom()) - (this.F / 2)));
       return;
    }
    public void setAnimationEnabled(boolean p0){
       this.E = p0;
    }
    public void setBorderColor(int p0){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveUserView.class, "5")) {
          return;
       }
       this.G = p0;
       this.K.setColor(p0);
       return;
    }
    public void setBorderWidth(int p0){
       if (PatchProxy.isSupport(LiveUserView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveUserView.class, "6")) {
          return;
       }
       this.F = p0;
       this.K.setStrokeWidth((float)p0);
       if (this.getWidth() > 0) {
          this.q0();
       }
       return;
    }
    public void setEnableBorder(boolean p0){
       this.I = p0;
    }
}
