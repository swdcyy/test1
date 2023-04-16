package gp2.p;
import lf3.g;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCTheaterEpisodeOrderFinished;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.core.audience.LongConnectionUnregisterException;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$NoOrderEvent;
import ut7.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lf3.f;

public final class p implements g	// class@002b81
{
    public final AudienceTheaterManager b;

    public void p(AudienceTheaterManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else if(a.g(p0.liveStreamId, this.b.d().d()) && (a.g(p0.voicePartyId, this.b.d().e()) && a.g(p0.theaterId, this.b.d().k0()))){
          b.S(LiveVoicePartyLogTag.THEATER.appendTag("AudienceTheaterManager"), "on receive SCTheaterEpisodeOrderFinished", "msg", p0);
          p tb = this.b;
          if (tb.i != null) {
             ExceptionHandler.handleCaughtException(new LongConnectionUnregisterException(new TheaterManager$NoOrderEvent()));
          }else {
             tb.r(new TheaterManager$NoOrderEvent());
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
