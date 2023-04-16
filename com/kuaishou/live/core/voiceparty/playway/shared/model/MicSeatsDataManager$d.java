package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$d;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCMicSeatsInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import kotlin.jvm.internal.a;
import z12.e;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import lf3.f;

public final class MicSeatsDataManager$d implements g	// class@001877
{
    public final MicSeatsDataManager b;

    public void MicSeatsDataManager$d(MicSeatsDataManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       String[] stringArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager$d.class, "1")) {
       }else if(a.g(p0.voicePartyId, this.b.m.y()) ^ 0x01){
          stringArray = new String[0];
          e.c("VoicePartyMicSeatsDataManager", "onReceiveMicSeats voice party id not match", stringArray);
       }else {
          MicSeatsDataManager$d tb = this.b;
          if (p0.micSeatsVersion < tb.m.k) {
             stringArray = new String[0];
             e.c("VoicePartyMicSeatsDataManager", "updateMicSeatList error because micSeatsVersion is overdue", stringArray);
          }else {
             SCMicSeatsInfo micSeatDetai = p0.micSeatDetailInfo;
             if (micSeatDetai != null) {
                tb.D(micSeatDetai);
                this.b.L(micSeatDetai);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
