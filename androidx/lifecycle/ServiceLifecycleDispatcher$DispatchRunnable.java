package androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable;
import java.lang.Runnable;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Object;

public class ServiceLifecycleDispatcher$DispatchRunnable implements Runnable	// class@0007f5
{
    public final Lifecycle$Event mEvent;
    public final LifecycleRegistry mRegistry;
    public boolean mWasExecuted;

    public void ServiceLifecycleDispatcher$DispatchRunnable(LifecycleRegistry p0,Lifecycle$Event p1){
       super();
       this.mWasExecuted = false;
       this.mRegistry = p0;
       this.mEvent = p1;
    }
    public void run(){
       if (this.mWasExecuted == null) {
          this.mRegistry.handleLifecycleEvent(this.mEvent);
          this.mWasExecuted = true;
       }
       return;
    }
}
