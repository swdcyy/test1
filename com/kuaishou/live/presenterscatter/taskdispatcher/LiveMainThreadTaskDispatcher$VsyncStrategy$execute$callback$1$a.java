package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1$a;
import java.lang.Runnable;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import msd.a;

public final class LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1$a implements Runnable	// class@000d6b
{
    public final LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1 b;

    public void LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1$a(LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1$a.class, "1")) {
          return;
       }
       b.P(this.b.this$0.a, "callback.execute.runOnUiThreadDelay, actionCount: "+this.b.$actionCount);
       this.b.$block.invoke();
       return;
    }
}
