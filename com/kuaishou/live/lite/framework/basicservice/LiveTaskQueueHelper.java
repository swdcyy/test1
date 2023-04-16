package com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper;
import msd.a;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher;
import yj3.a;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$scheduler$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import ec3.f;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$b;
import qrd.l1;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$1;
import msd.l;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$a;
import erd.r;
import com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$b;
import erd.g;
import crd.b;

public final class LiveTaskQueueHelper	// class@00090a
{
    public final List a;
    public final List b;
    public final List c;
    public boolean d;
    public final LiveMainThreadTaskDispatcher e;
    public final a f;

    public void LiveTaskQueueHelper(a p0,t p1){
       a.p(p0, "isScatterLoading");
       a.p(p1, "scatterLoadStatusObservable");
       super();
       this.f = p0;
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
       LiveMainThreadTaskDispatcher liveMainThre = new LiveMainThreadTaskDispatcher(a.a(), 0, new LiveTaskQueueHelper$scheduler$1(this));
       LiveMainThreadTaskDispatcher$VsyncStrategy vsyncStrateg = PatchProxy.apply(null, this, LiveTaskQueueHelper.class, "1");
       if (vsyncStrateg != PatchProxyResult.class) {
       }else if(f.k()){
          vsyncStrateg = new LiveMainThreadTaskDispatcher$VsyncStrategy();
       }else {
          vsyncStrateg = new LiveMainThreadTaskDispatcher$b();
       }
       new ArrayList().a(vsyncStrateg);
       this.e = new ArrayList();
       new ArrayList().d(LiveTaskQueueHelper$1.INSTANCE);
       p1.filter(LiveTaskQueueHelper$a.b).subscribe(new LiveTaskQueueHelper$b(this));
       return;
    }
}
