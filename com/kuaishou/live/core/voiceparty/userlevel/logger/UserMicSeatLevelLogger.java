package com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import qu2.a;
import co2.f2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$a;
import msd.p;
import yx2.d;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$createLogger$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import lnc.i3;
import java.lang.CharSequence;

public final class UserMicSeatLevelLogger	// class@001acb
{
    public final UserMicSeatLevelLogger$a a;
    public final f2 b;

    public void UserMicSeatLevelLogger(a p0,f2 p1){
       a.p(p0, "liveBaseContext");
       a.p(p1, "voicePartyContext");
       super();
       this.b = p1;
       this.a = new UserMicSeatLevelLogger$a(this, p0, p0);
    }
    public static d b(UserMicSeatLevelLogger p0,String p1,String p2,p p3,int p4,Object p5){
       UserMicSeatLevelLogger$createLogger$1 iNSTANCE;
       if (p4 & 0x02) {
          p2 = null;
       }
       if (p4 & 0x04) {
          iNSTANCE = UserMicSeatLevelLogger$createLogger$1.INSTANCE;
       }
       return p0.a(p1, p2, iNSTANCE);
    }
    public final d a(String p0,String p1,p p2){
       d obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, UserMicSeatLevelLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d(p0, this.b, this.a);
       if (p1 != null) {
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          userPackage.identity = p1;
          p0.userPackage = userPackage;
       }
       p0.liveVoicePartyPackage = null;
       i3 oi3 = i3.f();
       p1 = this.b.f();
       a.o(p1, "voicePartyContext.crossRoomPkId");
       String str = 1;
       UserMicSeatLevelLogger userMicSeatL = (p1.length() > 0)? 1: null;
       if (userMicSeatL) {
          oi3.d("voice_party_pk_id", this.b.f());
       }
       userMicSeatL = this.b.l();
       a.o(userMicSeatL, "voicePartyContext.gridChatId");
       if (userMicSeatL.length() <= 0) {
          str = null;
       }
       if (str) {
          oi3.d("voice_nine_room_id", this.b.l());
       }
       a.o(oi3, "paramsBuilder");
       p2.invoke(obj, oi3);
       oi3 = oi3.e();
       a.o(oi3, "paramsBuilder.build\(\)");
       obj.a(oi3);
       return obj;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserMicSeatLevelLogger.class, "16")) {
          return;
       }
       a.p(p0, "uid");
       UserMicSeatLevelLogger.b(this, "MIC_LEVEL_CARD", p0, null, 4, null).g();
       return;
    }
}
