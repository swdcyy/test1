package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState$prepareWatch$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState;
import java.lang.Object;
import mp2.d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareSuccess;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;

public final class KtvManager$BaseWatchPrepareState$prepareWatch$1 extends Lambda implements l	// class@001402
{
    public final KtvManager$BaseWatchPrepareState this$0;

    public void KtvManager$BaseWatchPrepareState$prepareWatch$1(KtvManager$BaseWatchPrepareState p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$BaseWatchPrepareState$prepareWatch$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.g.r(new KtvManager$KtvWatchPrepareSuccess(p0));
       return;
    }
}
