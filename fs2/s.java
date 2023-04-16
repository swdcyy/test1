package fs2.s;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx2.d;
import yx2.h;

public final class s implements View$OnClickListener	// class@0029ba
{
    public final VoicePartyKtvSingModeBottomDialogFragment b;

    public void s(VoicePartyKtvSingModeBottomDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       this.b.wh();
       this.b.K.e("VOICE_PARTY_KTV_ANCHOR_SING_MODE_VOICE").f();
       return;
    }
}
