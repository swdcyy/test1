package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$foregroundSwitchTabDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class HomeExperimentManager$foregroundSwitchTabDuration$2 extends Lambda implements a	// class@0016b4
{
    public static final HomeExperimentManager$foregroundSwitchTabDuration$2 INSTANCE;

    static {
       HomeExperimentManager$foregroundSwitchTabDuration$2.INSTANCE = new HomeExperimentManager$foregroundSwitchTabDuration$2();
    }
    public void HomeExperimentManager$foregroundSwitchTabDuration$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, HomeExperimentManager$foregroundSwitchTabDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (a.t().b("enableBackTime", 300) * 1000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
