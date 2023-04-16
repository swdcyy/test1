package com.kuaishou.live.core.voiceparty.ktv.stage.VoicePartyKtvStageViewController$h;
import sfc.a;
import msd.a;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class VoicePartyKtvStageViewController$h extends a	// class@001549
{
    public final a c;
    public final KtvSingMode d;

    public void VoicePartyKtvStageViewController$h(a p0,KtvSingMode p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvStageViewController$h.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       if (this.c != null) {
          super.b(p0);
       }
       b.B(LiveVoicePartyLogTag.KTV, "sync SingMode "+this.d+" Error: "+p0.getMessage());
       return;
    }
}
