package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$e;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkOpMicSeats;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hp2.e;
import co2.f2;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.crossroompk.log.LiveVoicePartyPKLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import rr2.k;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import lf3.f;

public final class MicSeatsDataManager$e implements g	// class@001878
{
    public final MicSeatsDataManager b;

    public void MicSeatsDataManager$e(MicSeatsDataManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager$e.class, "1")) {
       }else {
          e uoe = this.b.m.e();
          String str = (uoe != null)? uoe.i(): null;
          if (str != null && (a.g(str, p0.pkId) ^ 0x01)) {
             b.Z(LiveVoicePartyPKLogTag.TAG, "onReceiveOpMicSeats pk id not match");
          }else if(!k.j(p0)){
             b.Z(LiveVoicePartyPKLogTag.TAG, "micseat empty ");
          }else {
             SCLiveVoicePartyPkOpMicSeats micSeatDetai = p0.micSeatDetailInfo;
             if (micSeatDetai != null) {
                this.b.H(micSeatDetai);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
