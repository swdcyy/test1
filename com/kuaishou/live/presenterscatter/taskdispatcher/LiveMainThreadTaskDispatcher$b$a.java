package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$b$a;
import java.lang.Runnable;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveMainThreadTaskDispatcher$b$a implements Runnable	// class@000d6f
{
    public final a b;

    public void LiveMainThreadTaskDispatcher$b$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$b$a.class, "1")) {
          return;
       }
       this.b.invoke();
       return;
    }
}
