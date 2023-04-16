package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$createMicSeatPendantDependency$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import ss2.f;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$c;
import qs2.d;

public final class VoicePartyAudienceViewController$createMicSeatPendantDependency$1 extends Lambda implements p	// class@00183a
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$createMicSeatPendantDependency$1(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.intValue());
       return l1.a;
    }
    public final void invoke(f p0,int p1){
       if (PatchProxy.isSupport(VoicePartyAudienceViewController$createMicSeatPendantDependency$1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, VoicePartyAudienceViewController$createMicSeatPendantDependency$1.class, "1")) {
          return;
       }
       String str = "micSeatInfo";
       a.p(p0, str);
       VoicePartyAudienceViewController c = this.this$0.C;
       Objects.requireNonNull(c);
       VoicePartyAudienceViewController$c uoc = VoicePartyAudienceViewController$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), c, uoc, "2")) {
          a.p(p0, str);
          VoicePartyAudienceViewController o = c.b.o;
          if (o != null) {
             o.x(p0, p1);
          }
       }
       return;
    }
}
