package com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayExperimentManager;
import com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.component.uiconfig.homeslideplay.HomeSlidePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HomeSlidePlayExperimentManager	// class@000bdd
{
    public static final p a;
    public static final HomeSlidePlayExperimentManager b;

    static {
       HomeSlidePlayExperimentManager.b = new HomeSlidePlayExperimentManager();
       HomeSlidePlayExperimentManager.a = s.c(HomeSlidePlayExperimentManager$mHomeSlidePlayConfig$2.INSTANCE);
    }
    public void HomeSlidePlayExperimentManager(){
       super();
    }
    public final HomeSlidePlayConfig a(){
       Object obj = PatchProxy.apply(null, this, HomeSlidePlayExperimentManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomeSlidePlayExperimentManager.a.getValue();
    }
}
