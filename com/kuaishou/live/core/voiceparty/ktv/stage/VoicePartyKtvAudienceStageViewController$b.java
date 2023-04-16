package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$b;
import oq5.c;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;

public final class VoicePartyKtvAudienceStageViewController$b implements c	// class@001538
{
    public final VoicePartyKtvAudienceStageViewController b;

    public void VoicePartyKtvAudienceStageViewController$b(VoicePartyKtvAudienceStageViewController p0){
       this.b = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$b.class, "1")) {
          return;
       }
       this.b.a3().b();
       return;
    }
}
