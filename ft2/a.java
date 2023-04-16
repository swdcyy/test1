package ft2.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.micseats.invitation.AudienceBeingInvitedBottomPanel;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;

public final class a implements View$OnClickListener	// class@0029c3
{
    public final AudienceBeingInvitedBottomPanel b;

    public void a(AudienceBeingInvitedBottomPanel p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.F.b();
       return;
    }
}
