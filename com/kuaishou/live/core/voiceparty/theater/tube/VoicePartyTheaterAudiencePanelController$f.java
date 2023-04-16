package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$f;
import sfc.a;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;

public final class VoicePartyTheaterAudiencePanelController$f extends a	// class@0019f2
{
    public final VoicePartyTheaterAudiencePanelController c;

    public void VoicePartyTheaterAudiencePanelController$f(VoicePartyTheaterAudiencePanelController p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudiencePanelController$f.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       d0.c(this.c.l);
       return;
    }
}
