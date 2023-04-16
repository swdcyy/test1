package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sEnableShieldSearchApp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.b;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class CoronaExperimentUtilKt$sEnableShieldSearchApp$2 extends Lambda implements a	// class@0011e3
{
    public static final CoronaExperimentUtilKt$sEnableShieldSearchApp$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sEnableShieldSearchApp$2.INSTANCE = new CoronaExperimentUtilKt$sEnableShieldSearchApp$2();
    }
    public void CoronaExperimentUtilKt$sEnableShieldSearchApp$2(){
       super(0);
    }
    public final int invoke(){
       String obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$sEnableShieldSearchApp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = "enable_shield_search_app";
       int i = b.b(obj);
       int i1 = 1;
       if (i == i1) {
          return i1;
       }
       if (i != 2) {
          return f.e(obj);
       }
       return 0;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
