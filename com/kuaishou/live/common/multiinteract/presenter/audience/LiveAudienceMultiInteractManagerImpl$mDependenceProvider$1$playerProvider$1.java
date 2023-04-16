package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1;
import d02.a;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import kotlin.jvm.internal.a;
import ga1.e;
import msd.l;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewLocator$1;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewVisibilityListener$1;

public final class LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1 implements a	// class@0017fa
{
    public final LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1 a;

    public void LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1(LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1 p0){
       this.a = p0;
       super();
    }
    public LivePlayerController a(){
       LiveAudienceMultiInteractManagerImpl obj = PatchProxy.apply(null, this, LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.a.A;
       if (obj == null) {
          a.S("playerService");
       }
       LivePlayerController livePlayerCo = obj.Vc();
       a.o(livePlayerCo, "playerService.livePlayerController");
       return livePlayerCo;
    }
    public l b(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewLocator$1(this);
    }
    public l c(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1$playerViewVisibilityListener$1(this);
    }
}
