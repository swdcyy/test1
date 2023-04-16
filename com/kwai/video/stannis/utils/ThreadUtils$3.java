package com.kwai.video.stannis.utils.ThreadUtils$3;
import com.kwai.video.stannis.utils.ThreadUtils$BlockingOperation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ThreadUtils$3 implements ThreadUtils$BlockingOperation	// class@000c87
{
    public final Object val$object;

    public void ThreadUtils$3(Object p0){
       this.val$object = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ThreadUtils$3.class, "1")) {
          return;
       }
       this.val$object.wait();
       return;
    }
}
