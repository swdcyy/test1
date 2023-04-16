package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$d;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PlayEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import ut7.h;
import nsd.u;

public final class TheaterManager$d implements o	// class@00146f
{
    public static final TheaterManager$d a;

    static {
       TheaterManager$d.a = new TheaterManager$d();
    }
    public void TheaterManager$d(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, TheaterManager$d.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(p0.a, null, 2, null);
       }
       return uoa;
    }
}
