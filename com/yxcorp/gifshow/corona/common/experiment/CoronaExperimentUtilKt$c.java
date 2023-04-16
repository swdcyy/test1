package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$c;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$c implements x	// class@0011d1
{
    public static final CoronaExperimentUtilKt$c b;

    static {
       CoronaExperimentUtilKt$c.b = new CoronaExperimentUtilKt$c();
    }
    public void CoronaExperimentUtilKt$c(){
       super();
    }
    public Object get(){
       Long longx = PatchProxy.apply(null, this, CoronaExperimentUtilKt$c.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          String str = "CoronaTvTabPreloadPageListValidTime";
          int i = b.b(str);
          if (i != 1) {
             if (i != 2) {
                longx = (i != 3)? Long.valueOf(a.t().b(str, 0x5460)): Long.valueOf(60);
             }else {
                longx = Long.valueOf(300);
             }
          }else {
             longx = Long.valueOf(0x5460);
          }
       }
       return longx;
    }
}
