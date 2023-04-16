package ntd.a;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import java.lang.Enum;

public final class a	// class@001ee7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[CoroutineScheduler$WorkerState.values().length];
       a.a = ointArray;
       ointArray[CoroutineScheduler$WorkerState.PARKING.ordinal()] = 1;
       ointArray[CoroutineScheduler$WorkerState.BLOCKING.ordinal()] = 2;
       ointArray[CoroutineScheduler$WorkerState.CPU_ACQUIRED.ordinal()] = 3;
       ointArray[CoroutineScheduler$WorkerState.DORMANT.ordinal()] = 4;
       ointArray[CoroutineScheduler$WorkerState.TERMINATED.ordinal()] = 5;
    }
}
