package com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2$a;
import z0.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.team.frame.LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ut1.p;
import cu1.d;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkColorInfo;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ut1.n;

public final class LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2$a implements a	// class@001697
{
    public final LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2 a;

    public void LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2$a(LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2 p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2 obj = PatchProxy.applyOneRefs(p0, this, LiveMultiPkRenderTeamFrameViewModel$teamFrameColor$2$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a.$viewKey;
       LiveMultiPkColorInfo liveMultiPkC = null;
       LiveMultiPkColorInfo liveMultiPkC1 = PatchProxy.applyTwoRefs(obj, p0, liveMultiPkC, d.class, str);
       if (liveMultiPkC1 != patchProxyRe) {
       }else {
          a.p(obj, "teamId");
          a.p(p0, "viewConfig");
          p0 = p0.b().iterator();
          while (true) {
             if (p0.hasNext()) {
                n on = p0.next();
                if (a.g(on.c(), obj)) {
                   liveMultiPkC1 = on.b();
                }
             }else {
                liveMultiPkC1 = liveMultiPkC;
             }
          }
       }
       if (liveMultiPkC1 != null) {
          liveMultiPkC = liveMultiPkC1.startColor;
       }
       return liveMultiPkC;
    }
}
