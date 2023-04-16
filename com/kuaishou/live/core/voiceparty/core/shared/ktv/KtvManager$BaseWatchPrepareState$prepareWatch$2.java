package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState$prepareWatch$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$BaseWatchPrepareState;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jp2.s;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$f;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$KtvWatchPrepareFail;
import ut7.e;

public final class KtvManager$BaseWatchPrepareState$prepareWatch$2 extends Lambda implements l	// class@001403
{
    public final KtvManager$BaseWatchPrepareState this$0;

    public void KtvManager$BaseWatchPrepareState$prepareWatch$2(KtvManager$BaseWatchPrepareState p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$BaseWatchPrepareState$prepareWatch$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.g.i().x1(this.this$0.h().b());
       this.this$0.g.r(new KtvManager$KtvWatchPrepareFail());
       return;
    }
}
