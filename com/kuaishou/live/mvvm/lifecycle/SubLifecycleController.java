package com.kuaishou.live.mvvm.lifecycle.SubLifecycleController;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.LifecycleRegistry;
import gq3.a;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.mvvm.lifecycle.SubLifecycleController$1;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public abstract class SubLifecycleController implements LifecycleOwner, ViewModelStoreOwner	// class@000d0e
{
    public final ViewModelStore b;
    public final LifecycleRegistry c;
    public final a d;
    public final LifecycleOwner e;

    public void SubLifecycleController(LifecycleOwner p0){
       a.p(p0, "parentLifecycleOwner");
       super();
       this.b = new ViewModelStore();
       this.c = new LifecycleRegistry(this);
       a uoa = new a();
       this.d = uoa;
       p0 = LifecyclesExt.a(p0, uoa);
       this.e = p0;
       p0.getLifecycle().addObserver(new SubLifecycleController$1(this));
       LifecycleRegistry lifecycle = uoa.getLifecycle();
       lifecycle.handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SubLifecycleController.class, "5")) {
          return;
       }
       this.d.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_DESTROY);
       return;
    }
    public void b(){
    }
    public void c(){
    }
    public void d(){
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, SubLifecycleController.class, "3")) {
          return;
       }
       this.d.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_START);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, SubLifecycleController.class, "4")) {
          return;
       }
       this.d.getLifecycle().handleLifecycleEvent(Lifecycle$Event.ON_STOP);
       return;
    }
    public Lifecycle getLifecycle(){
       return this.c;
    }
    public ViewModelStore getViewModelStore(){
       return this.b;
    }
}
