package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$g;
import lf3.g;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkEnd;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hp2.e;
import co2.f2;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.crossroompk.log.LiveVoicePartyPKLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatDetailInfo;
import lf3.f;

public final class MicSeatsDataManager$g implements g	// class@00187a
{
    public final MicSeatsDataManager b;

    public void MicSeatsDataManager$g(MicSeatsDataManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MicSeatsDataManager$g.class, "1")) {
       }else {
          SCLiveVoicePartyPkEnd pkId = p0.pkId;
          e uoe = this.b.m.e();
          String str = (uoe != null)? uoe.i(): null;
          if (a.g(pkId, str) ^ 0x01) {
             b.Z(LiveVoicePartyPKLogTag.TAG, "onReceive SCLiveVoicePartyPkEndFailed invalid pkId ");
          }else {
             SCLiveVoicePartyPkEnd micSeatDetai = p0.micSeatDetailInfo;
             a.o(micSeatDetai, "it.micSeatDetailInfo");
             this.b.E(micSeatDetai, p0.micSeatsVersion);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
