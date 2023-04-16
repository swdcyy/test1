package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$captionUnFoldStyle$2;
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

public final class NasaExperimentUtilOld$captionUnFoldStyle$2 extends Lambda implements a	// class@00186a
{
    public static final NasaExperimentUtilOld$captionUnFoldStyle$2 INSTANCE;

    static {
       NasaExperimentUtilOld$captionUnFoldStyle$2.INSTANCE = new NasaExperimentUtilOld$captionUnFoldStyle$2();
    }
    public void NasaExperimentUtilOld$captionUnFoldStyle$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$captionUnFoldStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("captionUnfold", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
