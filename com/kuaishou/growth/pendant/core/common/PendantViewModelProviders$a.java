package com.kuaishou.growth.pendant.core.common.PendantViewModelProviders$a;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModelStore;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.common.PendantViewModelProviders;
import qrd.p;

public final class PendantViewModelProviders$a	// class@00063c
{

    public void PendantViewModelProviders$a(){
       super();
    }
    public void PendantViewModelProviders$a(u p0){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, PendantViewModelProviders$a.class, "3")) {
          return;
       }
       this.b().clear();
       return;
    }
    public final ViewModelStore b(){
       Object obj = PatchProxy.apply(null, this, PendantViewModelProviders$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PendantViewModelProviders.a.getValue();
    }
}
