package androidx.lifecycle.ProcessLifecycleOwner$3;
import androidx.lifecycle.EmptyActivityLifecycleCallbacks;
import androidx.lifecycle.ProcessLifecycleOwner;
import android.app.Activity;
import android.os.Bundle;
import android.os.Build$VERSION;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.ReportFragment$ActivityInitializationListener;
import androidx.lifecycle.ProcessLifecycleOwner$3$1;
import android.app.Application$ActivityLifecycleCallbacks;

public class ProcessLifecycleOwner$3 extends EmptyActivityLifecycleCallbacks	// class@0007ec
{
    public final ProcessLifecycleOwner this$0;

    public void ProcessLifecycleOwner$3(ProcessLifecycleOwner p0){
       this.this$0 = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (Build$VERSION.SDK_INT < 29) {
          ReportFragment.get(p0).setProcessListener(this.this$0.mInitializationListener);
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       this.this$0.activityPaused();
    }
    public void onActivityPreCreated(Activity p0,Bundle p1){
       p0.registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$3$1(this));
    }
    public void onActivityStopped(Activity p0){
       this.this$0.activityStopped();
    }
}
