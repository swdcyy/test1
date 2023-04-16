package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$showSwitchModePanel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$showSwitchModePanel$1$1;
import msd.a;

public final class VoicePartyKtvStageViewController$showSwitchModePanel$1 extends Lambda implements l	// class@00154b
{
    public final KtvSingMode $currentMode;
    public final VoicePartyKtvStageViewController this$0;

    public void VoicePartyKtvStageViewController$showSwitchModePanel$1(VoicePartyKtvStageViewController p0,KtvSingMode p1){
       this.this$0 = p0;
       this.$currentMode = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(KtvSingMode p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyKtvStageViewController$showSwitchModePanel$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "singMode");
       if (this.$currentMode != p0) {
          this.this$0.m3(p0, new VoicePartyKtvStageViewController$showSwitchModePanel$1$1(this, p0));
       }
       return true;
    }
}
