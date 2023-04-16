package com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer$a;
import java.lang.Runnable;
import com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer;
import dc.a;
import ec.a;
import java.lang.Object;
import com.facebook.common.references.a;
import android.graphics.Bitmap$Config;
import sc.d;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import cb.a;
import android.graphics.Bitmap;
import ec.b;
import java.lang.Integer;
import android.util.SparseArray;

public class DefaultBitmapFramePreparer$a implements Runnable	// class@0010d6
{
    public final a b;
    public final a c;
    public final int d;
    public final int e;
    public final DefaultBitmapFramePreparer f;

    public void DefaultBitmapFramePreparer$a(DefaultBitmapFramePreparer p0,a p1,a p2,int p3,int p4){
       this.f = p0;
       super();
       this.c = p1;
       this.b = p2;
       this.d = p3;
       this.e = p4;
    }
    public final boolean a(int p0,int p1){
       int i = 2;
       a uoa = null;
       if (p1 != 1) {
          boolean b = false;
          if (p1 != i) {
             a.f(uoa);
             return b;
          }else {
             try{
                uoa = this.f.mPlatformBitmapFactory.c(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight(), this.f.mBitmapConfig);
                i = -1;
             }catch(java.lang.RuntimeException e8){
                a.u(DefaultBitmapFramePreparer.TAG, "Failed to create frame bitmap", e8);
                a.f(uoa);
                return this.f.mPlatformBitmapFactory.c(this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight(), this.f.mBitmapConfig);
             }
          }
       }else {
          uoa = this.b.b(p0, this.c.getIntrinsicWidth(), this.c.getIntrinsicHeight());
       }
       boolean b1 = this.b(p0, uoa, p1);
       a.f(uoa);
       if (b1 || i == -1) {
          return b1;
       }else {
          return this.a(p0, i);
       }
    }
    public final boolean b(int p0,a p1,int p2){
       boolean b = false;
       if (!a.l(p1)) {
          return b;
       }
       if (!this.f.mBitmapFrameRenderer.renderFrame(p0, p1.j())) {
          return b;
       }
       a.n(DefaultBitmapFramePreparer.TAG, "Frame %d ready.", Integer.valueOf(this.d));
       DefaultBitmapFramePreparer mPendingFram = this.f.mPendingFrameDecodeJobs;
       _monitor_enter(mPendingFram);
       this.b.g(this.d, p1, p2);
       _monitor_exit(mPendingFram);
       return true;
    }
    public void run(){
       DefaultBitmapFramePreparer mPendingFram;
       if (this.b.d(this.d)) {
          a.n(DefaultBitmapFramePreparer.TAG, "Frame %d is cached already.", Integer.valueOf(this.d));
          mPendingFram = this.f.mPendingFrameDecodeJobs;
          _monitor_enter(mPendingFram);
          this.f.mPendingFrameDecodeJobs.remove(this.e);
          _monitor_exit(mPendingFram);
          return;
       }else {
          int i = 1;
          if (this.a(this.d, i)) {
             a.n(DefaultBitmapFramePreparer.TAG, "Prepared frame frame %d.", Integer.valueOf(this.d));
          }else {
             Object[] objArray = new Object[i];
             objArray[0] = Integer.valueOf(this.d);
             a.e(DefaultBitmapFramePreparer.TAG, "Could not prepare frame %d.", objArray);
          }
          mPendingFram = this.f.mPendingFrameDecodeJobs;
          _monitor_enter(mPendingFram);
          this.f.mPendingFrameDecodeJobs.remove(this.e);
          _monitor_exit(mPendingFram);
          return;
       }
    }
}
