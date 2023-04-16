package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2 extends Lambda implements a	// class@0011e4
{
    public static final CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2.INSTANCE = new CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2();
    }
    public void CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2(){
       super(0);
    }
    public final long invoke(){
       String obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = "landscapeFpsMonitorDuration";
       int i = b.b(obj);
       if (i == 1) {
          return 1;
       }
       if (i == 2) {
          return 3;
       }
       if (i != 3) {
          return a.t().b(obj, 3);
       }
       return 5;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
