package ft2.h$d;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class h$d implements g	// class@0029cd
{
    public static final h$d b;

    static {
       h$d.b = new h$d();
    }
    public void h$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
       }else {
          b.Z(LiveVoicePartyLogTag.AUDIENCE, "rejectInvitationSuccess");
       }
       return;
    }
}
