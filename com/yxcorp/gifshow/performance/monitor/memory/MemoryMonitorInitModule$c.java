package com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ac6.d;
import java.util.Objects;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.kwai.sdk.switchconfig.a;
import na0.h;
import java.lang.reflect.Type;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ac6.b;
import io7.a;
import com.kwai.chat.sdk.signal.f;
import ac6.c;
import j85.e;

public final class MemoryMonitorInitModule$c implements Runnable	// class@000e8c
{
    public static final MemoryMonitorInitModule$c b;

    static {
       MemoryMonitorInitModule$c.b = new MemoryMonitorInitModule$c();
    }
    public void MemoryMonitorInitModule$c(){
       super();
    }
    public final void run(){
       String[] stringArray;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, MemoryMonitorInitModule$c.class, str)) {
          return;
       }
       d c = d.c;
       Objects.requireNonNull(c);
       d uod = d.class;
       if (!PatchProxy.applyVoid(objArray, c, uod, str)) {
          str = "cnyDegradeConfig";
          String str1 = "PerfDegradeUtils";
          if (!PatchProxy.applyVoid(objArray, c, uod, "2")) {
             try{
                Rubas.f("perf_degrade_kswitch_parseConfig", null, null, null, 14, null);
                h value = a.t().getValue(str, h.class, objArray);
                Log.g(str1, "initKSwitchConfig configList : "+String.valueOf(value));
                c.d(value, false);
                a.t().p(str, new b());
             }catch(java.lang.Exception e2){
                Log.d(str1, "initKSwitchConfig exception : "+e2+".message");
                Rubas.f("perf_degrade_kswitch_parseConfig_failed", null, null, null, 14, null);
             }
          }
       }
    label_00b0 :
       return;
    }
}
