package com.yxcorp.gifshow.widget.RectSweepingButtonView;
import com.yxcorp.gifshow.widget.HaloSweepingImageView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import android.widget.ImageView;
import kotlin.Pair;
import java.lang.Number;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.Matrix;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.drawee.view.DraweeView;
import java.lang.Float;
import java.lang.Long;
import tyc.u1;
import java.lang.Runnable;

public abstract class RectSweepingButtonView extends HaloSweepingImageView	// class@0018ab
{
    public Bitmap Q;
    public boolean R;
    public float S;
    public boolean T;
    public boolean U;
    public long U0;
    public long V;
    public float V0;
    public float W;

    public void RectSweepingButtonView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void RectSweepingButtonView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void RectSweepingButtonView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.S = 0x3f800000;
       this.V = 1000;
       this.W = 0.40f;
       this.U0 = 1000;
       this.V0 = 0x41f00000;
    }
    public final float getMBandRatio(){
       return this.W;
    }
    public final long getMDurationInMills(){
       return this.U0;
    }
    public final Bitmap getMMaskBitmap(){
       return this.Q;
    }
    public final float getMRotationAngle(){
       return this.V0;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RectSweepingButtonView.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       Bitmap uBitmap = this.r0();
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
             this.t0();
             return;
          }else {
             float f = ((float)l1 / (float)this.getMAnimationDurationInMills()) * ((float)this.getWidth() + this.getMInitTranslateX());
             float f1 = f - this.getMAccumulatedTranslate();
             this.setMAccumulatedTranslate(f);
             if (this.T == null) {
                b = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.getMPaint(), 31);
             }
             this.getMPaint().setColor(0xff000000);
             Pair pair = this.s0();
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
             if (this.T == null) {
                p0.restoreToCount(b);
             }
             this.invalidate();
             return;
          }
       }
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RectSweepingButtonView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (this.R != null) {
          int action = p0.getAction();
          boolean b = true;
          if (action) {
             if (action != b) {
                if (action == 3) {
                   this.setAlpha(0x3f800000);
                   this.T = false;
                }
             }else {
                this.setAlpha(0x3f800000);
                this.T = false;
             }
          }else {
             this.setAlpha(this.S);
             this.T = b;
          }
       }
       return super.onTouchEvent(p0);
    }
    public void q0(RectF p0,RectF p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RectSweepingButtonView.class, "1")) {
          return;
       }
       a.p(p0, "maskRect");
       a.p(p1, "primerRect");
       p0.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       p1.set(p0);
       return;
    }
    public Pair s0(){
       Object obj = PatchProxy.apply(null, this, RectSweepingButtonView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Float.valueOf((this.getMaskRect().height() / 2.00f)), Float.valueOf((this.getMaskRect().height() / 2.00f)));
    }
    public final void setMBandRatio(float p0){
       this.W = p0;
    }
    public final void setMDurationInMills(long p0){
       this.U0 = p0;
    }
    public final void setMMaskBitmap(Bitmap p0){
       this.Q = p0;
    }
    public final void setMRotationAngle(float p0){
       this.V0 = p0;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, RectSweepingButtonView.class, "7")) {
          return;
       }
       if (this.U != null) {
          RectSweepingButtonView tV = this.V;
          RectSweepingButtonView tW = this.W;
          RectSweepingButtonView tU0 = this.U0;
          RectSweepingButtonView tV0 = this.V0;
          if (!PatchProxy.isSupport(HaloSweepingImageView.class) || !PatchProxy.applyVoidFourRefs(Long.valueOf(tV), Float.valueOf(tW), Long.valueOf(tU0), Float.valueOf(tV0), this, HaloSweepingImageView.class, "1")) {
             if (tV <= 0) {
                this.u0(tW, tU0, tV0);
             }
             u1 ou1 = new u1(this, tW, tU0, tV0);
             this.postDelayed(v8, tV);
          }
       }
       return;
    }
}
