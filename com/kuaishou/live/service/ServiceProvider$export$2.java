package com.kuaishou.live.service.ServiceProvider$export$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.service.ServiceProvider;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.service.ServiceHolderImpl$a;
import androidx.lifecycle.MutableLiveData;

public final class ServiceProvider$export$2 extends Lambda implements a	// class@000f88
{
    public final ServiceProvider this$0;

    public void ServiceProvider$export$2(ServiceProvider p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, ServiceProvider$export$2.class, "1")) {
          return;
       }
       ServiceProvider$export$2 tthis$0 = this.this$0;
       ServiceProvider b = tthis$0.b;
       tthis$0.b = b + 1;
       tthis$0.a.setValue(new ServiceHolderImpl$a(b, null));
       return;
    }
}
