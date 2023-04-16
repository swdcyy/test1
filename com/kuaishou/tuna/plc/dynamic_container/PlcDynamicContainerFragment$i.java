package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$i;
import iy4.b$b;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Map;
import ekd.q;
import ey4.e;
import java.lang.Runnable;
import ekd.k1;

public final class PlcDynamicContainerFragment$i implements b$b	// class@000fd3
{
    public final PlcDynamicContainerFragment a;

    public void PlcDynamicContainerFragment$i(PlcDynamicContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       PlcDynamicContainerFragment$i oi = PlcDynamicContainerFragment$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "1")) {
          return;
       }
       oi = this.a;
       oi.s = p0;
       Objects.requireNonNull(oi);
       if (!PatchProxy.isSupport(PlcDynamicContainerFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), oi, PlcDynamicContainerFragment.class, "32") && !q.h(oi.r))) {
          k1.o(new e(oi, p0));
       }
       return;
    }
}
