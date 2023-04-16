package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveInteractState extends Enum	// class@0017e6
{
    public static final LiveInteractState[] $VALUES;
    public static final LiveInteractState CONNECTED;
    public static final LiveInteractState ESTABLISHING;
    public static final LiveInteractState IDLE;

    static {
       LiveInteractState liveInteract1;
       LiveInteractState[] liveInteract = new LiveInteractState[]{liveInteract1,liveInteract1,liveInteract1};
       liveInteract1 = new LiveInteractState("IDLE", 0);
       LiveInteractState.IDLE = liveInteract1;
       liveInteract1 = new LiveInteractState("ESTABLISHING", 1);
       LiveInteractState.ESTABLISHING = liveInteract1;
       liveInteract1 = new LiveInteractState("CONNECTED", 2);
       LiveInteractState.CONNECTED = liveInteract1;
       LiveInteractState.$VALUES = liveInteract;
    }
    public void LiveInteractState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveInteractState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveInteractState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveInteractState.class, p0);
    }
    public static LiveInteractState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveInteractState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveInteractState.$VALUES.clone();
    }
}
