package com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$Companion$config$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class CtrPredictionRuntimeConfig$Companion$config$2 extends Lambda implements a	// class@000d4d
{
    public static final CtrPredictionRuntimeConfig$Companion$config$2 INSTANCE;

    static {
       CtrPredictionRuntimeConfig$Companion$config$2.INSTANCE = new CtrPredictionRuntimeConfig$Companion$config$2();
    }
    public void CtrPredictionRuntimeConfig$Companion$config$2(){
       super(0);
    }
    public final CtrPredictionRuntimeConfig invoke(){
       Object obj = PatchProxy.apply(null, this, CtrPredictionRuntimeConfig$Companion$config$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("pageCtrPredictionRuntimeConfig", CtrPredictionRuntimeConfig.class, CtrPredictionRuntimeConfig.a);
    }
    public Object invoke(){
       return this.invoke();
    }
}
