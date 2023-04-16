package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class VoicePartyKtvStageViewController$b implements g	// class@001543
{
    public final VoicePartyKtvStageViewController b;

    public void VoicePartyKtvStageViewController$b(VoicePartyKtvStageViewController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController$b.class, "1")) {
       }else if(a.g(Boolean.valueOf(this.b.r), p0) ^ 0x01){
          a.o(p0, "it");
          this.b.r = p0.booleanValue();
          this.b.g3();
       }
       return;
    }
}
