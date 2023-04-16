package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$a;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareSuccess;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import mp2.d;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$e;
import ut7.h;

public final class KtvManager$buildWatchState$1$a implements o	// class@001425
{
    public static final KtvManager$buildWatchState$1$a a;

    static {
       KtvManager$buildWatchState$1$a.a = new KtvManager$buildWatchState$1$a();
    }
    public void KtvManager$buildWatchState$1$a(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, KtvManager$buildWatchState$1$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(p0.a(), KtvManager$e$e.d);
       }
       return uoa;
    }
}
