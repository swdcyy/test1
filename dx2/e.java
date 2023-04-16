package dx2.e;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import java.lang.Object;
import android.content.DialogInterface;

public final class e implements DialogInterface$OnDismissListener	// class@0025cf
{
    public final VoicePartyTheaterAudiencePanelController b;

    public void e(VoicePartyTheaterAudiencePanelController p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       p0.l = null;
    }
}
