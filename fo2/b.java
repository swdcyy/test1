package fo2.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController;
import java.lang.Object;
import java.lang.Long;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$FailReason;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController$d;

public final class b implements g	// class@00298d
{
    public final VoicePartyAryaRoomSwitchController b;

    public void b(VoicePartyAryaRoomSwitchController p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.d.a(VoicePartyAryaRoomSwitchController$FailReason.TIMEOUT);
    }
}
