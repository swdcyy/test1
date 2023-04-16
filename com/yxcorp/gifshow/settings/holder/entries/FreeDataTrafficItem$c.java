package com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem$c;
import erd.g;
import com.yxcorp.gifshow.settings.holder.entries.FreeDataTrafficItem;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.freetraffic.FreeTrafficManager;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse;

public final class FreeDataTrafficItem$c implements g	// class@001b2e
{
    public final FreeDataTrafficItem b;

    public void FreeDataTrafficItem$c(FreeDataTrafficItem p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FreeDataTrafficItem$c.class, "1")) {
       }else {
          p0 = FreeTrafficManager.j();
          a.o(p0, "FreeTrafficManager.getInstance\(\)");
          this.b.p(p0.h());
       }
       return;
    }
}
