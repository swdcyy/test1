package androidx.activity.ComponentActivity$3;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.activity.ComponentActivity;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import android.app.Activity;
import androidx.lifecycle.ViewModelStore;

public class ComponentActivity$3 implements LifecycleEventObserver	// class@00054b
{
    public final ComponentActivity b;

    public void ComponentActivity$3(ComponentActivity p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_DESTROY && !this.b.isChangingConfigurations()) {
          this.b.getViewModelStore().clear();
       }
       return;
    }
}
