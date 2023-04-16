package androidx.viewpager2.adapter.FragmentStateAdapter$2;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import i3.a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import android.widget.FrameLayout;
import android.view.View;
import a2.i0;

public class FragmentStateAdapter$2 implements LifecycleEventObserver	// class@000a1f
{
    public final a b;
    public final FragmentStateAdapter c;

    public void FragmentStateAdapter$2(FragmentStateAdapter p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (this.c.b1()) {
          return;
       }
       p0.getLifecycle().removeObserver(this);
       if (i0.X(this.b.b())) {
          this.c.X0(this.b);
       }
       return;
    }
}
