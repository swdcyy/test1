package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1;
import d02.b;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import msd.a;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$commonEngineSupplier$1;
import com.kuaishou.live.common.core.component.livestage.a;
import d02.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1;

public final class LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1 implements b	// class@0017fb
{
    public final LiveAudienceMultiInteractManagerImpl a;

    public void LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1(LiveAudienceMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public a a(){
       return LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$commonEngineSupplier$1.INSTANCE;
    }
    public a b(){
       return this.a.I;
    }
    public a c(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveAudienceMultiInteractManagerImpl$mDependenceProvider$1$playerProvider$1(this);
    }
}
