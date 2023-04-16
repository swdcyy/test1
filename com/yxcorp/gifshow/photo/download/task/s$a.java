package com.yxcorp.gifshow.photo.download.task.s$a;
import java.util.concurrent.Future;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import exb.b;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import android.graphics.drawable.Drawable;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeoutException;
import ixb.l0;
import java.lang.Runnable;
import ixb.m0;
import android.graphics.Bitmap;
import m0d.l;
import java.lang.Float;
import ixb.n0;
import ekd.k1;
import java.lang.AssertionError;

public class s$a implements Future, ImageCallback	// class@000f17
{
    public boolean b;
    public Drawable c;
    public final Handler d;
    public b e;
    public boolean f;

    public void s$a(b p0){
       super();
       this.b = false;
       this.d = new Handler(Looper.getMainLooper());
       this.e = p0;
    }
    public boolean cancel(boolean p0){
       return true;
    }
    public Object get(){
       return this.q();
    }
    public Object get(long p0,TimeUnit p1){
       Drawable uDrawable;
       if (PatchProxy.isSupport(s$a.class)) {
          uDrawable = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, s$a.class, "2");
          if (uDrawable != PatchProxyResult.class) {
          label_0029 :
             return uDrawable;
          }
       }
       uDrawable = this.m(Long.valueOf(TimeUnit.MILLISECONDS.convert(p0, p1)));
       goto label_0029 ;
    }
    public boolean isCancelled(){
       return false;
    }
    public synchronized boolean isDone(){
       return this.b;
    }
    public synchronized final Drawable m(Long p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b != null) {
          return this.c;
       }
       long l = 0;
       if (p0 == null) {
          this.wait(l);
       }else if(p0.longValue() - l > 0){
          this.wait(p0.longValue());
       }
       if (this.b != null) {
          return this.c;
       }else {
          throw new TimeoutException();
       }
    }
    public synchronized void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "4")) {
          return;
       }
       this.b = true;
       this.c = p0;
       if (this.e != null) {
          if (p0 != null) {
             this.d.post(new l0(this));
          }else {
             this.d.post(new m0(this));
          }
       }
       this.notifyAll();
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       if (PatchProxy.isSupport(s$a.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, s$a.class, "5")) {
          return;
       }
       if (this.e != null && this.f == null) {
          if (!(p0 * 100.00f) - 100.00f) {
             this.f = true;
          }else if(p0){
             k1.o(new n0(this, p0));
          }
       }
       return;
    }
    public Drawable q(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, s$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.m(objArray);
       }catch(java.util.concurrent.TimeoutException e0){
          throw new AssertionError(e0);
       }
    }
}
