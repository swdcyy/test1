package com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment$e;
import com.kuaishou.tuna.plc.dynamic_container.view.a$a;
import com.kuaishou.tuna.plc.dynamic_container.PlcDynamicContainerFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import java.util.Map;
import ekd.q;
import ey4.f;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc.dynamic_container.logger.PlcDynamicLogger;
import ey4.d;

public final class PlcDynamicContainerFragment$e implements a$a	// class@000fce
{
    public final PlcDynamicContainerFragment a;

    public void PlcDynamicContainerFragment$e(PlcDynamicContainerFragment p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       PlcDynamicContainerFragment$e uoe = PlcDynamicContainerFragment$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "2")) {
          return;
       }
       uoe = this.a;
       Objects.requireNonNull(uoe);
       if (!PatchProxy.isSupport(PlcDynamicContainerFragment.class) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), uoe, PlcDynamicContainerFragment.class, "34") && !q.h(uoe.r))) {
          k1.o(new f(uoe, p0));
       }
       return;
    }
    public void onStateChanged(int p0){
       PlcDynamicContainerFragment$e uoe = PlcDynamicContainerFragment$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       PlcDynamicLogger.a("onStateChanged: "+p0);
       uoe = this.a;
       Objects.requireNonNull(uoe);
       if (!PatchProxy.isSupport(PlcDynamicContainerFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoe, PlcDynamicContainerFragment.class, "35") && !q.h(uoe.r))) {
          k1.o(new d(uoe, p0));
       }
       return;
    }
}
