package ct2.d;
import java.lang.Runnable;
import java.lang.String;
import ct2.c;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$FollowGuestGuide;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import at2.c$b;
import java.util.Objects;
import java.util.LinkedList;
import com.kuaishou.android.live.log.LiveLogTag;

public final class d implements Runnable	// class@0023e1
{
    public final String b;
    public final c c;
    public final VoicePartyMicSeatData d;
    public final LiveVoicePartyCommonConfig$FollowGuestGuide e;

    public void d(String p0,c p1,VoicePartyMicSeatData p2,LiveVoicePartyCommonConfig$FollowGuestGuide p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, d.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "MicSeatGuideTimer reach watchingCount:"+this.c.a);
       d tb = this.b;
       a.o(tb, "userId");
       c$b uob = this.c.c(tb, false);
       tb = this.c;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(uob, tb, c.class, "11")) {
          tb.h.offer(uob);
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "insertMicSeatsGuide "+uob);
          if (tb.g == null) {
             tb.h();
          }
       }
       this.c.h();
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
