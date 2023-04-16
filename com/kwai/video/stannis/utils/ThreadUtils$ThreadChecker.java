package com.kwai.video.stannis.utils.ThreadUtils$ThreadChecker;
import java.lang.Object;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalStateException;

public class ThreadUtils$ThreadChecker	// class@000c8b
{
    public Thread thread;

    public void ThreadUtils$ThreadChecker(){
       super();
       this.thread = Thread.currentThread();
    }
    public void checkIsOnValidThread(){
       if (PatchProxy.applyVoid(null, this, ThreadUtils$ThreadChecker.class, "1")) {
          return;
       }
       if (this.thread == null) {
          this.thread = Thread.currentThread();
       }
       if (Thread.currentThread() == this.thread) {
          return;
       }else {
          throw new IllegalStateException("Wrong thread");
       }
    }
    public void detachThread(){
       this.thread = null;
    }
}
