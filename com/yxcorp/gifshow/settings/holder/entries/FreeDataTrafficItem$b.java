package com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$b;
import erd.g;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem;
import java.lang.Object;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class FreeDataTrafficItem$b implements g	// class@001b2d
{
    public final FreeDataTrafficItem b;

    public void FreeDataTrafficItem$b(FreeDataTrafficItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeDataTrafficItem$b.class, "1")) {
       }else {
          this.b.p(p0);
          p0.s = true;
       }
       return;
    }
}
