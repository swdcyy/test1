package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2 extends Lambda implements a	// class@001876
{
    public static final NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2.INSTANCE = new NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2();
    }
    public void NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enablePauseBroadcastAutoplay$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("pauseBroadcastAutoplay1");
    }
}
