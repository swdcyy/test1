package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ktvSingPrepare$1$onEnter$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$k;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import jp2.s;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$PlayNextOrder;
import ut7.e;

public final class KtvManager$ktvSingPrepare$1$onEnter$2 extends Lambda implements l	// class@001436
{
    public final KtvMusicOrderInfo $music;
    public final KtvManager$k this$0;

    public void KtvManager$ktvSingPrepare$1$onEnter$2(KtvManager$k p0,KtvMusicOrderInfo p1){
       this.this$0 = p0;
       this.$music = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$ktvSingPrepare$1$onEnter$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.a().p(true);
       this.this$0.g.i().p0(this.$music);
       this.this$0.g.r(new KtvManager$PlayNextOrder(2));
       return;
    }
}
