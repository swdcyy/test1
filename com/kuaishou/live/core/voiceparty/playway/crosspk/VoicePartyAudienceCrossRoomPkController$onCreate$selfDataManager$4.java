package com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ru2.c;
import qu2.a;
import com.kuaishou.live.core.voiceparty.micseats.core.data.TransformerKt;

public final class VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$4 extends Lambda implements l	// class@001857
{
    public final VoicePartyAudienceCrossRoomPkController this$0;

    public void VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$4(VoicePartyAudienceCrossRoomPkController p0){
       this.this$0 = p0;
       super(1);
    }
    public final t invoke(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceCrossRoomPkController$onCreate$selfDataManager$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       return TransformerKt.d(p0, this.this$0.r.b);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
