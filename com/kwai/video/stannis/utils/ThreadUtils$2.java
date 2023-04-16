package com.kwai.video.stannis.utils.ThreadUtils$2;
import com.kwai.video.stannis.utils.ThreadUtils$BlockingOperation;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ThreadUtils$2 implements ThreadUtils$BlockingOperation	// class@000c86
{
    public final CountDownLatch val$latch;

    public void ThreadUtils$2(CountDownLatch p0){
       this.val$latch = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ThreadUtils$2.class, "1")) {
          return;
       }
       this.val$latch.await();
       return;
    }
}
