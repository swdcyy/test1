package by2.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.video.audience.VoicePartyOpenVideoInvitationDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qrd.l1;
import msd.l;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class a implements View$OnClickListener	// class@000477
{
    public final VoicePartyOpenVideoInvitationDialogFragment b;

    public void a(VoicePartyOpenVideoInvitationDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, VoicePartyOpenVideoInvitationDialogFragment.class, "7")) {
          tb.w.invoke(l1.a);
          tb.dismissAllowingStateLoss();
       }
       return;
    }
}
