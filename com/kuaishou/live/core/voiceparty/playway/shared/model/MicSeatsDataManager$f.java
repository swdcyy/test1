package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$f;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCMicSeatsApplyInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import kotlin.jvm.internal.a;
import z12.e;
import com.kuaishou.livestream.message.nano.KtvMusicOrderStatisticsInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsUserApplyInfo;
import lf3.f;

public final class MicSeatsDataManager$f implements g	// class@001879
{
    public final MicSeatsDataManager b;

    public void MicSeatsDataManager$f(MicSeatsDataManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager$f.class, "1")) {
       }else if(a.g(p0.voicePartyId, this.b.m.y()) ^ 0x01){
          String[] stringArray = new String[0];
          e.c("VoicePartyMicSeatsDataManager", "onReceiveMusicOrderInfo voice party id not match", stringArray);
       }else {
          LiveStreamMessages$SCMicSeatsApplyInfo musicOrderSt = p0.musicOrderStatisticsInfo;
          if (musicOrderSt != null) {
             this.b.I(musicOrderSt);
          }
          LiveStreamMessages$SCMicSeatsApplyInfo micSeatsUser = p0.micSeatsUserApplyInfo;
          if (micSeatsUser != null) {
             this.b.J(micSeatsUser);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
