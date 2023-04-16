package com.kwai.feature.api.feed.home.HomePageExperimentManager$enableFirstLiveStreamMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomePageExperimentManager$enableFirstLiveStreamMonitor$2 extends Lambda implements a	// class@000ee2
{
    public static final HomePageExperimentManager$enableFirstLiveStreamMonitor$2 INSTANCE;

    static {
       HomePageExperimentManager$enableFirstLiveStreamMonitor$2.INSTANCE = new HomePageExperimentManager$enableFirstLiveStreamMonitor$2();
    }
    public void HomePageExperimentManager$enableFirstLiveStreamMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomePageExperimentManager$enableFirstLiveStreamMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("launchOpt2022EnableFirstMonitor", false);
    }
}
