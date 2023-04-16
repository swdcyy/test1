package com.kuaishou.live.core.voiceparty.micseats.a$n;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.VoicePartyAryaConfigResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.e;

public final class a$n implements g	// class@001570
{
    public final a b;

    public void a$n(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$n.class, "1")) {
       }else {
          this.b.p();
          p0 = new String[0];
          e.c("VoicePartyAudienceMicManager", "revokAapply success", p0);
       }
       return;
    }
}
