package com.kwai.video.stannis.utils.ThreadUtils$5;
import java.util.concurrent.Callable;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ThreadUtils$5 implements Callable	// class@000c89
{
    public final Runnable val$runner;

    public void ThreadUtils$5(Runnable p0){
       this.val$runner = p0;
       super();
    }
    public Object call(){
       return this.call();
    }
    public Void call(){
       Object obj = PatchProxy.apply(null, this, ThreadUtils$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.val$runner.run();
       return null;
    }
}
