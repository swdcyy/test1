package ft2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.micseats.invitation.AudienceBeingInvitedBottomPanel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;

public final class c implements View$OnClickListener	// class@0029c5
{
    public final AudienceBeingInvitedBottomPanel b;

    public void c(AudienceBeingInvitedBottomPanel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, this.b.s+" initCloseView close");
       this.b.F.onDismiss();
       m.b(this.b);
       return;
    }
}
