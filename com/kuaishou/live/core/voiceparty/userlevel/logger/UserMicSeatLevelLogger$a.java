package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$a;
import qu2.e;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import qu2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import co2.f2;

public final class UserMicSeatLevelLogger$a extends e	// class@001abb
{
    public final UserMicSeatLevelLogger b;
    public final a c;

    public void UserMicSeatLevelLogger$a(UserMicSeatLevelLogger p0,a p1,a p2){
       this.b = p0;
       this.c = p1;
       super(p2);
    }
    public ClientContent$LiveVoicePartyPackageV2 y(){
       ClientContent$LiveVoicePartyPackageV2 obj = PatchProxy.apply(null, this, UserMicSeatLevelLogger$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$LiveVoicePartyPackageV2();
       obj.theaterId = this.b.b.t();
       obj.teamPkRoomId = this.b.b.r();
       obj.ktvId = this.b.b.o();
       obj.voicePartyId = this.b.b.y();
       return obj;
    }
}
