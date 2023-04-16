package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import op2.f;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand$PlayerSyncCommand;
import op2.k;

public final class AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1 extends Lambda implements p	// class@0013cd
{
    public final AudienceTheaterManager this$0;

    public void AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1(AudienceTheaterManager p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(ProgressSource p0,VoicePartyTheaterSyncCommand p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "command");
       VoicePartyTheaterSyncCommand b = p1.b;
       f uof = this.this$0.d().a();
       String str = (uof != null)? uof.c(): null;
       if (a.g(b, str) && p1.c == VoicePartyTheaterSyncCommand$PlayerSyncCommand.SEEK) {
          this.this$0.f().W();
       }
       PatchProxy.onMethodExit(AudienceTheaterManager$createSyncCommandDispatcher$$inlined$also$lambda$1.class, "1");
       return;
    }
}
