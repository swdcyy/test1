package com.kuaishou.live.core.voiceparty.micseats.a$c;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.VoicePartyAryaConfigResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.h;
import z12.e;

public final class a$c implements g	// class@001565
{
    public final a b;
    public final int c;

    public void a$c(a p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.p(p0, "response");
          VoicePartyAryaConfigResponse micSeatId = p0.micSeatId;
          if (micSeatId != this.c && micSeatId != null) {
             this.b.k(micSeatId);
          }
          a u = this.b.u;
          if (u != null) {
             u.a(p0.mAryaConfig);
          }
          p0 = new String[0];
          e.c("VoicePartyAudienceMicManager", "doApplyMic success", p0);
       }
       return;
    }
}
