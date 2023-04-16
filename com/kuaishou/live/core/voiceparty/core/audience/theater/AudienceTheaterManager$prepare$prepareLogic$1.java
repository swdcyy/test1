package com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager$prepare$prepareLogic$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import gp2.s;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gp2.r;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import xw2.d;
import brd.t;
import zw2.c;

public final class AudienceTheaterManager$prepare$prepareLogic$1 extends Lambda implements l	// class@0013d2
{
    public final s $orderInfo;
    public final AudienceTheaterManager this$0;

    public void AudienceTheaterManager$prepare$prepareLogic$1(AudienceTheaterManager p0,s p1){
       this.this$0 = p0;
       this.$orderInfo = p1;
       super(1);
    }
    public final TheaterPlayerController invoke(a p0){
       boolean b;
       AudienceTheaterManager$prepare$prepareLogic$1 tthis$0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AudienceTheaterManager obj = PatchProxy.applyOneRefs(p0, this, AudienceTheaterManager$prepare$prepareLogic$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0.o;
       AudienceTheaterManager$prepare$prepareLogic$1 t$orderInfo = this.$orderInfo;
       Objects.requireNonNull(t$orderInfo);
       Object obj1 = PatchProxy.apply(null, t$orderInfo, s.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          TheaterEpisodeOrderInfo theaterEpiso = t$orderInfo.a();
          if (theaterEpiso != null) {
             theaterEpiso = theaterEpiso.episodeInfo;
             if (theaterEpiso != null) {
                b = theaterEpiso.isSyntheticStream;
             }
          }
          tthis$0 = null;
       }
       boolean b1 = b;
       tthis$0 = this.this$0;
       AudienceTheaterManager m = tthis$0.m;
       AudienceTheaterManager k = tthis$0.k;
       if (k == null) {
          a.S("statusDispatcher");
       }
       r or = new r(p0, b1, m, k, this.this$0.p);
       return obj.a(v8);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
