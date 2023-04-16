package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$showSwitchModePanel$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.customview.stage.LiveVoicePartyStageView;

public final class VoicePartyKtvStageViewController$showSwitchModePanel$2 extends Lambda implements l	// class@00154c
{
    public final VoicePartyKtvStageViewController this$0;

    public void VoicePartyKtvStageViewController$showSwitchModePanel$2(VoicePartyKtvStageViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController$showSwitchModePanel$2.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.this$0.a3().setUseFrontCamera(p0.booleanValue());
       }
       return;
    }
}
