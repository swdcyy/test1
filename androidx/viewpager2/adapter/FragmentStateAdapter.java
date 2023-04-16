package androidx.viewpager2.adapter.FragmentStateAdapter;
import i3.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.FragmentActivity;
import androidx.activity.ComponentActivity;
import androidx.collection.LongSparseArray;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Long;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import i3.a;
import android.os.Parcelable;
import android.os.Bundle;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import androidx.fragment.app.Fragment$SavedState;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewParent;
import android.view.ViewGroup;
import androidx.collection.ArraySet;
import java.lang.Integer;
import a2.i0;
import androidx.viewpager2.adapter.FragmentStateAdapter$a;
import android.view.View$OnLayoutChangeListener;
import androidx.fragment.app.e;
import androidx.lifecycle.Lifecycle$State;
import androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer;
import androidx.viewpager2.adapter.FragmentStateAdapter$2;
import androidx.lifecycle.LifecycleObserver;
import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.adapter.FragmentStateAdapter$c;
import androidx.viewpager2.adapter.FragmentStateAdapter$5;
import java.lang.Runnable;
import androidx.viewpager2.adapter.FragmentStateAdapter$b;
import androidx.fragment.app.c$b;
import androidx.recyclerview.widget.RecyclerView;
import z1.h;

public abstract class FragmentStateAdapter extends RecyclerView$Adapter implements b	// class@000a29
{
    public final Lifecycle e;
    public final c f;
    public final LongSparseArray g;
    public final LongSparseArray h;
    public final LongSparseArray i;
    public FragmentStateAdapter$FragmentMaxLifecycleEnforcer j;
    public boolean k;
    public boolean l;

    public void FragmentStateAdapter(Fragment p0){
       super(p0.getChildFragmentManager(), p0.getLifecycle());
    }
    public void FragmentStateAdapter(FragmentActivity p0){
       super(p0.getSupportFragmentManager(), p0.getLifecycle());
    }
    public void FragmentStateAdapter(c p0,Lifecycle p1){
       super();
       this.g = new LongSparseArray();
       this.h = new LongSparseArray();
       this.i = new LongSparseArray();
       this.k = false;
       this.l = false;
       this.f = p0;
       this.e = p1;
       this.G0(true);
    }
    public static String M0(String p0,long p1){
       return p0+p1;
    }
    public static boolean Q0(String p0,String p1){
       boolean b = (p0.startsWith(p1) && p0.length() > p1.length())? true: false;
       return b;
    }
    public static long W0(String p0,String p1){
       return Long.parseLong(p0.substring(p1.length()));
    }
    public boolean A0(RecyclerView$ViewHolder p0){
       return true;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.U0(p0);
    }
    public void E0(RecyclerView$ViewHolder p0){
       this.V0(p0);
    }
    public final void I(Parcelable p0){
       if (!this.h.isEmpty() || !this.g.isEmpty()) {
          throw new IllegalStateException("Expected the adapter to be \'fresh\' while restoring state.");
       }
       if (p0.getClassLoader() == null) {
          p0.setClassLoader(this.getClass().getClassLoader());
       }
       Iterator iterator = p0.keySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             String str = iterator.next();
             String str1 = "f#";
             if (FragmentStateAdapter.Q0(str, str1)) {
                this.g.put(FragmentStateAdapter.W0(str, str1), this.f.getFragment(p0, str));
             }else {
                str1 = "s#";
                if (FragmentStateAdapter.Q0(str, str1)) {
                   long l = FragmentStateAdapter.W0(str, str1);
                   Fragment$SavedState parcelable = p0.getParcelable(str);
                   if (this.K0(l)) {
                      this.h.put(l, parcelable);
                   }
                }else {
                   throw new IllegalArgumentException("Unexpected key in savedState: "+str);
                }
             }
          }else if(!this.g.isEmpty()){
             this.l = true;
             this.k = true;
             this.O0();
             this.Z0();
             break ;
          }
          break ;
       }
       return;
    }
    public void J0(View p0,FrameLayout p1){
       if (p1.getChildCount() > 1) {
          throw new IllegalStateException("Design assumption violated.");
       }
       if (p0.getParent() == p1) {
          return;
       }
       if (p1.getChildCount() > 0) {
          p1.removeAllViews();
       }
       if (p0.getParent() != null) {
          p0.getParent().removeView(p0);
       }
       p1.addView(p0);
       return;
    }
    public boolean K0(long p0){
       boolean b = (p0 >= 0 && p0 - (long)this.getItemCount() < 0)? true: false;
       return b;
    }
    public abstract Fragment L0(int p0);
    public final void N0(int p0){
       long l = this.d0(p0);
       if (!this.g.containsKey(l)) {
          Fragment uFragment = this.L0(p0);
          uFragment.setInitialSavedState(this.h.get(l));
          this.g.put(l, uFragment);
       }
       return;
    }
    public void O0(){
       if (this.l != null && !this.b1()) {
          ArraySet uArraySet = new ArraySet();
          boolean b = false;
          int i = 0;
          while (i < this.g.size()) {
             long l = this.g.keyAt(i);
             if (!this.K0(l)) {
                uArraySet.add(Long.valueOf(l));
                this.i.remove(l);
             }
             i = i + 1;
          }
          if (this.k == null) {
             this.l = b;
             while (b < this.g.size()) {
                long l1 = this.g.keyAt(b);
                if (!this.P0(l1)) {
                   uArraySet.add(Long.valueOf(l1));
                }
                b = b + 1;
             }
          }
          Iterator iterator = uArraySet.iterator();
          while (iterator.hasNext()) {
             this.Y0(iterator.next().longValue());
          }
       }
       return;
    }
    public final boolean P0(long p0){
       boolean b = true;
       if (this.i.containsKey(p0)) {
          return b;
       }
       Fragment uFragment = this.g.get(p0);
       if (uFragment == null) {
          return false;
       }
       View view = uFragment.getView();
       if (view == null) {
          return false;
       }
       if (view.getParent() == null) {
          b = false;
       }
       return b;
    }
    public final Long R0(int p0){
       FragmentStateAdapter uFragmentSta = null;
       int i = 0;
       while (true) {
          if (i >= this.i.size()) {
             return uFragmentSta;
          }
          if (this.i.valueAt(i).intValue() == p0) {
             if (uFragmentSta == null) {
                uFragmentSta = Long.valueOf(this.i.keyAt(i));
             }else {
                break ;
             }
          }
          i = i + 1;
       }
       throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
    }
    public final void S0(a p0,int p1){
       long itemId = p0.getItemId();
       int id = p0.b().getId();
       Long longx = this.R0(id);
       if (longx != null && longx.longValue() - itemId) {
          this.Y0(longx.longValue());
          this.i.remove(longx.longValue());
       }
       this.i.put(itemId, Integer.valueOf(id));
       this.N0(p1);
       FrameLayout uFrameLayout = p0.b();
       if (i0.X(uFrameLayout)) {
          if (uFrameLayout.getParent() == null) {
             uFrameLayout.addOnLayoutChangeListener(new FragmentStateAdapter$a(this, uFrameLayout, p0));
          }else {
             throw new IllegalStateException("Design assumption violated.");
          }
       }
       this.O0();
       return;
    }
    public final a T0(ViewGroup p0,int p1){
       return a.a(p0);
    }
    public final void U0(a p0){
       this.X0(p0);
       this.O0();
    }
    public final void V0(a p0){
       Long longx = this.R0(p0.b().getId());
       if (longx != null) {
          this.Y0(longx.longValue());
          this.i.remove(longx.longValue());
       }
       return;
    }
    public void X0(a p0){
       Fragment uFragment = this.g.get(p0.getItemId());
       String str = "Design assumption violated.";
       if (uFragment == null) {
          throw new IllegalStateException(str);
       }
       FrameLayout uFrameLayout = p0.b();
       View view = uFragment.getView();
       if (!uFragment.isAdded() && view != null) {
          throw new IllegalStateException(str);
       }
       if (uFragment.isAdded() && view == null) {
          this.a1(uFragment, uFrameLayout);
          return;
       }else if(uFragment.isAdded() && view.getParent() != null){
          if (view.getParent() != uFrameLayout) {
             this.J0(view, uFrameLayout);
          }
          return;
       }else if(uFragment.isAdded()){
          this.J0(view, uFrameLayout);
          return;
       }else if(!this.b1()){
          this.a1(uFragment, uFrameLayout);
          e uoe = this.f.beginTransaction();
          uoe.h(uFragment, "f"+p0.getItemId());
          uoe.A(uFragment, Lifecycle$State.STARTED).n();
          this.j.d(false);
       }else if(this.f.isDestroyed()){
          return;
       }else {
          this.e.addObserver(new FragmentStateAdapter$2(this, p0));
       }
       return;
    }
    public final void Y0(long p0){
       Fragment uFragment = this.g.get(p0);
       if (uFragment == null) {
          return;
       }
       if (uFragment.getView() != null) {
          ViewParent parent = uFragment.getView().getParent();
          if (parent != null) {
             parent.removeAllViews();
          }
       }
       if (!this.K0(p0)) {
          this.h.remove(p0);
       }
       if (!uFragment.isAdded()) {
          this.g.remove(p0);
          return;
       }else if(this.b1()){
          this.l = true;
          return;
       }else if(uFragment.isAdded() && this.K0(p0)){
          this.h.put(p0, this.f.saveFragmentInstanceState(uFragment));
       }
       this.f.beginTransaction().u(uFragment).n();
       this.g.remove(p0);
       return;
    }
    public final void Z0(){
       Handler handler = new Handler(Looper.getMainLooper());
       FragmentStateAdapter$c uoc = new FragmentStateAdapter$c(this);
       this.e.addObserver(new FragmentStateAdapter$5(this, handler, uoc));
       handler.postDelayed(uoc, 0x2710);
    }
    public final void a1(Fragment p0,FrameLayout p1){
       this.f.registerFragmentLifecycleCallbacks(new FragmentStateAdapter$b(this, p0, p1), false);
    }
    public boolean b1(){
       return this.f.isStateSaved();
    }
    public long d0(int p0){
       return (long)p0;
    }
    public final Parcelable g(){
       Bundle uBundle = new Bundle((this.g.size() + this.h.size()));
       int i = 0;
       int i1 = 0;
       while (i1 < this.g.size()) {
          long l = this.g.keyAt(i1);
          Fragment uFragment = this.g.get(l);
          if (uFragment != null && uFragment.isAdded()) {
             this.f.putFragment(uBundle, FragmentStateAdapter.M0("f#", l), uFragment);
          }
          i1 = i1 + 1;
       }
       while (i < this.h.size()) {
          long l1 = this.h.keyAt(i);
          if (this.K0(l1)) {
             uBundle.putParcelable(FragmentStateAdapter.M0("s#", l1), this.h.get(l1));
          }
          i = i + 1;
       }
       return uBundle;
    }
    public void u0(RecyclerView p0){
       boolean b = (this.j == null)? true: false;
       h.a(b);
       FragmentStateAdapter$FragmentMaxLifecycleEnforcer uFragmentMax = new FragmentStateAdapter$FragmentMaxLifecycleEnforcer(this);
       this.j = uFragmentMax;
       uFragmentMax.b(p0);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.S0(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.T0(p0, p1);
    }
    public void z0(RecyclerView p0){
       this.j.c(p0);
       this.j = null;
    }
}
