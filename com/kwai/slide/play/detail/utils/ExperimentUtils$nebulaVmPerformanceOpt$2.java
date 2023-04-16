package com.kwai.slide.play.detail.utils.ExperimentUtils$nebulaVmPerformanceOpt$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class ExperimentUtils$nebulaVmPerformanceOpt$2 extends Lambda implements a	// class@00187e
{
    public static final ExperimentUtils$nebulaVmPerformanceOpt$2 INSTANCE;

    static {
       ExperimentUtils$nebulaVmPerformanceOpt$2.INSTANCE = new ExperimentUtils$nebulaVmPerformanceOpt$2();
    }
    public void ExperimentUtils$nebulaVmPerformanceOpt$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ExperimentUtils$nebulaVmPerformanceOpt$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("nebulaVmPerformanceOpt", false);
    }
}
