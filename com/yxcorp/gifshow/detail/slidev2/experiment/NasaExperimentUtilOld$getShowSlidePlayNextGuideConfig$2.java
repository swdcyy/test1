package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.homepage.SlidePlayNextGuideConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2 extends Lambda implements a	// class@001883
{
    public static final NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2 INSTANCE;

    static {
       NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2.INSTANCE = new NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2();
    }
    public void NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2(){
       super(0);
    }
    public final SlidePlayNextGuideConfig invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$getShowSlidePlayNextGuideConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("displayFrequencyOfSlideUpGuideBubble", SlidePlayNextGuideConfig.class, new SlidePlayNextGuideConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
