package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableHotRefreshWayBack$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaExperimentUtilOld$enableHotRefreshWayBack$2 extends Lambda implements a	// class@001874
{
    public static final NasaExperimentUtilOld$enableHotRefreshWayBack$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableHotRefreshWayBack$2.INSTANCE = new NasaExperimentUtilOld$enableHotRefreshWayBack$2();
    }
    public void NasaExperimentUtilOld$enableHotRefreshWayBack$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableHotRefreshWayBack$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("hotRefreshWayBack");
    }
}
