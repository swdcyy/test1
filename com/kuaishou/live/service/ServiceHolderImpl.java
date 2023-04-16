package com.kuaishou.live.service.ServiceHolderImpl;
import ip3.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import z1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.service.ServiceHolderImpl$observe$observer$1;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.LifecycleObserver;
import msd.l;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder;
import com.kuaishou.live.service.ServiceHolderImpl$a;

public class ServiceHolderImpl implements a	// class@000f87
{
    public final LiveData a;

    public void ServiceHolderImpl(LiveData p0){
       a.p(p0, "proxy");
       super();
       this.a = p0;
    }
    public void a(LifecycleOwner p0,a p1,a p2){
       Lifecycle lifecycle;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ServiceHolderImpl.class, "2")) {
          return;
       }
       a.p(p0, "lifecycle");
       a.p(p1, "onActive");
       a.p(p2, "onInactive");
       ServiceHolderImpl$observe$observer$1 oobserve$obs = new ServiceHolderImpl$observe$observer$1(this, p2, p1);
       lifecycle = p0.getLifecycle();
       a.o(lifecycle, "lifecycle.lifecycle");
       if (lifecycle.getCurrentState().isAtLeast(Lifecycle$State.CREATED)) {
          oobserve$obs.a();
       }
       p0.getLifecycle().addObserver(oobserve$obs);
       return;
    }
    public a b(l p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ServiceHolderImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "mapper");
       return new ServiceHolderImpl$MappedHolder(this.a, p0);
    }
    public final LiveData c(){
       return this.a;
    }
    public Object get(){
       Object[] objArray = null;
       ServiceHolderImpl$a obj = PatchProxy.apply(objArray, this, ServiceHolderImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.getValue();
       if (obj != null) {
          objArray = obj.a();
       }
       return objArray;
    }
}
