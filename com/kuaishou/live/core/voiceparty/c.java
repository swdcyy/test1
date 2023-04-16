package com.kuaishou.live.core.voiceparty.c;
import erd.g;
import com.kuaishou.live.core.voiceparty.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import java.lang.String;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import bs2.c;
import com.kuaishou.android.live.model.QLivePlayConfig;
import co2.f2;
import brd.t;
import cjd.e;
import erd.o;
import zfc.b;
import co2.o;
import com.kuaishou.live.core.voiceparty.d0;
import crd.b;
import crd.a;

public final class c implements g	// class@00136c
{
    public final h b;

    public void c(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       b.Z(LiveVoicePartyLogTag.MIC_SEAT, "MicSeatStateChecker: isNetworkConnected: "+p0);
       if (p0.booleanValue() && tb.m.c().g()) {
          p0 = tb.g;
          c uoc = PatchProxy.apply(null, null, LiveVoicePartyApi.class, "6");
          if (uoc == PatchProxyResult.class) {
             uoc = LiveVoicePartyApi.e.getValue();
          }
          p0.c(uoc.a(tb.d.getLiveStreamId(), tb.c.y()).map(new e()).retryWhen(new b(3, 2000)).subscribe(new o(tb), d0.s("AudienceMicSeatStateChecker", "checkFailed")));
       }
       return;
    }
}
