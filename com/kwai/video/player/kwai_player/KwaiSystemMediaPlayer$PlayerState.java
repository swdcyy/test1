package com.kwai.video.player.kwai_player.KwaiSystemMediaPlayer$PlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiSystemMediaPlayer$PlayerState extends Enum	// class@000b49
{
    public static final KwaiSystemMediaPlayer$PlayerState[] $VALUES;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_COMPLETE;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_ERROR;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_IDLE;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_INITIALIZED;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_PAUSED;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_PREPARED;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_PREPARING;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_STARTED;
    public static final KwaiSystemMediaPlayer$PlayerState STATE_STOPPED;

    static {
       KwaiSystemMediaPlayer$PlayerState playerState = new KwaiSystemMediaPlayer$PlayerState("STATE_ERROR", 0);
       KwaiSystemMediaPlayer$PlayerState.STATE_ERROR = playerState;
       KwaiSystemMediaPlayer$PlayerState playerState1 = new KwaiSystemMediaPlayer$PlayerState("STATE_IDLE", 1);
       KwaiSystemMediaPlayer$PlayerState.STATE_IDLE = playerState1;
       KwaiSystemMediaPlayer$PlayerState playerState2 = new KwaiSystemMediaPlayer$PlayerState("STATE_INITIALIZED", 2);
       KwaiSystemMediaPlayer$PlayerState.STATE_INITIALIZED = playerState2;
       KwaiSystemMediaPlayer$PlayerState playerState3 = new KwaiSystemMediaPlayer$PlayerState("STATE_PREPARING", 3);
       KwaiSystemMediaPlayer$PlayerState.STATE_PREPARING = playerState3;
       KwaiSystemMediaPlayer$PlayerState playerState4 = new KwaiSystemMediaPlayer$PlayerState("STATE_PREPARED", 4);
       KwaiSystemMediaPlayer$PlayerState.STATE_PREPARED = playerState4;
       KwaiSystemMediaPlayer$PlayerState playerState5 = new KwaiSystemMediaPlayer$PlayerState("STATE_STARTED", 5);
       KwaiSystemMediaPlayer$PlayerState.STATE_STARTED = playerState5;
       KwaiSystemMediaPlayer$PlayerState playerState6 = new KwaiSystemMediaPlayer$PlayerState("STATE_PAUSED", 6);
       KwaiSystemMediaPlayer$PlayerState.STATE_PAUSED = playerState6;
       KwaiSystemMediaPlayer$PlayerState playerState7 = new KwaiSystemMediaPlayer$PlayerState("STATE_STOPPED", 7);
       KwaiSystemMediaPlayer$PlayerState.STATE_STOPPED = playerState7;
       KwaiSystemMediaPlayer$PlayerState playerState8 = new KwaiSystemMediaPlayer$PlayerState("STATE_COMPLETE", 8);
       KwaiSystemMediaPlayer$PlayerState.STATE_COMPLETE = playerState8;
       KwaiSystemMediaPlayer$PlayerState[] playerStateA = new KwaiSystemMediaPlayer$PlayerState[9];
       playerStateA[0] = playerState;
       playerStateA[1] = playerState1;
       playerStateA[2] = playerState2;
       playerStateA[3] = playerState3;
       playerStateA[4] = playerState4;
       playerStateA[5] = playerState5;
       playerStateA[6] = playerState6;
       playerStateA[7] = playerState7;
       playerStateA[8] = playerState8;
       KwaiSystemMediaPlayer$PlayerState.$VALUES = playerStateA;
    }
    public void KwaiSystemMediaPlayer$PlayerState(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiSystemMediaPlayer$PlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiSystemMediaPlayer$PlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiSystemMediaPlayer$PlayerState.class, p0);
    }
    public static KwaiSystemMediaPlayer$PlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiSystemMediaPlayer$PlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiSystemMediaPlayer$PlayerState.$VALUES.clone();
    }
}
