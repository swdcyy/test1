package com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import dc.a;
import dc.c$b;
import sc.d;
import ec.a;
import dc.d;
import ec.b;
import gc.a;
import gc.b;
import java.lang.Object;
import android.graphics.Bitmap$Config;
import android.graphics.Paint;
import com.facebook.common.references.a;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend$a;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import android.graphics.ColorFilter;

public class BitmapAnimationBackend implements a, c$b	// class@0010d5
{
    public final d mAnimationInformation;
    public Bitmap$Config mBitmapConfig;
    public final a mBitmapFrameCache;
    public final a mBitmapFramePreparationStrategy;
    public final b mBitmapFramePreparer;
    public final b mBitmapFrameRenderer;
    public int mBitmapHeight;
    public int mBitmapWidth;
    public Rect mBounds;
    public BitmapAnimationBackend$a mFrameListener;
    public final Paint mPaint;
    public final d mPlatformBitmapFactory;
    public static final Class TAG;

    static {
       BitmapAnimationBackend.TAG = BitmapAnimationBackend.class;
    }
    public void BitmapAnimationBackend(d p0,a p1,d p2,b p3,a p4,b p5){
       super();
       this.mBitmapConfig = Bitmap$Config.ARGB_8888;
       this.mPlatformBitmapFactory = p0;
       this.mBitmapFrameCache = p1;
       this.mAnimationInformation = p2;
       this.mBitmapFrameRenderer = p3;
       this.mBitmapFramePreparationStrategy = p4;
       this.mBitmapFramePreparer = p5;
       this.mPaint = new Paint(6);
       this.updateBitmapDimensions();
    }
    public void clear(){
       this.mBitmapFrameCache.clear();
    }
    public final boolean drawBitmapAndCache(int p0,a p1,Canvas p2,int p3){
       if (!a.l(p1)) {
          return false;
       }
       if (this.mBounds == null) {
          p2.drawBitmap(p1.j(), 0, 0, this.mPaint);
       }else {
          p2.drawBitmap(p1.j(), null, this.mBounds, this.mPaint);
       }
       if (p3 != 3) {
          this.mBitmapFrameCache.a(p0, p1, p3);
       }
       BitmapAnimationBackend tmFrameListe = this.mFrameListener;
       if (tmFrameListe != null) {
          tmFrameListe.b(this, p0, p3);
       }
       return true;
    }
    public boolean drawFrame(Drawable p0,Canvas p1,int p2){
       BitmapAnimationBackend tmFrameListe1;
       BitmapAnimationBackend tmFrameListe = this.mFrameListener;
       if (tmFrameListe != null) {
          tmFrameListe.a(this, p2);
       }
       boolean b = this.drawFrameOrFallback(p1, p2, 0);
       if (!b) {
          tmFrameListe1 = this.mFrameListener;
          if (tmFrameListe1 != null) {
             tmFrameListe1.c(this, p2);
          }
       }
       tmFrameListe1 = this.mBitmapFramePreparationStrategy;
       if (tmFrameListe1 != null) {
          BitmapAnimationBackend tmBitmapFram = this.mBitmapFramePreparer;
          if (tmBitmapFram != null) {
             tmFrameListe1.a(tmBitmapFram, this.mBitmapFrameCache, this, p2);
          }
       }
       return b;
    }
    public final boolean drawFrameOrFallback(Canvas p0,int p1,int p2){
       boolean b1;
       int i = 3;
       boolean b = false;
       a uoa = null;
       if (p2) {
          if (p2 != 1) {
             if (p2 != 2) {
                if (p2 != i) {
                   a.f(uoa);
                   return b;
                }else {
                   uoa = this.mBitmapFrameCache.c(p1);
                   b1 = this.drawBitmapAndCache(p1, uoa, p0, i);
                   i = -1;
                }
             }else {
                try{
                   uoa = this.mPlatformBitmapFactory.c(this.mBitmapWidth, this.mBitmapHeight, this.mBitmapConfig);
                   if (this.renderFrameInBitmap(p1, uoa) && this.drawBitmapAndCache(p1, uoa, p0, 2)) {
                      b = 1;
                   }
                   b1 = b;
                }catch(java.lang.RuntimeException e10){
                   a.u(BitmapAnimationBackend.TAG, "Failed to create frame bitmap", e10);
                   a.f(uoa);
                   return b;
                }
             }
          }else {
             uoa = this.mBitmapFrameCache.b(p1, this.mBitmapWidth, this.mBitmapHeight);
             if (this.renderFrameInBitmap(p1, uoa) && this.drawBitmapAndCache(p1, uoa, p0, 1)) {
                b = 1;
             }
             b1 = b;
             i = 2;
          }
       }else {
          uoa = this.mBitmapFrameCache.f(p1);
          b1 = this.drawBitmapAndCache(p1, uoa, p0, b);
          i = 1;
       }
       a.f(uoa);
       if (b1 || i == -1) {
          return b1;
       }else {
          return this.drawFrameOrFallback(p0, p1, i);
       }
    }
    public int getFrameCount(){
       return this.mAnimationInformation.getFrameCount();
    }
    public int getFrameDurationMs(int p0){
       return this.mAnimationInformation.getFrameDurationMs(p0);
    }
    public int getIntrinsicHeight(){
       return this.mBitmapHeight;
    }
    public int getIntrinsicWidth(){
       return this.mBitmapWidth;
    }
    public int getLoopCount(){
       return this.mAnimationInformation.getLoopCount();
    }
    public int getSizeInBytes(){
       return this.mBitmapFrameCache.getSizeInBytes();
    }
    public void onInactive(){
       this.clear();
    }
    public final boolean renderFrameInBitmap(int p0,a p1){
       if (!a.l(p1)) {
          return false;
       }
       boolean b = this.mBitmapFrameRenderer.renderFrame(p0, p1.j());
       if (!b) {
          a.f(p1);
       }
       return b;
    }
    public void setAlpha(int p0){
       this.mPaint.setAlpha(p0);
    }
    public void setBitmapConfig(Bitmap$Config p0){
       this.mBitmapConfig = p0;
    }
    public void setBounds(Rect p0){
       this.mBounds = p0;
       this.mBitmapFrameRenderer.setBounds(p0);
       this.updateBitmapDimensions();
    }
    public void setColorFilter(ColorFilter p0){
       this.mPaint.setColorFilter(p0);
    }
    public void setFrameListener(BitmapAnimationBackend$a p0){
       this.mFrameListener = p0;
    }
    public final void updateBitmapDimensions(){
       BitmapAnimationBackend tmBounds;
       int intrinsicWid = this.mBitmapFrameRenderer.getIntrinsicWidth();
       this.mBitmapWidth = intrinsicWid;
       int i = -1;
       if (intrinsicWid == i) {
          tmBounds = this.mBounds;
          intrinsicWid = (tmBounds == null)? -1: tmBounds.width();
          this.mBitmapWidth = intrinsicWid;
       }
       intrinsicWid = this.mBitmapFrameRenderer.getIntrinsicHeight();
       this.mBitmapHeight = intrinsicWid;
       if (intrinsicWid == i) {
          tmBounds = this.mBounds;
          if (tmBounds != null) {
             i = tmBounds.height();
          }
          this.mBitmapHeight = i;
       }
       return;
    }
}
