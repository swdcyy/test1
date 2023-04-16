package androidx.fragment.app.Fragment$2;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import android.view.View;

public class Fragment$2 implements LifecycleEventObserver	// class@000776
{
    public final Fragment b;

    public void Fragment$2(Fragment p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_STOP) {
          Fragment mView = this.b.mView;
          if (mView != null) {
             mView.cancelPendingInputEvents();
          }
       }
       return;
    }
}
