package com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.content.res.Resources;
import android.widget.ImageView;
import android.graphics.RectF;
import com.yxcorp.gifshow.camera.record.slipmode.ui.IdentifyCircleImageView$a;
import android.view.ViewOutlineProvider;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Float;
import ah9.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class IdentifyCircleImageView extends KwaiBindableImageView	// class@000f2d
{
    public boolean A;
    public float B;
    public ValueAnimator C;
    public final Paint v;
    public int w;
    public RectF x;
    public float y;
    public float z;
    public static final int D;

    public void IdentifyCircleImageView(Context p0){
       super(p0);
       this.v = new Paint(1);
       this.A = false;
       this.o0();
    }
    public void IdentifyCircleImageView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = new Paint(1);
       this.A = false;
       this.o0();
    }
    public float getProgress(){
       return this.B;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, IdentifyCircleImageView.class, "7")) {
          return;
       }
       IdentifyCircleImageView tC = this.C;
       if (tC != null) {
          if (tC.isRunning()) {
             this.C.cancel();
          }
          this.C = null;
       }
       return;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, IdentifyCircleImageView.class, "1")) {
          return;
       }
       RoundingParams roundingPara = new RoundingParams();
       roundingPara.q(true);
       this.getHierarchy().L(roundingPara);
       this.setPlaceHolderImage(R.drawable.arg_RES_7f080e09);
       this.w = (int)this.getResources().getDimension(0x7f07032e);
       IdentifyCircleImageView tw = this.w;
       float f = (float)tw;
       this.x = new RectF(0, 0, f, (float)tw);
       this.v.setColor(this.getResources().getColor(R.color.arg_RES_7f062047));
       this.setOutlineProvider(new IdentifyCircleImageView$a(this));
       this.setClipToOutline(true);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IdentifyCircleImageView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.A != null) {
          IdentifyCircleImageView ty = this.y;
          p0.drawArc(this.x, (-90.00f + (ty * 3.60f)), (360.00f - (ty * 3.60f)), true, this.v);
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(IdentifyCircleImageView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, IdentifyCircleImageView.class, "2")) {
          return;
       }
       this.setMeasuredDimension(this.w, this.w);
       return;
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, IdentifyCircleImageView.class, "5")) {
          return;
       }
       this.n0();
       this.A = false;
       this.y = 0;
       this.B = 0;
       this.invalidate();
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(IdentifyCircleImageView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, IdentifyCircleImageView.class, "6")) {
          return;
       }
       this.n0();
       if (p0 >= 0 && p0 - 0x42c80000 <= 0) {
          this.A = true;
          if (this.y - p0 >= 0) {
             this.y = p0;
             this.B = p0;
             this.invalidate();
          }else {
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             this.C = valueAnimato;
             this.B = p0;
             IdentifyCircleImageView ty = this.y;
             valueAnimato.setDuration((long)((p0 - ty) * 3.00f));
             this.C.addUpdateListener(new a(this, ty));
             this.C.start();
          }
       }else {
          this.p0();
       }
       return;
    }
}
