package com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder;
import java.lang.Object;
import com.kuaishou.live.service.ServiceHolderImpl$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ServiceHolderImpl$MappedHolder$b implements Observer	// class@000f81
{
    public final ServiceHolderImpl$MappedHolder b;

    public void ServiceHolderImpl$MappedHolder$b(ServiceHolderImpl$MappedHolder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ServiceHolderImpl$MappedHolder$b.class, "1")) {
       }else {
          this.b.d();
       }
       return;
    }
}
