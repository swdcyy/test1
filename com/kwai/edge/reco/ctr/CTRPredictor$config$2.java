package com.kwai.edge.reco.ctr.CTRPredictor$config$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig$a;

public final class CTRPredictor$config$2 extends Lambda implements a	// class@000d36
{
    public static final CTRPredictor$config$2 INSTANCE;

    static {
       CTRPredictor$config$2.INSTANCE = new CTRPredictor$config$2();
    }
    public void CTRPredictor$config$2(){
       super(0);
    }
    public final CtrPredictionRuntimeConfig invoke(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor$config$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrPredictionRuntimeConfig.c.a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
