package androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;

public class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 implements LifecycleEventObserver	// class@000a21
{
    public final FragmentStateAdapter$FragmentMaxLifecycleEnforcer b;

    public void FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(FragmentStateAdapter$FragmentMaxLifecycleEnforcer p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       this.b.d(false);
    }
}
