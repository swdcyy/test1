package com.kwai.video.stannis.utils.ThreadUtils$4;
import java.lang.Runnable;
import com.kwai.video.stannis.utils.ThreadUtils$1Result;
import java.util.concurrent.Callable;
import com.kwai.video.stannis.utils.ThreadUtils$1CaughtException;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ThreadUtils$4 implements Runnable	// class@000c88
{
    public final CountDownLatch val$barrier;
    public final Callable val$callable;
    public final ThreadUtils$1CaughtException val$caughtException;
    public final ThreadUtils$1Result val$result;

    public void ThreadUtils$4(ThreadUtils$1Result p0,Callable p1,ThreadUtils$1CaughtException p2,CountDownLatch p3){
       this.val$result = p0;
       this.val$callable = p1;
       this.val$caughtException = p2;
       this.val$barrier = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ThreadUtils$4.class, "1")) {
          return;
       }
       try{
          this.val$result.value = this.val$callable.call();
       }catch(java.lang.Exception e0){
          this.val$caughtException.e = e0;
       }
       this.val$barrier.countDown();
       return;
    }
}
