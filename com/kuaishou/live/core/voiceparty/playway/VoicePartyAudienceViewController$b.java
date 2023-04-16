package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$b;
import ru2.a;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qs2.d;
import ss2.f;
import java.lang.Integer;

public final class VoicePartyAudienceViewController$b implements a	// class@001837
{
    public final VoicePartyAudienceViewController b;

    public void VoicePartyAudienceViewController$b(VoicePartyAudienceViewController p0){
       this.b = p0;
       super();
    }
    public void N0(VoicePartyMicSeatData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceViewController$b.class, "2")) {
          return;
       }
       a.p(p0, "data");
       VoicePartyAudienceViewController o = this.b.o;
       if (o != null) {
          o.i(p0);
       }
       return;
    }
    public void V(VoicePartyMicSeatData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceViewController$b.class, "1")) {
          return;
       }
       a.p(p0, "data");
       VoicePartyAudienceViewController o = this.b.o;
       if (o != null) {
          o.B(p0);
       }
       return;
    }
    public void n1(f p0,int p1){
       VoicePartyAudienceViewController$b uob = VoicePartyAudienceViewController$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       a.p(p0, "data");
       VoicePartyAudienceViewController o = this.b.o;
       if (o != null) {
          o.l(p0, p1);
       }
       return;
    }
}
