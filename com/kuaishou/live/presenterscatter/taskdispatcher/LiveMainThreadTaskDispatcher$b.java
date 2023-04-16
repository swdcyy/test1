package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$b;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import java.lang.Object;
import msd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$b$a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c$a;

public final class LiveMainThreadTaskDispatcher$b implements LiveMainThreadTaskDispatcher$c	// class@000d70
{

    public void LiveMainThreadTaskDispatcher$b(){
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher$b.class, "1")) {
          return;
       }
       a.p(p0, "block");
       Objects.requireNonNull(LiveMainThreadTaskDispatcher.l);
       k1.s(new LiveMainThreadTaskDispatcher$b$a(p0), this, 0);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$b.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$b.class, "3")) {
          return;
       }
       LiveMainThreadTaskDispatcher$c$a.a(this);
       return;
    }
}
