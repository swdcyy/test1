package ft2.h$e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h$e implements g	// class@0029ce
{
    public static final h$e b;

    static {
       h$e.b = new h$e();
    }
    public void h$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$e.class, "1")) {
       }else {
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "rejectInvitationError");
       }
       return;
    }
}
