package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import java.lang.Object;
import zo2.m0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;

public final class AudienceTheaterPlayerController$b implements g	// class@0019e0
{
    public final AudienceTheaterPlayerController b;

    public void AudienceTheaterPlayerController$b(AudienceTheaterPlayerController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterPlayerController$b.class, "1")) {
       }else if(p0.a()){
          this.b.l().pause();
       }else {
          this.b.l().resume();
       }
       return;
    }
}
