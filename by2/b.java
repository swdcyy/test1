package by2.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.video.audience.VoicePartyOpenVideoInvitationDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b implements View$OnClickListener	// class@000478
{
    public final VoicePartyOpenVideoInvitationDialogFragment b;

    public void b(VoicePartyOpenVideoInvitationDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.wh();
       return;
    }
}
