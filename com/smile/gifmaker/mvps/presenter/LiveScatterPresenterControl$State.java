package com.smile.gifmaker.mvps.presenter.LiveScatterPresenterControl$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LiveScatterPresenterControl$State extends Enum	// class@000bfc
{
    public static final LiveScatterPresenterControl$State[] $VALUES;
    public static final LiveScatterPresenterControl$State BIND;
    public static final LiveScatterPresenterControl$State CREATE;
    public static final LiveScatterPresenterControl$State DESTROY;
    public static final LiveScatterPresenterControl$State INIT;
    public static final LiveScatterPresenterControl$State UNBIND;

    static {
       LiveScatterPresenterControl$State state;
       LiveScatterPresenterControl$State[] stateArray = new LiveScatterPresenterControl$State[]{state,state,state,state,state};
       state = new LiveScatterPresenterControl$State("INIT", 0);
       LiveScatterPresenterControl$State.INIT = state;
       state = new LiveScatterPresenterControl$State("CREATE", 1);
       LiveScatterPresenterControl$State.CREATE = state;
       state = new LiveScatterPresenterControl$State("BIND", 2);
       LiveScatterPresenterControl$State.BIND = state;
       state = new LiveScatterPresenterControl$State("UNBIND", 3);
       LiveScatterPresenterControl$State.UNBIND = state;
       state = new LiveScatterPresenterControl$State("DESTROY", 4);
       LiveScatterPresenterControl$State.DESTROY = state;
       LiveScatterPresenterControl$State.$VALUES = stateArray;
    }
    public void LiveScatterPresenterControl$State(String p0,int p1){
       super(p0, p1);
    }
    public static LiveScatterPresenterControl$State valueOf(String p0){
       return Enum.valueOf(LiveScatterPresenterControl$State.class, p0);
    }
    public static LiveScatterPresenterControl$State[] values(){
       return LiveScatterPresenterControl$State.$VALUES.clone();
    }
}
