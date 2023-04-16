package com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController$onCreate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.MicSeatGuestInvitationGuidingController;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import it2.a0;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatStyle;

public final class MicSeatGuestInvitationGuidingController$onCreate$1 extends Lambda implements l	// class@001692
{
    public final MicSeatGuestInvitationGuidingController this$0;

    public void MicSeatGuestInvitationGuidingController$onCreate$1(MicSeatGuestInvitationGuidingController p0){
       this.this$0 = p0;
       super(1);
    }
    public final ViewController invoke(LiveData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MicSeatGuestInvitationGuidingController$onCreate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return new a0(this.this$0.n);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
