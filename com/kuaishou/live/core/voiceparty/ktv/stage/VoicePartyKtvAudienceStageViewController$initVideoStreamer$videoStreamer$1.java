package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvAudienceStageViewController;
import java.lang.Object;
import u71.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import cy2.h;

public final class VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$1 extends Lambda implements l	// class@00153e
{
    public final VoicePartyKtvAudienceStageViewController this$0;

    public void VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$1(VoicePartyKtvAudienceStageViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceStageViewController$initVideoStreamer$videoStreamer$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveVoicePartyStageView liveVoicePar = this.this$0.a3();
       VoicePartyKtvAudienceStageViewController e = this.this$0.E;
       a uoa = (e != null)? e.a(): null;
       liveVoicePar.setLiveCamera(uoa);
       return;
    }
}
