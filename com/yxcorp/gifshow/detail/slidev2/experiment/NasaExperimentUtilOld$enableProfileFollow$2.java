package com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtilOld$enableProfileFollow$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager;
import com.kwai.slide.play.detail.information.profilefollow.ProfileFollowManager$a;

public final class NasaExperimentUtilOld$enableProfileFollow$2 extends Lambda implements a	// class@00187a
{
    public static final NasaExperimentUtilOld$enableProfileFollow$2 INSTANCE;

    static {
       NasaExperimentUtilOld$enableProfileFollow$2.INSTANCE = new NasaExperimentUtilOld$enableProfileFollow$2();
    }
    public void NasaExperimentUtilOld$enableProfileFollow$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaExperimentUtilOld$enableProfileFollow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ProfileFollowManager.h.a();
    }
}
