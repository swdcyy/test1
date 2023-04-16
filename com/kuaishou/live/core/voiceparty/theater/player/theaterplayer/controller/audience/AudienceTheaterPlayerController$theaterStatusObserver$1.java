package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$theaterStatusObserver$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.sync.audience.ProgressSource;
import com.kuaishou.live.core.voiceparty.theater.player.sync.VoicePartyTheaterSyncCommand;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AudienceTheaterPlayerController$theaterStatusObserver$1 extends Lambda implements p	// class@0019e2
{
    public final AudienceTheaterPlayerController this$0;

    public void AudienceTheaterPlayerController$theaterStatusObserver$1(AudienceTheaterPlayerController p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(ProgressSource p0,VoicePartyTheaterSyncCommand p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudienceTheaterPlayerController$theaterStatusObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "command");
       this.this$0.D(p0, p1);
       return;
    }
}
