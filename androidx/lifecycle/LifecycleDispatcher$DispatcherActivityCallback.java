package androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback;
import androidx.lifecycle.EmptyActivityLifecycleCallbacks;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;

public class LifecycleDispatcher$DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks	// class@0007cb
{

    public void LifecycleDispatcher$DispatcherActivityCallback(){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       ReportFragment.injectIfNeededIn(p0);
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStopped(Activity p0){
    }
}
