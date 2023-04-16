package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$g;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import msd.a;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import qrd.l1;

public final class VoicePartyKtvStageViewController$g implements g	// class@001548
{
    public final KtvSingMode b;
    public final a c;

    public void VoicePartyKtvStageViewController$g(KtvSingMode p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController$g.class, "1")) {
       }else {
          b.Z(LiveVoicePartyLogTag.KTV, "sync SingMode "+this.b+" Success");
          p0 = this.c;
          if (p0 != null) {
             p0.invoke();
          }
       }
       return;
    }
}
