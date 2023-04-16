package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$b;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import ye0.a$a;
import ye0.b;
import java.lang.StringBuilder;
import bf0.f;
import java.lang.Throwable;

public final class PrtpSpeedManager$b implements a	// class@0006c7
{
    public static final PrtpSpeedManager$b b;

    static {
       PrtpSpeedManager$b.b = new PrtpSpeedManager$b();
    }
    public void PrtpSpeedManager$b(){
       super();
    }
    public final void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpSpeedManager$b.class, "1")) {
          return;
       }
       if (a.g("GrowthPendantSpeedConfig", p0)) {
          PrtpSpeedManager s = PrtpSpeedManager.s;
          PrtpSpeedSwitchConfig prtpSpeedSwi = s.f(p1);
          if (prtpSpeedSwi != null) {
             PrtpSpeedManager.a = prtpSpeedSwi;
             a$a.i(b.a(), "ConfigValueChangedObserver#onChanged : config = "+PrtpSpeedManager.a, false, 2, null);
             s.k();
             f.d.d();
          }
       }
       return;
    }
}
