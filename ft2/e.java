package ft2.e;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;

public final class e implements View$OnClickListener	// class@0029c7
{
    public final VoicePartyAudienceInvitationDialog b;

    public void e(VoicePartyAudienceInvitationDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       VoicePartyAudienceInvitationDialog u = this.b.u;
       if (u != null) {
          u.b();
       }
       return;
    }
}
