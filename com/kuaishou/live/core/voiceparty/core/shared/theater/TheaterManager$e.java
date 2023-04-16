package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$e;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$NoOrderEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$c$a;
import ut7.h;

public final class TheaterManager$e implements o	// class@001470
{
    public static final TheaterManager$e a;

    static {
       TheaterManager$e.a = new TheaterManager$e();
    }
    public void TheaterManager$e(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, TheaterManager$e.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, TheaterManager$c$a.d);
       }
       return uoa;
    }
}
