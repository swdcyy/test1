package com.kuaishou.merchant.basic.widget.sweeping.RectSweepingButtonView;
import com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import kotlin.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.SystemClock;
import java.lang.Number;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.graphics.Matrix;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.view.View;

public abstract class RectSweepingButtonView extends HaloSweepingImageView	// class@001601
{
    public boolean A;
    public float B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public long G;
    public float H;
    public Bitmap y;
    public int z;

    public void RectSweepingButtonView(Context p0){
       super(p0, null);
    }
    public void RectSweepingButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RectSweepingButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.z = -1;
       this.B = 0x3f800000;
       this.E = 520;
       this.F = 0.40f;
       this.G = 680;
       this.H = 0x41f00000;
    }
    public void a(RectF p0,RectF p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RectSweepingButtonView.class, "1")) {
          return;
       }
       p0.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       p1.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       return;
    }
    public Pair d(){
       Object obj = PatchProxy.apply(null, this, RectSweepingButtonView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Float.valueOf((this.getMaskRect().height() / 2.00f)), Float.valueOf((this.getMaskRect().height() / 2.00f)));
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, RectSweepingButtonView.class, "8")) {
          return;
       }
       if (this.D != null) {
          if (this.getMSweepCount() == 3) {
             this.setMSweepCount(0);
             this.i(1000, this.F, this.G, this.H);
          }else {
             this.i(this.E, this.F, this.G, this.H);
          }
       }
       return;
    }
    public int getLightBandDrawableId(){
       return this.z;
    }
    public final long getMAnimationInterval(){
       return this.E;
    }
    public final float getMBandRatio(){
       return this.F;
    }
    public final long getMDurationInMills(){
       return this.G;
    }
    public final int getMHaloDrawableId(){
       return this.z;
    }
    public final boolean getMIsAnimationOpened(){
       return this.D;
    }
    public final Bitmap getMMaskBitmap(){
       return this.y;
    }
    public final float getMRotationAngle(){
       return this.H;
    }
    public final boolean getMTouching(){
       return this.C;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, RectSweepingButtonView.class, "6")) {
          return;
       }
       this.D = true;
       this.f(this.F, this.G, this.H);
       return;
    }
    public final void k(){
       this.D = false;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RectSweepingButtonView.class, "3")) {
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
             if (this.C == null) {
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
             if (this.C == null) {
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
       if (this.A != null) {
          int action = p0.getAction();
          boolean b = true;
          if (action) {
             if (action != b) {
                if (action == 3) {
                   this.setAlpha(0x3f800000);
                   this.C = false;
                }
             }else {
                this.setAlpha(0x3f800000);
                this.C = false;
             }
          }else {
             this.setAlpha(this.B);
             this.C = b;
          }
       }
       return super.onTouchEvent(p0);
    }
    public final void setMAnimationInterval(long p0){
       this.E = p0;
    }
    public final void setMBandRatio(float p0){
       this.F = p0;
    }
    public final void setMDurationInMills(long p0){
       this.G = p0;
    }
    public final void setMHaloDrawableId(int p0){
       this.z = p0;
    }
    public final void setMIsAnimationOpened(boolean p0){
       this.D = p0;
    }
    public final void setMMaskBitmap(Bitmap p0){
       this.y = p0;
    }
    public final void setMRotationAngle(float p0){
       this.H = p0;
    }
    public final void setMTouching(boolean p0){
       this.C = p0;
    }
}
