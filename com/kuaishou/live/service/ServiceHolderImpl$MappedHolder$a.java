package com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import msd.a;
import qrd.l1;

public final class ServiceHolderImpl$MappedHolder$a extends MutableLiveData	// class@000f80
{
    public a a;
    public a b;

    public void ServiceHolderImpl$MappedHolder$a(){
       super();
    }
    public void onActive(){
       if (PatchProxy.applyVoid(null, this, ServiceHolderImpl$MappedHolder$a.class, "1")) {
          return;
       }
       super.onActive();
       ServiceHolderImpl$MappedHolder$a ta = this.a;
       if (ta != null) {
          ta.invoke();
       }
       return;
    }
    public void onInactive(){
       if (PatchProxy.applyVoid(null, this, ServiceHolderImpl$MappedHolder$a.class, "2")) {
          return;
       }
       super.onInactive();
       ServiceHolderImpl$MappedHolder$a tb = this.b;
       if (tb != null) {
          tb.invoke();
       }
       return;
    }
}
