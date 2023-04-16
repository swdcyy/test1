package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$j;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$j implements x	// class@0011db
{
    public static final CoronaExperimentUtilKt$j b;

    static {
       CoronaExperimentUtilKt$j.b = new CoronaExperimentUtilKt$j();
    }
    public void CoronaExperimentUtilKt$j(){
       super();
    }
    public Object get(){
       Long longx = PatchProxy.apply(null, this, CoronaExperimentUtilKt$j.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          String str = "CoronaTvDetailPageListPreloadStrategy";
          int i = b.b(str);
          if (i != 1) {
             if (i != 2) {
                longx = (i != 3)? Long.valueOf(a.t().b(str, 0)): Long.valueOf(2);
             }else {
                longx = Long.valueOf(1);
             }
          }else {
             longx = Long.valueOf(0);
          }
       }
       return longx;
    }
}
