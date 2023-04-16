package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$buildWatchState$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$b;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KtvManager$buildWatchState$1$1 extends Lambda implements l	// class@00141e
{
    public static final KtvManager$buildWatchState$1$1 INSTANCE;

    static {
       KtvManager$buildWatchState$1$1.INSTANCE = new KtvManager$buildWatchState$1$1();
    }
    public void KtvManager$buildWatchState$1$1(){
       super(1);
    }
    public final KtvManager$f invoke(KtvManager$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KtvManager$buildWatchState$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new KtvManager$f();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
