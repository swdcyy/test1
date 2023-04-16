package androidx.lifecycle.Lifecycle$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Lifecycle$State extends Enum	// class@000247
{
    public static final Lifecycle$State[] $VALUES;
    public static final Lifecycle$State CREATED;
    public static final Lifecycle$State DESTROYED;
    public static final Lifecycle$State INITIALIZED;
    public static final Lifecycle$State RESUMED;
    public static final Lifecycle$State STARTED;

    static {
       Lifecycle$State state = new Lifecycle$State("DESTROYED", 0);
       Lifecycle$State.DESTROYED = state;
       Lifecycle$State state1 = new Lifecycle$State("INITIALIZED", 1);
       Lifecycle$State.INITIALIZED = state1;
       Lifecycle$State state2 = new Lifecycle$State("CREATED", 2);
       Lifecycle$State.CREATED = state2;
       Lifecycle$State state3 = new Lifecycle$State("STARTED", 3);
       Lifecycle$State.STARTED = state3;
       Lifecycle$State state4 = new Lifecycle$State("RESUMED", 4);
       Lifecycle$State.RESUMED = state4;
       Lifecycle$State[] stateArray = new Lifecycle$State[]{state,state1,state2,state3,state4};
       Lifecycle$State.$VALUES = stateArray;
    }
    public void Lifecycle$State(String p0,int p1){
       super(p0, p1);
    }
    public static Lifecycle$State valueOf(String p0){
       return Enum.valueOf(Lifecycle$State.class, p0);
    }
    public static Lifecycle$State[] values(){
       return Lifecycle$State.$VALUES.clone();
    }
    public boolean isAtLeast(Lifecycle$State p0){
       boolean b = (this.compareTo(p0) >= 0)? true: false;
       return b;
    }
}
