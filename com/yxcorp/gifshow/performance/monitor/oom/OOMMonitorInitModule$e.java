package com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$e;
import kh7.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.l;
import java.lang.StringBuilder;
import yf7.h;

public final class OOMMonitorInitModule$e implements f	// class@000e9c
{

    public void OOMMonitorInitModule$e(){
       super();
    }
    public boolean a(){
       String obj = PatchProxy.apply(null, this, OOMMonitorInitModule$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "memory_leak_trigger";
       boolean b = l.c(obj, false);
       h.d("OOMMonitorInitModule", "check OOM trigger "+b);
       if (b) {
          l.h(obj, false);
          h.d("OOMMonitorInitModule", "manual trigger leak");
       }
       return b;
    }
}
