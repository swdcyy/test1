package com.kuaishou.live.common.core.component.trigger.LiveActionTriggerManagerImpl;
import py1.a;
import lp3.a;
import com.kuaishou.live.common.core.component.trigger.LiveActionTriggerManagerImpl$trigger$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveActionTriggerManagerImpl extends a implements a	// class@0017ba
{
    public final p d;

    public void LiveActionTriggerManagerImpl(){
       super();
       this.d = s.c(LiveActionTriggerManagerImpl$trigger$2.INSTANCE);
    }
    public LiveActionTrigger qe(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveActionTriggerManagerImpl liveActionTr = LiveActionTriggerManagerImpl.class;
       Object obj = PatchProxy.apply(null, this, liveActionTr, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, liveActionTr, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.d.getValue();
       }
       return obj1;
    }
}
