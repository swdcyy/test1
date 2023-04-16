package com.kwai.edge.reco.ctr.CtrEnvLightMonitor$config$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$a;

public final class CtrEnvLightMonitor$config$2 extends Lambda implements a	// class@000d42
{
    public static final CtrEnvLightMonitor$config$2 INSTANCE;

    static {
       CtrEnvLightMonitor$config$2.INSTANCE = new CtrEnvLightMonitor$config$2();
    }
    public void CtrEnvLightMonitor$config$2(){
       super(0);
    }
    public final CtrPredictionRuntimeConfig invoke(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor$config$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrPredictionRuntimeConfig.c.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
