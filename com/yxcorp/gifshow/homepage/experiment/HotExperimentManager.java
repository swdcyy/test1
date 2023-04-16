package com.yxcorp.gifshow.homepage.experiment.HotExperimentManager;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableHotChangeTabRefresh$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableEveInRerank$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableHotPreloadShowBeforeNetwork$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$findLiveGapLimit$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableFindNewCache$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$findNewCacheExpiredMinute$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableFindSecondFloorTopicSquare$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableHotCardViewPreInflate$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$findTkPreLoad$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableFindRefreshFailedFix$2;
import com.yxcorp.gifshow.homepage.experiment.HotExperimentManager$enableFindNewCacheReport$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class HotExperimentManager	// class@0016c9
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final HotExperimentManager l;

    static {
       HotExperimentManager.l = new HotExperimentManager();
       HotExperimentManager.a = s.c(HotExperimentManager$enableHotChangeTabRefresh$2.INSTANCE);
       HotExperimentManager.b = s.c(HotExperimentManager$enableEveInRerank$2.INSTANCE);
       HotExperimentManager.c = s.c(HotExperimentManager$enableHotPreloadShowBeforeNetwork$2.INSTANCE);
       HotExperimentManager.d = s.c(HotExperimentManager$findLiveGapLimit$2.INSTANCE);
       HotExperimentManager.e = s.c(HotExperimentManager$enableFindNewCache$2.INSTANCE);
       HotExperimentManager.f = s.c(HotExperimentManager$findNewCacheExpiredMinute$2.INSTANCE);
       HotExperimentManager.g = s.c(HotExperimentManager$enableFindSecondFloorTopicSquare$2.INSTANCE);
       HotExperimentManager.h = s.c(HotExperimentManager$enableHotCardViewPreInflate$2.INSTANCE);
       HotExperimentManager.i = s.c(HotExperimentManager$findTkPreLoad$2.INSTANCE);
       HotExperimentManager.j = s.c(HotExperimentManager$enableFindRefreshFailedFix$2.INSTANCE);
       HotExperimentManager.k = s.c(HotExperimentManager$enableFindNewCacheReport$2.INSTANCE);
    }
    public void HotExperimentManager(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, HotExperimentManager.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = HotExperimentManager.e.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, HotExperimentManager.class, "7");
       if (obj == PatchProxyResult.class) {
          obj = HotExperimentManager.g.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, HotExperimentManager.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = HotExperimentManager.a.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, HotExperimentManager.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = HotExperimentManager.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final int e(){
       Object obj = PatchProxy.apply(null, null, HotExperimentManager.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = HotExperimentManager.d.getValue();
       }
       return obj.intValue();
    }
}
