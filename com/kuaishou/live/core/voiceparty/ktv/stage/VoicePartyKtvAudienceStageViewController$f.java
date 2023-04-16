package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$f;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import com.kuaishou.live.common.core.basic.widget.LiveRedDotLayout;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class VoicePartyKtvAudienceStageViewController$f implements g	// class@00153c
{
    public final VoicePartyKtvAudienceStageViewController b;
    public final LiveRedDotLayout c;

    public void VoicePartyKtvAudienceStageViewController$f(VoicePartyKtvAudienceStageViewController p0,LiveRedDotLayout p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$f.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             VoicePartyKtvAudienceStageViewController.p3(this.b, this.c);
          }else {
             b.B(LiveVoicePartyLogTag.KTV, "onSingModeButtonClick load plugin fail");
          }
       }
       return;
    }
}
