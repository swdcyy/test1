package androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import androidx.lifecycle.LifecycleEventObserver;
import o0.a;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import o0.b;
import java.lang.Object;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements LifecycleEventObserver, a	// class@000550
{
    public final Lifecycle b;
    public final b c;
    public a d;
    public final OnBackPressedDispatcher e;

    public void OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(OnBackPressedDispatcher p0,Lifecycle p1,b p2){
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       p1.addObserver(this);
    }
    public void cancel(){
       this.b.removeObserver(this);
       this.c.e(this);
       OnBackPressedDispatcher$LifecycleOnBackPressedCancellable td = this.d;
       if (td != null) {
          td.cancel();
          this.d = null;
       }
       return;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_START) {
          this.d = this.e.c(this.c);
       }else if(p1 == Lifecycle$Event.ON_STOP){
          OnBackPressedDispatcher$LifecycleOnBackPressedCancellable td = this.d;
          if (td != null) {
             td.cancel();
          }
       }else if(p1 == Lifecycle$Event.ON_DESTROY){
          this.cancel();
       }
       return;
    }
}
