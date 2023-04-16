package androidx.lifecycle.ReportFragment$LifecycleCallbacks;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.ReportFragment;

public class ReportFragment$LifecycleCallbacks implements Application$ActivityLifecycleCallbacks	// class@0007f3
{

    public void ReportFragment$LifecycleCallbacks(){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityPostCreated(Activity p0,Bundle p1){
       ReportFragment.dispatch(p0, Lifecycle$Event.ON_CREATE);
    }
    public void onActivityPostResumed(Activity p0){
       ReportFragment.dispatch(p0, Lifecycle$Event.ON_RESUME);
    }
    public void onActivityPostStarted(Activity p0){
       ReportFragment.dispatch(p0, Lifecycle$Event.ON_START);
    }
    public void onActivityPreDestroyed(Activity p0){
       ReportFragment.dispatch(p0, Lifecycle$Event.ON_DESTROY);
    }
    public void onActivityPrePaused(Activity p0){
       ReportFragment.dispatch(p0, Lifecycle$Event.ON_PAUSE);
    }
    public void onActivityPreStopped(Activity p0){
       ReportFragment.dispatch(p0, Lifecycle$Event.ON_STOP);
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
