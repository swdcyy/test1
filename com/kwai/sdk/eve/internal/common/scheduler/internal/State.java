package com.kwai.sdk.eve.internal.common.scheduler.internal.State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class State extends Enum	// class@001494
{
    public static final State[] $VALUES;
    public static final State RUNNING;
    public static final State SHUTDOWN;
    public static final State SHUTTING_DOWN;

    static {
       State state;
       State[] stateArray = new State[]{state,state,state};
       state = new State("RUNNING", 0);
       State.RUNNING = state;
       state = new State("SHUTTING_DOWN", 1);
       State.SHUTTING_DOWN = state;
       state = new State("SHUTDOWN", 2);
       State.SHUTDOWN = state;
       State.$VALUES = stateArray;
    }
    public void State(String p0,int p1){
       super(p0, p1);
    }
    public static State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(State.class, p0);
    }
    public static State[] values(){
       Object obj = PatchProxy.apply(null, null, State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return State.$VALUES.clone();
    }
}
