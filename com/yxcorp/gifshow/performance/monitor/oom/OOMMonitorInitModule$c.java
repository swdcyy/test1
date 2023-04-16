package com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule$c;
import ch7.i$c;
import java.lang.Object;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yf7.h;
import twb.c;
import java.lang.Enum;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import p5.f;

public final class OOMMonitorInitModule$c implements i$c	// class@000e9a
{
    public static final OOMMonitorInitModule$c a;

    static {
       OOMMonitorInitModule$c.a = new OOMMonitorInitModule$c();
    }
    public void OOMMonitorInitModule$c(){
       super();
    }
    public final void a(LowMemoryLevel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OOMMonitorInitModule$c.class, "1")) {
          return;
       }
       h.d("OOMMonitorInitModule", "LeakFix.onLowMemory\(\) | Level = "+p0);
       if (p0 != null) {
          int i = c.a[p0.ordinal()];
          if (i == 1 || (i == 2 || i == 3)) {
             Fresco.getImagePipeline().clearMemoryCaches();
             f.c().a();
          }
       }
       return;
    }
}
