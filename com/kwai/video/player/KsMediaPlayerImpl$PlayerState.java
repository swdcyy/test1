package com.kwai.video.player.KsMediaPlayerImpl$PlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsMediaPlayerImpl$PlayerState extends Enum	// class@000aed
{
    public static final KsMediaPlayerImpl$PlayerState[] $VALUES;
    public static final KsMediaPlayerImpl$PlayerState STATE_COMPLETED;
    public static final KsMediaPlayerImpl$PlayerState STATE_END;
    public static final KsMediaPlayerImpl$PlayerState STATE_ERROR;
    public static final KsMediaPlayerImpl$PlayerState STATE_IDLE;
    public static final KsMediaPlayerImpl$PlayerState STATE_INITIALIZED;
    public static final KsMediaPlayerImpl$PlayerState STATE_PAUSED;
    public static final KsMediaPlayerImpl$PlayerState STATE_PLAYING;
    public static final KsMediaPlayerImpl$PlayerState STATE_PREPARED;
    public static final KsMediaPlayerImpl$PlayerState STATE_PREPARING;
    public static final KsMediaPlayerImpl$PlayerState STATE_STOPPED;

    static {
       KsMediaPlayerImpl$PlayerState playerState = new KsMediaPlayerImpl$PlayerState("STATE_IDLE", 0);
       KsMediaPlayerImpl$PlayerState.STATE_IDLE = playerState;
       KsMediaPlayerImpl$PlayerState playerState1 = new KsMediaPlayerImpl$PlayerState("STATE_INITIALIZED", 1);
       KsMediaPlayerImpl$PlayerState.STATE_INITIALIZED = playerState1;
       KsMediaPlayerImpl$PlayerState playerState2 = new KsMediaPlayerImpl$PlayerState("STATE_PREPARING", 2);
       KsMediaPlayerImpl$PlayerState.STATE_PREPARING = playerState2;
       KsMediaPlayerImpl$PlayerState playerState3 = new KsMediaPlayerImpl$PlayerState("STATE_PREPARED", 3);
       KsMediaPlayerImpl$PlayerState.STATE_PREPARED = playerState3;
       KsMediaPlayerImpl$PlayerState playerState4 = new KsMediaPlayerImpl$PlayerState("STATE_PLAYING", 4);
       KsMediaPlayerImpl$PlayerState.STATE_PLAYING = playerState4;
       KsMediaPlayerImpl$PlayerState playerState5 = new KsMediaPlayerImpl$PlayerState("STATE_PAUSED", 5);
       KsMediaPlayerImpl$PlayerState.STATE_PAUSED = playerState5;
       KsMediaPlayerImpl$PlayerState playerState6 = new KsMediaPlayerImpl$PlayerState("STATE_STOPPED", 6);
       KsMediaPlayerImpl$PlayerState.STATE_STOPPED = playerState6;
       KsMediaPlayerImpl$PlayerState playerState7 = new KsMediaPlayerImpl$PlayerState("STATE_COMPLETED", 7);
       KsMediaPlayerImpl$PlayerState.STATE_COMPLETED = playerState7;
       KsMediaPlayerImpl$PlayerState playerState8 = new KsMediaPlayerImpl$PlayerState("STATE_ERROR", 8);
       KsMediaPlayerImpl$PlayerState.STATE_ERROR = playerState8;
       KsMediaPlayerImpl$PlayerState playerState9 = new KsMediaPlayerImpl$PlayerState("STATE_END", 9);
       KsMediaPlayerImpl$PlayerState.STATE_END = playerState9;
       KsMediaPlayerImpl$PlayerState[] playerStateA = new KsMediaPlayerImpl$PlayerState[10];
       playerStateA[0] = playerState;
       playerStateA[1] = playerState1;
       playerStateA[2] = playerState2;
       playerStateA[3] = playerState3;
       playerStateA[4] = playerState4;
       playerStateA[5] = playerState5;
       playerStateA[6] = playerState6;
       playerStateA[7] = playerState7;
       playerStateA[8] = playerState8;
       playerStateA[9] = playerState9;
       KsMediaPlayerImpl$PlayerState.$VALUES = playerStateA;
    }
    public void KsMediaPlayerImpl$PlayerState(String p0,int p1){
       super(p0, p1);
    }
    public static KsMediaPlayerImpl$PlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsMediaPlayerImpl$PlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsMediaPlayerImpl$PlayerState.class, p0);
    }
    public static KsMediaPlayerImpl$PlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, KsMediaPlayerImpl$PlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsMediaPlayerImpl$PlayerState.$VALUES.clone();
    }
}
