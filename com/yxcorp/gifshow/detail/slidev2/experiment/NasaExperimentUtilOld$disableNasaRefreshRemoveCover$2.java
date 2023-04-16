package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2 extends Lambda implements a	// class@00186d
{
    public static final NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2 INSTANCE;

    static {
       NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2.INSTANCE = new NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2();
    }
    public void NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$disableNasaRefreshRemoveCover$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disableNasaHotStartRefreshAdrRemoveCover", false);
    }
}
