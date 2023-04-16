package com.kuaishou.growth.pendant.realtime.price.core.PrtpManager$d;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import java.lang.StringBuilder;
import ye0.a;
import bf0.f;
import java.lang.Throwable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class PrtpManager$d implements a	// class@0006a3
{
    public static final PrtpManager$d b;

    static {
       PrtpManager$d.b = new PrtpManager$d();
    }
    public void PrtpManager$d(){
       super();
    }
    public final void a(String p0,f p1){
       PrtpManager z;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpManager$d.class, "1")) {
          return;
       }
       if (a.g("PendantRealtimePrice", p0)) {
          z = PrtpManager.z;
          PrtpSwitchConfig prtpSwitchCo = z.p(p1);
          if (prtpSwitchCo != null) {
             PrtpManager.a = prtpSwitchCo;
             a.h("ConfigValueChangedObserver#onChanged : config = "+PrtpManager.a, false, 2, null);
             z.v();
             f.d.d();
          }
       }else if(a.g("PrtpCoinMappingConfig", p0)){
          z = PrtpManager.z;
          HashMap hashMap = z.m(p1);
          if (hashMap != null) {
             PrtpManager.a(z).clear();
             PrtpManager.a(z).putAll(hashMap);
             a.h("ConfigValueChangedObserver#onChanged : mapping = "+PrtpManager.a(z), false, 2, null);
          }
       }
       return;
    }
}
