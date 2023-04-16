package com.kuaishou.live.service.ServiceHolderImpl$MappedHolder$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.service.ServiceHolderImpl$MappedHolder;
import androidx.lifecycle.Observer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;

public final class ServiceHolderImpl$MappedHolder$1 extends Lambda implements a	// class@000f7e
{
    public final Observer $observer;
    public final ServiceHolderImpl$MappedHolder this$0;

    public void ServiceHolderImpl$MappedHolder$1(ServiceHolderImpl$MappedHolder p0,Observer p1){
       this.this$0 = p0;
       this.$observer = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, ServiceHolderImpl$MappedHolder$1.class, "1")) {
          return;
       }
       this.this$0.b.observeForever(this.$observer);
       return;
    }
}
