package com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$isSwitchHotWithoutFollowDot$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$isSwitchToFollow$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$foregroundSwitchTabDuration$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$channelFollowBaseId$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableSlideMonitorIndexJump$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableShowFeatureBottomGuideDialog$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableHotPreloadShowBeforeNetwork$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$findLiveGapLimit$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableFindPresenterAsync$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableSideBarRemoveBottom$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableClickRemoveMenuPoint$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableHomeMenuMixNoticeMessageOpt$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$enableShowSettingPrivacyClip$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$showPrivacyClipDialogIntervalTime$2;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager$settingPrivacyClipIntoEffect$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.kcube.TabIdentifier;

public final class HomeExperimentManager	// class@0016ba
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
    public static final p l;
    public static final p m;
    public static final p n;
    public static final p o;
    public static final p p;
    public static final HomeExperimentManager q;

    static {
       HomeExperimentManager.q = new HomeExperimentManager();
       HomeExperimentManager.a = s.c(HomeExperimentManager$foregroundSwitchTabWhenHomeChannels$2.INSTANCE);
       HomeExperimentManager.b = s.c(HomeExperimentManager$isSwitchHotWithoutFollowDot$2.INSTANCE);
       HomeExperimentManager.c = s.c(HomeExperimentManager$isSwitchToFollow$2.INSTANCE);
       HomeExperimentManager.d = s.c(HomeExperimentManager$foregroundSwitchTabDuration$2.INSTANCE);
       HomeExperimentManager.e = s.c(HomeExperimentManager$channelFollowBaseId$2.INSTANCE);
       HomeExperimentManager.f = s.c(HomeExperimentManager$enableSlideMonitorIndexJump$2.INSTANCE);
       HomeExperimentManager.g = s.c(HomeExperimentManager$enableShowFeatureBottomGuideDialog$2.INSTANCE);
       HomeExperimentManager.h = s.c(HomeExperimentManager$enableHotPreloadShowBeforeNetwork$2.INSTANCE);
       HomeExperimentManager.i = s.c(HomeExperimentManager$findLiveGapLimit$2.INSTANCE);
       HomeExperimentManager.j = s.c(HomeExperimentManager$enableFindPresenterAsync$2.INSTANCE);
       HomeExperimentManager.k = s.c(HomeExperimentManager$enableSideBarRemoveBottom$2.INSTANCE);
       HomeExperimentManager.l = s.c(HomeExperimentManager$enableClickRemoveMenuPoint$2.INSTANCE);
       HomeExperimentManager.m = s.c(HomeExperimentManager$enableHomeMenuMixNoticeMessageOpt$2.INSTANCE);
       HomeExperimentManager.n = s.c(HomeExperimentManager$enableShowSettingPrivacyClip$2.INSTANCE);
       HomeExperimentManager.o = s.c(HomeExperimentManager$showPrivacyClipDialogIntervalTime$2.INSTANCE);
       HomeExperimentManager.p = s.c(HomeExperimentManager$settingPrivacyClipIntoEffect$2.INSTANCE);
    }
    public void HomeExperimentManager(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, HomeExperimentManager.class, "11");
       if (obj == PatchProxyResult.class) {
          obj = HomeExperimentManager.k.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, HomeExperimentManager.class, "6");
       if (obj == PatchProxyResult.class) {
          obj = HomeExperimentManager.f.getValue();
       }
       return obj.booleanValue();
    }
    public static final TabIdentifier c(){
       Object obj = PatchProxy.apply(null, null, HomeExperimentManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HomeExperimentManager.a.getValue();
    }
}
