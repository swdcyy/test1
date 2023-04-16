package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$h;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$ExitRoomEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import ut7.h;
import nsd.u;
import ut7.i$b;

public final class RtcManager$h implements o	// class@0013ac
{
    public final RtcManager a;

    public void RtcManager$h(RtcManager p0){
       this.a = p0;
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, RtcManager$h.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          p0 = (p0.b == this.a.f)? new i$a(l1.a, null, 2, null): new i$b();
          uoa = p0;
       }
       return uoa;
    }
}
