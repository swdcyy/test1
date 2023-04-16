package androidx.lifecycle.ServiceLifecycleDispatcher;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import androidx.lifecycle.LifecycleRegistry;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.ServiceLifecycleDispatcher$DispatchRunnable;
import java.lang.Runnable;

public class ServiceLifecycleDispatcher	// class@0007f6
{
    public final Handler mHandler;
    public ServiceLifecycleDispatcher$DispatchRunnable mLastDispatchRunnable;
    public final LifecycleRegistry mRegistry;

    public void ServiceLifecycleDispatcher(LifecycleOwner p0){
       super();
       this.mRegistry = new LifecycleRegistry(p0);
       this.mHandler = new Handler();
    }
    public Lifecycle getLifecycle(){
       return this.mRegistry;
    }
    public void onServicePreSuperOnBind(){
       this.postDispatchRunnable(Lifecycle$Event.ON_START);
    }
    public void onServicePreSuperOnCreate(){
       this.postDispatchRunnable(Lifecycle$Event.ON_CREATE);
    }
    public void onServicePreSuperOnDestroy(){
       this.postDispatchRunnable(Lifecycle$Event.ON_STOP);
       this.postDispatchRunnable(Lifecycle$Event.ON_DESTROY);
    }
    public void onServicePreSuperOnStart(){
       this.postDispatchRunnable(Lifecycle$Event.ON_START);
    }
    public final void postDispatchRunnable(Lifecycle$Event p0){
       ServiceLifecycleDispatcher tmLastDispat = this.mLastDispatchRunnable;
       if (tmLastDispat != null) {
          tmLastDispat.run();
       }
       ServiceLifecycleDispatcher$DispatchRunnable uDispatchRun = new ServiceLifecycleDispatcher$DispatchRunnable(this.mRegistry, p0);
       this.mLastDispatchRunnable = uDispatchRun;
       this.mHandler.postAtFrontOfQueue(uDispatchRun);
       return;
    }
}
