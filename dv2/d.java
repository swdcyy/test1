package dv2.d;
import le3.b$a;
import com.kuaishou.live.core.voiceparty.playway.video.VoicePartyAudienceVideoViewController;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import co2.f2;
import iv2.b;

public final class d implements b$a	// class@0025ab
{
    public final VoicePartyAudienceVideoViewController a;

    public void d(VoicePartyAudienceVideoViewController p0){
       this.a = p0;
       super();
    }
    public void a(long p0,long p1,long p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, d.class, "1")) {
          return;
       }
       if (this.a.s.I()) {
          this.a.q.f(p0, p1);
       }
       return;
    }
}
