package com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleObserver;
import u2.g$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashSet;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$1;
import androidx.recyclerview.widget.h$b;
import u2.f;
import androidx.recyclerview.widget.b;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$diffUpdateList$dispatchUpdates$1;
import msd.a;
import fq3.a;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
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
import androidx.lifecycle.MutableLiveData;

public abstract class ViewControllerAdapter extends RecyclerView$Adapter implements LifecycleObserver, g$a	// class@000fec
{
    public final HashSet e;
    public final Handler f;
    public List g;
    public final LifecycleOwner h;
    public final Activity i;

    public void ViewControllerAdapter(LifecycleOwner p0,Activity p1){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       super();
       this.h = p0;
       this.i = p1;
       this.e = new HashSet();
       this.f = new Handler(Looper.getMainLooper());
       this.g = CollectionsKt__CollectionsKt.E();
       p0.getLifecycle().addObserver(new ViewControllerAdapter$1(this));
    }
    public static void J0(ViewControllerAdapter p0,List p1,h$b p2,f p3,boolean p4,int p5,Object p6){
       b uob = (p5 & 0x04)? new b(p0): null;
       if (p5 & 0x08) {
          p4 = true;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(ViewControllerAdapter.class) || !PatchProxy.applyVoidFourRefs(p1, p2, uob, Boolean.valueOf(p4), p0, ViewControllerAdapter.class, "2")) {
          a.p(p1, "list");
          a.p(p2, "diffCallback");
          a.p(uob, "updateCallback");
          h$e uoe = h.c(p2, p4);
          a.o(uoe, "DiffUtil.calculateDiff\(diffCallback, detectMoves\)");
          ViewControllerAdapter$diffUpdateList$dispatchUpdates$1 uodiffUpdate = new ViewControllerAdapter$diffUpdateList$dispatchUpdates$1(p0, p1, uoe, uob);
          if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
             uodiffUpdate.invoke();
          }else {
             p0.f.post(new a(uodiffUpdate));
          }
       }
       return;
    }
    public void B0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter.class, "12")) {
       }else {
          a.p(p0, "holder");
          if (!this.e.contains(p0)) {
             this.e.add(p0);
          }
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ViewControllerAdapter$a.class, "4")) {
             p0.e.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_RESUME);
          }
       }
       return;
    }
    public void D0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter.class, "13")) {
       }else {
          a.p(p0, "holder");
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ViewControllerAdapter$a.class, "5")) {
             p0.e.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_STOP);
          }
       }
       return;
    }
    public final Activity K0(){
       return this.i;
    }
    public final List L0(){
       return this.g;
    }
    public Object M0(int p0){
       ViewControllerAdapter viewControll = ViewControllerAdapter.class;
       if (PatchProxy.isSupport(viewControll)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, viewControll, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g.get(p0);
    }
    public final LifecycleOwner N0(){
       return this.h;
    }
    public final void O0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter.class, "1")) {
          return;
       }
       a.p(p0, "list");
       this.g = CollectionsKt___CollectionsKt.G5(p0);
       this.k0();
       return;
    }
    public final void destroy(){
       if (PatchProxy.applyVoid(null, this, ViewControllerAdapter.class, "10")) {
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
       Object obj = PatchProxy.apply(null, this, ViewControllerAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void i(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter.class, "9")) {
          return;
       }
       a.p(p0, "viewHolder");
       if (p0 instanceof ViewControllerAdapter$a) {
          p0.a();
          ViewControllerAdapter te = this.e;
          Objects.requireNonNull(te, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
          s0.a(te).remove(p0);
       }
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter.class, "8")) {
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
       ViewControllerAdapter viewControll = ViewControllerAdapter.class;
       if (!PatchProxy.isSupport(viewControll) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, viewControll, "7")) {
          a.p(p0, "holder");
          Object obj = this.M0(p1);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(obj, p0, ViewControllerAdapter$a.class, "7")) {
             p0.c.setValue(obj);
          }
       }
       return;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter.class, "11")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.destroy();
       return;
    }
}
