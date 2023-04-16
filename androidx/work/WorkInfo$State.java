package androidx.work.WorkInfo$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class WorkInfo$State extends Enum	// class@000a52
{
    public static final WorkInfo$State[] $VALUES;
    public static final WorkInfo$State BLOCKED;
    public static final WorkInfo$State CANCELLED;
    public static final WorkInfo$State ENQUEUED;
    public static final WorkInfo$State FAILED;
    public static final WorkInfo$State RUNNING;
    public static final WorkInfo$State SUCCEEDED;

    static {
       WorkInfo$State state = new WorkInfo$State("ENQUEUED", 0);
       WorkInfo$State.ENQUEUED = state;
       WorkInfo$State state1 = new WorkInfo$State("RUNNING", 1);
       WorkInfo$State.RUNNING = state1;
       WorkInfo$State state2 = new WorkInfo$State("SUCCEEDED", 2);
       WorkInfo$State.SUCCEEDED = state2;
       WorkInfo$State state3 = new WorkInfo$State("FAILED", 3);
       WorkInfo$State.FAILED = state3;
       WorkInfo$State state4 = new WorkInfo$State("BLOCKED", 4);
       WorkInfo$State.BLOCKED = state4;
       WorkInfo$State state5 = new WorkInfo$State("CANCELLED", 5);
       WorkInfo$State.CANCELLED = state5;
       WorkInfo$State[] stateArray = new WorkInfo$State[]{state,state1,state2,state3,state4,state5};
       WorkInfo$State.$VALUES = stateArray;
    }
    public void WorkInfo$State(String p0,int p1){
       super(p0, p1);
    }
    public static WorkInfo$State valueOf(String p0){
       return Enum.valueOf(WorkInfo$State.class, p0);
    }
    public static WorkInfo$State[] values(){
       return WorkInfo$State.$VALUES.clone();
    }
    public boolean isFinished(){
       boolean b = (this != WorkInfo$State.SUCCEEDED && (this == WorkInfo$State.FAILED || this == WorkInfo$State.CANCELLED))? true: false;
       return b;
    }
}
