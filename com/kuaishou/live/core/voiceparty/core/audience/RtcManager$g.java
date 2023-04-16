package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$g;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$d$b;
import ut7.h;

public final class RtcManager$g implements o	// class@0013ab
{
    public static final RtcManager$g a;

    static {
       RtcManager$g.a = new RtcManager$g();
    }
    public void RtcManager$g(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, RtcManager$g.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(p0.a, RtcManager$d$b.d);
       }
       return uoa;
    }
}
