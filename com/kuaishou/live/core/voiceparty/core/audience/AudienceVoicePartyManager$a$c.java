package com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a$c;
import com.kwai.statechart.a;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import zo2.l0;

public final class AudienceVoicePartyManager$a$c extends a	// class@00138a
{
    public final AudienceVoicePartyManager$a d;

    public void AudienceVoicePartyManager$a$c(AudienceVoicePartyManager$a p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudienceVoicePartyManager$a$c.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          p0 = this.d.k;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(p1, p0, AudienceVoicePartyManager.class, "6")) {
             p0 = p0.g;
             if (p0 == null) {
                a.S("switchLogic");
             }
             p0.d();
          }
       }
       return;
    }
}
