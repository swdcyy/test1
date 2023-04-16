package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$disablePlayTimeReport$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.b;
import com.kwai.sdk.switchconfig.a;

public final class CoronaExperimentUtilKt$disablePlayTimeReport$2 extends Lambda implements a	// class@0011d4
{
    public static final CoronaExperimentUtilKt$disablePlayTimeReport$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$disablePlayTimeReport$2.INSTANCE = new CoronaExperimentUtilKt$disablePlayTimeReport$2();
    }
    public void CoronaExperimentUtilKt$disablePlayTimeReport$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$disablePlayTimeReport$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = b.b("disablePlayReport");
       b = false;
       if (i != 1) {
          if (i != 2) {
             b = a.t().d("disablePlayReport", b);
          }
       }else {
          b = true;
       }
       return b;
    }
}
