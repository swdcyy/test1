package com.yxcorp.image.fresco.wrapper.c;
import java.util.concurrent.Future;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import java.util.concurrent.TimeUnit;
import java.lang.Long;
import java.util.concurrent.TimeoutException;
import android.graphics.Bitmap;
import m0d.l;
import java.lang.AssertionError;

public class c implements Future, ImageCallback	// class@001a14
{
    public boolean b;
    public Drawable c;

    public void c(){
       super();
       this.b = false;
    }
    public static c w(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public boolean cancel(boolean p0){
       return false;
    }
    public Object get(){
       return this.q();
    }
    public Object get(long p0,TimeUnit p1){
       return this.t(p0, p1);
    }
    public boolean isCancelled(){
       return false;
    }
    public synchronized boolean isDone(){
       return this.b;
    }
    public synchronized final Drawable m(Long p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       this.b = true;
       this.c = p0;
       this.notifyAll();
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
    }
    public Drawable q(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return this.m(objArray);
       }catch(java.util.concurrent.TimeoutException e0){
          throw new AssertionError(e0);
       }
    }
    public Drawable t(long p0,TimeUnit p1){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.m(Long.valueOf(TimeUnit.MILLISECONDS.convert(p0, p1)));
    }
}
