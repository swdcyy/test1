package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$timeManagementTimeoutDuration$2;
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

public final class NasaExperimentUtilOld$timeManagementTimeoutDuration$2 extends Lambda implements a	// class@001894
{
    public static final NasaExperimentUtilOld$timeManagementTimeoutDuration$2 INSTANCE;

    static {
       NasaExperimentUtilOld$timeManagementTimeoutDuration$2.INSTANCE = new NasaExperimentUtilOld$timeManagementTimeoutDuration$2();
    }
    public void NasaExperimentUtilOld$timeManagementTimeoutDuration$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$timeManagementTimeoutDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("relaxTimeVideoTimeoutDuration", 5);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
