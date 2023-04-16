package com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$execute$fpsMonitorConfig$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import n66.c;
import java.util.List;

public final class FPSMonitorInitModule$execute$fpsMonitorConfig$2 extends Lambda implements l	// class@0012b3
{
    public static final FPSMonitorInitModule$execute$fpsMonitorConfig$2 INSTANCE;

    static {
       FPSMonitorInitModule$execute$fpsMonitorConfig$2.INSTANCE = new FPSMonitorInitModule$execute$fpsMonitorConfig$2();
    }
    public void FPSMonitorInitModule$execute$fpsMonitorConfig$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, FPSMonitorInitModule$execute$fpsMonitorConfig$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       obj = PatchProxy.applyOneRefs(p0, null, c.class, "5");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "scene");
          b = c.b.contains(p0);
       }
       return b;
    }
}
