package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$hideMusicLabel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaExperimentUtilOld$hideMusicLabel$2 extends Lambda implements a	// class@001884
{
    public static final NasaExperimentUtilOld$hideMusicLabel$2 INSTANCE;

    static {
       NasaExperimentUtilOld$hideMusicLabel$2.INSTANCE = new NasaExperimentUtilOld$hideMusicLabel$2();
    }
    public void NasaExperimentUtilOld$hideMusicLabel$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$hideMusicLabel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("offline_music_label");
    }
}
