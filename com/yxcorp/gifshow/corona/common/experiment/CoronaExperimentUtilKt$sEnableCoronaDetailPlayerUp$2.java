package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.b;
import com.kwai.framework.abtest.f;

public final class CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2 extends Lambda implements a	// class@0011e1
{
    public static final CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2 INSTANCE;

    static {
       CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2.INSTANCE = new CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2();
    }
    public void CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       String obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "enableCoronaDetailPlayerUp";
       int i = b.b(obj);
       b = true;
       if (i == b) {
          return b;
       }
       if (i != 2) {
          return f.a(obj);
       }
       return false;
    }
}
