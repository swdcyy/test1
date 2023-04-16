package com.kuaishou.live.service.ServiceHolderImpl$observe$observer$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.service.ServiceHolderImpl;
import z1.a;
import java.lang.Object;
import com.kuaishou.live.service.ServiceHolderImpl$observe$observer$1$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import kotlin.jvm.internal.a;

public final class ServiceHolderImpl$observe$observer$1 implements LifecycleEventObserver	// class@000f86
{
    public Object b;
    public boolean c;
    public final Observer d;
    public final ServiceHolderImpl e;
    public final a f;
    public final a g;

    public void ServiceHolderImpl$observe$observer$1(ServiceHolderImpl p0,a p1,a p2){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       super();
       this.d = new ServiceHolderImpl$observe$observer$1$a(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, ServiceHolderImpl$observe$observer$1.class, "1")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.e.c().observeForever(this.d);
       this.c = true;
       return;
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ServiceHolderImpl$observe$observer$1.class, "2")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_CREATE) {
          this.a();
       }else if(p1 == Lifecycle$Event.ON_DESTROY){
          this.e.c().removeObserver(this.d);
          this.c = false;
          ServiceHolderImpl$observe$observer$1 tb = this.b;
          if (tb != null) {
             this.f.accept(tb);
          }
       }
       return;
    }
}
