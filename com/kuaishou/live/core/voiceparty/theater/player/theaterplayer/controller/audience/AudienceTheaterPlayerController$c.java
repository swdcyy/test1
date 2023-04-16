package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController$c;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager$c;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceTheaterPlayerController;
import java.lang.Object;
import zo2.n0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q00.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import java.util.Map;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import java.util.Set;
import java.lang.Integer;

public final class AudienceTheaterPlayerController$c implements RtcManager$c	// class@0019e1
{
    public final AudienceTheaterPlayerController b;

    public void AudienceTheaterPlayerController$c(AudienceTheaterPlayerController p0){
       this.b = p0;
       super();
    }
    public void H(){
       n0.f(this);
    }
    public void I(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceTheaterPlayerController$c.class, "1")) {
          return;
       }
       p0 = this.b;
       p0.C(p0.s.e(), true);
       return;
    }
    public void N(Object p0,Map p1){
       n0.e(this, p0, p1);
    }
    public void X(LiveAryaBroadcastProto$LiveAryaBroadcastMessage p0){
       n0.g(this, p0);
    }
    public void e(Set p0){
       n0.a(this, p0);
    }
    public void f(Object p0,int p1){
       AudienceTheaterPlayerController$c uoc = AudienceTheaterPlayerController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       this.b.C(null, true);
       return;
    }
    public void i0(Object p0){
       n0.c(this, p0);
    }
}
