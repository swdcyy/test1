package ct2.g;
import erd.g;
import ct2.c;
import at2.c$b;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kuaishou.live.core.voiceparty.model.VoicePartyUserIsFansResponse;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class g implements g	// class@0023e4
{
    public final c b;
    public final c$b c;

    public void g(c p0,c$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else if(!this.b.p.G()){
          p0 = p0.a();
          boolean b = true;
          if (p0 == null || p0.isFan() != b) {
             b = false;
          }
          b.Z(LiveVoicePartyLogTag.OTHER, "updateAndShowFollowGuestGuide "+b);
          this.b.g(this.b.c(this.c.g(), b));
       }
       return;
    }
}
