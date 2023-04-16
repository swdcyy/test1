package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$ktvSinging$1$onEnter$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$l;
import java.lang.Object;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import jp2.s;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$d;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;

public final class KtvManager$ktvSinging$1$onEnter$2 extends Lambda implements l	// class@001438
{
    public final KtvManager$l this$0;

    public void KtvManager$ktvSinging$1$onEnter$2(KtvManager$l p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.longValue());
       return l1.a;
    }
    public final void invoke(long p0){
       if (PatchProxy.isSupport(KtvManager$ktvSinging$1$onEnter$2.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, KtvManager$ktvSinging$1$onEnter$2.class, "1")) {
          return;
       }
       this.this$0.h.i().C1(this.this$0.a().b(), true, p0);
       return;
    }
}
