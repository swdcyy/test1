package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$c;
import ru2.h;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import hu2.j;
import hu2.i;
import com.kuaishou.live.core.voiceparty.h;
import ss2.f;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import qs2.d;

public final class VoicePartyAudienceViewController$c implements h	// class@001838
{
    public final VoicePartyAudienceViewController b;

    public void VoicePartyAudienceViewController$c(VoicePartyAudienceViewController p0){
       this.b = p0;
       super();
    }
    public boolean q(){
       h obj = PatchProxy.apply(null, this, VoicePartyAudienceViewController$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.H.d().b();
       boolean b = true;
       if (obj == null || obj.e() != b) {
          b = false;
       }
       return b;
    }
    public void s2(f p0,int p1){
       VoicePartyAudienceViewController$c uoc = VoicePartyAudienceViewController$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       a.p(p0, "micSeatInfo");
       VoicePartyAudienceViewController o = this.b.o;
       if (o != null) {
          o.x(p0, p1);
       }
       return;
    }
}
