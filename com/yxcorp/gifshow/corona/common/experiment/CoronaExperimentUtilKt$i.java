package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$i;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$i implements x	// class@0011da
{
    public static final CoronaExperimentUtilKt$i b;

    static {
       CoronaExperimentUtilKt$i.b = new CoronaExperimentUtilKt$i();
    }
    public void CoronaExperimentUtilKt$i(){
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.apply(null, this, CoronaExperimentUtilKt$i.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          String str = "enableTvResponseCache";
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
