package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$f;
import xz1.b$e;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import java.lang.Object;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import xz1.e;
import z1.a;
import oh3.a;

public final class LiveInteractStateManager$f implements b$e	// class@0017ec
{
    public final LiveInteractStateManager a;

    public void LiveInteractStateManager$f(LiveInteractStateManager p0){
       this.a = p0;
       super();
    }
    public void a(LiveInteractState p0,LiveInteractState p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveInteractStateManager$f.class, "1")) {
          return;
       }
       a.p(p0, "fromState");
       a.p(p1, "toState");
       LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
       lIVE_MULTI_I.appendTag("LiveInteractStateManager");
       b.T(lIVE_MULTI_I, "onStateChange", "fromState", p0, "toState", p1);
       LiveInteractStateManager$f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p1, ta, LiveInteractStateManager.class, "6")) {
          ta.Q(new e(p1));
       }
       return;
    }
}
