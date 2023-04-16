package fs2.u;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import u71.a;
import com.kuaishou.live.core.voiceparty.util.HandyLogEvent;
import fs2.e;

public final class u implements View$OnClickListener	// class@0029bc
{
    public final VoicePartyKtvSingModeBottomDialogFragment b;

    public void u(VoicePartyKtvSingModeBottomDialogFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       VoicePartyKtvSingModeBottomDialogFragment d = this.b.D;
       if (d == null) {
          a.S("videoSelectView");
       }
       if (d.isSelected()) {
          u tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, VoicePartyKtvSingModeBottomDialogFragment.class, "8")) {
             if (tb.z != null || tb.I == null) {
                VoicePartyKtvSingModeBottomDialogFragment f = tb.F;
                if (f == null) {
                   f = tb.A;
                   if (f == null) {
                   label_0041 :
                      tb.K.g(HandyLogEvent.CLICK);
                   }
                }
                f.switchCamera();
                goto label_0041 ;
             }else {
                goto label_0041 ;
             }
          }
       }else {
          this.b.xh();
          this.b.K.f(HandyLogEvent.CLICK);
       }
       return;
    }
}
