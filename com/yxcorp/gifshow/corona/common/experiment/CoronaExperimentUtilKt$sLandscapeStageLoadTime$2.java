package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeStageLoadTime$2;
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

public final class CoronaExperimentUtilKt$sLandscapeStageLoadTime$2 extends Lambda implements a	// class@0011e7
{
    public static final CoronaExperimentUtilKt$sLandscapeStageLoadTime$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sLandscapeStageLoadTime$2.INSTANCE = new CoronaExperimentUtilKt$sLandscapeStageLoadTime$2();
    }
    public void CoronaExperimentUtilKt$sLandscapeStageLoadTime$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$sLandscapeStageLoadTime$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("landscapeStageLoadDelayTime", 0);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
