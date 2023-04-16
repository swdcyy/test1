package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGiftController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController;
import ts2.f;
import qx1.a;
import hf3.a;

public final class MicSeatGiftController$onCreate$1 extends Lambda implements l	// class@00168b
{
    public final MicSeatGiftController this$0;

    public void MicSeatGiftController$onCreate$1(MicSeatGiftController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatGiftController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatGiftController$onCreate$1 tthis$0 = this.this$0;
       GiftPendantViewController giftPendantV = new GiftPendantViewController(tthis$0.k, tthis$0.n, tthis$0.o, tthis$0.p, p0);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
