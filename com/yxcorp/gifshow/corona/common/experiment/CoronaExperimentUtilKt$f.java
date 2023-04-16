package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$f;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$f implements x	// class@0011d7
{
    public static final CoronaExperimentUtilKt$f b;

    static {
       CoronaExperimentUtilKt$f.b = new CoronaExperimentUtilKt$f();
    }
    public void CoronaExperimentUtilKt$f(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$f.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "enableCoronaInstreamAd";
          int i = b.b(str);
          if (i != 1) {
             uBoolean = (i != 2)? Boolean.valueOf(a.t().d(str, true)): Boolean.FALSE;
          }else {
             uBoolean = Boolean.TRUE;
          }
       }
       return uBoolean;
    }
}
