package com.kwai.video.stannis.utils.RefCountDelegate;
import com.kwai.video.stannis.utils.RefCounted;
import java.lang.Runnable;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RefCountDelegate implements RefCounted	// class@000c80
{
    public final AtomicInteger refCount;
    public final Runnable releaseCallback;

    public void RefCountDelegate(Runnable p0){
       super();
       this.refCount = new AtomicInteger(1);
       this.releaseCallback = p0;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, RefCountDelegate.class, "2")) {
          return;
       }
       if (!this.refCount.decrementAndGet()) {
          RefCountDelegate treleaseCall = this.releaseCallback;
          if (treleaseCall != null) {
             treleaseCall.run();
          }
       }
       return;
    }
    public void retain(){
       if (PatchProxy.applyVoid(null, this, RefCountDelegate.class, "1")) {
          return;
       }
       this.refCount.incrementAndGet();
       return;
    }
}
