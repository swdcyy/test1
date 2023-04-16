package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKsCoinController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatKsCoinController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.KsCoinPendantViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;
import msd.p;

public final class MicSeatKsCoinController$onCreate$1 extends Lambda implements l	// class@0016a6
{
    public final MicSeatKsCoinController this$0;

    public void MicSeatKsCoinController$onCreate$1(MicSeatKsCoinController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatKsCoinController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatKsCoinController$onCreate$1 tthis$0 = this.this$0;
       KsCoinPendantViewController ksCoinPendan = new KsCoinPendantViewController(tthis$0.k, tthis$0.n, tthis$0.o, tthis$0.p, p0);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
