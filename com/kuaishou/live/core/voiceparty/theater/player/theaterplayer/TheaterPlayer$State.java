package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TheaterPlayer$State extends Enum	// class@0019c4
{
    public static final TheaterPlayer$State[] $VALUES;
    public static final TheaterPlayer$State COMPLETED;
    public static final TheaterPlayer$State ERROR;
    public static final TheaterPlayer$State PAUSED;
    public static final TheaterPlayer$State PREPARED;
    public static final TheaterPlayer$State STARTED;

    static {
       TheaterPlayer$State state;
       TheaterPlayer$State[] stateArray = new TheaterPlayer$State[]{state,state,state,state,state};
       state = new TheaterPlayer$State("PREPARED", 0);
       TheaterPlayer$State.PREPARED = state;
       state = new TheaterPlayer$State("PAUSED", 1);
       TheaterPlayer$State.PAUSED = state;
       state = new TheaterPlayer$State("STARTED", 2);
       TheaterPlayer$State.STARTED = state;
       state = new TheaterPlayer$State("COMPLETED", 3);
       TheaterPlayer$State.COMPLETED = state;
       state = new TheaterPlayer$State("ERROR", 4);
       TheaterPlayer$State.ERROR = state;
       TheaterPlayer$State.$VALUES = stateArray;
    }
    public void TheaterPlayer$State(String p0,int p1){
       super(p0, p1);
    }
    public static TheaterPlayer$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TheaterPlayer$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TheaterPlayer$State.class, p0);
    }
    public static TheaterPlayer$State[] values(){
       Object obj = PatchProxy.apply(null, null, TheaterPlayer$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TheaterPlayer$State.$VALUES.clone();
    }
}
