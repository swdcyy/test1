package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$b;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$b implements x	// class@0011d0
{
    public static final CoronaExperimentUtilKt$b b;

    static {
       CoronaExperimentUtilKt$b.b = new CoronaExperimentUtilKt$b();
    }
    public void CoronaExperimentUtilKt$b(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$b.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "coronaDetailAsyncOptmization";
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
