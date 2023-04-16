package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$m;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$m implements x	// class@0011de
{
    public static final CoronaExperimentUtilKt$m b;

    static {
       CoronaExperimentUtilKt$m.b = new CoronaExperimentUtilKt$m();
    }
    public void CoronaExperimentUtilKt$m(){
       super();
    }
    public Object get(){
       Long longx = PatchProxy.apply(null, this, CoronaExperimentUtilKt$m.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          String str = "CoronaTvTabPageListPreloadInterval";
          int i = b.b(str);
          if (i != 1) {
             longx = (i != 2)? Long.valueOf(a.t().b(str, 2)): Long.valueOf(3);
          }else {
             longx = Long.valueOf(2);
          }
       }
       return longx;
    }
}
