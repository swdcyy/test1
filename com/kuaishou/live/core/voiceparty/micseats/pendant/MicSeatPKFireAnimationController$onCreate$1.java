package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatPKFireAnimationController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatPKFireAnimationController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.PKFireAnimationPendantViewController;
import ts2.f;
import tu2.f;
import brd.t;

public final class MicSeatPKFireAnimationController$onCreate$1 extends Lambda implements l	// class@0016d2
{
    public final MicSeatPKFireAnimationController this$0;

    public void MicSeatPKFireAnimationController$onCreate$1(MicSeatPKFireAnimationController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatPKFireAnimationController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatPKFireAnimationController$onCreate$1 tthis$0 = this.this$0;
       return new PKFireAnimationPendantViewController(tthis$0.k, tthis$0.o, tthis$0.p, p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
