package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$3$b;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareSuccess;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import mp2.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$e;
import ut7.h;

public final class KtvManager$buildWatchState$1$3$b implements o	// class@001423
{
    public static final KtvManager$buildWatchState$1$3$b a;

    static {
       KtvManager$buildWatchState$1$3$b.a = new KtvManager$buildWatchState$1$3$b();
    }
    public void KtvManager$buildWatchState$1$3$b(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, KtvManager$buildWatchState$1$3$b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(p0.a(), KtvManager$e$e.d);
       }
       return uoa;
    }
}
