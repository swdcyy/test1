package com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$b;
import ch7.i$a;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.System;
import o56.d;
import java.lang.Long;

public final class OOMMonitorInitModule$b implements i$a	// class@000e99
{
    public static final OOMMonitorInitModule$b a;

    static {
       OOMMonitorInitModule$b.a = new OOMMonitorInitModule$b();
    }
    public void OOMMonitorInitModule$b(){
       super();
    }
    public final Map a(){
       HashMap obj = PatchProxy.apply(null, this, OOMMonitorInitModule$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("usageTimeMills", Long.valueOf((System.currentTimeMillis() - d.h)));
       return obj;
    }
}
