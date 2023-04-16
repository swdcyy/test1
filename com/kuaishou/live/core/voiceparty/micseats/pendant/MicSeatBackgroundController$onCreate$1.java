package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatBackgroundController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import it2.n0;
import java.lang.Enum;
import rs2.d;
import com.kuaishou.live.core.voiceparty.micseats.pendant.BackgroundPendantViewController;
import ts2.f;

public final class MicSeatBackgroundController$onCreate$1 extends Lambda implements l	// class@001653
{
    public final MicSeatBackgroundController this$0;

    public void MicSeatBackgroundController$onCreate$1(MicSeatBackgroundController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       d uod;
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatBackgroundController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       if (n0.a[this.this$0.n.ordinal()] != 1) {
          uod = new d();
       }else {
          MicSeatBackgroundController$onCreate$1 tthis$0 = this.this$0;
          uod = new BackgroundPendantViewController(tthis$0.k, tthis$0.o, p0);
       }
       return uod;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
