package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatShareController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.SharePendantViewController;
import ts2.f;
import co2.f2;
import qu2.a;
import mt2.a;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatShareController$onCreate$1 extends Lambda implements l	// class@0016da
{
    public final MicSeatShareController this$0;

    public void MicSeatShareController$onCreate$1(MicSeatShareController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatShareController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatShareController$onCreate$1 tthis$0 = this.this$0;
       SharePendantViewController sharePendant = new SharePendantViewController(tthis$0.k, tthis$0.o, tthis$0.p, tthis$0.q, tthis$0.r, tthis$0.n, p0);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
