package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$showSlideGPSDialogInterval$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class NasaExperimentUtilOld$showSlideGPSDialogInterval$2 extends Lambda implements a	// class@00188e
{
    public static final NasaExperimentUtilOld$showSlideGPSDialogInterval$2 INSTANCE;

    static {
       NasaExperimentUtilOld$showSlideGPSDialogInterval$2.INSTANCE = new NasaExperimentUtilOld$showSlideGPSDialogInterval$2();
    }
    public void NasaExperimentUtilOld$showSlideGPSDialogInterval$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$showSlideGPSDialogInterval$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("showSlideGPSDialogInterval", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
