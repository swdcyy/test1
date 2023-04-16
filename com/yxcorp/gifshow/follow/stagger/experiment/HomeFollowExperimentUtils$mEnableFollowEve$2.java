package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableFollowEve$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeFollowExperimentUtils$mEnableFollowEve$2 extends Lambda implements a	// class@00117f
{
    public static final HomeFollowExperimentUtils$mEnableFollowEve$2 INSTANCE;

    static {
       HomeFollowExperimentUtils$mEnableFollowEve$2.INSTANCE = new HomeFollowExperimentUtils$mEnableFollowEve$2();
    }
    public void HomeFollowExperimentUtils$mEnableFollowEve$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeFollowExperimentUtils$mEnableFollowEve$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableFollowEve", false);
    }
}
