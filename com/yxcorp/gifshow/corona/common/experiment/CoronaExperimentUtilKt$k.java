package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$k;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$k implements x	// class@0011dc
{
    public static final CoronaExperimentUtilKt$k b;

    static {
       CoronaExperimentUtilKt$k.b = new CoronaExperimentUtilKt$k();
    }
    public void CoronaExperimentUtilKt$k(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$k.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "enableTvPlayerPreloadInit";
          int i = b.b(str);
          if (i != 1) {
             uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, false)): Boolean.FALSE;
          }else {
             uBoolean = Boolean.TRUE;
          }
       }
       return uBoolean;
    }
}
