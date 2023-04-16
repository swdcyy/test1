package com.kuaishou.live.service.ServiceHolderImpl$observe$observer$1$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.service.ServiceHolderImpl$observe$observer$1;
import java.lang.Object;
import com.kuaishou.live.service.ServiceHolderImpl$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.a;

public final class ServiceHolderImpl$observe$observer$1$a implements Observer	// class@000f85
{
    public final ServiceHolderImpl$observe$observer$1 b;

    public void ServiceHolderImpl$observe$observer$1$a(ServiceHolderImpl$observe$observer$1 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ServiceHolderImpl$observe$observer$1$a.class, "1")) {
       }else {
          p0 = p0.a();
          if (p0 != null) {
             this.b.g.accept(p0);
          }else {
             ServiceHolderImpl$observe$observer$1$a tb = this.b;
             ServiceHolderImpl$observe$observer$1 b = tb.b;
             if (b != null) {
                tb.f.accept(b);
             }
          }
          this.b.b = p0;
       }
       return;
    }
}
