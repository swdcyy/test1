package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLevelUpAnimationController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatLevelUpAnimationController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.LevelUpAnimationPendantViewController;
import ts2.f;
import hf3.a;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatLevelUpAnimationController$onCreate$1 extends Lambda implements l	// class@0016b7
{
    public final MicSeatLevelUpAnimationController this$0;

    public void MicSeatLevelUpAnimationController$onCreate$1(MicSeatLevelUpAnimationController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatLevelUpAnimationController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatLevelUpAnimationController$onCreate$1 tthis$0 = this.this$0;
       return new LevelUpAnimationPendantViewController(tthis$0.k, tthis$0.o, tthis$0.n, p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
