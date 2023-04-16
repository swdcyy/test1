package androidx.lifecycle.ProcessLifecycleOwner$1;
import java.lang.Runnable;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.lang.Object;

public class ProcessLifecycleOwner$1 implements Runnable	// class@000253
{
    public final ProcessLifecycleOwner this$0;

    public void ProcessLifecycleOwner$1(ProcessLifecycleOwner p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       this.this$0.dispatchPauseIfNeeded();
       this.this$0.dispatchStopIfNeeded();
    }
}
