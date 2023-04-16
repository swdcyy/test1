package com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import qu2.a;
import co2.f2;
import hf3.a;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$1;
import msd.a;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$d;
import wkd.b;
import et2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wa1.h;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyGridChatOpened;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyGridChatClosed;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$c;
import com.kuaishou.livestream.message.nano.SCTeamPkRoomClosed;

public final class AudienceMicSeatsDataManager extends MicSeatsDataManager	// class@001884
{
    public final AudienceMicSeatsDataManager$d p;
    public final f2 q;
    public final t r;

    public void AudienceMicSeatsDataManager(a p0,f2 p1,a p2,t p3){
       a.p(p0, "liveBaseContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "liveLongConnection");
       super(new AudienceMicSeatsDataManager$1(p0), p1, p2);
       this.q = p1;
       this.r = p3;
       this.p = new AudienceMicSeatsDataManager$d(this);
       b.a(0x58c478c0).c();
       this.w();
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, AudienceMicSeatsDataManager.class, "4")) {
          return;
       }
       super.w();
       this.i().a(932, LiveStreamMessages$SCVoicePartyGridChatOpened.class, new AudienceMicSeatsDataManager$a(this));
       this.i().a(933, LiveStreamMessages$SCVoicePartyGridChatClosed.class, new AudienceMicSeatsDataManager$b(this));
       this.i().a(647, SCTeamPkRoomClosed.class, new AudienceMicSeatsDataManager$c(this));
       return;
    }
}
