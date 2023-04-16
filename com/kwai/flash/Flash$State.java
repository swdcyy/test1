package com.kwai.flash.Flash$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Flash$State extends Enum	// class@0014c2
{
    public static final Flash$State[] $VALUES;
    public static final Flash$State BOOT_END;
    public static final Flash$State BOOT_IDLE;
    public static final Flash$State BOOT_START;
    public static final Flash$State CLEAN;

    static {
       Flash$State state = new Flash$State("BOOT_START", 0);
       Flash$State.BOOT_START = state;
       Flash$State state1 = new Flash$State("BOOT_END", 1);
       Flash$State.BOOT_END = state1;
       Flash$State state2 = new Flash$State("BOOT_IDLE", 2);
       Flash$State.BOOT_IDLE = state2;
       Flash$State state3 = new Flash$State("CLEAN", 3);
       Flash$State.CLEAN = state3;
       Flash$State[] stateArray = new Flash$State[]{state,state1,state2,state3};
       Flash$State.$VALUES = stateArray;
    }
    public void Flash$State(String p0,int p1){
       super(p0, p1);
    }
    public static Flash$State valueOf(String p0){
       return Enum.valueOf(Flash$State.class, p0);
    }
    public static Flash$State[] values(){
       return Flash$State.$VALUES.clone();
    }
}
