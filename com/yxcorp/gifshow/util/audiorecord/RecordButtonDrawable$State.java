package com.yxcorp.gifshow.util.audiorecord.RecordButtonDrawable$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RecordButtonDrawable$State extends Enum	// class@001f46
{
    public static final RecordButtonDrawable$State[] $VALUES;
    public static final RecordButtonDrawable$State INIT;
    public static final RecordButtonDrawable$State PAUSE;
    public static final RecordButtonDrawable$State PLAY;

    static {
       RecordButtonDrawable$State state = new RecordButtonDrawable$State("INIT", 0);
       RecordButtonDrawable$State.INIT = state;
       RecordButtonDrawable$State state1 = new RecordButtonDrawable$State("PLAY", 1);
       RecordButtonDrawable$State.PLAY = state1;
       RecordButtonDrawable$State state2 = new RecordButtonDrawable$State("PAUSE", 2);
       RecordButtonDrawable$State.PAUSE = state2;
       RecordButtonDrawable$State[] stateArray = new RecordButtonDrawable$State[]{state,state1,state2};
       RecordButtonDrawable$State.$VALUES = stateArray;
    }
    public void RecordButtonDrawable$State(String p0,int p1){
       super(p0, p1);
    }
    public static RecordButtonDrawable$State valueOf(String p0){
       return Enum.valueOf(RecordButtonDrawable$State.class, p0);
    }
    public static RecordButtonDrawable$State[] values(){
       return RecordButtonDrawable$State.$VALUES.clone();
    }
}
