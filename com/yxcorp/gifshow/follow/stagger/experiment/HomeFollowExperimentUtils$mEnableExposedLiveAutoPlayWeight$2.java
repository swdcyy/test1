package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2 extends Lambda implements a	// class@00117e
{
    public static final HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2 INSTANCE;

    static {
       HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2.INSTANCE = new HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2();
    }
    public void HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeFollowExperimentUtils$mEnableExposedLiveAutoPlayWeight$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableExposedLiveAutoPlayWeight", false);
    }
}
