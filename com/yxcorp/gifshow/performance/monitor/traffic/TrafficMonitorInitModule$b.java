package com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule$b;
import hg7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import kotlin.jvm.internal.a;
import kka.h;

public final class TrafficMonitorInitModule$b implements a	// class@000ec0
{

    public void TrafficMonitorInitModule$b(){
       super();
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, TrafficMonitorInitModule$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = b.a(-1592356291);
       a.o(obj, "Singleton.get\(FreeTrafficHelper::class.java\)");
       if (obj.a()) {
          return 1;
       }
       return 0;
    }
}
