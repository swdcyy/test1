package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$f;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$PrepareFailed;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import qrd.l1;
import ut7.h;
import nsd.u;

public final class TheaterManager$f implements o	// class@001471
{
    public static final TheaterManager$f a;

    static {
       TheaterManager$f.a = new TheaterManager$f();
    }
    public void TheaterManager$f(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, TheaterManager$f.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, null, 2, null);
       }
       return uoa;
    }
}
