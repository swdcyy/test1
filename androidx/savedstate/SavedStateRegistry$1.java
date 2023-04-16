package androidx.savedstate.SavedStateRegistry$1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.savedstate.SavedStateRegistry;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;

public class SavedStateRegistry$1 implements GenericLifecycleObserver	// class@000986
{
    public final SavedStateRegistry b;

    public void SavedStateRegistry$1(SavedStateRegistry p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_START) {
          p0.e = true;
       }else if(p1 == Lifecycle$Event.ON_STOP){
          p0.e = false;
       }
       return;
    }
}
