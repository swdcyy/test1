package gp2.e;
import erd.g;
import gp2.k;
import msd.l;
import gp2.s;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.player.a;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import java.lang.IllegalArgumentException;
import gp2.b;
import com.kuaishou.livestream.message.nano.SCTheaterNextEpisodeOrderInfo;

public final class e implements g	// class@002b76
{
    public final k b;
    public final l c;
    public final l d;
    public final s e;

    public void e(k p0,l p1,l p2,s p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a uoa = p0.component1();
          p0 = p0.component2();
          b.P(LiveVoicePartyLogTag.THEATER.appendTag("AudienceTheaterManager"), "receive URL&position "+p0+", startPlay");
          a.o(uoa, "playSource");
          TheaterPlayerController theaterPlaye = this.b.d.invoke(uoa);
          if (theaterPlaye == null) {
             this.c.invoke(new IllegalArgumentException("can not create playerController"));
          }else {
             a.o(p0, "position");
             this.d.invoke(new b(theaterPlaye, p0.longValue(), this.e.b.switchType));
          }
       }
       return;
    }
}
