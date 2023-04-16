package com.kwai.feature.api.feed.home.HomePageExperimentManager;
import com.kwai.feature.api.feed.home.HomePageExperimentManager$enableCheckEndLiveStatus$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.feed.home.HomePageExperimentManager$enableFirstLiveStreamMonitor$2;
import com.kwai.feature.api.feed.home.HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2;
import com.kwai.feature.api.feed.home.HomePageExperimentManager$enableBlockPageshowBySplash$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class HomePageExperimentManager	// class@000ee4
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final HomePageExperimentManager e;

    static {
       HomePageExperimentManager.e = new HomePageExperimentManager();
       HomePageExperimentManager.a = s.c(HomePageExperimentManager$enableCheckEndLiveStatus$2.INSTANCE);
       HomePageExperimentManager.b = s.c(HomePageExperimentManager$enableFirstLiveStreamMonitor$2.INSTANCE);
       HomePageExperimentManager.c = s.c(HomePageExperimentManager$enableHomeRemoveDuplicatePhoto$2.INSTANCE);
       HomePageExperimentManager.d = s.c(HomePageExperimentManager$enableBlockPageshowBySplash$2.INSTANCE);
    }
    public void HomePageExperimentManager(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, HomePageExperimentManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = HomePageExperimentManager.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, HomePageExperimentManager.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = HomePageExperimentManager.c.getValue();
       }
       return obj.booleanValue();
    }
}
