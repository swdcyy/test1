package com.kwai.video.waynelive.LivePlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayerState extends Enum	// class@000dd9
{
    public static final LivePlayerState[] $VALUES;
    public static final LivePlayerState CREATED;
    public static final LivePlayerState DESTROY;
    public static final LivePlayerState ERROR;
    public static final LivePlayerState IDLE;
    public static final LivePlayerState INIT;
    public static final LivePlayerState PLAYING;
    public static final LivePlayerState PREPARING;
    public static final LivePlayerState STOP;

    static {
       LivePlayerState livePlayerSt = new LivePlayerState("IDLE", 0);
       LivePlayerState.IDLE = livePlayerSt;
       LivePlayerState livePlayerSt1 = new LivePlayerState("INIT", 1);
       LivePlayerState.INIT = livePlayerSt1;
       LivePlayerState livePlayerSt2 = new LivePlayerState("CREATED", 2);
       LivePlayerState.CREATED = livePlayerSt2;
       LivePlayerState livePlayerSt3 = new LivePlayerState("PREPARING", 3);
       LivePlayerState.PREPARING = livePlayerSt3;
       LivePlayerState livePlayerSt4 = new LivePlayerState("PLAYING", 4);
       LivePlayerState.PLAYING = livePlayerSt4;
       LivePlayerState livePlayerSt5 = new LivePlayerState("STOP", 5);
       LivePlayerState.STOP = livePlayerSt5;
       LivePlayerState livePlayerSt6 = new LivePlayerState("DESTROY", 6);
       LivePlayerState.DESTROY = livePlayerSt6;
       LivePlayerState livePlayerSt7 = new LivePlayerState("ERROR", 7);
       LivePlayerState.ERROR = livePlayerSt7;
       LivePlayerState[] livePlayerSt8 = new LivePlayerState[]{livePlayerSt,livePlayerSt1,livePlayerSt2,livePlayerSt3,livePlayerSt4,livePlayerSt5,livePlayerSt6,livePlayerSt7};
       LivePlayerState.$VALUES = livePlayerSt8;
    }
    public void LivePlayerState(String p0,int p1){
       super(p0, p1);
    }
    public static LivePlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayerState.class, p0);
    }
    public static LivePlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayerState.$VALUES.clone();
    }
}
