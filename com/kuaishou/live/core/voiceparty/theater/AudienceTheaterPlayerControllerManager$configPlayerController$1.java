package com.kuaishou.live.core.voiceparty.theater.AudienceTheaterPlayerControllerManager$configPlayerController$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import dw2.c;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.VoicePartyTheaterPlayerView;

public final class AudienceTheaterPlayerControllerManager$configPlayerController$1 extends Lambda implements l	// class@00194c
{
    public final c this$0;

    public void AudienceTheaterPlayerControllerManager$configPlayerController$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(TheaterPlayer$Event p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterPlayerControllerManager$configPlayerController$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       if (p0 == TheaterPlayer$Event.START_RENDERING) {
          this.this$0.b.c();
       }
       return;
    }
}
