package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$refreshWayBackBtnDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class NasaExperimentUtilOld$refreshWayBackBtnDuration$2 extends Lambda implements a	// class@00188b
{
    public static final NasaExperimentUtilOld$refreshWayBackBtnDuration$2 INSTANCE;

    static {
       NasaExperimentUtilOld$refreshWayBackBtnDuration$2.INSTANCE = new NasaExperimentUtilOld$refreshWayBackBtnDuration$2();
    }
    public void NasaExperimentUtilOld$refreshWayBackBtnDuration$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$refreshWayBackBtnDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("userRefreshButtonShowTime", 7);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
