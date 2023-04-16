package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatAnchorKsCoinController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AnchorKsCoinPendantViewController;
import ts2.f;
import brd.t;
import msd.p;
import lk2.c;

public final class MicSeatAnchorKsCoinController$onCreate$1 extends Lambda implements l	// class@001638
{
    public final MicSeatAnchorKsCoinController this$0;

    public void MicSeatAnchorKsCoinController$onCreate$1(MicSeatAnchorKsCoinController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatAnchorKsCoinController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatAnchorKsCoinController$onCreate$1 tthis$0 = this.this$0;
       AnchorKsCoinPendantViewController uAnchorKsCoi = new AnchorKsCoinPendantViewController(tthis$0.k, tthis$0.n, tthis$0.o, tthis$0.p, p0);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
