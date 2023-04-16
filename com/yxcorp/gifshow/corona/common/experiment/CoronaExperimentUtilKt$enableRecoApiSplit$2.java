package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$enableRecoApiSplit$2;
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

public final class CoronaExperimentUtilKt$enableRecoApiSplit$2 extends Lambda implements a	// class@0011d6
{
    public static final CoronaExperimentUtilKt$enableRecoApiSplit$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$enableRecoApiSplit$2.INSTANCE = new CoronaExperimentUtilKt$enableRecoApiSplit$2();
    }
    public void CoronaExperimentUtilKt$enableRecoApiSplit$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$enableRecoApiSplit$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = b.b("enableCoronaRecoApiSpliet");
       b = false;
       if (i != 1) {
          if (i != 2) {
             b = a.t().d("enableCoronaRecoApiSpliet", b);
          }
       }else {
          b = true;
       }
       return b;
    }
}
