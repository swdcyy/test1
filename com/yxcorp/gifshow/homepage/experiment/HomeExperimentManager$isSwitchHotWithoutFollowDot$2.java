package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$isSwitchHotWithoutFollowDot$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeExperimentManager$isSwitchHotWithoutFollowDot$2 extends Lambda implements a	// class@0016b6
{
    public static final HomeExperimentManager$isSwitchHotWithoutFollowDot$2 INSTANCE;

    static {
       HomeExperimentManager$isSwitchHotWithoutFollowDot$2.INSTANCE = new HomeExperimentManager$isSwitchHotWithoutFollowDot$2();
    }
    public void HomeExperimentManager$isSwitchHotWithoutFollowDot$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$isSwitchHotWithoutFollowDot$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.t().a("enableBackSelectionHot", 4) == 4)? true: false;
       return b;
    }
}
