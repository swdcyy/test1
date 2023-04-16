package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class VoicePartyKtvAudienceStageViewController$g implements g	// class@00153d
{
    public static final VoicePartyKtvAudienceStageViewController$g b;

    static {
       VoicePartyKtvAudienceStageViewController$g.b = new VoicePartyKtvAudienceStageViewController$g();
    }
    public void VoicePartyKtvAudienceStageViewController$g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$g.class, "1")) {
       }else {
          b.B(LiveVoicePartyLogTag.KTV, "onSingModeButtonClick load plugin fail");
       }
       return;
    }
}
