package com.kwaishou.merchant.troubleshooting.core.model.State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class State extends Enum	// class@001358
{
    public int state;
    public static final State[] $VALUES;
    public static final State FAILED;
    public static final State NONE;
    public static final State SUCCESS;

    public static final State[] $values(){
       State[] stateArray = new State[]{State.NONE,State.SUCCESS,State.FAILED};
       return stateArray;
    }
    static {
       State.NONE = new State("NONE", 0, 0);
       State.SUCCESS = new State("SUCCESS", 1, 1);
       State.FAILED = new State("FAILED", 2, 2);
       State.$VALUES = State.$values();
    }
    public void State(String p0,int p1,int p2){
       super(p0, p1);
       this.state = p2;
    }
    public static State valueOf(String p0){
       return Enum.valueOf(State.class, p0);
    }
    public static State[] values(){
       return State.$VALUES.clone();
    }
    public final int getState(){
       return this.state;
    }
    public final void setState(int p0){
       this.state = p0;
    }
}
