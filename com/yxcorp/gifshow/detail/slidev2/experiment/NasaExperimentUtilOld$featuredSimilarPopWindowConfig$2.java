package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2 extends Lambda implements a	// class@001881
{
    public static final NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2 INSTANCE;

    static {
       NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2.INSTANCE = new NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2();
    }
    public void NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2(){
       super(0);
    }
    public final JsonObject invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$featuredSimilarPopWindowConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("featuredSimilarPopWindowConfig", JsonObject.class, null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
