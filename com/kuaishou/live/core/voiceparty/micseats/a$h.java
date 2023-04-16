package com.kuaishou.live.core.voiceparty.micseats.a$h;
import erd.g;
import com.kuaishou.live.core.voiceparty.micseats.a;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.teampk.model.VoicePartyTeamPkAudienceJoinResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.h;

public final class a$h implements g	// class@00156a
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          a.p(p0, "response");
          b.Z(LiveVoicePartyLogTag.TEAM_PK_AUDIENCE, "requestToJoinPk success");
          a u = this.b.u;
          if (u != null) {
             u.a(p0.mAryaConfig);
          }
       }
       return;
    }
}
