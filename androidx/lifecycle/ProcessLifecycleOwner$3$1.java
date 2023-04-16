package androidx.lifecycle.ProcessLifecycleOwner$3$1;
import androidx.lifecycle.EmptyActivityLifecycleCallbacks;
import androidx.lifecycle.ProcessLifecycleOwner$3;
import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner;

public class ProcessLifecycleOwner$3$1 extends EmptyActivityLifecycleCallbacks	// class@0007eb
{
    public final ProcessLifecycleOwner$3 this$1;

    public void ProcessLifecycleOwner$3$1(ProcessLifecycleOwner$3 p0){
       this.this$1 = p0;
       super();
    }
    public void onActivityPostResumed(Activity p0){
       this.this$1.this$0.activityResumed();
    }
    public void onActivityPostStarted(Activity p0){
       this.this$1.this$0.activityStarted();
    }
}
