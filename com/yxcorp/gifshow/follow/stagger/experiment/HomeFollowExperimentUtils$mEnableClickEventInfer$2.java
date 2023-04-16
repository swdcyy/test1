package com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils$mEnableClickEventInfer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeFollowExperimentUtils$mEnableClickEventInfer$2 extends Lambda implements a	// class@00117d
{
    public static final HomeFollowExperimentUtils$mEnableClickEventInfer$2 INSTANCE;

    static {
       HomeFollowExperimentUtils$mEnableClickEventInfer$2.INSTANCE = new HomeFollowExperimentUtils$mEnableClickEventInfer$2();
    }
    public void HomeFollowExperimentUtils$mEnableClickEventInfer$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeFollowExperimentUtils$mEnableClickEventInfer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableClickEventInfer", false);
    }
}
