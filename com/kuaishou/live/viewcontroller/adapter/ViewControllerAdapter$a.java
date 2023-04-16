package com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import eq3.d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import gq3.a;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$Event;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewHost;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import android.view.ViewGroup;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.lifecycle.LiveData;
import eq3.d$a;

public abstract class ViewControllerAdapter$a extends RecyclerView$ViewHolder implements d	// class@000fea
{
    public final ViewControllerManagerImpl b;
    public final MutableLiveData c;
    public final LiveData d;
    public final a e;

    public void ViewControllerAdapter$a(View p0,LifecycleOwner p1,Activity p2){
       a.p(p0, "itemView");
       a.p(p1, "parentLifecycleOwner");
       a.p(p2, "activity");
       super(p0);
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.c = mutableLiveD;
       this.d = mutableLiveD;
       a uoa = new a();
       this.e = uoa;
       p1 = LifecyclesExt.a(uoa, p1);
       uoa.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
       Context context = p0.getContext();
       a.o(context, "itemView.context");
       this.b = new ViewControllerManagerImpl(p1, p2, context, ViewHost.a.b(p0));
    }
    public void E2(ViewGroup p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewControllerAdapter$a.class, "2")) {
          return;
       }
       a.p(p0, "container");
       a.p(p1, "viewController");
       this.b.E2(p0, p1);
       return;
    }
    public void G8(int p0,ViewController p1){
       ViewControllerAdapter$a uoa = ViewControllerAdapter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "viewController");
       this.b.G8(p0, p1);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ViewControllerAdapter$a.class, "6")) {
          return;
       }
       this.e.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
       return;
    }
    public final LiveData b(){
       return this.d;
    }
    public void o1(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter$a.class, "3")) {
          return;
       }
       a.p(p0, "viewController");
       this.b.o1(p0);
       return;
    }
    public void xg(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewControllerAdapter$a.class, "8")) {
          return;
       }
       a.p(p0, "viewController");
       d$a.a(this, p0);
       return;
    }
}
