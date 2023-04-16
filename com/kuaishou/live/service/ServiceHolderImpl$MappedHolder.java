package com.kuaishou.live.service.ServiceHolderImpl$MappedHolder;
import com.kuaishou.live.service.ServiceHolderImpl;
import androidx.lifecycle.LiveData;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$a;
import java.util.Objects;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$b;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$1;
import androidx.lifecycle.Observer;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.service.ServiceHolderImpl$a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.MutableLiveData;

public final class ServiceHolderImpl$MappedHolder extends ServiceHolderImpl	// class@000f82
{
    public final LiveData b;
    public final l c;

    public void ServiceHolderImpl$MappedHolder(LiveData p0,l p1){
       a.p(p0, "sourceHolderState");
       a.p(p1, "mapper");
       super(new ServiceHolderImpl$MappedHolder$a());
       this.b = p0;
       this.c = p1;
       p0 = this.c();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.service.ServiceHolderImpl.MappedHolder.MyMutableLiveData<com.kuaishou.live.service.ServiceHolderImpl.HolderState<R>>");
       ServiceHolderImpl$MappedHolder$b mappedHolder = new ServiceHolderImpl$MappedHolder$b(this);
       p0.a = new ServiceHolderImpl$MappedHolder$1(this, mappedHolder);
       p0.b = new ServiceHolderImpl$MappedHolder$2(this, mappedHolder);
    }
    public final void d(){
       ServiceHolderImpl$a value1;
       ServiceHolderImpl$MappedHolder mappedHolder = ServiceHolderImpl$MappedHolder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mappedHolder, "2")) {
          return;
       }
       ServiceHolderImpl$a value = this.b.getValue();
       Integer integer = (value != null)? Integer.valueOf(value.b()): objArray;
       Integer integer1 = PatchProxy.apply(objArray, this, mappedHolder, "1");
       if (integer1 != PatchProxyResult.class) {
       }else {
          value1 = this.c().getValue();
          integer1 = (value1 != null)? Integer.valueOf(value1.b()): objArray;
       }
       if (a.g(integer, integer1)) {
          return;
       }else {
          value1 = this.b.getValue();
          if (value1 != null) {
             a.o(value1, "sourceHolderState.value ?: return");
             int i = value1.b();
             LiveData obj = value1.a();
             if (obj != null) {
                objArray = this.c.invoke(obj);
             }
             obj = this.c();
             Objects.requireNonNull(obj, "null cannot be cast to non-null type com.kuaishou.live.service.ServiceHolderImpl.MappedHolder.MyMutableLiveData<com.kuaishou.live.service.ServiceHolderImpl.HolderState<R>>");
             obj.setValue(new ServiceHolderImpl$a(i, objArray));
          }
          return;
       }
    }
    public Object get(){
       Object obj = PatchProxy.apply(null, this, ServiceHolderImpl$MappedHolder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d();
       return super.get();
    }
}
