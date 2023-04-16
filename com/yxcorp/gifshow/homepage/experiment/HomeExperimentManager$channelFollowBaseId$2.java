package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$channelFollowBaseId$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class HomeExperimentManager$channelFollowBaseId$2 extends Lambda implements a	// class@0016aa
{
    public static final HomeExperimentManager$channelFollowBaseId$2 INSTANCE;

    static {
       HomeExperimentManager$channelFollowBaseId$2.INSTANCE = new HomeExperimentManager$channelFollowBaseId$2();
    }
    public void HomeExperimentManager$channelFollowBaseId$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$channelFollowBaseId$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("channelFollowBaseID", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
