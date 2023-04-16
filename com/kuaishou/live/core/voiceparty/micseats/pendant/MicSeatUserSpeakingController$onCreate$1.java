package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatUserSpeakingController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.micseats.pendant.UserSpeakingPendantViewController;
import ts2.f;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;
import brd.t;

public final class MicSeatUserSpeakingController$onCreate$1 extends Lambda implements l	// class@001705
{
    public final MicSeatUserSpeakingController this$0;

    public void MicSeatUserSpeakingController$onCreate$1(MicSeatUserSpeakingController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatUserSpeakingController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MicSeatUserSpeakingController$onCreate$1 tthis$0 = this.this$0;
       UserSpeakingPendantViewController userSpeaking = new UserSpeakingPendantViewController(tthis$0.k, tthis$0.n, tthis$0.p, tthis$0.o, p0);
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
