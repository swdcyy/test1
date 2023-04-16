package com.kwai.video.wayne.player.main.PlayerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlayerState extends Enum	// class@000d82
{
    public final String alias;
    public static final PlayerState[] $VALUES;
    public static final PlayerState Completion;
    public static final PlayerState Error;
    public static final PlayerState Idle;
    public static final PlayerState Initialized;
    public static final PlayerState Paused;
    public static final PlayerState Playing;
    public static final PlayerState Prepared;
    public static final PlayerState Preparing;
    public static final PlayerState Released;
    public static final PlayerState Started;
    public static final PlayerState Stopped;

    static {
       PlayerState[] playerStateA = new PlayerState[11];
       PlayerState playerState = new PlayerState("Idle", 0, "idle");
       PlayerState.Idle = playerState;
       playerStateA[0] = playerState;
       playerState = new PlayerState("Initialized", 1, "Initialized");
       PlayerState.Initialized = playerState;
       playerStateA[1] = playerState;
       playerState = new PlayerState("Preparing", 2, "preparing");
       PlayerState.Preparing = playerState;
       playerStateA[2] = playerState;
       playerState = new PlayerState("Prepared", 3, "prepared");
       PlayerState.Prepared = playerState;
       playerStateA[3] = playerState;
       playerState = new PlayerState("Playing", 4, "playing");
       PlayerState.Playing = playerState;
       playerStateA[4] = playerState;
       playerState = new PlayerState("Paused", 5, "paused");
       PlayerState.Paused = playerState;
       playerStateA[5] = playerState;
       playerState = new PlayerState("Completion", 6, "completion");
       PlayerState.Completion = playerState;
       playerStateA[6] = playerState;
       playerState = new PlayerState("Stopped", 7, "stopped");
       PlayerState.Stopped = playerState;
       playerStateA[7] = playerState;
       playerState = new PlayerState("Error", 8, "error");
       PlayerState.Error = playerState;
       playerStateA[8] = playerState;
       playerState = new PlayerState("Released", 9, "released");
       PlayerState.Released = playerState;
       playerStateA[9] = playerState;
       playerState = new PlayerState("Started", 10, "started");
       PlayerState.Started = playerState;
       playerStateA[10] = playerState;
       PlayerState.$VALUES = playerStateA;
    }
    public void PlayerState(String p0,int p1,String p2){
       super(p0, p1);
       this.alias = p2;
    }
    public static PlayerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PlayerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PlayerState.class, p0);
    }
    public static PlayerState[] values(){
       Object obj = PatchProxy.apply(null, null, PlayerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PlayerState.$VALUES.clone();
    }
    public final String getAlias(){
       return this.alias;
    }
}
