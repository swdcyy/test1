package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$d;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ee1.a;
import fs2.p;
import com.kuaishou.protobuf.livestream.nano.LiveAryaBroadcastProto$LiveAryaBroadcastMessage;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;

public final class VoicePartyKtvAudienceStageViewController$d implements g	// class@00153a
{
    public final VoicePartyKtvAudienceStageViewController b;
    public final KtvSingMode c;

    public void VoicePartyKtvAudienceStageViewController$d(VoicePartyKtvAudienceStageViewController p0,KtvSingMode p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$d.class, "1")) {
       }else {
          p0 = this.b.G.j();
          if (p0 != null && p0.j() == 2) {
             p0 = new LiveAryaBroadcastProto$LiveAryaBroadcastMessage();
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             p0.senderId = mE.getId();
             p0.senderTimestamp = System.currentTimeMillis();
             p0.type = 13;
             b = (this.c == KtvSingMode.VIDEO)? true: false;
             p0.videoStatus = b;
             this.b.G.j().T(MessageNano.toByteArray(p0));
             b.Z(LiveVoicePartyLogTag.KTV, "Broadcast SingMode: userId = "+p0.senderId+", isOpenVideo = "+p0.videoStatus);
          }else {
             p0 = LiveVoicePartyLogTag.KTV;
             StringBuilder str = "[Error] Broadcast SingMode On Illegal State: ";
             a uoa = this.b.G.j();
             Integer integer = (uoa != null)? Integer.valueOf(uoa.j()): null;
             b.Z(p0, str+integer);
          }
       }
       return;
    }
}
