package com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer;
import gc.b;
import sc.d;
import ec.b;
import android.graphics.Bitmap$Config;
import java.util.concurrent.ExecutorService;
import java.lang.Object;
import android.util.SparseArray;
import dc.a;
import ec.a;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import cb.a;
import com.facebook.fresco.animation.bitmap.preparation.DefaultBitmapFramePreparer$a;
import java.lang.Runnable;

public class DefaultBitmapFramePreparer implements b	// class@0010d7
{
    public final Bitmap$Config mBitmapConfig;
    public final b mBitmapFrameRenderer;
    public final ExecutorService mExecutorService;
    public final SparseArray mPendingFrameDecodeJobs;
    public final d mPlatformBitmapFactory;
    public static final Class TAG;

    static {
       DefaultBitmapFramePreparer.TAG = DefaultBitmapFramePreparer.class;
    }
    public void DefaultBitmapFramePreparer(d p0,b p1,Bitmap$Config p2,ExecutorService p3){
       super();
       this.mPlatformBitmapFactory = p0;
       this.mBitmapFrameRenderer = p1;
       this.mBitmapConfig = p2;
       this.mExecutorService = p3;
       this.mPendingFrameDecodeJobs = new SparseArray();
    }
    public static int getUniqueId(a p0,int p1){
       return ((p0.hashCode() * 31) + p1);
    }
    public boolean prepareFrame(a p0,a p1,int p2){
       int uniqueId = DefaultBitmapFramePreparer.getUniqueId(p1, p2);
       DefaultBitmapFramePreparer tmPendingFra = this.mPendingFrameDecodeJobs;
       _monitor_enter(tmPendingFra);
       if (this.mPendingFrameDecodeJobs.get(uniqueId) != null) {
          a.n(DefaultBitmapFramePreparer.TAG, "Already scheduled decode job for frame %d", Integer.valueOf(p2));
          _monitor_exit(tmPendingFra);
          return true;
       }else if(p0.d(p2)){
          a.n(DefaultBitmapFramePreparer.TAG, "Frame %d is cached already.", Integer.valueOf(p2));
          _monitor_exit(tmPendingFra);
          return true;
       }else {
          DefaultBitmapFramePreparer$a uoa = new DefaultBitmapFramePreparer$a(this, p1, p0, p2, uniqueId);
          this.mPendingFrameDecodeJobs.put(uniqueId, v9);
          this.mExecutorService.execute(v9);
          _monitor_exit(tmPendingFra);
          return true;
       }
    }
}
