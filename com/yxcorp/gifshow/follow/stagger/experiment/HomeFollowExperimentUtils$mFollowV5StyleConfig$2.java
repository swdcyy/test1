package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mFollowV5StyleConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.social.followStagger.model.FollowV5StyleConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class HomeFollowExperimentUtils$mFollowV5StyleConfig$2 extends Lambda implements a	// class@001182
{
    public static final HomeFollowExperimentUtils$mFollowV5StyleConfig$2 INSTANCE;

    static {
       HomeFollowExperimentUtils$mFollowV5StyleConfig$2.INSTANCE = new HomeFollowExperimentUtils$mFollowV5StyleConfig$2();
    }
    public void HomeFollowExperimentUtils$mFollowV5StyleConfig$2(){
       super(0);
    }
    public final FollowV5StyleConfig invoke(){
       Object obj = PatchProxy.apply(null, this, HomeFollowExperimentUtils$mFollowV5StyleConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("followNewV4Config", FollowV5StyleConfig.class, new FollowV5StyleConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
