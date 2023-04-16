package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.model.LiveMultiLineArenaLiveState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiLineArenaLiveState extends Enum	// class@00152e
{
    public static final LiveMultiLineArenaLiveState[] $VALUES;
    public static final LiveMultiLineArenaLiveState IDLE;
    public static final LiveMultiLineArenaLiveState SHOWING;
    public static final LiveMultiLineArenaLiveState SHOW_END;

    static {
       LiveMultiLineArenaLiveState liveMultiLin1;
       LiveMultiLineArenaLiveState[] liveMultiLin = new LiveMultiLineArenaLiveState[]{liveMultiLin1,liveMultiLin1,liveMultiLin1};
       liveMultiLin1 = new LiveMultiLineArenaLiveState("IDLE", 0);
       LiveMultiLineArenaLiveState.IDLE = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLineArenaLiveState("SHOWING", 1);
       LiveMultiLineArenaLiveState.SHOWING = liveMultiLin1;
       liveMultiLin1 = new LiveMultiLineArenaLiveState("SHOW_END", 2);
       LiveMultiLineArenaLiveState.SHOW_END = liveMultiLin1;
       LiveMultiLineArenaLiveState.$VALUES = liveMultiLin;
    }
    public void LiveMultiLineArenaLiveState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiLineArenaLiveState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiLineArenaLiveState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiLineArenaLiveState.class, p0);
    }
    public static LiveMultiLineArenaLiveState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiLineArenaLiveState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiLineArenaLiveState.$VALUES.clone();
    }
}
