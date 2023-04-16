package com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$a;
import ekd.x;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyCommonConfig$CountDownAboardConfig;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import ekd.b;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;

public class VoicePartyAudienceInvitationDialog$a extends x	// class@0015b5
{
    public final VoicePartyAudienceInvitationDialog a;

    public void VoicePartyAudienceInvitationDialog$a(VoicePartyAudienceInvitationDialog p0,long p1){
       this.a = p0;
       super(p1);
    }
    public void a(long p0){
       VoicePartyAudienceInvitationDialog$a uoa = VoicePartyAudienceInvitationDialog$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       long l = TimeUnit.SECONDS.toMillis((long)this.a.t.mCountDownSeconds) - p0;
       if (l - null < 0) {
          VoicePartyAudienceInvitationDialog u = this.a.u;
          if (u != null) {
             u.a();
          }
          u = this.a.v;
          if (u != null) {
             u.stop();
          }
       }
       this.a.A.setText(a1.p(R.string.arg_RES_7f102dd7)+"£¨"+(TimeUnit.MILLISECONDS.toSeconds(l) + 1)+"s£©");
       return;
    }
}
