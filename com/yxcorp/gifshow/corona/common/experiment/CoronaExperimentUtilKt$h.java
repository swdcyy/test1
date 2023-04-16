package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$h;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$h implements x	// class@0011d9
{
    public static final CoronaExperimentUtilKt$h b;

    static {
       CoronaExperimentUtilKt$h.b = new CoronaExperimentUtilKt$h();
    }
    public void CoronaExperimentUtilKt$h(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$h.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "enableTvFeedListPreload";
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
