package androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a;
import androidx.viewpager2.widget.ViewPager2$h;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.c;
import androidx.lifecycle.Lifecycle$State;

public class FragmentStateAdapter$FragmentMaxLifecycleEnforcer	// class@000a24
{
    public ViewPager2$h a;
    public RecyclerView$i b;
    public LifecycleEventObserver c;
    public ViewPager2 d;
    public long e;
    public final FragmentStateAdapter f;

    public void FragmentStateAdapter$FragmentMaxLifecycleEnforcer(FragmentStateAdapter p0){
       this.f = p0;
       super();
       this.e = -1;
    }
    public final ViewPager2 a(RecyclerView p0){
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewPager2) {
          return parent;
       }
       throw new IllegalStateException("Expected ViewPager2 instance. Got: "+parent);
    }
    public void b(RecyclerView p0){
       this.d = this.a(p0);
       FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a uFragmentMax = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a(this);
       this.a = uFragmentMax;
       this.d.j(uFragmentMax);
       FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b uFragmentMax1 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b(this);
       this.b = uFragmentMax1;
       this.f.F0(uFragmentMax1);
       FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 uFragmentMax2 = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(this);
       this.c = uFragmentMax2;
       this.f.e.addObserver(uFragmentMax2);
    }
    public void c(RecyclerView p0){
       this.a(p0).r(this.a);
       this.f.I0(this.b);
       this.f.e.removeObserver(this.c);
       this.d = null;
    }
    public void d(boolean p0){
       if (this.f.b1()) {
          return;
       }
       if (this.d.getScrollState()) {
          return;
       }
       if (!this.f.g.isEmpty() && this.f.getItemCount()) {
          int currentItem = this.d.getCurrentItem();
          if (currentItem >= this.f.getItemCount()) {
             return;
          }else {
             long l = this.f.d0(currentItem);
             if (!l - this.e && !p0) {
                return;
             }else {
                Fragment uFragment = this.f.g.get(l);
                if (uFragment != null && uFragment.isAdded()) {
                   this.e = l;
                   e uoe = this.f.f.beginTransaction();
                   Fragment uFragment1 = null;
                   int i = 0;
                   while (i < this.f.g.size()) {
                      long l1 = this.f.g.keyAt(i);
                      Fragment uFragment2 = this.f.g.valueAt(i);
                      if (uFragment2.isAdded()) {
                         if (l1 - this.e) {
                            uoe.A(uFragment2, Lifecycle$State.STARTED);
                         }else {
                            uFragment1 = uFragment2;
                         }
                         boolean b = (!l1 - this.e)? true: false;
                         uFragment2.setMenuVisibility(b);
                      }
                      i = i + 1;
                   }
                   if (uFragment1 != null) {
                      uoe.A(uFragment1, Lifecycle$State.RESUMED);
                   }
                   if (!uoe.t()) {
                      uoe.n();
                   }
                }
             }
          }
       }
       return;
    }
}
