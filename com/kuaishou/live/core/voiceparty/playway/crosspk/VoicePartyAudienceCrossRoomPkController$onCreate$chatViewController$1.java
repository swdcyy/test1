package com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.crosspk.VoicePartyAudienceCrossRoomPkController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import iu2.a;
import com.kuaishou.live.core.voiceparty.crossroompk.stageview.VoicePartyCrossRoomPkStageView;
import android.view.View;
import com.kuaishou.live.core.voiceparty.g0;

public final class VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1 extends Lambda implements a	// class@001850
{
    public final VoicePartyAudienceCrossRoomPkController this$0;

    public void VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1(VoicePartyAudienceCrossRoomPkController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.CROSS_ROOM_TEAM_PK, this.this$0.j+" dispatchCoreUIFeatureChange");
       VoicePartyAudienceCrossRoomPkController$onCreate$chatViewController$1 tthis$0 = this.this$0;
       a f = tthis$0.q.f;
       if (f != null) {
          f.b(6, VoicePartyAudienceCrossRoomPkController.V2(tthis$0));
       }
       return;
    }
}
