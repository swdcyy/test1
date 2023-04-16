package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$getOcrShowConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import f3a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class NasaExperimentUtilOld$getOcrShowConfig$2 extends Lambda implements a	// class@001882
{
    public static final NasaExperimentUtilOld$getOcrShowConfig$2 INSTANCE;

    static {
       NasaExperimentUtilOld$getOcrShowConfig$2.INSTANCE = new NasaExperimentUtilOld$getOcrShowConfig$2();
    }
    public void NasaExperimentUtilOld$getOcrShowConfig$2(){
       super(0);
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$getOcrShowConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("imageOCRButtonFrequencyControl", c.class, new c());
    }
    public Object invoke(){
       return this.invoke();
    }
}
