package kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoroutineScheduler$WorkerState extends Enum	// class@001b40
{
    public static final CoroutineScheduler$WorkerState[] $VALUES;
    public static final CoroutineScheduler$WorkerState BLOCKING;
    public static final CoroutineScheduler$WorkerState CPU_ACQUIRED;
    public static final CoroutineScheduler$WorkerState DORMANT;
    public static final CoroutineScheduler$WorkerState PARKING;
    public static final CoroutineScheduler$WorkerState TERMINATED;

    static {
       CoroutineScheduler$WorkerState workerState;
       CoroutineScheduler$WorkerState[] workerStateA = new CoroutineScheduler$WorkerState[]{workerState,workerState,workerState,workerState,workerState};
       workerState = new CoroutineScheduler$WorkerState("CPU_ACQUIRED", 0);
       CoroutineScheduler$WorkerState.CPU_ACQUIRED = workerState;
       workerState = new CoroutineScheduler$WorkerState("BLOCKING", 1);
       CoroutineScheduler$WorkerState.BLOCKING = workerState;
       workerState = new CoroutineScheduler$WorkerState("PARKING", 2);
       CoroutineScheduler$WorkerState.PARKING = workerState;
       workerState = new CoroutineScheduler$WorkerState("DORMANT", 3);
       CoroutineScheduler$WorkerState.DORMANT = workerState;
       workerState = new CoroutineScheduler$WorkerState("TERMINATED", 4);
       CoroutineScheduler$WorkerState.TERMINATED = workerState;
       CoroutineScheduler$WorkerState.$VALUES = workerStateA;
    }
    public void CoroutineScheduler$WorkerState(String p0,int p1){
       super(p0, p1);
    }
    public static CoroutineScheduler$WorkerState valueOf(String p0){
       return Enum.valueOf(CoroutineScheduler$WorkerState.class, p0);
    }
    public static CoroutineScheduler$WorkerState[] values(){
       return CoroutineScheduler$WorkerState.$VALUES.clone();
    }
}
