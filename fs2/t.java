package fs2.t;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.util.HandyLogEvent;
import fs2.e;

public final class t implements View$OnClickListener	// class@0029bb
{
    public final VoicePartyKtvSingModeBottomDialogFragment b;

    public void t(VoicePartyKtvSingModeBottomDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.b.xh();
       this.b.K.f(HandyLogEvent.CLICK);
       return;
    }
}
