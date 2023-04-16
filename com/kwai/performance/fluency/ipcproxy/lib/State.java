package com.kwai.performance.fluency.ipcproxy.lib.State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class State extends Enum	// class@000d8c
{
    public static final State[] $VALUES;
    public static final State AVAILABLE;
    public static final State EXPIRED;

    static {
       State state = new State("AVAILABLE", 0);
       State.AVAILABLE = state;
       State state1 = new State("EXPIRED", 1);
       State.EXPIRED = state1;
       State[] stateArray = new State[]{state,state1};
       State.$VALUES = stateArray;
    }
    public void State(String p0,int p1){
       super(p0, p1);
    }
    public static State valueOf(String p0){
       return Enum.valueOf(State.class, p0);
    }
    public static State[] values(){
       return State.$VALUES.clone();
    }
}
