package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$k;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$EnterRoomFailEvent;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$d$a;
import ut7.h;

public final class RtcManager$k implements o	// class@0013af
{
    public static final RtcManager$k a;

    static {
       RtcManager$k.a = new RtcManager$k();
    }
    public void RtcManager$k(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, RtcManager$k.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, RtcManager$d$a.d);
       }
       return uoa;
    }
}
