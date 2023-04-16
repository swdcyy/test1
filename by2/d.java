package by2.d;
import erd.g;
import com.kuaishou.live.core.voiceparty.video.audience.VoicePartyOpenVideoInvitationDialogFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public final class d implements g	// class@00047a
{
    public final VoicePartyOpenVideoInvitationDialogFragment b;
    public final String c;

    public void d(VoicePartyOpenVideoInvitationDialogFragment p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       long l = p0.longValue();
       p0 = d.class;
       if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), this, p0, "1")) {
          long l1 = 10 - l;
          if (l1 - null > 0) {
             p0 = this.b.u;
             if (p0 == null) {
                a.S("mRejectTextView");
             }
             p0.setText(this.c+'('+l1+')');
          }else {
             this.b.wh();
          }
       }
       return;
    }
}
