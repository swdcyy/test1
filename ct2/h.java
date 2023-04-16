package ct2.h;
import erd.g;
import ct2.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h implements g	// class@0023e5
{
    public final c b;

    public void h(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          b.I(LiveVoicePartyLogTag.OTHER, "updateAndShowFollowGuestGuide error", p0);
          this.b.f();
       }
       return;
    }
}
