package com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager$b;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.audience.AudienceMicSeatsDataManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoicePartyGridChatClosed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import lf3.f;

public final class AudienceMicSeatsDataManager$b implements g	// class@001881
{
    public final AudienceMicSeatsDataManager b;

    public void AudienceMicSeatsDataManager$b(AudienceMicSeatsDataManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceMicSeatsDataManager$b.class, "1")) {
       }else {
          LiveStreamMessages$SCVoicePartyGridChatClosed micSeatDetai = p0.micSeatDetailInfo;
          a.o(micSeatDetai, "it.micSeatDetailInfo");
          this.b.E(micSeatDetai, p0.micSeatsVersion);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}