package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableAllPhotosRefresh$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaExperimentUtilOld$enableAllPhotosRefresh$2 extends Lambda implements a	// class@00186f
{
    public static final NasaExperimentUtilOld$enableAllPhotosRefresh$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableAllPhotosRefresh$2.INSTANCE = new NasaExperimentUtilOld$enableAllPhotosRefresh$2();
    }
    public void NasaExperimentUtilOld$enableAllPhotosRefresh$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableAllPhotosRefresh$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableAllPhotosRefresh");
    }
}
