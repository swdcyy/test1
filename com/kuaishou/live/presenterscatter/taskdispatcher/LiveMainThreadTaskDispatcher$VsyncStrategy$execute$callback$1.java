package com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy;
import msd.a;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1$a;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public final class LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1 extends Lambda implements l	// class@000d6c
{
    public final int $actionCount;
    public final a $block;
    public final LiveMainThreadTaskDispatcher$VsyncStrategy this$0;

    public void LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1(LiveMainThreadTaskDispatcher$VsyncStrategy p0,int p1,a p2){
       this.this$0 = p0;
       this.$actionCount = p1;
       this.$block = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport(LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1.class, "1")) {
          return;
       }
       b.P(this.this$0.a, "callback.execute, actionCount: "+this.$actionCount);
       Objects.requireNonNull(LiveMainThreadTaskDispatcher.l);
       k1.s(new LiveMainThreadTaskDispatcher$VsyncStrategy$execute$callback$1$a(this), this.this$0.b, 0);
       return;
    }
}
