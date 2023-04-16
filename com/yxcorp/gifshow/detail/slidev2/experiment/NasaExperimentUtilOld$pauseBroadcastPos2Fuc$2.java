package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2;
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

public final class NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2 extends Lambda implements a	// class@001887
{
    public static final NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2 INSTANCE;

    static {
       NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2.INSTANCE = new NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2();
    }
    public void NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$pauseBroadcastPos2Fuc$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("pauseBroadcastFunction1");
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
