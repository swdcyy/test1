package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2 extends Lambda implements a	// class@00187d
{
    public static final NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2.INSTANCE = new NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2();
    }
    public void NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableShowNasaLocationPermissionDialog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("location_authorized_card_app");
    }
}
