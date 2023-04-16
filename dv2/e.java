package dv2.e;
import le3.c$a;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import iv2.b;

public final class e implements c$a	// class@0025ac
{
    public final VoicePartyAudienceVideoViewController a;

    public void e(VoicePartyAudienceVideoViewController p0){
       this.a = p0;
       super();
    }
    public void a(long p0,long p1,long p2,long p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), Long.valueOf(p3), this, e.class, "1")) {
          return;
       }
       this.a.q.h(p0, p1, p2, p3);
       return;
    }
}
