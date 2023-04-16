package com.kuaishou.live.core.voiceparty.micseats.invitation.a;
import sfc.a;
import ft2.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qs2.a;
import z12.e;

public final class a extends a	// class@0015b8
{
    public final h c;

    public void a(h p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       h l = this.c.l;
       if (l != null) {
          l.p();
       }
       String[] stringArray = new String[0];
       e.c("VoicePartyAudienceMicInvitation", "onAcceptAutoInvitationError", stringArray);
       return;
    }
}
