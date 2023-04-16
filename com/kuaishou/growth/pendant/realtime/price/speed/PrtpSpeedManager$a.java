package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import ze0.a;

public final class PrtpSpeedManager$a implements Runnable	// class@0006c6
{
    public static final PrtpSpeedManager$a b;

    static {
       PrtpSpeedManager$a.b = new PrtpSpeedManager$a();
    }
    public void PrtpSpeedManager$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PrtpSpeedManager$a.class, "1")) {
          return;
       }
       PrtpSpeedManager s = PrtpSpeedManager.s;
       if (a.d(s.c())) {
          s.g("timeout");
       }
       return;
    }
}
