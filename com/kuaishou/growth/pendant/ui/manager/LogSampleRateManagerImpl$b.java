package com.kuaishou.growth.pendant.ui.manager.LogSampleRateManagerImpl$b;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.growth.pendant.ui.manager.a;
import java.lang.reflect.Type;
import el.a;
import trd.t0;

public final class LogSampleRateManagerImpl$b implements x	// class@0006f5
{
    public static final LogSampleRateManagerImpl$b b;

    static {
       LogSampleRateManagerImpl$b.b = new LogSampleRateManagerImpl$b();
    }
    public void LogSampleRateManagerImpl$b(){
       super();
    }
    public Object get(){
       Map map = PatchProxy.apply(null, this, LogSampleRateManagerImpl$b.class, "1");
       if (map != PatchProxyResult.class) {
       }else {
          map = a.t().getValue("pendantLogSample", new a().getType(), t0.z());
       }
       return map;
    }
}
