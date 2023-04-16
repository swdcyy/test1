package androidx.lifecycle.SingleGeneratedAdapterObserver;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.GeneratedAdapter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.MethodCallsLogger;

public class SingleGeneratedAdapterObserver implements LifecycleEventObserver	// class@0007f7
{
    public final GeneratedAdapter mGeneratedAdapter;

    public void SingleGeneratedAdapterObserver(GeneratedAdapter p0){
       super();
       this.mGeneratedAdapter = p0;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       this.mGeneratedAdapter.callMethods(p0, p1, false, null);
       this.mGeneratedAdapter.callMethods(p0, p1, true, null);
    }
}
