package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$c;
import java.lang.Runnable;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Choreographer;
import xj3.b;
import android.view.Choreographer$FrameCallback;

public final class LiveMainThreadTaskDispatcher$VsyncStrategy$c implements Runnable	// class@000d6a
{
    public final l b;

    public void LiveMainThreadTaskDispatcher$VsyncStrategy$c(l p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$VsyncStrategy$c.class, "1")) {
          return;
       }
       Choreographer instance = Choreographer.getInstance();
       LiveMainThreadTaskDispatcher$VsyncStrategy$c tb = this.b;
       if (tb != null) {
          tb = new b(tb);
       }
       instance.removeFrameCallback(tb);
       return;
    }
}
