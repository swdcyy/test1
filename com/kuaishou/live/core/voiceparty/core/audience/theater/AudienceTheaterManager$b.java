package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$b;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$NextOrderEvent;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import gp2.s;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import ut7.i$a;
import gp2.l;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$c$b;
import ut7.h;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ut7.i$b;

public final class AudienceTheaterManager$b implements o	// class@0013cb
{
    public final AudienceTheaterManager a;

    public void AudienceTheaterManager$b(AudienceTheaterManager p0){
       this.a = p0;
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefsWithListener(p0, p1, this, AudienceTheaterManager$b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "event");
          a.p(p1, "context");
          if (a.g(p0.a().c(), p1.k0()) && (a.g(p0.a().d(), this.a.j) ^ 0x01)) {
             p1 = p0.a().a();
             p1 = (p1 != null)? p1.episodeInfo: null;
             if (p1 != null) {
                p1.j = p0.a().d();
                uoa = new i$a(new l(p0.a()), TheaterManager$c$b.d);
             label_0085 :
                PatchProxy.onMethodExit(AudienceTheaterManager$b.class, "1");
             }
          }
       label_0072 :
          b.P(LiveVoicePartyLogTag.THEATER.appendTag("AudienceTheaterManager"), "onReceiveTheaterNextEpisodeOrderInfo, receive duplicated msg");
          uoa = new i$b();
          goto label_0085 ;
       }
       return uoa;
    }
}
