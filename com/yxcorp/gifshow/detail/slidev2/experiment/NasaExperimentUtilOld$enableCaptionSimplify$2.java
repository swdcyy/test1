package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableCaptionSimplify$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtilOld$enableCaptionSimplify$2 extends Lambda implements a	// class@001871
{
    public static final NasaExperimentUtilOld$enableCaptionSimplify$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableCaptionSimplify$2.INSTANCE = new NasaExperimentUtilOld$enableCaptionSimplify$2();
    }
    public void NasaExperimentUtilOld$enableCaptionSimplify$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableCaptionSimplify$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (a.t().a("enableCaptionSimplify", i) == 1) {
          i = true;
       }
       return i;
    }
}
