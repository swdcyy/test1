package ft2.i;
import erd.g;
import ft2.h;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyAcceptAutoInvitationResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i implements g	// class@0029d0
{
    public final h b;

    public void i(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          this.b.Q(p0.mAryaConfig);
       }
       return;
    }
}
