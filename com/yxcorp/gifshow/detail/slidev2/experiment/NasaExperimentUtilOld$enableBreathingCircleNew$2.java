package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableBreathingCircleNew$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtilOld$enableBreathingCircleNew$2 extends Lambda implements a	// class@001870
{
    public static final NasaExperimentUtilOld$enableBreathingCircleNew$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableBreathingCircleNew$2.INSTANCE = new NasaExperimentUtilOld$enableBreathingCircleNew$2();
    }
    public void NasaExperimentUtilOld$enableBreathingCircleNew$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableBreathingCircleNew$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("breathingCircleNew", true);
    }
}
