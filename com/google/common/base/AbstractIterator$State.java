package com.google.common.base.AbstractIterator$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AbstractIterator$State extends Enum	// class@0004ae
{
    public static final AbstractIterator$State[] $VALUES;
    public static final AbstractIterator$State DONE;
    public static final AbstractIterator$State FAILED;
    public static final AbstractIterator$State NOT_READY;
    public static final AbstractIterator$State READY;

    static {
       AbstractIterator$State state = new AbstractIterator$State("READY", 0);
       AbstractIterator$State.READY = state;
       AbstractIterator$State state1 = new AbstractIterator$State("NOT_READY", 1);
       AbstractIterator$State.NOT_READY = state1;
       AbstractIterator$State state2 = new AbstractIterator$State("DONE", 2);
       AbstractIterator$State.DONE = state2;
       AbstractIterator$State state3 = new AbstractIterator$State("FAILED", 3);
       AbstractIterator$State.FAILED = state3;
       AbstractIterator$State[] stateArray = new AbstractIterator$State[]{state,state1,state2,state3};
       AbstractIterator$State.$VALUES = stateArray;
    }
    public void AbstractIterator$State(String p0,int p1){
       super(p0, p1);
    }
    public static AbstractIterator$State valueOf(String p0){
       return Enum.valueOf(AbstractIterator$State.class, p0);
    }
    public static AbstractIterator$State[] values(){
       return AbstractIterator$State.$VALUES.clone();
    }
}
