package com.kuaishou.merchant.marketing.base.widget.RectSweepingButtonViewEx;
import com.kuaishou.merchant.basic.widget.sweeping.RectSweepingButtonView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView;
import com.kuaishou.merchant.marketing.base.widget.RectSweepingButtonViewEx$a;
import java.lang.Runnable;
import android.widget.ImageView;
import com.kuaishou.merchant.marketing.base.widget.RectSweepingButtonViewEx$b;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import kotlin.Pair;
import java.lang.Number;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.Matrix;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.ex.LottieAnimationView;

public abstract class RectSweepingButtonViewEx extends RectSweepingButtonView	// class@001afd
{
    public LottieAnimationView I;
    public HashMap J;

    public void RectSweepingButtonViewEx(Context p0){
       super(p0, null);
    }
    public void RectSweepingButtonViewEx(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RectSweepingButtonViewEx(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void e(){
       RectSweepingButtonViewEx tI;
       if (PatchProxy.applyVoid(null, this, RectSweepingButtonViewEx.class, "3")) {
          return;
       }
       if (this.getMIsAnimationOpened()) {
          if (this.getMSweepCount() == 3) {
             this.setMSweepCount(0);
             tI = this.I;
             if (tI != null) {
                if (tI != null) {
                   tI.postDelayed(new RectSweepingButtonViewEx$a(this), 1000);
                }
             }else {
                this.i(1000, this.getMBandRatio(), this.getMDurationInMills(), this.getMRotationAngle());
             }
          }else {
             tI = this.I;
             if (tI != null) {
                if (tI != null) {
                   tI.postDelayed(new RectSweepingButtonViewEx$b(this), this.getMAnimationInterval());
                }
             }else {
                this.i(this.getMAnimationInterval(), this.getMBandRatio(), this.getMDurationInMills(), this.getMRotationAngle());
             }
          }
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, RectSweepingButtonViewEx.class, "2")) {
          return;
       }
       super.j();
       RectSweepingButtonViewEx tI = this.I;
       if (tI != null) {
          tI.invalidate();
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RectSweepingButtonViewEx.class, "1")) {
          return;
       }
       Bitmap uBitmap = this.c();
       long l = 0;
       if (this.getMSweepingStartTime() - l <= 0) {
          if (uBitmap == null) {
             super.onDraw(p0);
          }else {
             p0.drawBitmap(uBitmap, null, this.getMMaskRect(), this.getMPaint());
          }
          return;
       }else {
          long l1 = SystemClock.uptimeMillis() - this.getMSweepingStartTime();
          boolean b = false;
          if (!this.getMForceStopRequired() && (l1 - l < 0 || l1 - this.getMAnimationDurationInMills() > 0)) {
             if (uBitmap == null) {
                super.onDraw(p0);
             }else {
                p0.drawBitmap(uBitmap, null, this.getMMaskRect(), this.getMPaint());
             }
             this.setMIsSweeping(b);
             this.setMSweepingStartTime(l);
             this.setMAccumulatedTranslate(0);
             this.getMHaloMatrix().reset();
             this.e();
             return;
          }else {
             float f = ((float)l1 / (float)this.getMAnimationDurationInMills()) * ((float)this.getWidth() + this.getMInitTranslateX());
             float f1 = f - this.getMAccumulatedTranslate();
             this.setMAccumulatedTranslate(f);
             if (!this.getMTouching()) {
                b = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.getMPaint(), 31);
             }
             this.getMPaint().setColor(0xff000000);
             Pair pair = this.d();
             p0.drawRoundRect(this.getMPrimerRect(), pair.getFirst().floatValue(), pair.getSecond().floatValue(), this.getMPaint());
             this.getMPaint().setXfermode(this.getMXfermode());
             this.getMPaint().setColor(this.getMPaint().getColor());
             this.getMHaloMatrix().postTranslate(f1, 0);
             Bitmap mHaloBitmap = this.getMHaloBitmap();
             a.m(mHaloBitmap);
             p0.drawBitmap(mHaloBitmap, this.getMHaloMatrix(), this.getMPaint());
             this.getMPaint().setXfermode(this.getMXfermodeBlend());
             if (uBitmap != null) {
                p0.drawBitmap(uBitmap, null, this.getMMaskRect(), this.getMPaint());
             }
             this.getMPaint().setXfermode(null);
             if (!this.getMTouching()) {
                p0.restoreToCount(b);
             }
             RectSweepingButtonViewEx tI = this.I;
             if (tI != null) {
                tI.invalidate();
             }
             this.invalidate();
             return;
          }
       }
    }
    public final void setAttachLottieView(LottieAnimationView p0){
       this.I = p0;
    }
}
