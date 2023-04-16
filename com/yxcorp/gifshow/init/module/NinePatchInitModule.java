package com.yxcorp.gifshow.init.module.NinePatchInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.kwai.framework.logger.LogManagerInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import b76.a;
import com.yxcorp.gifshow.init.module.k0;
import ua.anatolii.graphics.ninepatch.a;

public class NinePatchInitModule extends TTIInitModule	// class@001990
{
    public static final int q;

    public void NinePatchInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, NinePatchInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{PerformanceMonitorInitModule.class,LogManagerInitModule.class};
       PatchProxy.onMethodExit(NinePatchInitModule.class, "3");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, NinePatchInitModule.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, NinePatchInitModule.class, "1")) {
          a.a = k0.a;
          PatchProxy.onMethodExit(NinePatchInitModule.class, "1");
       }
       PatchProxy.onMethodExit(NinePatchInitModule.class, "2");
       return;
    }
}
