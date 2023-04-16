package com.yxcorp.gifshow.widget.HaloSweepingImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Matrix;
import com.yxcorp.gifshow.widget.HaloSweepingImageView$a;
import android.graphics.Paint$Style;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import android.widget.ImageView;
import kotlin.Pair;
import java.lang.Number;
import android.graphics.Xfermode;
import android.graphics.Rect;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;
import java.lang.Runnable;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap$Config;
import java.lang.Float;
import java.lang.Long;

public abstract class HaloSweepingImageView extends KwaiImageView	// class@001860
{
    public final RectF A;
    public final RectF B;
    public final RectF C;
    public final Paint D;
    public long E;
    public long F;
    public float G;
    public final PorterDuffXfermode H;
    public final PorterDuffXfermode I;
    public final Matrix J;
    public float K;
    public int L;
    public float M;
    public boolean N;
    public boolean O;
    public final Runnable P;
    public boolean x;
    public Bitmap y;
    public float z;

    public void HaloSweepingImageView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void HaloSweepingImageView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void HaloSweepingImageView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.z = 0x3f800000;
       this.A = new RectF();
       this.B = new RectF();
       this.C = new RectF();
       Paint paint = new Paint();
       this.D = paint;
       this.H = new PorterDuffXfermode(PorterDuff$Mode.SRC_ATOP);
       this.I = new PorterDuffXfermode(PorterDuff$Mode.ADD);
       this.J = new Matrix();
       this.L = Integer.MIN_VALUE;
       this.P = new HaloSweepingImageView$a(this);
       paint.setStyle(Paint$Style.FILL);
       paint.setAntiAlias(true);
    }
    public abstract int getLightBandDrawableId();
    public final float getMAccumulatedTranslate(){
       return this.K;
    }
    public final long getMAnimationDurationInMills(){
       return this.E;
    }
    public final int getMExternalSetLightBandResId(){
       return this.L;
    }
    public final boolean getMForceStopRequired(){
       return this.N;
    }
    public final float getMHaloBandRatio(){
       return this.z;
    }
    public final Bitmap getMHaloBitmap(){
       return this.y;
    }
    public final Matrix getMHaloMatrix(){
       return this.J;
    }
    public final RectF getMHaloRect(){
       return this.A;
    }
    public final float getMInitTranslateX(){
       return this.M;
    }
    public final boolean getMIsSweeping(){
       return this.x;
    }
    public final RectF getMMaskRect(){
       return this.B;
    }
    public final Paint getMPaint(){
       return this.D;
    }
    public final RectF getMPrimerRect(){
       return this.C;
    }
    public final long getMSweepingStartTime(){
       return this.F;
    }
    public final PorterDuffXfermode getMXfermode(){
       return this.H;
    }
    public final PorterDuffXfermode getMXfermodeBlend(){
       return this.I;
    }
    public final RectF getMaskRect(){
       return this.B;
    }
    public final Paint getPaint(){
       return this.D;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HaloSweepingImageView.class, "4")) {
          return;
       }
       String str = "canvas";
       a.p(p0, str);
       super.onDraw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, HaloSweepingImageView.class, "5")) {
          a.p(p0, str);
       }
       long l = 0;
       if (this.F - l <= 0) {
          return;
       }else {
          long l1 = SystemClock.uptimeMillis() - this.F;
          float f = 0;
          if (this.N != null || l1 - l < 0) {
             this.x = false;
             this.N = false;
             this.F = l;
             this.K = f;
             this.J.reset();
             this.t0();
             return;
          }else {
             float f1 = ((float)l1 / (float)this.E) * ((float)this.getWidth() + this.M);
             float f2 = f1 - this.K;
             this.K = f1;
             int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.D, 31);
             this.D.setColor(0xff000000);
             Pair pair = this.s0();
             p0.drawRoundRect(this.C, pair.getFirst().floatValue(), pair.getSecond().floatValue(), this.D);
             this.D.setXfermode(this.H);
             this.D.setColor(this.D.getColor());
             this.J.postTranslate(f2, f);
             HaloSweepingImageView ty = this.y;
             a.m(ty);
             p0.drawBitmap(ty, this.J, this.D);
             this.D.setXfermode(this.I);
             Bitmap uBitmap = this.r0();
             if (uBitmap != null) {
                p0.drawBitmap(uBitmap, null, this.B, this.D);
             }
             this.D.setXfermode(null);
             p0.restoreToCount(i);
             if (((int)l1 / (int)this.E) == 1) {
                this.N = true;
             }
             this.invalidate();
             return;
          }
       }
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(HaloSweepingImageView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, HaloSweepingImageView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0 && (this.getWidth() > 0 && this.getHeight() > 0)) {
          this.A.set(0, 0, ((float)this.getWidth() * this.z), (float)this.getHeight());
          this.q0(this.B, this.C);
          if (this.O != null) {
             this.P.run();
             this.O = false;
          }
       }
       return;
    }
    public final Bitmap p0(Drawable p0,RectF p1){
       Bitmap obj = PatchProxy.applyTwoRefs(p0, p1, this, HaloSweepingImageView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "drawable");
       a.p(p1, "rect");
       float f = 0;
       if (p1.width() - f <= 0 || p1.height() - f <= 0) {
          return null;
       }
       obj = Bitmap.createBitmap((int)p1.width(), (int)p1.height(), Bitmap$Config.ARGB_8888);
       p0.setBounds(0, 0, (int)p1.width(), (int)p1.height());
       p0.draw(new Canvas(obj));
       return obj;
    }
    public abstract void q0(RectF p0,RectF p1);
    public abstract Bitmap r0();
    public Pair s0(){
       Object obj = PatchProxy.apply(null, this, HaloSweepingImageView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Float.valueOf(0), Float.valueOf(0));
    }
    public final void setMAccumulatedTranslate(float p0){
       this.K = p0;
    }
    public final void setMAnimationDurationInMills(long p0){
       this.E = p0;
    }
    public final void setMExternalSetLightBandResId(int p0){
       this.L = p0;
    }
    public final void setMForceStopRequired(boolean p0){
       this.N = p0;
    }
    public final void setMHaloBandRatio(float p0){
       this.z = p0;
    }
    public final void setMHaloBitmap(Bitmap p0){
       this.y = p0;
    }
    public final void setMInitTranslateX(float p0){
       this.M = p0;
    }
    public final void setMIsSweeping(boolean p0){
       this.x = p0;
    }
    public final void setMSweepingStartTime(long p0){
       this.F = p0;
    }
    public void t0(){
    }
    public final void u0(float p0,long p1,float p2){
       if (PatchProxy.isSupport(HaloSweepingImageView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Long.valueOf(p1), Float.valueOf(p2), this, HaloSweepingImageView.class, "2")) {
          return;
       }
       this.z = p0;
       this.E = p1;
       this.G = p2;
       if (this.x != null) {
          return;
       }
       if (this.getWidth() <= 0 || this.getHeight() <= 0) {
          this.O = true;
       }else {
          this.P.run();
       }
       return;
    }
}
