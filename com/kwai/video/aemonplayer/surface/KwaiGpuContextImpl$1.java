package com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl$1;
import java.lang.Runnable;
import com.kwai.video.aemonplayer.surface.KwaiGpuContextImpl;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class KwaiGpuContextImpl$1 implements Runnable	// class@0019df
{
    public final KwaiGpuContextImpl this$0;
    public final Handler val$handler;
    public final CountDownLatch val$latch;

    public void KwaiGpuContextImpl$1(KwaiGpuContextImpl p0,Handler p1,CountDownLatch p2){
       this.this$0 = p0;
       this.val$handler = p1;
       this.val$latch = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KwaiGpuContextImpl$1.class, "1")) {
          return;
       }
       this.this$0.createInternal(this.val$handler);
       this.val$latch.countDown();
       return;
    }
}
