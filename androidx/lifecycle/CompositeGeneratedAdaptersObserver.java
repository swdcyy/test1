package androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.GeneratedAdapter;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.MethodCallsLogger;

public class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver	// class@0007bb
{
    public final GeneratedAdapter[] mGeneratedAdapters;

    public void CompositeGeneratedAdaptersObserver(GeneratedAdapter[] p0){
       super();
       this.mGeneratedAdapters = p0;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       MethodCallsLogger methodCallsL = new MethodCallsLogger();
       CompositeGeneratedAdaptersObserver tmGeneratedA = this.mGeneratedAdapters;
       int len = tmGeneratedA.length;
       boolean b = false;
       for (int i = 0; i < len; i = i + 1) {
          tmGeneratedA[i].callMethods(p0, p1, b, methodCallsL);
       }
       tmGeneratedA = this.mGeneratedAdapters;
       len = tmGeneratedA.length;
       for (; b < len; b = b + 1) {
          tmGeneratedA[b].callMethods(p0, p1, true, methodCallsL);
       }
       return;
    }
}
