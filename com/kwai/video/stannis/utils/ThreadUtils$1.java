package com.kwai.video.stannis.utils.ThreadUtils$1;
import com.kwai.video.stannis.utils.ThreadUtils$BlockingOperation;
import java.lang.Thread;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ThreadUtils$1 implements ThreadUtils$BlockingOperation	// class@000c83
{
    public final Thread val$thread;

    public void ThreadUtils$1(Thread p0){
       this.val$thread = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ThreadUtils$1.class, "1")) {
          return;
       }
       this.val$thread.join();
       return;
    }
}
