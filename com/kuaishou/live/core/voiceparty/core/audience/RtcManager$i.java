package com.kuaishou.live.core.voiceparty.core.audience.RtcManager$i;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$PrepareAryaFail;
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

public final class RtcManager$i implements o	// class@0013ad
{
    public static final RtcManager$i a;

    static {
       RtcManager$i.a = new RtcManager$i();
    }
    public void RtcManager$i(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, RtcManager$i.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, RtcManager$d$a.d);
       }
       return uoa;
    }
}
