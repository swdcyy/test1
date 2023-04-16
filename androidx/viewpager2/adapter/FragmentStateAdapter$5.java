package androidx.viewpager2.adapter.FragmentStateAdapter$5;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public class FragmentStateAdapter$5 implements LifecycleEventObserver	// class@000a20
{
    public final Handler b;
    public final Runnable c;
    public final FragmentStateAdapter d;

    public void FragmentStateAdapter$5(FragmentStateAdapter p0,Handler p1,Runnable p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.removeCallbacks(this.c);
          p0.getLifecycle().removeObserver(this);
       }
       return;
    }
}
