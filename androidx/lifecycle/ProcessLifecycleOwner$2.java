package androidx.lifecycle.ProcessLifecycleOwner$2;
import androidx.lifecycle.ReportFragment$ActivityInitializationListener;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.lang.Object;

public class ProcessLifecycleOwner$2 implements ReportFragment$ActivityInitializationListener	// class@000254
{
    public final ProcessLifecycleOwner this$0;

    public void ProcessLifecycleOwner$2(ProcessLifecycleOwner p0){
       this.this$0 = p0;
       super();
    }
    public void onCreate(){
    }
    public void onResume(){
       this.this$0.activityResumed();
    }
    public void onStart(){
       this.this$0.activityStarted();
    }
}
