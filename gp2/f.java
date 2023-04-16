package gp2.f;
import erd.o;
import gp2.s;
import com.kuaishou.livestream.message.nano.TheaterEpisodeOrderInfo;
import java.lang.Object;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.SCTheaterNextEpisodeOrderInfo;
import com.kuaishou.livestream.message.nano.TheaterEpisodeInfo;
import brd.t;

public final class f implements o	// class@002b77
{
    public final s b;
    public final TheaterEpisodeOrderInfo c;

    public void f(s p0,TheaterEpisodeOrderInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       SCTheaterNextEpisodeOrderInfo sCTheaterNex;
       SCTheaterNextEpisodeOrderInfo sCTheaterNex1;
       s os = s.class;
       String str = "1";
       t ot = PatchProxy.applyOneRefs(p0, this, f.class, str);
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          e uoe = LiveVoicePartyApi.e();
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, p0, os, str);
          if (obj != PatchProxyResult.class) {
             sCTheaterNex = obj;
          }else {
             p0 = p0.b.liveStreamId;
             a.o(p0, "msg.liveStreamId");
             sCTheaterNex = p0;
          }
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object obj1 = PatchProxy.apply(objArray, p0, os, "2");
          if (obj1 != PatchProxyResult.class) {
             sCTheaterNex1 = obj1;
          }else {
             p0 = p0.b.voicePartyId;
             a.o(p0, "msg.voicePartyId");
             sCTheaterNex1 = p0;
          }
          p0 = this.c;
          p0 = p0.episodeInfo;
          ot = uoe.m(sCTheaterNex, sCTheaterNex1, this.b.c(), p0.episodeOrderId, p0.photoId, p0.type);
       }
       return ot;
    }
}
