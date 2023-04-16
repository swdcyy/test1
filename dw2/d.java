package dw2.d;
import zw2.c;
import dw2.c;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import gp2.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceLiveTheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.AudienceTheaterPlayerControllerManager$buildPlayerControllerFactory$1$1;
import bx2.a;
import qu2.a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import xw2.d;
import brd.t;
import yw2.k;
import msd.a;
import mw2.a;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.audience.AudienceVodTheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.AudienceTheaterPlayerControllerManager$buildPlayerControllerFactory$1$2;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.theater.AudienceTheaterPlayerControllerManager$configPlayerController$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.theater.AudienceTheaterPlayerControllerManager$configPlayerController$2;
import msd.p;

public final class d implements c	// class@0025b1
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public TheaterPlayerController a(Object p0){
       Object obj = this;
       d obj1 = p0;
       AudienceLiveTheaterPlayerController uAudienceLiv = PatchProxy.applyOneRefs(obj1, obj, d.class, "1");
       if (uAudienceLiv != PatchProxyResult.class) {
       }else {
          a.p(obj1, "params");
          if (obj1.c().b()) {
             AudienceLiveTheaterPlayerController uAudienceLiv1 = new AudienceLiveTheaterPlayerController(obj.a.b, obj1.c(), obj1.b, new AudienceTheaterPlayerControllerManager$buildPlayerControllerFactory$1$1(obj), new a(obj.a.e), obj.a.f, obj1.b(), obj1.d(), obj1.a(), obj.a.g);
          }else {
             AudienceVodTheaterPlayerController uAudienceVod = new AudienceVodTheaterPlayerController(obj.a.b, obj1.c(), new AudienceTheaterPlayerControllerManager$buildPlayerControllerFactory$1$2(obj), obj1.b(), obj1.d(), obj1.a(), obj.a.g);
          }
          obj1 = obj.a;
          Objects.requireNonNull(obj1);
          if (!PatchProxy.applyVoidOneRefs(uAudienceLiv, obj1, c.class, "5")) {
             uAudienceLiv.a(new AudienceTheaterPlayerControllerManager$configPlayerController$1(obj1));
             uAudienceLiv.d(new AudienceTheaterPlayerControllerManager$configPlayerController$2(obj1));
             obj1.h.invoke(uAudienceLiv);
          }
       }
       return uAudienceLiv;
    }
}
