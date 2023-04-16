package ntd.b;
import java.lang.Thread;
import kotlinx.coroutines.scheduling.CoroutineScheduler$b;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

public final class b	// class@001ee8
{

    public static final boolean a(Thread p0){
       return p0 instanceof CoroutineScheduler$b;
    }
    public static final boolean b(Thread p0){
       boolean b = (p0 instanceof CoroutineScheduler$b && p0.c == CoroutineScheduler$WorkerState.CPU_ACQUIRED)? true: false;
       return b;
    }
}
