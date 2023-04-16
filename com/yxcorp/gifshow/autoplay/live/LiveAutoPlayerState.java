package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAutoPlayerState extends Enum	// class@001c0c
{
    public static final LiveAutoPlayerState[] $VALUES;
    public static final LiveAutoPlayerState DESTROY;
    public static final LiveAutoPlayerState ERROR;
    public static final LiveAutoPlayerState IDLE;
    public static final LiveAutoPlayerState PLAYING;
    public static final LiveAutoPlayerState PREPARING;
    public static final LiveAutoPlayerState STOP;

    static {
       LiveAutoPlayerState liveAutoPlay1;
       LiveAutoPlayerState[] liveAutoPlay = new LiveAutoPlayerState[]{liveAutoPlay1,liveAutoPlay1,liveAutoPlay1,liveAutoPlay1,liveAutoPlay1,liveAutoPlay1};
       liveAutoPlay1 = new LiveAutoPlayerState("IDLE", 0);
       LiveAutoPlayerState.IDLE = liveAutoPlay1;
       liveAutoPlay1 = new LiveAutoPlayerState("PREPARING", 1);
       LiveAutoPlayerState.PREPARING = liveAutoPlay1;
       liveAutoPlay1 = new LiveAutoPlayerState("PLAYING", 2);
       LiveAutoPlayerState.PLAYING = liveAutoPlay1;
       liveAutoPlay1 = new LiveAutoPlayerState("STOP", 3);
       LiveAutoPlayerState.STOP = liveAutoPlay1;
       liveAutoPlay1 = new LiveAutoPlayerState("DESTROY", 4);
       LiveAutoPlayerState.DESTROY = liveAutoPlay1;
       liveAutoPlay1 = new LiveAutoPlayerState("ERROR", 5);
       LiveAutoPlayerState.ERROR = liveAutoPlay1;
       LiveAutoPlayerState.$VALUES = liveAutoPlay;
    }
    public void LiveAutoPlayerState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAutoPlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAutoPlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAutoPlayerState.class, p0);
    }
    public static LiveAutoPlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAutoPlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAutoPlayerState.$VALUES.clone();
    }
}
