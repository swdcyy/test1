package co2.o;
import erd.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyIsOnBoardResponse;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;

public final class o implements g	// class@0005a4
{
    public final h b;

    public void o(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       LiveVoicePartyLogTag mIC_SEAT = LiveVoicePartyLogTag.MIC_SEAT;
       b.Z(mIC_SEAT, "MicSeatStateChecker: isOnboard: "+p0.isOnboard);
       if (p0.isOnboard == null) {
          b.Z(mIC_SEAT, "MicSeatStateChecker: force leave room");
          tb.m.c().h(4, h.o);
       }
       return;
    }
}
