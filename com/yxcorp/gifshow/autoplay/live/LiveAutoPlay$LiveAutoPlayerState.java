package com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$LiveAutoPlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAutoPlay$LiveAutoPlayerState extends Enum	// class@001bf7
{
    public static final LiveAutoPlay$LiveAutoPlayerState[] $VALUES;
    public static final LiveAutoPlay$LiveAutoPlayerState DESTROY;
    public static final LiveAutoPlay$LiveAutoPlayerState ERROR;
    public static final LiveAutoPlay$LiveAutoPlayerState IDLE;
    public static final LiveAutoPlay$LiveAutoPlayerState PLAYING;
    public static final LiveAutoPlay$LiveAutoPlayerState PREPARING;
    public static final LiveAutoPlay$LiveAutoPlayerState STOP;

    static {
       LiveAutoPlay$LiveAutoPlayerState liveAutoPlay = new LiveAutoPlay$LiveAutoPlayerState("IDLE", 0);
       LiveAutoPlay$LiveAutoPlayerState.IDLE = liveAutoPlay;
       LiveAutoPlay$LiveAutoPlayerState liveAutoPlay1 = new LiveAutoPlay$LiveAutoPlayerState("PREPARING", 1);
       LiveAutoPlay$LiveAutoPlayerState.PREPARING = liveAutoPlay1;
       LiveAutoPlay$LiveAutoPlayerState liveAutoPlay2 = new LiveAutoPlay$LiveAutoPlayerState("PLAYING", 2);
       LiveAutoPlay$LiveAutoPlayerState.PLAYING = liveAutoPlay2;
       LiveAutoPlay$LiveAutoPlayerState liveAutoPlay3 = new LiveAutoPlay$LiveAutoPlayerState("STOP", 3);
       LiveAutoPlay$LiveAutoPlayerState.STOP = liveAutoPlay3;
       LiveAutoPlay$LiveAutoPlayerState liveAutoPlay4 = new LiveAutoPlay$LiveAutoPlayerState("DESTROY", 4);
       LiveAutoPlay$LiveAutoPlayerState.DESTROY = liveAutoPlay4;
       LiveAutoPlay$LiveAutoPlayerState liveAutoPlay5 = new LiveAutoPlay$LiveAutoPlayerState("ERROR", 5);
       LiveAutoPlay$LiveAutoPlayerState.ERROR = liveAutoPlay5;
       LiveAutoPlay$LiveAutoPlayerState[] liveAutoPlay6 = new LiveAutoPlay$LiveAutoPlayerState[]{liveAutoPlay,liveAutoPlay1,liveAutoPlay2,liveAutoPlay3,liveAutoPlay4,liveAutoPlay5};
       LiveAutoPlay$LiveAutoPlayerState.$VALUES = liveAutoPlay6;
    }
    public void LiveAutoPlay$LiveAutoPlayerState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAutoPlay$LiveAutoPlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAutoPlay$LiveAutoPlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAutoPlay$LiveAutoPlayerState.class, p0);
    }
    public static LiveAutoPlay$LiveAutoPlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAutoPlay$LiveAutoPlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAutoPlay$LiveAutoPlayerState.$VALUES.clone();
    }
}
