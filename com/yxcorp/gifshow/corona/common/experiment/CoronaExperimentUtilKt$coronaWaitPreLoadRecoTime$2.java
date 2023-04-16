package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2 extends Lambda implements a	// class@0011d2
{
    public static final CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2.INSTANCE = new CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2();
    }
    public void CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("CORONA_WAIT_PRE_LOAD_RECO_TIME", 0x2710);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
