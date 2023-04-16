package kotlin.collections.State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class State extends Enum	// class@001857
{
    public static final State[] $VALUES;
    public static final State Done;
    public static final State Failed;
    public static final State NotReady;
    public static final State Ready;

    static {
       State state;
       State[] stateArray = new State[]{state,state,state,state};
       state = new State("Ready", 0);
       State.Ready = state;
       state = new State("NotReady", 1);
       State.NotReady = state;
       state = new State("Done", 2);
       State.Done = state;
       state = new State("Failed", 3);
       State.Failed = state;
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
