package androidx.activity.ComponentActivity$2;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.activity.ComponentActivity;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import android.view.Window;
import android.app.Activity;
import android.view.View;

public class ComponentActivity$2 implements LifecycleEventObserver	// class@00054a
{
    public final ComponentActivity b;

    public void ComponentActivity$2(ComponentActivity p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_STOP) {
          Window window = this.b.getWindow();
          View view = (window != null)? window.peekDecorView(): null;
          if (view != null) {
             view.cancelPendingInputEvents();
          }
       }
       return;
    }
}
