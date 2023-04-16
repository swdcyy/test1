package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildSingState$1$a;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvSingPrepareSuccess;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$e$b;
import ut7.h;

public final class KtvManager$buildSingState$1$a implements o	// class@001418
{
    public static final KtvManager$buildSingState$1$a a;

    static {
       KtvManager$buildSingState$1$a.a = new KtvManager$buildSingState$1$a();
    }
    public void KtvManager$buildSingState$1$a(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, KtvManager$buildSingState$1$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(p0.a, KtvManager$e$b.d);
       }
       return uoa;
    }
}
