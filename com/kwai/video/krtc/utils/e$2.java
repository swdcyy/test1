package com.kwai.video.krtc.utils.e$2;
import java.lang.Runnable;
import com.kwai.video.krtc.utils.e$b;
import java.util.concurrent.Callable;
import com.kwai.video.krtc.utils.e$a;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e$2 implements Runnable	// class@0008c5
{
    public final e$b a;
    public final Callable b;
    public final e$a c;
    public final CountDownLatch d;

    public void e$2(e$b p0,Callable p1,e$a p2,CountDownLatch p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$2.class, "1")) {
          return;
       }
       try{
          this.a.a = this.b.call();
       }catch(java.lang.Exception e0){
          this.c.a = e0;
       }
       this.d.countDown();
       return;
    }
}
