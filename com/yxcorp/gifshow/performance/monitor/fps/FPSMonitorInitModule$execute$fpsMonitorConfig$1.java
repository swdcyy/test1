package com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$execute$fpsMonitorConfig$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import n66.c;
import java.util.concurrent.ConcurrentHashMap;

public final class FPSMonitorInitModule$execute$fpsMonitorConfig$1 extends Lambda implements l	// class@0012b2
{
    public static final FPSMonitorInitModule$execute$fpsMonitorConfig$1 INSTANCE;

    static {
       FPSMonitorInitModule$execute$fpsMonitorConfig$1.INSTANCE = new FPSMonitorInitModule$execute$fpsMonitorConfig$1();
    }
    public void FPSMonitorInitModule$execute$fpsMonitorConfig$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, FPSMonitorInitModule$execute$fpsMonitorConfig$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "scene");
          obj = c.a.get(p0);
       }
       return obj;
    }
}
