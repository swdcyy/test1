package com.yxcorp.gifshow.performance.monitor.memorysanitizer.MemorySanitizerInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.MemorySanitizerInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.MemorySanitizerInitModule$b;
import java.lang.Runnable;
import com.kwai.framework.init.e;

public final class MemorySanitizerInitModule extends PerformanceBaseInitModule	// class@000e91
{
    public static final MemorySanitizerInitModule$a q;

    static {
       MemorySanitizerInitModule.q = new MemorySanitizerInitModule$a(null);
    }
    public void MemorySanitizerInitModule(){
       super();
    }
    public void n0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemorySanitizerInitModule.class, "1")) {
          return;
       }
       a.p(p0, "event");
       e.g(MemorySanitizerInitModule$b.b, "LeakMonitorTask");
       return;
    }
}
