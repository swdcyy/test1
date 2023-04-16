package b93.c;
import androidx.lifecycle.LifecycleEventObserver;
import b93.d;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.util.Objects;

public final class c implements LifecycleEventObserver	// class@000373
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == Lifecycle$Event.ON_START) {
          tb.a9();
       }else if(p1 == Lifecycle$Event.ON_RESUME){
          tb.onResume();
       }else if(p1 == Lifecycle$Event.ON_PAUSE){
          tb.onPause();
       }else if(p1 == Lifecycle$Event.ON_STOP){
          tb.b9();
       }
       return;
    }
}
