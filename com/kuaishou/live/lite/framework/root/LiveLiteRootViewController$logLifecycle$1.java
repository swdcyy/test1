package com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$logLifecycle$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.live.lite.LiveLiteParam;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLiteRootViewController$logLifecycle$1 implements LifecycleEventObserver	// class@000971
{
    public final LiveLiteRootViewController b;

    public void LiveLiteRootViewController$logLifecycle$1(LiveLiteRootViewController p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteRootViewController$logLifecycle$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       QLivePlayConfig qLivePlayCon = this.b.u.getQLivePlayConfig();
       a.o(qLivePlayCon, "liveLiteParam.qLivePlayConfig");
       b.Z(LiveLiteLogTag.LIFECYCLE, "RootVC lifecycle "+p1+' '+qLivePlayCon.getLiveStreamId()+' '+this.b.t+' '+this.b);
       return;
    }
}
