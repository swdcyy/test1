package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import ut7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import ut7.h;
import nsd.u;

public final class KtvManager$buildWatchState$1$2 extends Lambda implements p	// class@00141f
{
    public static final KtvManager$buildWatchState$1$2 INSTANCE;

    static {
       KtvManager$buildWatchState$1$2.INSTANCE = new KtvManager$buildWatchState$1$2();
    }
    public void KtvManager$buildWatchState$1$2(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final l invoke(KtvMusicOrderInfo p0,KtvManager$b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KtvManager$buildWatchState$1$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       return new l(l1.a, null, 2, null);
    }
}
