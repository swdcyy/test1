package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$a;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$a implements x	// class@0011cf
{
    public static final CoronaExperimentUtilKt$a b;

    static {
       CoronaExperimentUtilKt$a.b = new CoronaExperimentUtilKt$a();
    }
    public void CoronaExperimentUtilKt$a(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "ENABLE_CORONA_BIG_CARD_PRE_LOAD_RECO";
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
