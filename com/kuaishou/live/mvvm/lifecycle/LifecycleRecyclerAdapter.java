package com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.lifecycle.LifecycleObserver;
import u2.g$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import java.lang.Number;
import java.util.Collection;
import nsd.s0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import u2.g;

public abstract class LifecycleRecyclerAdapter extends RecyclerView$Adapter implements LifecycleObserver, g$a	// class@000d0b
{
    public final HashSet e;
    public final Handler f;
    public List g;
    public final LifecycleOwner h;
    public static final LifecycleRecyclerAdapter$a i;

    static {
       LifecycleRecyclerAdapter.i = new LifecycleRecyclerAdapter$a(null);
    }
    public void LifecycleRecyclerAdapter(LifecycleOwner p0){
       a.p(p0, "parentLifecycleOwner");
       super();
       this.h = p0;
       this.e = new HashSet();
       this.f = new Handler(Looper.getMainLooper());
       this.g = CollectionsKt__CollectionsKt.E();
       p0.getLifecycle().addObserver(this);
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.N0(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.O0(p0);
    }
    public final List J0(){
       return this.g;
    }
    public Object K0(int p0){
       LifecycleRecyclerAdapter lifecycleRec = LifecycleRecyclerAdapter.class;
       if (PatchProxy.isSupport(lifecycleRec)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, lifecycleRec, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g.get(p0);
    }
    public final LifecycleOwner L0(){
       return this.h;
    }
    public void M0(LifecycleRecyclerAdapter$b p0,int p1){
       LifecycleRecyclerAdapter lifecycleRec = LifecycleRecyclerAdapter.class;
       if (PatchProxy.isSupport(lifecycleRec) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, lifecycleRec, "7")) {
          return;
       }
       a.p(p0, "holder");
       Object obj = this.K0(p1);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(obj, p0, LifecycleRecyclerAdapter$b.class, "3")) {
          p0.c.setValue(obj);
       }
       return;
    }
    public void N0(LifecycleRecyclerAdapter$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapter.class, "12")) {
          return;
       }
       a.p(p0, "holder");
       if (!this.e.contains(p0)) {
          this.e.add(p0);
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LifecycleRecyclerAdapter$b.class, "4")) {
          p0.b.e();
       }
       return;
    }
    public void O0(LifecycleRecyclerAdapter$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapter.class, "13")) {
          return;
       }
       a.p(p0, "holder");
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, LifecycleRecyclerAdapter$b.class, "5")) {
          p0.b.f();
       }
       return;
    }
    public final void P0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapter.class, "1")) {
          return;
       }
       a.p(p0, "list");
       this.g = CollectionsKt___CollectionsKt.G5(p0);
       this.k0();
       return;
    }
    public final void destroy(){
       if (PatchProxy.applyVoid(null, this, LifecycleRecyclerAdapter.class, "10")) {
          return;
       }
       this.h.getLifecycle().removeObserver(this);
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       this.e.clear();
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LifecycleRecyclerAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void i(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapter.class, "9")) {
          return;
       }
       a.p(p0, "viewHolder");
       if (p0 instanceof LifecycleRecyclerAdapter$b) {
          p0.a();
          LifecycleRecyclerAdapter te = this.e;
          Objects.requireNonNull(te, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
          s0.a(te).remove(p0);
       }
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapter.class, "8")) {
          return;
       }
       a.p(p0, "recyclerView");
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          layoutManage.M0(true);
       }
       g og = new g(p0, this);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.M0(p0, p1);
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapter.class, "11")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.destroy();
       return;
    }
}
