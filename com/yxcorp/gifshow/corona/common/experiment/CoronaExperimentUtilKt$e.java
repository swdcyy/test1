package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$e;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$e implements x	// class@0011d5
{
    public static final CoronaExperimentUtilKt$e b;

    static {
       CoronaExperimentUtilKt$e.b = new CoronaExperimentUtilKt$e();
    }
    public void CoronaExperimentUtilKt$e(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$e.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "enableDetailEpisodeListPreload";
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
