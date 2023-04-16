package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$b;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.ArrayList;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$c;
import msd.l;
import android.view.Choreographer;
import xj3.b;
import android.view.Choreographer$FrameCallback;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c$a;

public final class LiveMainThreadTaskDispatcher$VsyncStrategy implements LiveMainThreadTaskDispatcher$c	// class@000d6d
{
    public final List a;
    public final Object b;
    public final List c;
    public static int d;
    public static final LiveMainThreadTaskDispatcher$VsyncStrategy$a e;

    static {
       LiveMainThreadTaskDispatcher$VsyncStrategy.e = new LiveMainThreadTaskDispatcher$VsyncStrategy$a(null);
    }
    public void LiveMainThreadTaskDispatcher$VsyncStrategy(){
       super();
       int d = LiveMainThreadTaskDispatcher$VsyncStrategy.d;
       LiveMainThreadTaskDispatcher$VsyncStrategy.d = d + 1;
       this.a = LiveMainThreadTaskDispatcher$VsyncStrategy$b.b.appendTag(String.valueOf(d));
       this.b = new Object();
       this.c = new ArrayList();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMainThreadTaskDispatcher$VsyncStrategy.class, "1")) {
          return;
       }
       a.p(p0, "block");
       LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1 vsyncStrateg = new LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1(this, this.c.size(), p0);
       this.c.add(new LiveMainThreadTaskDispatcher$VsyncStrategy$c(vsyncStrateg));
       Choreographer.getInstance().postFrameCallback(new b(vsyncStrateg));
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$VsyncStrategy.class, "2")) {
          return;
       }
       b.P(this.a, "quit, actionCount: "+this.c.size());
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().run();
       }
       this.c.clear();
       k1.n(this.b);
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, LiveMainThreadTaskDispatcher$VsyncStrategy.class, "3")) {
          return;
       }
       LiveMainThreadTaskDispatcher$c$a.a(this);
       return;
    }
}
