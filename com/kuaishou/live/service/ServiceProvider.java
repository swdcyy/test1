package com.kuaishou.live.service.ServiceProvider;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import ip3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.service.ServiceHolderImpl;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.a;
import com.kuaishou.live.service.ServiceHolderImpl$a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kuaishou.live.service.ServiceProvider$export$2;
import msd.a;
import u63.a;

public final class ServiceProvider	// class@000f89
{
    public final MutableLiveData a;
    public int b;

    public void ServiceProvider(){
       super();
       this.a = new MutableLiveData();
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, ServiceProvider.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ServiceHolderImpl(this.a);
    }
    public final void b(LifecycleOwner p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ServiceProvider.class, "1")) {
          return;
       }
       a.p(p0, "lifecycleOwner");
       a.p(p1, "service");
       ServiceHolderImpl$a value = this.a.getValue();
       if (value != null) {
          Object obj = value.a();
          if (obj != null) {
             throw new IllegalStateException("already has a service exported: "+obj);
          }
       }
       ServiceProvider tb = this.b;
       this.b = tb + 1;
       this.a.setValue(new ServiceHolderImpl$a(tb, p1));
       a.a(p0, new ServiceProvider$export$2(this));
       return;
    }
}
