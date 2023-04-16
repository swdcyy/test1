package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController;
import java.lang.Object;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;

public final class AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4 extends Lambda implements l	// class@0019dd
{
    public final TheaterPlayer $player;
    public final AudienceLiveTheaterPlayerController this$0;

    public void AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4(TheaterPlayer p0,AudienceLiveTheaterPlayerController p1){
       this.$player = p0;
       this.this$0 = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4.class, "1")) {
          return;
       }
       a.p(p0, "it");
       AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4 tthis$0 = this.this$0;
       List qualityList = this.$player.getQualityList();
       if (qualityList == null) {
          qualityList = CollectionsKt__CollectionsKt.E();
       }
       tthis$0.g(p0, qualityList);
       PatchProxy.onMethodExit(AudienceLiveTheaterPlayerController$createPlayer$$inlined$also$lambda$4.class, "1");
       return;
    }
}
