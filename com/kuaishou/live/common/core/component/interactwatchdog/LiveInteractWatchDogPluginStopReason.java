package com.kuaishou.live.common.core.component.interactwatchdog.LiveInteractWatchDogPluginStopReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveInteractWatchDogPluginStopReason extends Enum	// class@00144c
{
    public static final LiveInteractWatchDogPluginStopReason[] $VALUES;
    public static final LiveInteractWatchDogPluginStopReason SERVICE_STOP;

    static {
       LiveInteractWatchDogPluginStopReason liveInteract1;
       LiveInteractWatchDogPluginStopReason[] liveInteract = new LiveInteractWatchDogPluginStopReason[]{liveInteract1};
       liveInteract1 = new LiveInteractWatchDogPluginStopReason("SERVICE_STOP", 0);
       LiveInteractWatchDogPluginStopReason.SERVICE_STOP = liveInteract1;
       LiveInteractWatchDogPluginStopReason.$VALUES = liveInteract;
    }
    public void LiveInteractWatchDogPluginStopReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveInteractWatchDogPluginStopReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveInteractWatchDogPluginStopReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveInteractWatchDogPluginStopReason.class, p0);
    }
    public static LiveInteractWatchDogPluginStopReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveInteractWatchDogPluginStopReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveInteractWatchDogPluginStopReason.$VALUES.clone();
    }
}
