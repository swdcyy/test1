package com.kwai.feature.api.live.base.event.LiveLifecycleEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLifecycleEvent extends Enum	// class@000f77
{
    public static final LiveLifecycleEvent[] $VALUES;
    public static final LiveLifecycleEvent ACTIVITY_FINISH;
    public static final LiveLifecycleEvent PRESENTERS_BIND_FINISHED;

    static {
       LiveLifecycleEvent liveLifecycl = new LiveLifecycleEvent("ACTIVITY_FINISH", 0);
       LiveLifecycleEvent.ACTIVITY_FINISH = liveLifecycl;
       LiveLifecycleEvent liveLifecycl1 = new LiveLifecycleEvent("PRESENTERS_BIND_FINISHED", 1);
       LiveLifecycleEvent.PRESENTERS_BIND_FINISHED = liveLifecycl1;
       LiveLifecycleEvent[] liveLifecycl2 = new LiveLifecycleEvent[]{liveLifecycl,liveLifecycl1};
       LiveLifecycleEvent.$VALUES = liveLifecycl2;
    }
    public void LiveLifecycleEvent(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLifecycleEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLifecycleEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLifecycleEvent.class, p0);
    }
    public static LiveLifecycleEvent[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLifecycleEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLifecycleEvent.$VALUES.clone();
    }
}
