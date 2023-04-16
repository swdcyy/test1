package com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Matrix;
import com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView$a;
import android.graphics.Paint$Style;
import android.graphics.Bitmap;
import kotlin.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Long;
import android.widget.ImageView;
import java.lang.Runnable;
import com.kuaishou.merchant.basic.widget.sweeping.HaloSweepingImageView$b;
import android.graphics.Canvas;
import android.os.SystemClock;
import java.lang.Number;
import android.graphics.Xfermode;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public abstract class HaloSweepingImageView extends AppCompatImageView	// class@001600
{
    public final int d;
    public boolean e;
    public Bitmap f;
    public float g;
    public final RectF h;
    public final RectF i;
    public final RectF j;
    public final Paint k;
    public long l;
    public long m;
    public float n;
    public final PorterDuffXfermode o;
    public final PorterDuffXfermode p;
    public final Matrix q;
    public float r;
    public int s;
    public float t;
    public boolean u;
    public int v;
    public boolean w;
    public final Runnable x;

    public void HaloSweepingImageView(Context p0){
       super(p0, null);
    }
    public void HaloSweepingImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HaloSweepingImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = 3;
       this.g = 0x3f800000;
       this.h = new RectF();
       this.i = new RectF();
       this.j = new RectF();
       Paint paint = new Paint();
       this.k = paint;
       this.o = new PorterDuffXfermode(PorterDuff$Mode.SRC_ATOP);
       this.p = new PorterDuffXfermode(PorterDuff$Mode.ADD);
       this.q = new Matrix();
       this.s = Integer.MIN_VALUE;
       this.x = new HaloSweepingImageView$a(this);
       paint.setStyle(Paint$Style.FILL);
       paint.setAntiAlias(true);
    }
    public abstract void a(RectF p0,RectF p1);
    public abstract Bitmap c();
    public Pair d(){
       Object obj = PatchProxy.apply(null, this, HaloSweepingImageView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Pair(Float.valueOf(0), Float.valueOf(0));
    }
    public void e(){
    }
    public final void f(float p0,long p1,float p2){
       if (PatchProxy.isSupport(HaloSweepingImageView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Long.valueOf(p1), Float.valueOf(p2), this, HaloSweepingImageView.class, "2")) {
          return;
       }
       this.g = p0;
       this.l = p1;
       this.n = p2;
       if (this.e != null) {
          return;
       }
       if (this.getWidth() <= 0 || this.getHeight() <= 0) {
          this.w = true;
       }else {
          this.x.run();
       }
       return;
    }
    public abstract int getLightBandDrawableId();
    public final float getMAccumulatedTranslate(){
       return this.r;
    }
    public final long getMAnimationDurationInMills(){
       return this.l;
    }
    public final int getMExternalSetLightBandResId(){
       return this.s;
    }
    public final boolean getMForceStopRequired(){
       return this.u;
    }
    public final float getMHaloBandRatio(){
       return this.g;
    }
    public final Bitmap getMHaloBitmap(){
       return this.f;
    }
    public final Matrix getMHaloMatrix(){
       return this.q;
    }
    public final RectF getMHaloRect(){
       return this.h;
    }
    public final float getMInitTranslateX(){
       return this.t;
    }
    public final boolean getMIsSweeping(){
       return this.e;
    }
    public final RectF getMMaskRect(){
       return this.i;
    }
    public final Paint getMPaint(){
       return this.k;
    }
    public final RectF getMPrimerRect(){
       return this.j;
    }
    public final int getMSweepCount(){
       return this.v;
    }
    public final int getMSweepMaxCount(){
       return this.d;
    }
    public final long getMSweepingStartTime(){
       return this.m;
    }
    public final PorterDuffXfermode getMXfermode(){
       return this.o;
    }
    public final PorterDuffXfermode getMXfermodeBlend(){
       return this.p;
    }
    public final RectF getMaskRect(){
       return this.i;
    }
    public final Paint getPaint(){
       return this.k;
    }
    public final void i(long p0,float p1,long p2,float p3){
       if (PatchProxy.isSupport(HaloSweepingImageView.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Float.valueOf(p1), Long.valueOf(p2), Float.valueOf(p3), this, HaloSweepingImageView.class, "1")) {
          return;
       }
       if (p0 - null <= 0) {
          this.f(p1, p2, p3);
       }
       HaloSweepingImageView$b uob = new HaloSweepingImageView$b(this, p1, p2, p3);
       this.postDelayed(v0, p0);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HaloSweepingImageView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       long l = 0;
       if (this.m - l <= 0) {
          return;
       }
       long l1 = SystemClock.uptimeMillis() - this.m;
       if (this.u == null && l1 - l >= 0) {
          HaloSweepingImageView tl = this.l;
          if (l1 - tl <= 0) {
             float f = ((float)l1 / (float)tl) * ((float)this.getWidth() + this.t);
             float f1 = f - this.r;
             this.r = f;
             int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), this.k, 31);
             this.k.setColor(0xff000000);
             Pair pair = this.d();
             p0.drawRoundRect(this.j, pair.getFirst().floatValue(), pair.getSecond().floatValue(), this.k);
             this.k.setXfermode(this.o);
             this.k.setColor(this.k.getColor());
             this.q.postTranslate(f1, 0);
             HaloSweepingImageView tf = this.f;
             a.m(tf);
             p0.drawBitmap(tf, this.q, this.k);
             this.k.setXfermode(this.p);
             Bitmap uBitmap = this.c();
             if (uBitmap != null) {
                p0.drawBitmap(uBitmap, null, this.i, this.k);
             }
             this.k.setXfermode(null);
             p0.restoreToCount(i);
             this.invalidate();
             return;
          }
       }
       this.e = false;
       this.u = false;
       this.m = l;
       this.r = 0;
       this.q.reset();
       this.e();
       return;
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
          this.h.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
          this.a(this.i, this.j);
          if (this.w != null) {
             this.x.run();
             this.w = false;
          }
       }
       return;
    }
    public final void setMAccumulatedTranslate(float p0){
       this.r = p0;
    }
    public final void setMAnimationDurationInMills(long p0){
       this.l = p0;
    }
    public final void setMExternalSetLightBandResId(int p0){
       this.s = p0;
    }
    public final void setMForceStopRequired(boolean p0){
       this.u = p0;
    }
    public final void setMHaloBandRatio(float p0){
       this.g = p0;
    }
    public final void setMHaloBitmap(Bitmap p0){
       this.f = p0;
    }
    public final void setMInitTranslateX(float p0){
       this.t = p0;
    }
    public final void setMIsSweeping(boolean p0){
       this.e = p0;
    }
    public final void setMSweepCount(int p0){
       this.v = p0;
    }
    public final void setMSweepingStartTime(long p0){
       this.m = p0;
    }
}
