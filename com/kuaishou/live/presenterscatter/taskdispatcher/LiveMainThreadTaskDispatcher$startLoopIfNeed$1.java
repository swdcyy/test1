package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$startLoopIfNeed$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import w1.k;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import xj3.d;
import kotlin.jvm.internal.a;

public final class LiveMainThreadTaskDispatcher$startLoopIfNeed$1 extends Lambda implements a	// class@000d76
{
    public final LiveMainThreadTaskDispatcher this$0;

    public void LiveMainThreadTaskDispatcher$startLoopIfNeed$1(LiveMainThreadTaskDispatcher p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveMainThreadTaskDispatcher$startLoopIfNeed$1.class, "1")) {
          return;
       }
       LiveMainThreadTaskDispatcher$startLoopIfNeed$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, LiveMainThreadTaskDispatcher.class, "16")) {
          k.a("ScatterRunLoop-"+tthis$0.i);
          long l = TimeUnit.MILLISECONDS.toNanos(tthis$0.i);
          int i = 0;
          b.P(tthis$0.a, "executeTasks, queue.size: "+tthis$0.c.size());
          int i1 = tthis$0.c.isEmpty() ^ 0x01;
          while (i1 && l - null > 0) {
             d uod = tthis$0.c.removeFirst();
             a.o(uod, "task");
             l = l - tthis$0.p(uod);
             i = i + 1;
          }
          tthis$0.o();
          b.P(tthis$0.a, "executeTasks end, "+"loopCostTime:"+(tthis$0.i - (l / (long)0xf4240))+" MS,"+" execTasksCount:"+i);
          k.b();
       }
       this.this$0.q();
       return;
    }
}
