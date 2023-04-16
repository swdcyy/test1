package com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$b;
import erd.g;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper;
import java.lang.Object;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import xj3.d;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import za3.l;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import kotlin.jvm.internal.a;
import java.util.List;

public final class LiveTaskQueueHelper$b implements g	// class@000908
{
    public final LiveTaskQueueHelper b;

    public void LiveTaskQueueHelper$b(LiveTaskQueueHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTaskQueueHelper$b.class, "1")) {
       }else {
          b.Z(LiveLiteLogTag.LIVE_LITE_TASK, "execute MainThread task start");
          if (this.b.a.isEmpty() ^ 0x01) {
             p0 = this.b.a.iterator();
             while (p0.hasNext()) {
                this.b.e.h(p0.next());
             }
             this.b.e.start();
          }
          if (this.b.b.isEmpty() ^ 0x01) {
             p0 = this.b.b.iterator();
             while (p0.hasNext()) {
                Future uFuture = c.k(new l(p0.next()));
                a.o(uFuture, "Async.submit {\n         ¡­s:${timeMs}\"\)\n          }");
                this.b.c.add(uFuture);
             }
          }
       }
       return;
    }
}
